package o;

import org.apache.http.message.TokenParser;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class vb {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static String[] m1144(byte[] bArr, hz hzVar) {
        if (hzVar != null) {
            hzVar.m1101(0L, 1L);
        }
        String[] strArrSplit = new String(bArr).split("\\r?\\n");
        long length = strArrSplit.length / 10;
        long length2 = length + strArrSplit.length;
        if (hzVar != null) {
            hzVar.m1101(length, length2);
        }
        String strSubstring = null;
        for (int i = 0; i < strArrSplit.length; i++) {
            if (hzVar != null) {
                hzVar.m1101(i + length, length2);
            }
            strArrSplit[i] = strArrSplit[i].trim().replace(TokenParser.ESCAPE, '/');
            String str = strArrSplit[i];
            if (str.length() > 0) {
                if (i == 0) {
                    strSubstring = str;
                }
                int length3 = strSubstring.length();
                if (str.length() < length3) {
                    strSubstring = str;
                } else if (!strSubstring.regionMatches(0, str, 0, length3)) {
                    int iLastIndexOf = str.toLowerCase().lastIndexOf("/data/");
                    if (iLastIndexOf != -1) {
                        iLastIndexOf++;
                    }
                    if (str.startsWith("data/")) {
                        iLastIndexOf = 0;
                    }
                    int i2 = 0;
                    while (i2 < length3 && str.charAt(i2) == strSubstring.charAt(i2) && (iLastIndexOf == -1 || i2 != iLastIndexOf)) {
                        i2++;
                    }
                    if (i2 < length3) {
                        strSubstring = str.substring(0, i2);
                    }
                }
            }
        }
        int length4 = strSubstring.length();
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            strArrSplit[i3] = strArrSplit[i3].substring(length4, strArrSplit[i3].length());
        }
        if (hzVar != null) {
            hzVar.m1101(length2, length2);
        }
        return strArrSplit;
    }
}
