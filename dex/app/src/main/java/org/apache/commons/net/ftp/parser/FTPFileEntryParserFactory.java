package org.apache.commons.net.ftp.parser;

import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFileEntryParser;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface FTPFileEntryParserFactory {
    FTPFileEntryParser createFileEntryParser(String str);

    FTPFileEntryParser createFileEntryParser(FTPClientConfig fTPClientConfig);
}
