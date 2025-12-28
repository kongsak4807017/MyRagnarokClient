package o;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import o.pl;
import org.apache.commons.net.io.CopyStreamEvent;
import org.apache.commons.net.io.CopyStreamListener;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class va {

    /* renamed from: 鷭, reason: contains not printable characters */
    static URL f5353 = null;

    /* renamed from: 櫯, reason: contains not printable characters */
    static long f5352 = 0;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static int f5351 = 0;

    /* renamed from: ȃ, reason: contains not printable characters */
    static int f5350 = 100;

    /* renamed from: Ą, reason: contains not printable characters */
    static HashSet<String> f5349 = new HashSet<>();

    /* renamed from: o.va$櫯, reason: contains not printable characters */
    public static class C0116 {

        /* renamed from: 櫯, reason: contains not printable characters */
        public long f5360;

        /* renamed from: 鷭, reason: contains not printable characters */
        public long f5361;
    }

    /* renamed from: o.va$if, reason: invalid class name */
    static class Cif implements CopyStreamListener {

        /* renamed from: 鷭, reason: contains not printable characters */
        un f5359;

        /* renamed from: 櫯, reason: contains not printable characters */
        private long f5358 = 0;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        private long f5357 = 0;

        /* renamed from: ȃ, reason: contains not printable characters */
        private long f5356 = 0;

        /* renamed from: Ą, reason: contains not printable characters */
        private long f5354 = System.currentTimeMillis();

        /* renamed from: ą, reason: contains not printable characters */
        private long f5355 = 0;

        Cif(un unVar) {
            this.f5359 = unVar;
        }

        @Override // org.apache.commons.net.io.CopyStreamListener
        public final void bytesTransferred(long j, int i, long j2) {
            long j3;
            if (va.f5352 == 0) {
                return;
            }
            this.f5356 += i;
            if (this.f5358 == 0) {
                this.f5358 = System.currentTimeMillis();
                j3 = 0;
            } else if (this.f5358 == System.currentTimeMillis()) {
                j3 = 0;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f5358;
                if (jCurrentTimeMillis >= 1000) {
                    this.f5357 = ((this.f5356 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) * 1000) / jCurrentTimeMillis;
                    this.f5358 = System.currentTimeMillis();
                    this.f5356 = 0L;
                }
                j3 = this.f5357;
            }
            long j4 = (100 * j) / va.f5352;
            if (this.f5354 < System.currentTimeMillis() - 300 || j4 != this.f5355) {
                this.f5354 = System.currentTimeMillis();
                this.f5355 = j4;
                if (this.f5359 != null) {
                    this.f5359.mo789("Downloading update\n[" + (va.f5351 + 1) + "/" + va.f5350 + "] " + va.f5353.getFile() + ":\n" + j4 + "% (" + pa.m973(j) + "/" + pa.m973(va.f5352) + ")\n" + j3 + " KBytes/s");
                }
            }
        }

        @Override // org.apache.commons.net.io.CopyStreamListener
        public final void bytesTransferred(CopyStreamEvent copyStreamEvent) {
            bytesTransferred(copyStreamEvent.getTotalBytesTransferred(), copyStreamEvent.getBytesTransferred(), copyStreamEvent.getStreamSize());
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static final URL m1139(String str) {
        try {
            URL url = new URL(str);
            try {
                return new URL(new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString());
            } catch (URISyntaxException e) {
                throw new ut((Exception) e, true);
            }
        } catch (MalformedURLException e2) {
            throw new ut((Exception) e2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d A[Catch: MalformedURLException -> 0x01e8, SocketException -> 0x01ef, UnknownHostException -> 0x0201, IOException -> 0x020e, RuntimeException -> 0x024e, all -> 0x0275, TRY_LEAVE, TryCatch #3 {UnknownHostException -> 0x0201, blocks: (B:5:0x0009, B:7:0x000f, B:8:0x0025, B:46:0x01de, B:9:0x006b, B:11:0x006f, B:13:0x008c, B:14:0x00b7, B:16:0x00c1, B:18:0x00c4, B:22:0x00e2, B:25:0x0110, B:26:0x0113, B:28:0x0121, B:29:0x013c, B:30:0x013d, B:31:0x0156, B:36:0x0179, B:38:0x0196, B:39:0x01ae, B:40:0x01af, B:42:0x01ba, B:43:0x01d8, B:44:0x01d9, B:34:0x015d, B:35:0x0178, B:20:0x00c9, B:21:0x00e1, B:45:0x01dc, B:48:0x01e3), top: B:88:0x0009, outer: #1 }] */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void m1141(java.lang.String r14, java.lang.String r15, java.lang.String[] r16, boolean r17, o.un r18) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.va.m1141(java.lang.String, java.lang.String, java.lang.String[], boolean, o.un):void");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static C0116 m1140(String str) {
        C0116 c0116 = new C0116();
        if (f5349.contains(str)) {
            throw new uw(new FileNotFoundException(), str, ":(");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) m1139(str).openConnection();
        httpURLConnection.setRequestProperty("Connection", HTTP.CONN_KEEP_ALIVE);
        httpURLConnection.setRequestProperty("User-agent", "AndRO");
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, HTTP.IDENTITY_CODING);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200 && responseCode != 206) {
            throw new uw(null, str, null);
        }
        try {
            c0116.f5361 = Long.parseLong(httpURLConnection.getHeaderField("Content-Length"));
        } catch (NumberFormatException unused) {
            c0116.f5361 = -1L;
        }
        c0116.f5360 = httpURLConnection.getLastModified();
        return c0116;
    }

    /* renamed from: o.va$鷭, reason: contains not printable characters */
    static final class C0117 extends GZIPInputStream {
        public C0117(InputStream inputStream) {
            super(inputStream);
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        public final Inflater m1143() {
            return ((GZIPInputStream) this).inf;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static byte[] m1142(String str, File file, boolean z, boolean z2, pl.Cif cif, po poVar) {
        long contentLength;
        try {
            try {
                if (f5349.contains(str)) {
                    throw new uw(new FileNotFoundException(), str, "to=" + file.getAbsolutePath());
                }
                URL urlM1139 = m1139(str);
                if (cif == pl.Cif.SKIP && file != null && file.exists()) {
                    if (z) {
                        return pa.m956(file.getAbsolutePath());
                    }
                    return null;
                }
                if (urlM1139.getProtocol().equals("ftp")) {
                    m1141(str, file.getParentFile().getAbsolutePath(), new String[]{file.getName()}, cif == pl.Cif.SKIP, null);
                    if (z) {
                        return pa.m956(file.getAbsolutePath());
                    }
                    return null;
                }
                C0117 c0117 = null;
                om omVar = null;
                File file2 = null;
                long length = 0;
                if (file != null) {
                    file2 = new File(String.valueOf(file.getAbsolutePath()) + ".tmp");
                    if (file2.exists()) {
                        if (cif == pl.Cif.RESUME) {
                            length = file2.length();
                        } else {
                            file2.delete();
                        }
                    }
                }
                long lastModified = 0;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) urlM1139.openConnection();
                    httpURLConnection.setRequestProperty("Connection", HTTP.CONN_KEEP_ALIVE);
                    if (z2) {
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                    } else {
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, HTTP.IDENTITY_CODING);
                    }
                    httpURLConnection.setRequestProperty("User-agent", "AndRO");
                    if (length > 0) {
                        httpURLConnection.setRequestProperty(HttpHeaders.RANGE, "bytes=" + length + "-");
                    }
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(60000);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (length > 0 && responseCode != 206) {
                        length = 0;
                    }
                    if (file != null && responseCode == 200 && cif == pl.Cif.RETURN_NULL_IF_SAME_LASTMODIFIED) {
                        lastModified = httpURLConnection.getLastModified();
                        new Date(lastModified);
                        new Date(file.lastModified());
                        pc.m994();
                        if (lastModified > 0 && file.lastModified() == lastModified) {
                            httpURLConnection.disconnect();
                            return null;
                        }
                    }
                    try {
                        contentLength = Long.parseLong(httpURLConnection.getHeaderField("Content-Length"));
                    } catch (NumberFormatException unused) {
                        contentLength = httpURLConnection.getContentLength();
                    }
                    if (z) {
                        if (contentLength > 2147483647L) {
                            throw new ut("Requested resource " + str + " is too large to store in memory", true);
                        }
                        if (contentLength > 0) {
                            omVar = new om((int) contentLength);
                        } else {
                            omVar = new om();
                        }
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    String contentEncoding = httpURLConnection.getContentEncoding();
                    if (contentEncoding != null && contentEncoding.equals("gzip")) {
                        C0117 c01172 = new C0117(inputStream);
                        c0117 = c01172;
                        inputStream = c01172;
                    }
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        os osVar = new os(errorStream);
                        String str2 = new String(osVar.m939());
                        osVar.f3371.close();
                        osVar.f3371 = null;
                        throw new ut("Error " + responseCode + ": " + str2);
                    }
                    if (responseCode != 200 && responseCode != 206) {
                        throw new uw(null, str, "to=" + (file != null ? file.getAbsolutePath() : "memory"));
                    }
                    FileOutputStream fileOutputStream = null;
                    if (file != null) {
                        pa.m955(file.getAbsolutePath());
                        if (file.exists()) {
                            file.delete();
                        }
                        try {
                            fileOutputStream = new FileOutputStream(file2, length > 0);
                        } catch (FileNotFoundException e) {
                            throw new ut(e, "Failed to open file for writing: " + file2.getAbsolutePath() + ". More info:\n" + e.toString(), false);
                        }
                    }
                    try {
                        long jCurrentTimeMillis = 0;
                        long j = length;
                        byte[] bArr = new byte[1048576];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            if (omVar != null) {
                                omVar.m922(bArr, i);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.write(bArr, 0, i);
                            }
                            j += i;
                            if (poVar != null && jCurrentTimeMillis + 250 < System.currentTimeMillis()) {
                                if (c0117 != null) {
                                    poVar.mo548(c0117.m1143().getBytesRead() + length, contentLength);
                                } else {
                                    poVar.mo548(j, contentLength);
                                }
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                        }
                        if (poVar != null) {
                            if (c0117 != null) {
                                poVar.mo548(c0117.m1143().getBytesRead() + length, contentLength);
                            } else {
                                poVar.mo548(j, contentLength);
                            }
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        inputStream.close();
                        httpURLConnection.disconnect();
                        if (file != null) {
                            file2.renameTo(file);
                            if (lastModified != 0) {
                                file.setLastModified(lastModified);
                            }
                        }
                        if (omVar != null) {
                            return Arrays.copyOf(omVar.f3345.array(), omVar.f3345.position());
                        }
                        return null;
                    } catch (EOFException unused2) {
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        inputStream.close();
                        httpURLConnection.disconnect();
                        throw new ut("Failed to download " + str);
                    }
                } catch (EOFException e2) {
                    throw new ut("Failed to download " + str + "\nCheck your internet connection\n\n" + e2.getMessage());
                } catch (FileNotFoundException e3) {
                    f5349.add(str);
                    throw new uw(e3, str, "to=" + (file != null ? file.getAbsolutePath() : "memory"));
                } catch (ConnectException e4) {
                    throw new ut("Failed to open remote file: " + str + "\nCheck your Internet connection\n\n" + e4.getMessage());
                } catch (UnknownHostException e5) {
                    throw new ut(e5.toString());
                }
            } catch (SocketTimeoutException e6) {
                throw new ut(e6, "Failed to download " + str + " : connection timeout\n\n" + e6.getLocalizedMessage(), false);
            } catch (IOException e7) {
                if (e7.getMessage().contains("ENOSPC")) {
                    throw new ut(e7, "No space left on device", false);
                }
                throw new RuntimeException(e7);
            } catch (RuntimeException e8) {
                if (e8.toString().contains("ETIMEDOUT")) {
                    throw new ut(e8, "Timeout occured while trying to download " + str + "\nCheck your Internet connection settings\n\n" + e8.getLocalizedMessage(), false);
                }
                throw e8;
            }
        } catch (FileNotFoundException e9) {
            if (file != null && e9.toString().contains("EROFS")) {
                throw new ut("Couldn't create file " + file.getAbsolutePath() + ": file system is read-only\n\n" + e9.getMessage());
            }
            if (file != null && e9.toString().contains("EACCES")) {
                throw new ut("Couldn't create file " + file.getAbsolutePath() + ": file system access error\n\n" + e9.getMessage());
            }
            pc.m997("FileNotFoundException (url = " + str + ", to=" + (file != null ? file.getAbsolutePath() : "memory") + "). Details:");
            throw new ux(e9);
        }
    }
}
