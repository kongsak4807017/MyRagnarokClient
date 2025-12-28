package o;

import java.util.HashMap;
import org.apache.commons.net.SocketClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class em {

    /* renamed from: 鷭, reason: contains not printable characters */
    HashMap<Integer, C0039> f1202 = new HashMap<>();

    /* renamed from: o.em$鷭, reason: contains not printable characters */
    class C0039 {

        /* renamed from: 櫯, reason: contains not printable characters */
        String f1204;

        /* renamed from: 鷭, reason: contains not printable characters */
        nt f1205;

        C0039() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m584() throws NumberFormatException {
        for (String str : pa.m978(C0358.f6674.m140(2130968589), ow.UTF8).split(SocketClient.NETASCII_EOL)) {
            String[] strArrSplit = str.split("\t");
            if (strArrSplit.length >= 2) {
                try {
                    int i = Integer.parseInt(strArrSplit[0]);
                    C0039 c0039 = this.f1202.get(Integer.valueOf(i));
                    if (c0039 == null) {
                        c0039 = new C0039();
                        c0039.f1205 = nt.m896(i);
                        this.f1202.put(Integer.valueOf(i), c0039);
                    }
                    c0039.f1204 = strArrSplit[1];
                } catch (NumberFormatException unused) {
                    nz.m907("Invalid stateicon resource ID line: " + str);
                }
            }
        }
    }

    em(cr crVar) throws NumberFormatException {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading sc_db..."));
        m584();
    }
}
