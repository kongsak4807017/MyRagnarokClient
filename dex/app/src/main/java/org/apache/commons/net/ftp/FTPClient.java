package org.apache.commons.net.ftp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory;
import org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory;
import org.apache.commons.net.ftp.parser.MLSxEntryParser;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.commons.net.io.CopyStreamAdapter;
import org.apache.commons.net.io.CopyStreamEvent;
import org.apache.commons.net.io.CopyStreamListener;
import org.apache.commons.net.io.FromNetASCIIInputStream;
import org.apache.commons.net.io.SocketInputStream;
import org.apache.commons.net.io.SocketOutputStream;
import org.apache.commons.net.io.ToNetASCIIOutputStream;
import org.apache.commons.net.io.Util;
import org.apache.http.protocol.HTTP;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class FTPClient extends FTP implements Configurable {
    public static final int ACTIVE_LOCAL_DATA_CONNECTION_MODE = 0;
    public static final int ACTIVE_REMOTE_DATA_CONNECTION_MODE = 1;
    public static final String FTP_SYSTEM_TYPE = "org.apache.commons.net.ftp.systemType";
    public static final String FTP_SYSTEM_TYPE_DEFAULT = "org.apache.commons.net.ftp.systemType.default";
    public static final int PASSIVE_LOCAL_DATA_CONNECTION_MODE = 2;
    public static final int PASSIVE_REMOTE_DATA_CONNECTION_MODE = 3;
    public static final String SYSTEM_TYPE_PROPERTIES = "/systemType.properties";
    private static final Pattern __PARMS_PAT = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");
    private InetAddress __activeExternalHost;
    private int __activeMaxPort;
    private int __activeMinPort;
    private int __bufferSize;
    private FTPClientConfig __configuration;
    private long __controlKeepAliveTimeout;
    private CopyStreamListener __copyStreamListener;
    private int __dataConnectionMode;
    private int __dataTimeout;
    private FTPFileEntryParser __entryParser;
    private String __entryParserKey;
    private HashMap<String, Set<String>> __featuresMap;
    private int __fileFormat;
    private int __fileStructure;
    private int __fileTransferMode;
    private int __fileType;
    private boolean __listHiddenFiles;
    private FTPFileEntryParserFactory __parserFactory;
    private String __passiveHost;
    private InetAddress __passiveLocalHost;
    private int __passivePort;
    private final Random __random;
    private boolean __remoteVerificationEnabled;
    private InetAddress __reportActiveExternalHost;
    private long __restartOffset;
    private String __systemName;
    private boolean __useEPSVwithIPv4;
    private int __controlKeepAliveReplyTimeout = 1000;
    private boolean __autodetectEncoding = false;

    static class PropertiesSingleton {
        static final Properties PROPERTIES;

        private PropertiesSingleton() {
        }

        static {
            InputStream resourceAsStream = FTPClient.class.getResourceAsStream(FTPClient.SYSTEM_TYPE_PROPERTIES);
            Properties properties = null;
            if (resourceAsStream != null) {
                properties = new Properties();
                try {
                    try {
                        properties.load(resourceAsStream);
                        try {
                            resourceAsStream.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        try {
                            resourceAsStream.close();
                        } catch (IOException unused3) {
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                }
            }
            PROPERTIES = properties;
        }
    }

    private static Properties getOverrideProperties() {
        return PropertiesSingleton.PROPERTIES;
    }

    public FTPClient() {
        __initDefaults();
        this.__dataTimeout = -1;
        this.__remoteVerificationEnabled = true;
        this.__parserFactory = new DefaultFTPFileEntryParserFactory();
        this.__configuration = null;
        this.__listHiddenFiles = false;
        this.__useEPSVwithIPv4 = false;
        this.__random = new Random();
        this.__passiveLocalHost = null;
    }

    private void __initDefaults() {
        this.__dataConnectionMode = 0;
        this.__passiveHost = null;
        this.__passivePort = -1;
        this.__activeExternalHost = null;
        this.__reportActiveExternalHost = null;
        this.__activeMinPort = 0;
        this.__activeMaxPort = 0;
        this.__fileType = 0;
        this.__fileStructure = 7;
        this.__fileFormat = 4;
        this.__fileTransferMode = 10;
        this.__restartOffset = 0L;
        this.__systemName = null;
        this.__entryParser = null;
        this.__entryParserKey = "";
        this.__bufferSize = 1024;
        this.__featuresMap = null;
    }

    private static String __parsePathname(String str) {
        int iIndexOf = str.indexOf(34);
        if (iIndexOf == -1) {
            return str.substring(4);
        }
        int iLastIndexOf = str.lastIndexOf("\" ");
        if (iLastIndexOf != -1) {
            return str.substring(iIndexOf + 1, iLastIndexOf).replace("\"\"", "\"");
        }
        return str.substring(4);
    }

    protected void _parsePassiveModeReply(String str) throws MalformedServerReplyException, NumberFormatException {
        Matcher matcher = __PARMS_PAT.matcher(str);
        if (!matcher.find()) {
            throw new MalformedServerReplyException("Could not parse passive host information.\nServer Reply: " + str);
        }
        this.__passiveHost = matcher.group(1).replace(',', '.');
        try {
            this.__passivePort = (Integer.parseInt(matcher.group(2)) << 8) | Integer.parseInt(matcher.group(3));
            try {
                if (InetAddress.getByName(this.__passiveHost).isSiteLocalAddress()) {
                    InetAddress remoteAddress = getRemoteAddress();
                    if (!remoteAddress.isSiteLocalAddress()) {
                        String hostAddress = remoteAddress.getHostAddress();
                        fireReplyReceived(0, "[Replacing site local address " + this.__passiveHost + " with " + hostAddress + "]\n");
                        this.__passiveHost = hostAddress;
                    }
                }
            } catch (UnknownHostException unused) {
                throw new MalformedServerReplyException("Could not parse passive host information.\nServer Reply: " + str);
            }
        } catch (NumberFormatException unused2) {
            throw new MalformedServerReplyException("Could not parse passive port information.\nServer Reply: " + str);
        }
    }

    protected void _parseExtendedPassiveModeReply(String str) throws MalformedServerReplyException, NumberFormatException {
        String strTrim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char cCharAt = strTrim.charAt(0);
        char cCharAt2 = strTrim.charAt(1);
        char cCharAt3 = strTrim.charAt(2);
        char cCharAt4 = strTrim.charAt(strTrim.length() - 1);
        if (cCharAt != cCharAt2 || cCharAt2 != cCharAt3 || cCharAt3 != cCharAt4) {
            throw new MalformedServerReplyException("Could not parse extended passive host information.\nServer Reply: " + strTrim);
        }
        try {
            int i = Integer.parseInt(strTrim.substring(3, strTrim.length() - 1));
            this.__passiveHost = getRemoteAddress().getHostAddress();
            this.__passivePort = i;
        } catch (NumberFormatException unused) {
            throw new MalformedServerReplyException("Could not parse extended passive host information.\nServer Reply: " + strTrim);
        }
    }

    private boolean __storeFile(int i, String str, InputStream inputStream) {
        return _storeFile(FTPCommand.getCommand(i), str, inputStream);
    }

    protected boolean _storeFile(String str, String str2, InputStream inputStream) throws IOException, NumberFormatException {
        OutputStream bufferedOutputStream;
        Socket socket_openDataConnection_ = _openDataConnection_(str, str2);
        if (socket_openDataConnection_ == null) {
            return false;
        }
        if (this.__fileType == 0) {
            bufferedOutputStream = new ToNetASCIIOutputStream(new BufferedOutputStream(socket_openDataConnection_.getOutputStream(), getDefaultedBufferSize()));
        } else {
            bufferedOutputStream = new BufferedOutputStream(socket_openDataConnection_.getOutputStream(), getDefaultedBufferSize());
        }
        CSL csl = null;
        if (this.__controlKeepAliveTimeout > 0) {
            csl = new CSL(this, this.__controlKeepAliveTimeout, this.__controlKeepAliveReplyTimeout);
        }
        try {
            Util.copyStream(inputStream, bufferedOutputStream, getDefaultedBufferSize(), -1L, __mergeListeners(csl), false);
            bufferedOutputStream.close();
            socket_openDataConnection_.close();
            if (csl != null) {
                csl.cleanUp();
            }
            return completePendingCommand();
        } catch (IOException e) {
            Util.closeQuietly(socket_openDataConnection_);
            throw e;
        }
    }

    private OutputStream __storeFileStream(int i, String str) {
        return _storeFileStream(FTPCommand.getCommand(i), str);
    }

    protected OutputStream _storeFileStream(String str, String str2) throws IOException, NumberFormatException {
        Socket socket_openDataConnection_ = _openDataConnection_(str, str2);
        if (socket_openDataConnection_ == null) {
            return null;
        }
        OutputStream outputStream = socket_openDataConnection_.getOutputStream();
        if (this.__fileType == 0) {
            outputStream = new ToNetASCIIOutputStream(new BufferedOutputStream(outputStream, getDefaultedBufferSize()));
        }
        return new SocketOutputStream(socket_openDataConnection_, outputStream);
    }

    protected Socket _openDataConnection_(int i, String str) {
        return _openDataConnection_(FTPCommand.getCommand(i), str);
    }

    protected Socket _openDataConnection_(String str, String str2) throws IOException, NumberFormatException {
        Socket socketCreateSocket;
        if (this.__dataConnectionMode != 0 && this.__dataConnectionMode != 2) {
            return null;
        }
        boolean z = getRemoteAddress() instanceof Inet6Address;
        if (this.__dataConnectionMode == 0) {
            ServerSocket serverSocketCreateServerSocket = this._serverSocketFactory_.createServerSocket(getActivePort(), 1, getHostAddress());
            try {
                if (z) {
                    if (!FTPReply.isPositiveCompletion(eprt(getReportHostAddress(), serverSocketCreateServerSocket.getLocalPort()))) {
                        serverSocketCreateServerSocket.close();
                        return null;
                    }
                } else if (!FTPReply.isPositiveCompletion(port(getReportHostAddress(), serverSocketCreateServerSocket.getLocalPort()))) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
                if (this.__restartOffset > 0 && !restart(this.__restartOffset)) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
                if (!FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
                if (this.__dataTimeout >= 0) {
                    serverSocketCreateServerSocket.setSoTimeout(this.__dataTimeout);
                }
                socketCreateSocket = serverSocketCreateServerSocket.accept();
                if (this.__dataTimeout >= 0) {
                    socketCreateSocket.setSoTimeout(this.__dataTimeout);
                }
            } finally {
                serverSocketCreateServerSocket.close();
            }
        } else {
            if ((isUseEPSVwithIPv4() || z) && epsv() == 229) {
                _parseExtendedPassiveModeReply(this._replyLines.get(0));
            } else {
                if (z || pasv() != 227) {
                    return null;
                }
                _parsePassiveModeReply(this._replyLines.get(0));
            }
            socketCreateSocket = this._socketFactory_.createSocket();
            if (this.__passiveLocalHost != null) {
                socketCreateSocket.bind(new InetSocketAddress(this.__passiveLocalHost, 0));
            }
            if (this.__dataTimeout >= 0) {
                socketCreateSocket.setSoTimeout(this.__dataTimeout);
            }
            socketCreateSocket.connect(new InetSocketAddress(this.__passiveHost, this.__passivePort), this.connectTimeout);
            if (this.__restartOffset > 0 && !restart(this.__restartOffset)) {
                socketCreateSocket.close();
                return null;
            }
            if (!FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
                socketCreateSocket.close();
                return null;
            }
        }
        if (this.__remoteVerificationEnabled && !verifyRemote(socketCreateSocket)) {
            socketCreateSocket.close();
            throw new IOException("Host attempting data connection " + socketCreateSocket.getInetAddress().getHostAddress() + " is not same as server " + getRemoteAddress().getHostAddress());
        }
        if (this.__bufferSize > 0) {
            socketCreateSocket.setReceiveBufferSize(this.__bufferSize);
            socketCreateSocket.setSendBufferSize(this.__bufferSize);
        }
        return socketCreateSocket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void _connectAction_() throws IOException {
        super._connectAction_();
        __initDefaults();
        if (this.__autodetectEncoding) {
            ArrayList arrayList = new ArrayList(this._replyLines);
            int i = this._replyCode;
            if (hasFeature("UTF8") || hasFeature(HTTP.UTF_8)) {
                setControlEncoding(HTTP.UTF_8);
                this._controlInput_ = new CRLFLineReader(new InputStreamReader(this._input_, getControlEncoding()));
                this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(this._output_, getControlEncoding()));
            }
            this._replyLines.clear();
            this._replyLines.addAll(arrayList);
            this._replyCode = i;
        }
    }

    public void setDataTimeout(int i) {
        this.__dataTimeout = i;
    }

    public void setParserFactory(FTPFileEntryParserFactory fTPFileEntryParserFactory) {
        this.__parserFactory = fTPFileEntryParserFactory;
    }

    @Override // org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        super.disconnect();
        __initDefaults();
    }

    public void setRemoteVerificationEnabled(boolean z) {
        this.__remoteVerificationEnabled = z;
    }

    public boolean isRemoteVerificationEnabled() {
        return this.__remoteVerificationEnabled;
    }

    public boolean login(String str, String str2) {
        user(str);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (!FTPReply.isPositiveIntermediate(this._replyCode)) {
            return false;
        }
        return FTPReply.isPositiveCompletion(pass(str2));
    }

    public boolean login(String str, String str2, String str3) {
        user(str);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (!FTPReply.isPositiveIntermediate(this._replyCode)) {
            return false;
        }
        pass(str2);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (!FTPReply.isPositiveIntermediate(this._replyCode)) {
            return false;
        }
        return FTPReply.isPositiveCompletion(acct(str3));
    }

    public boolean logout() {
        return FTPReply.isPositiveCompletion(quit());
    }

    public boolean changeWorkingDirectory(String str) {
        return FTPReply.isPositiveCompletion(cwd(str));
    }

    public boolean changeToParentDirectory() {
        return FTPReply.isPositiveCompletion(cdup());
    }

    public boolean structureMount(String str) {
        return FTPReply.isPositiveCompletion(smnt(str));
    }

    boolean reinitialize() {
        rein();
        if (FTPReply.isPositiveCompletion(this._replyCode) || (FTPReply.isPositivePreliminary(this._replyCode) && FTPReply.isPositiveCompletion(getReply()))) {
            __initDefaults();
            return true;
        }
        return false;
    }

    public void enterLocalActiveMode() {
        this.__dataConnectionMode = 0;
        this.__passiveHost = null;
        this.__passivePort = -1;
    }

    public void enterLocalPassiveMode() {
        this.__dataConnectionMode = 2;
        this.__passiveHost = null;
        this.__passivePort = -1;
    }

    public boolean enterRemoteActiveMode(InetAddress inetAddress, int i) {
        if (FTPReply.isPositiveCompletion(port(inetAddress, i))) {
            this.__dataConnectionMode = 1;
            this.__passiveHost = null;
            this.__passivePort = -1;
            return true;
        }
        return false;
    }

    public boolean enterRemotePassiveMode() throws MalformedServerReplyException, NumberFormatException {
        if (pasv() != 227) {
            return false;
        }
        this.__dataConnectionMode = 3;
        _parsePassiveModeReply(this._replyLines.get(0));
        return true;
    }

    public String getPassiveHost() {
        return this.__passiveHost;
    }

    public int getPassivePort() {
        return this.__passivePort;
    }

    public int getDataConnectionMode() {
        return this.__dataConnectionMode;
    }

    private int getActivePort() {
        if (this.__activeMinPort > 0 && this.__activeMaxPort >= this.__activeMinPort) {
            if (this.__activeMaxPort == this.__activeMinPort) {
                return this.__activeMaxPort;
            }
            return this.__random.nextInt((this.__activeMaxPort - this.__activeMinPort) + 1) + this.__activeMinPort;
        }
        return 0;
    }

    private InetAddress getHostAddress() {
        if (this.__activeExternalHost != null) {
            return this.__activeExternalHost;
        }
        return getLocalAddress();
    }

    private InetAddress getReportHostAddress() {
        if (this.__reportActiveExternalHost != null) {
            return this.__reportActiveExternalHost;
        }
        return getHostAddress();
    }

    public void setActivePortRange(int i, int i2) {
        this.__activeMinPort = i;
        this.__activeMaxPort = i2;
    }

    public void setActiveExternalIPAddress(String str) {
        this.__activeExternalHost = InetAddress.getByName(str);
    }

    public void setPassiveLocalIPAddress(String str) {
        this.__passiveLocalHost = InetAddress.getByName(str);
    }

    public void setPassiveLocalIPAddress(InetAddress inetAddress) {
        this.__passiveLocalHost = inetAddress;
    }

    public InetAddress getPassiveLocalIPAddress() {
        return this.__passiveLocalHost;
    }

    public void setReportActiveExternalIPAddress(String str) {
        this.__reportActiveExternalHost = InetAddress.getByName(str);
    }

    public boolean setFileType(int i) {
        if (FTPReply.isPositiveCompletion(type(i))) {
            this.__fileType = i;
            this.__fileFormat = 4;
            return true;
        }
        return false;
    }

    public boolean setFileType(int i, int i2) {
        if (FTPReply.isPositiveCompletion(type(i, i2))) {
            this.__fileType = i;
            this.__fileFormat = i2;
            return true;
        }
        return false;
    }

    public boolean setFileStructure(int i) {
        if (FTPReply.isPositiveCompletion(stru(i))) {
            this.__fileStructure = i;
            return true;
        }
        return false;
    }

    public boolean setFileTransferMode(int i) {
        if (FTPReply.isPositiveCompletion(mode(i))) {
            this.__fileTransferMode = i;
            return true;
        }
        return false;
    }

    public boolean remoteRetrieve(String str) {
        if (this.__dataConnectionMode == 1 || this.__dataConnectionMode == 3) {
            return FTPReply.isPositivePreliminary(retr(str));
        }
        return false;
    }

    public boolean remoteStore(String str) {
        if (this.__dataConnectionMode == 1 || this.__dataConnectionMode == 3) {
            return FTPReply.isPositivePreliminary(stor(str));
        }
        return false;
    }

    public boolean remoteStoreUnique(String str) {
        if (this.__dataConnectionMode == 1 || this.__dataConnectionMode == 3) {
            return FTPReply.isPositivePreliminary(stou(str));
        }
        return false;
    }

    public boolean remoteStoreUnique() {
        if (this.__dataConnectionMode == 1 || this.__dataConnectionMode == 3) {
            return FTPReply.isPositivePreliminary(stou());
        }
        return false;
    }

    public boolean remoteAppend(String str) {
        if (this.__dataConnectionMode == 1 || this.__dataConnectionMode == 3) {
            return FTPReply.isPositivePreliminary(appe(str));
        }
        return false;
    }

    public boolean completePendingCommand() {
        return FTPReply.isPositiveCompletion(getReply());
    }

    public boolean retrieveFile(String str, OutputStream outputStream) {
        return _retrieveFile(FTPCommand.getCommand(13), str, outputStream);
    }

    protected boolean _retrieveFile(String str, String str2, OutputStream outputStream) throws IOException, NumberFormatException {
        InputStream bufferedInputStream;
        Socket socket_openDataConnection_ = _openDataConnection_(str, str2);
        if (socket_openDataConnection_ == null) {
            return false;
        }
        if (this.__fileType == 0) {
            bufferedInputStream = new FromNetASCIIInputStream(new BufferedInputStream(socket_openDataConnection_.getInputStream(), getDefaultedBufferSize()));
        } else {
            bufferedInputStream = new BufferedInputStream(socket_openDataConnection_.getInputStream(), getDefaultedBufferSize());
        }
        CSL csl = null;
        if (this.__controlKeepAliveTimeout > 0) {
            csl = new CSL(this, this.__controlKeepAliveTimeout, this.__controlKeepAliveReplyTimeout);
        }
        try {
            Util.copyStream(bufferedInputStream, outputStream, getDefaultedBufferSize(), -1L, __mergeListeners(csl), false);
            if (csl != null) {
                csl.cleanUp();
            }
            return completePendingCommand();
        } finally {
            Util.closeQuietly(socket_openDataConnection_);
        }
    }

    public InputStream retrieveFileStream(String str) {
        return _retrieveFileStream(FTPCommand.getCommand(13), str);
    }

    protected InputStream _retrieveFileStream(String str, String str2) throws IOException, NumberFormatException {
        Socket socket_openDataConnection_ = _openDataConnection_(str, str2);
        if (socket_openDataConnection_ == null) {
            return null;
        }
        InputStream inputStream = socket_openDataConnection_.getInputStream();
        if (this.__fileType == 0) {
            inputStream = new FromNetASCIIInputStream(new BufferedInputStream(inputStream, getDefaultedBufferSize()));
        }
        return new SocketInputStream(socket_openDataConnection_, inputStream);
    }

    public boolean storeFile(String str, InputStream inputStream) {
        return __storeFile(14, str, inputStream);
    }

    public OutputStream storeFileStream(String str) {
        return __storeFileStream(14, str);
    }

    public boolean appendFile(String str, InputStream inputStream) {
        return __storeFile(16, str, inputStream);
    }

    public OutputStream appendFileStream(String str) {
        return __storeFileStream(16, str);
    }

    public boolean storeUniqueFile(String str, InputStream inputStream) {
        return __storeFile(15, str, inputStream);
    }

    public OutputStream storeUniqueFileStream(String str) {
        return __storeFileStream(15, str);
    }

    public boolean storeUniqueFile(InputStream inputStream) {
        return __storeFile(15, null, inputStream);
    }

    public OutputStream storeUniqueFileStream() {
        return __storeFileStream(15, null);
    }

    public boolean allocate(int i) {
        return FTPReply.isPositiveCompletion(allo(i));
    }

    public boolean features() {
        return FTPReply.isPositiveCompletion(feat());
    }

    public String[] featureValues(String str) {
        Set<String> set;
        if (initFeatureMap() && (set = this.__featuresMap.get(str.toUpperCase(Locale.ENGLISH))) != null) {
            return (String[]) set.toArray(new String[set.size()]);
        }
        return null;
    }

    public String featureValue(String str) {
        String[] strArrFeatureValues = featureValues(str);
        if (strArrFeatureValues != null) {
            return strArrFeatureValues[0];
        }
        return null;
    }

    public boolean hasFeature(String str) {
        if (!initFeatureMap()) {
            return false;
        }
        return this.__featuresMap.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    public boolean hasFeature(String str, String str2) {
        Set<String> set;
        if (initFeatureMap() && (set = this.__featuresMap.get(str.toUpperCase(Locale.ENGLISH))) != null) {
            return set.contains(str2);
        }
        return false;
    }

    private boolean initFeatureMap() {
        String strSubstring;
        if (this.__featuresMap == null) {
            boolean zIsPositiveCompletion = FTPReply.isPositiveCompletion(feat());
            this.__featuresMap = new HashMap<>();
            if (!zIsPositiveCompletion) {
                return false;
            }
            for (String str : getReplyStrings()) {
                if (str.startsWith(" ")) {
                    String strSubstring2 = "";
                    int iIndexOf = str.indexOf(32, 1);
                    if (iIndexOf > 0) {
                        strSubstring = str.substring(1, iIndexOf);
                        strSubstring2 = str.substring(iIndexOf + 1);
                    } else {
                        strSubstring = str.substring(1);
                    }
                    String upperCase = strSubstring.toUpperCase(Locale.ENGLISH);
                    Set<String> hashSet = this.__featuresMap.get(upperCase);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        this.__featuresMap.put(upperCase, hashSet);
                    }
                    hashSet.add(strSubstring2);
                }
            }
            return true;
        }
        return true;
    }

    public boolean allocate(int i, int i2) {
        return FTPReply.isPositiveCompletion(allo(i, i2));
    }

    public boolean doCommand(String str, String str2) {
        return FTPReply.isPositiveCompletion(sendCommand(str, str2));
    }

    public String[] doCommandAsStrings(String str, String str2) {
        if (FTPReply.isPositiveCompletion(sendCommand(str, str2))) {
            return getReplyStrings();
        }
        return null;
    }

    public FTPFile mlistFile(String str) {
        if (FTPReply.isPositiveCompletion(sendCommand(39, str))) {
            return MLSxEntryParser.parseEntry(getReplyStrings()[1].substring(1));
        }
        return null;
    }

    public FTPFile[] mlistDir() {
        return mlistDir(null);
    }

    public FTPFile[] mlistDir(String str) {
        return initiateMListParsing(str).getFiles();
    }

    public FTPFile[] mlistDir(String str, FTPFileFilter fTPFileFilter) {
        return initiateMListParsing(str).getFiles(fTPFileFilter);
    }

    protected boolean restart(long j) {
        this.__restartOffset = 0L;
        return FTPReply.isPositiveIntermediate(rest(Long.toString(j)));
    }

    public void setRestartOffset(long j) {
        if (j >= 0) {
            this.__restartOffset = j;
        }
    }

    public long getRestartOffset() {
        return this.__restartOffset;
    }

    public boolean rename(String str, String str2) {
        if (!FTPReply.isPositiveIntermediate(rnfr(str))) {
            return false;
        }
        return FTPReply.isPositiveCompletion(rnto(str2));
    }

    public boolean abort() {
        return FTPReply.isPositiveCompletion(abor());
    }

    public boolean deleteFile(String str) {
        return FTPReply.isPositiveCompletion(dele(str));
    }

    public boolean removeDirectory(String str) {
        return FTPReply.isPositiveCompletion(rmd(str));
    }

    public boolean makeDirectory(String str) {
        return FTPReply.isPositiveCompletion(mkd(str));
    }

    public String printWorkingDirectory() {
        if (pwd() != 257) {
            return null;
        }
        return __parsePathname(this._replyLines.get(this._replyLines.size() - 1));
    }

    public boolean sendSiteCommand(String str) {
        return FTPReply.isPositiveCompletion(site(str));
    }

    public String getSystemType() throws IOException {
        if (this.__systemName == null) {
            if (FTPReply.isPositiveCompletion(syst())) {
                this.__systemName = this._replyLines.get(this._replyLines.size() - 1).substring(4);
            } else {
                String property = System.getProperty(FTP_SYSTEM_TYPE_DEFAULT);
                if (property != null) {
                    this.__systemName = property;
                } else {
                    throw new IOException("Unable to determine system type - response: " + getReplyString());
                }
            }
        }
        return this.__systemName;
    }

    public String listHelp() {
        if (FTPReply.isPositiveCompletion(help())) {
            return getReplyString();
        }
        return null;
    }

    public String listHelp(String str) {
        if (FTPReply.isPositiveCompletion(help(str))) {
            return getReplyString();
        }
        return null;
    }

    public boolean sendNoOp() {
        return FTPReply.isPositiveCompletion(noop());
    }

    public String[] listNames(String str) throws IOException {
        Socket socket_openDataConnection_ = _openDataConnection_(27, getListArguments(str));
        if (socket_openDataConnection_ == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket_openDataConnection_.getInputStream(), getControlEncoding()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            arrayList.add(line);
        }
        bufferedReader.close();
        socket_openDataConnection_.close();
        if (completePendingCommand()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    public String[] listNames() {
        return listNames(null);
    }

    public FTPFile[] listFiles(String str) {
        return initiateListParsing((String) null, str).getFiles();
    }

    public FTPFile[] listFiles() {
        return listFiles(null);
    }

    public FTPFile[] listFiles(String str, FTPFileFilter fTPFileFilter) {
        return initiateListParsing((String) null, str).getFiles(fTPFileFilter);
    }

    public FTPFile[] listDirectories() {
        return listDirectories(null);
    }

    public FTPFile[] listDirectories(String str) {
        return listFiles(str, FTPFileFilters.DIRECTORIES);
    }

    public FTPListParseEngine initiateListParsing() {
        return initiateListParsing(null);
    }

    public FTPListParseEngine initiateListParsing(String str) {
        return initiateListParsing((String) null, str);
    }

    public FTPListParseEngine initiateListParsing(String str, String str2) throws IOException {
        String property;
        if (this.__entryParser == null || !this.__entryParserKey.equals(str)) {
            if (str == null) {
                if (this.__configuration != null) {
                    this.__entryParser = this.__parserFactory.createFileEntryParser(this.__configuration);
                    this.__entryParserKey = this.__configuration.getServerSystemKey();
                } else {
                    str = System.getProperty(FTP_SYSTEM_TYPE);
                    if (str == null) {
                        str = getSystemType();
                        Properties overrideProperties = getOverrideProperties();
                        if (overrideProperties != null && (property = overrideProperties.getProperty(str)) != null) {
                            str = property;
                        }
                    }
                    this.__entryParser = this.__parserFactory.createFileEntryParser(str);
                    this.__entryParserKey = str;
                }
            } else {
                this.__entryParser = this.__parserFactory.createFileEntryParser(str);
                this.__entryParserKey = str;
            }
        }
        return initiateListParsing(this.__entryParser, str2);
    }

    private FTPListParseEngine initiateListParsing(FTPFileEntryParser fTPFileEntryParser, String str) throws IOException {
        Socket socket_openDataConnection_ = _openDataConnection_(26, getListArguments(str));
        FTPListParseEngine fTPListParseEngine = new FTPListParseEngine(fTPFileEntryParser);
        if (socket_openDataConnection_ == null) {
            return fTPListParseEngine;
        }
        try {
            fTPListParseEngine.readServerList(socket_openDataConnection_.getInputStream(), getControlEncoding());
            completePendingCommand();
            return fTPListParseEngine;
        } finally {
            Util.closeQuietly(socket_openDataConnection_);
        }
    }

    private FTPListParseEngine initiateMListParsing(String str) throws IOException {
        Socket socket_openDataConnection_ = _openDataConnection_(38, str);
        FTPListParseEngine fTPListParseEngine = new FTPListParseEngine(MLSxEntryParser.getInstance());
        if (socket_openDataConnection_ == null) {
            return fTPListParseEngine;
        }
        try {
            fTPListParseEngine.readServerList(socket_openDataConnection_.getInputStream(), getControlEncoding());
            return fTPListParseEngine;
        } finally {
            Util.closeQuietly(socket_openDataConnection_);
            completePendingCommand();
        }
    }

    protected String getListArguments(String str) {
        if (getListHiddenFiles()) {
            if (str != null) {
                StringBuilder sb = new StringBuilder(str.length() + 3);
                sb.append("-a ");
                sb.append(str);
                return sb.toString();
            }
            return "-a";
        }
        return str;
    }

    public String getStatus() {
        if (FTPReply.isPositiveCompletion(stat())) {
            return getReplyString();
        }
        return null;
    }

    public String getStatus(String str) {
        if (FTPReply.isPositiveCompletion(stat(str))) {
            return getReplyString();
        }
        return null;
    }

    public String getModificationTime(String str) {
        if (FTPReply.isPositiveCompletion(mdtm(str))) {
            return getReplyString();
        }
        return null;
    }

    public boolean setModificationTime(String str, String str2) {
        return FTPReply.isPositiveCompletion(mfmt(str, str2));
    }

    public void setBufferSize(int i) {
        this.__bufferSize = i;
    }

    public int getBufferSize() {
        return this.__bufferSize;
    }

    private int getDefaultedBufferSize() {
        if (this.__bufferSize > 0) {
            return this.__bufferSize;
        }
        return 1024;
    }

    @Override // org.apache.commons.net.ftp.Configurable
    public void configure(FTPClientConfig fTPClientConfig) {
        this.__configuration = fTPClientConfig;
    }

    public void setListHiddenFiles(boolean z) {
        this.__listHiddenFiles = z;
    }

    public boolean getListHiddenFiles() {
        return this.__listHiddenFiles;
    }

    public boolean isUseEPSVwithIPv4() {
        return this.__useEPSVwithIPv4;
    }

    public void setUseEPSVwithIPv4(boolean z) {
        this.__useEPSVwithIPv4 = z;
    }

    public void setCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.__copyStreamListener = copyStreamListener;
    }

    public CopyStreamListener getCopyStreamListener() {
        return this.__copyStreamListener;
    }

    public void setControlKeepAliveTimeout(long j) {
        this.__controlKeepAliveTimeout = 1000 * j;
    }

    public long getControlKeepAliveTimeout() {
        return this.__controlKeepAliveTimeout / 1000;
    }

    public void setControlKeepAliveReplyTimeout(int i) {
        this.__controlKeepAliveReplyTimeout = i;
    }

    public int getControlKeepAliveReplyTimeout() {
        return this.__controlKeepAliveReplyTimeout;
    }

    static class CSL implements CopyStreamListener {
        private final int currentSoTimeout;
        private final long idle;
        private int notAcked;
        private final FTPClient parent;
        private long time = System.currentTimeMillis();

        CSL(FTPClient fTPClient, long j, int i) {
            this.idle = j;
            this.parent = fTPClient;
            this.currentSoTimeout = fTPClient.getSoTimeout();
            fTPClient.setSoTimeout(i);
        }

        @Override // org.apache.commons.net.io.CopyStreamListener
        public void bytesTransferred(CopyStreamEvent copyStreamEvent) {
            bytesTransferred(copyStreamEvent.getTotalBytesTransferred(), copyStreamEvent.getBytesTransferred(), copyStreamEvent.getStreamSize());
        }

        @Override // org.apache.commons.net.io.CopyStreamListener
        public void bytesTransferred(long j, int i, long j2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.time > this.idle) {
                try {
                    this.parent.__noop();
                } catch (SocketTimeoutException unused) {
                    this.notAcked++;
                } catch (IOException unused2) {
                }
                this.time = jCurrentTimeMillis;
            }
        }

        void cleanUp() {
            while (true) {
                int i = this.notAcked;
                this.notAcked = i - 1;
                if (i > 0) {
                    this.parent.__getReplyNoReport();
                } else {
                    this.parent.setSoTimeout(this.currentSoTimeout);
                    return;
                }
            }
        }
    }

    private CopyStreamListener __mergeListeners(CopyStreamListener copyStreamListener) {
        if (copyStreamListener == null) {
            return this.__copyStreamListener;
        }
        if (this.__copyStreamListener == null) {
            return copyStreamListener;
        }
        CopyStreamAdapter copyStreamAdapter = new CopyStreamAdapter();
        copyStreamAdapter.addCopyStreamListener(copyStreamListener);
        copyStreamAdapter.addCopyStreamListener(this.__copyStreamListener);
        return copyStreamAdapter;
    }

    public void setAutodetectUTF8(boolean z) {
        this.__autodetectEncoding = z;
    }

    public boolean getAutodetectUTF8() {
        return this.__autodetectEncoding;
    }

    @Deprecated
    public String getSystemName() {
        if (this.__systemName == null && FTPReply.isPositiveCompletion(syst())) {
            this.__systemName = this._replyLines.get(this._replyLines.size() - 1).substring(4);
        }
        return this.__systemName;
    }
}
