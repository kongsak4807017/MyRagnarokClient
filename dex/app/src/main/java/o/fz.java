package o;

import android.util.Log;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fz {

    /* renamed from: 鷭, reason: contains not printable characters */
    int f1301 = 5;

    /* renamed from: 櫯, reason: contains not printable characters */
    String[] f1300 = new String[this.f1301];

    fz(String str) throws NumberFormatException {
        for (String str2 : str.split("\r")) {
            String strTrim = (str2.startsWith("\ufeff") ? str2.substring(1) : str2).trim();
            if (!strTrim.startsWith("//")) {
                String[] strArrSplit = strTrim.split("\t");
                if (strArrSplit.length < 2) {
                    continue;
                } else {
                    int i = Integer.parseInt(strArrSplit[0].trim());
                    if (i < 0 || i >= this.f1301) {
                        String str3 = "Invalid shield view type " + i;
                        Log.e("AndRO", str3);
                        throw new nv(str3);
                    }
                    this.f1300[i] = strArrSplit[1].trim();
                }
            }
        }
    }
}
