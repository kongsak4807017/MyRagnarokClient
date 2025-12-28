package o;

import java.util.Arrays;

/* renamed from: o.Ǘ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0216 extends fc {
    C0216() {
        this.f5008 = (short) -15470;
        byte[] bArrM985 = pa.m985(ob.m915(), ":");
        bArrM985 = bArrM985.length != 6 ? Arrays.copyOf(bArrM985, 6) : bArrM985;
        int iPosition = this.f4868.position();
        this.f4868.putInt(0);
        int iPosition2 = this.f4868.position();
        this.f4868.putInt(0);
        this.f4868.putInt(C0358.f6667.f4805 != 0 ? C0358.f6667.f4805 : C0358.f6671.f751.mo1079());
        this.f4868.putInt((int) C0358.m1290());
        this.f4868.put(bArrM985);
        this.f4868.putShort((short) 0);
        this.f4868.putShort((short) C0358.f6671.f751.f4947);
        this.f4868.putShort((short) C0358.f6671.f751.f4945);
        this.f4868.putShort((short) C0358.f6671.f751.f4941);
        this.f4868.putShort((short) C0358.f6671.f751.f4946);
        this.f4868.putInt(iPosition, C0358.f6671.f751.m1080(this.f4868.array(), iPosition2, this.f4868.position() - iPosition2));
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
