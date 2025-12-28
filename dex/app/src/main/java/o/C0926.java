package o;

import java.nio.ByteBuffer;
import o.ue;

/* renamed from: o.髑, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0926 extends ub {
    C0926() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 402;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        ow owVar = ow.KOREAN;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        if (C0358.f6669.f2063 == null || C0358.f6669.f2063.f6887 == null) {
            nz.m907("Map not loaded: didn't change map cell.");
            return;
        }
        if (!strM978.equals(String.valueOf(C0358.f6669.f2063.f6887) + ".gat")) {
            nz.m907("Attempt to modify cell of another map " + strM978 + " (current one: " + C0358.f6669.f2063 + ".gat)");
            return;
        }
        ue ueVar = C0358.f6669.f2063.f6876;
        byte b = (byte) s3;
        if (s < 0 || s >= ueVar.f5057 || s2 < 0 || s2 >= ueVar.f5057) {
            pc.m997("Invalid x/y while trying to change map cell.");
            return;
        }
        ue.C0089 c0089M1112 = ueVar.m1112((ueVar.f5057 * s2) + s);
        if (c0089M1112 == null) {
            pc.m997("Attempt to change unexistant block type");
        } else {
            c0089M1112.f5061 = b;
        }
    }
}
