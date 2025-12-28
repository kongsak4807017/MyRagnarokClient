package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileEntryParser;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class CompositeFileEntryParser extends FTPFileEntryParserImpl {
    private FTPFileEntryParser cachedFtpFileEntryParser = null;
    private final FTPFileEntryParser[] ftpFileEntryParsers;

    public CompositeFileEntryParser(FTPFileEntryParser[] fTPFileEntryParserArr) {
        this.ftpFileEntryParsers = fTPFileEntryParserArr;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        if (this.cachedFtpFileEntryParser != null) {
            FTPFile fTPEntry = this.cachedFtpFileEntryParser.parseFTPEntry(str);
            if (fTPEntry != null) {
                return fTPEntry;
            }
            return null;
        }
        for (FTPFileEntryParser fTPFileEntryParser : this.ftpFileEntryParsers) {
            FTPFile fTPEntry2 = fTPFileEntryParser.parseFTPEntry(str);
            if (fTPEntry2 != null) {
                this.cachedFtpFileEntryParser = fTPFileEntryParser;
                return fTPEntry2;
            }
        }
        return null;
    }
}
