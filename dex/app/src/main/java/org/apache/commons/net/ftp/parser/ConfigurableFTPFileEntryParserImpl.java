package org.apache.commons.net.ftp.parser;

import java.util.Calendar;
import org.apache.commons.net.ftp.Configurable;
import org.apache.commons.net.ftp.FTPClientConfig;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class ConfigurableFTPFileEntryParserImpl extends RegexFTPFileEntryParserImpl implements Configurable {
    private final FTPTimestampParser timestampParser;

    protected abstract FTPClientConfig getDefaultConfiguration();

    public ConfigurableFTPFileEntryParserImpl(String str) {
        super(str);
        this.timestampParser = new FTPTimestampParserImpl();
    }

    public Calendar parseTimestamp(String str) {
        return this.timestampParser.parseTimestamp(str);
    }

    @Override // org.apache.commons.net.ftp.Configurable
    public void configure(FTPClientConfig fTPClientConfig) {
        if (this.timestampParser instanceof Configurable) {
            FTPClientConfig defaultConfiguration = getDefaultConfiguration();
            if (fTPClientConfig != null) {
                if (null == fTPClientConfig.getDefaultDateFormatStr()) {
                    fTPClientConfig.setDefaultDateFormatStr(defaultConfiguration.getDefaultDateFormatStr());
                }
                if (null == fTPClientConfig.getRecentDateFormatStr()) {
                    fTPClientConfig.setRecentDateFormatStr(defaultConfiguration.getRecentDateFormatStr());
                }
                ((Configurable) this.timestampParser).configure(fTPClientConfig);
                return;
            }
            ((Configurable) this.timestampParser).configure(defaultConfiguration);
        }
    }
}
