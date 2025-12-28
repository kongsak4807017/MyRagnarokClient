package o;

import java.util.ArrayList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class gv {

    /* renamed from: Ą, reason: contains not printable characters */
    final /* synthetic */ gu f1412;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f1413;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    ArrayList<Integer> f1414 = new ArrayList<>();

    /* renamed from: 櫯, reason: contains not printable characters */
    int f1415;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f1416;

    gv(gu guVar, String str) {
        this.f1412 = guVar;
        try {
            String[] strArrSplit = str.trim().split("#");
            for (int i = 0; i < strArrSplit.length; i++) {
                strArrSplit[i] = strArrSplit[i].trim();
            }
            if (strArrSplit.length < 2) {
                throw new IllegalArgumentException(str);
            }
            this.f1416 = strArrSplit[0];
            this.f1415 = Integer.parseInt(strArrSplit[1]);
            this.f1413 = Integer.parseInt(strArrSplit[strArrSplit.length - 1]);
            for (int i2 = 2; i2 < strArrSplit.length - 1; i2++) {
                try {
                    this.f1414.add(Integer.valueOf(Integer.parseInt(strArrSplit[i2])));
                } catch (NumberFormatException unused) {
                    nz.m907("error in skill tree entry string " + str + ": invalid prerec pos");
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(str, e);
        }
    }
}
