package org.apache.http.client.utils;

import java.util.StringTokenizer;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class Rfc3492Idn implements Idn {
    private static final String ACE_PREFIX = "xn--";
    private static final int base = 36;
    private static final int damp = 700;
    private static final char delimiter = '-';
    private static final int initial_bias = 72;
    private static final int initial_n = 128;
    private static final int skew = 38;
    private static final int tmax = 26;
    private static final int tmin = 1;

    private int adapt(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = i / damp;
        } else {
            i3 = i / 2;
        }
        int i4 = i3 + (i3 / i2);
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    private int digit(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        }
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        if (c >= '0' && c <= '9') {
            return (c - '0') + 26;
        }
        throw new IllegalArgumentException("illegal digit: " + c);
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (sb.length() > 0) {
                sb.append('.');
            }
            if (strNextToken.startsWith(ACE_PREFIX)) {
                strNextToken = decode(strNextToken.substring(4));
            }
            sb.append(strNextToken);
        }
        return sb.toString();
    }

    protected String decode(String str) {
        int i;
        int length = 128;
        int i2 = 0;
        int iAdapt = initial_bias;
        StringBuilder sb = new StringBuilder(str.length());
        int iLastIndexOf = str.lastIndexOf(45);
        if (iLastIndexOf != -1) {
            sb.append(str.subSequence(0, iLastIndexOf));
            str = str.substring(iLastIndexOf + 1);
        }
        while (!str.isEmpty()) {
            int i3 = i2;
            int i4 = 1;
            int i5 = 36;
            while (!str.isEmpty()) {
                char cCharAt = str.charAt(0);
                str = str.substring(1);
                int iDigit = digit(cCharAt);
                i2 += iDigit * i4;
                if (i5 <= iAdapt + 1) {
                    i = 1;
                } else if (i5 >= iAdapt + 26) {
                    i = 26;
                } else {
                    i = i5 - iAdapt;
                }
                if (iDigit < i) {
                    break;
                }
                i4 *= 36 - i;
                i5 += 36;
            }
            iAdapt = adapt(i2 - i3, sb.length() + 1, i3 == 0);
            length += i2 / (sb.length() + 1);
            int length2 = i2 % (sb.length() + 1);
            sb.insert(length2, (char) length);
            i2 = length2 + 1;
        }
        return sb.toString();
    }
}
