package org.apache.http.impl.cookie;

import java.util.Date;
import java.util.TimeZone;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class DateUtils {
    public static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    public static final String PATTERN_ASCTIME = "EEE MMM d HH:mm:ss yyyy";
    public static final String PATTERN_RFC1036 = "EEE, dd-MMM-yy HH:mm:ss zzz";
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";

    public static Date parseDate(String str) {
        return parseDate(str, null, null);
    }

    public static Date parseDate(String str, String[] strArr) {
        return parseDate(str, strArr, null);
    }

    public static Date parseDate(String str, String[] strArr, Date date) throws DateParseException {
        Date date2 = org.apache.http.client.utils.DateUtils.parseDate(str, strArr, date);
        if (date2 == null) {
            throw new DateParseException("Unable to parse the date " + str);
        }
        return date2;
    }

    public static String formatDate(Date date) {
        return org.apache.http.client.utils.DateUtils.formatDate(date);
    }

    public static String formatDate(Date date, String str) {
        return org.apache.http.client.utils.DateUtils.formatDate(date, str);
    }

    private DateUtils() {
    }
}
