package o;

import java.util.Comparator;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class pn implements Comparator<String> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        return (str4.equals("data.grf") ? 0 : str4.equals("rdata.grf") ? 1 : 2) - (str3.equals("data.grf") ? 0 : str3.equals("rdata.grf") ? 1 : 2);
    }

    pn() {
    }
}
