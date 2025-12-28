package o;

import java.net.SocketException;
import o.pj;

/* renamed from: o.齴, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0964 extends fc {
    C0964(String str, String str2, int i, byte b, boolean z) throws SocketException {
        if (C0358.f6667.f4771 == pj.aux.Eden3) {
            this.f5008 = (short) -26331;
        } else {
            this.f5008 = (short) 2085;
        }
        String strM915 = ob.m915();
        String strM914 = ob.m914();
        String str3 = str;
        String str4 = str2;
        if (C0358.f6667.f4771 == pj.aux.MOTR) {
            str3 = "andro";
            str4 = String.valueOf(str) + "#" + str2;
        }
        this.f4868.putInt(i);
        this.f4868.put(b);
        this.f4868.put(pa.m986(str3, ow.LATIN, 24));
        this.f4868.put(new byte[27]);
        this.f4868.put(pa.m986(strM915, ow.LATIN, 17));
        this.f4868.put(pa.m986(strM914, ow.LATIN, 15));
        this.f4868.put(pa.m987(str4, ow.LATIN, true));
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
