package org.apache.http.impl.cookie;

import java.util.BitSet;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SM;
import org.apache.http.cookie.SetCookie;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LaxExpiresHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    private static final Pattern DAY_OF_MONTH_PATTERN;
    private static final BitSet DELIMS;
    private static final Map<String, Integer> MONTHS;
    private static final Pattern MONTH_PATTERN;
    private static final Pattern TIME_PATTERN;
    static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Pattern YEAR_PATTERN;

    static {
        BitSet bitSet = new BitSet();
        bitSet.set(9);
        for (int i = 32; i <= 47; i++) {
            bitSet.set(i);
        }
        for (int i2 = 59; i2 <= 64; i2++) {
            bitSet.set(i2);
        }
        for (int i3 = 91; i3 <= 96; i3++) {
            bitSet.set(i3);
        }
        for (int i4 = 123; i4 <= 126; i4++) {
            bitSet.set(i4);
        }
        DELIMS = bitSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(12);
        concurrentHashMap.put("jan", 0);
        concurrentHashMap.put("feb", 1);
        concurrentHashMap.put("mar", 2);
        concurrentHashMap.put("apr", 3);
        concurrentHashMap.put("may", 4);
        concurrentHashMap.put("jun", 5);
        concurrentHashMap.put("jul", 6);
        concurrentHashMap.put("aug", 7);
        concurrentHashMap.put("sep", 8);
        concurrentHashMap.put("oct", 9);
        concurrentHashMap.put("nov", 10);
        concurrentHashMap.put("dec", 11);
        MONTHS = concurrentHashMap;
        TIME_PATTERN = Pattern.compile("^([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})([^0-9].*)?$");
        DAY_OF_MONTH_PATTERN = Pattern.compile("^([0-9]{1,2})([^0-9].*)?$");
        MONTH_PATTERN = Pattern.compile("^(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)(.*)?$", 2);
        YEAR_PATTERN = Pattern.compile("^([0-9]{2,4})([^0-9].*)?$");
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException, NumberFormatException {
        Args.notNull(setCookie, SM.COOKIE);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int iIntValue = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (!parserCursor.atEnd()) {
            try {
                skipDelims(str, parserCursor);
                sb.setLength(0);
                copyContent(str, parserCursor, sb);
                if (sb.length() == 0) {
                    break;
                }
                if (!z) {
                    Matcher matcher = TIME_PATTERN.matcher(sb);
                    if (matcher.matches()) {
                        z = true;
                        i3 = Integer.parseInt(matcher.group(1));
                        i2 = Integer.parseInt(matcher.group(2));
                        i = Integer.parseInt(matcher.group(3));
                    }
                }
                if (!z2) {
                    Matcher matcher2 = DAY_OF_MONTH_PATTERN.matcher(sb);
                    if (matcher2.matches()) {
                        z2 = true;
                        i4 = Integer.parseInt(matcher2.group(1));
                    }
                }
                if (!z3) {
                    Matcher matcher3 = MONTH_PATTERN.matcher(sb);
                    if (matcher3.matches()) {
                        z3 = true;
                        iIntValue = MONTHS.get(matcher3.group(1).toLowerCase(Locale.ROOT)).intValue();
                    }
                }
                if (!z4) {
                    Matcher matcher4 = YEAR_PATTERN.matcher(sb);
                    if (matcher4.matches()) {
                        z4 = true;
                        i5 = Integer.parseInt(matcher4.group(1));
                    }
                }
            } catch (NumberFormatException unused) {
                throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
            }
        }
        if (!z || !z2 || !z3 || !z4) {
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        if (i5 >= 70 && i5 <= 99) {
            i5 += 1900;
        }
        if (i5 >= 0 && i5 <= 69) {
            i5 += 2000;
        }
        if (i4 <= 0 || i4 > 31 || i5 < 1601 || i3 > 23 || i2 > 59 || i > 59) {
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(UTC);
        calendar.setTimeInMillis(0L);
        calendar.set(13, i);
        calendar.set(12, i2);
        calendar.set(11, i3);
        calendar.set(5, i4);
        calendar.set(2, iIntValue);
        calendar.set(1, i5);
        setCookie.setExpiryDate(calendar.getTime());
    }

    private void skipDelims(CharSequence charSequence, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            if (!DELIMS.get(charSequence.charAt(pos2))) {
                break;
            }
            pos++;
        }
        parserCursor.updatePos(pos);
    }

    private void copyContent(CharSequence charSequence, ParserCursor parserCursor, StringBuilder sb) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char cCharAt = charSequence.charAt(pos2);
            if (DELIMS.get(cCharAt)) {
                break;
            }
            pos++;
            sb.append(cCharAt);
        }
        parserCursor.updatePos(pos);
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.EXPIRES_ATTR;
    }
}
