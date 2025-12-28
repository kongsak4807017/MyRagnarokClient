package o;

import java.nio.ByteBuffer;
import o.ye;

/* renamed from: o.ﬤ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1154 {

    /* renamed from: Ą, reason: contains not printable characters */
    int f9008;

    /* renamed from: ą, reason: contains not printable characters */
    byte f9009;

    /* renamed from: Ć, reason: contains not printable characters */
    C0132 f9010;

    /* renamed from: ć, reason: contains not printable characters */
    int f9011;

    /* renamed from: ċ, reason: contains not printable characters */
    C0637 f9012;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f9013;

    /* renamed from: Ȋ, reason: contains not printable characters */
    int f9014;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    byte f9015;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    short f9016;

    /* renamed from: 岱, reason: contains not printable characters */
    short f9017;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f9018;

    /* renamed from: 纫, reason: contains not printable characters */
    byte f9019;

    /* renamed from: 鷭, reason: contains not printable characters */
    short f9020;

    C1154() {
    }

    C1154(short s, int i, byte b, int i2, int i3, byte b2, C0132 c0132, int i4, short s2, short s3, byte b3, vj[] vjVarArr, byte b4) {
        this.f9020 = s;
        this.f9018 = i;
        this.f9015 = b;
        this.f9013 = i2;
        this.f9008 = i3;
        this.f9009 = b2;
        this.f9010 = c0132;
        this.f9011 = i4;
        this.f9016 = s2;
        this.f9017 = s3;
        this.f9014 = b3;
        if (vjVarArr != null) {
            this.f9012 = new C0637(vjVarArr);
        }
        this.f9019 = b4;
    }

    C1154(ye.C0128 c0128) {
        short s = c0128.f5945;
        int iM968 = pa.m968(c0128.f5944);
        byte b = c0128.f5941;
        short s2 = c0128.f5936;
        short s3 = c0128.f5937;
        byte b2 = c0128.f5939;
        C0132 c0132 = new C0132(c0128.f5942);
        C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(c0128.f5944);
        this(s, iM968, b, s2, s3, b2, c0132, 0, (short) 0, (short) (c0432M1648 == null ? -1 : c0432M1648.f6850), (byte) 0, null, (byte) ((c0128.f5938 != 0 ? 2 : 0) | (c0128.f5940 != 0 ? 1 : 0)));
    }

    C1154(vi viVar) {
        short s = viVar.f5394;
        int iM968 = pa.m968(viVar.f5393);
        byte b = viVar.f5390;
        short s2 = viVar.f5385;
        short s3 = viVar.f5386;
        byte b2 = viVar.f5388;
        C0132 c0132 = new C0132(viVar.f5391);
        int i = viVar.f5392;
        C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(viVar.f5393);
        this(s, iM968, b, s2, s3, b2, c0132, i, (short) 0, (short) (c0432M1648 == null ? -1 : c0432M1648.f6850), (byte) 0, null, (byte) ((viVar.f5387 != 0 ? 2 : 0) | (viVar.f5389 != 0 ? 1 : 0)));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static C1154 m1654(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        int i = byteBuffer.getInt();
        int i2 = byteBuffer.getInt();
        byte b2 = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        int i3 = byteBuffer.getInt();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        byte b3 = byteBuffer.get();
        vj[] vjVarArr = new vj[5];
        for (int i4 = 0; i4 < 5; i4++) {
            vjVarArr[i4] = new vj(byteBuffer);
        }
        return new C1154(s, pa.m968(s2), b, i, i2, b2, c0132, i3, s3, s4, b3, vjVarArr, byteBuffer.get());
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static C1154 m1655(ByteBuffer byteBuffer, int i, boolean z) {
        short s;
        int i2;
        byte b;
        int iM968;
        int iM9682;
        byte b2;
        C0132 c0132;
        if (i <= 0) {
            i = C0358.f6667.f4800;
        }
        int i3 = 0;
        short s2 = 0;
        short s3 = 0;
        byte b3 = 0;
        byte b4 = 0;
        vj[] vjVarArr = null;
        if (i >= 20120712 || z) {
            s = byteBuffer.getShort();
            i2 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            b = byteBuffer.get();
            iM968 = C0358.f6667.f4823 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            iM9682 = C0358.f6667.f4823 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            b2 = byteBuffer.get();
            c0132 = new C0132(byteBuffer);
            i3 = byteBuffer.getInt();
            s2 = byteBuffer.getShort();
            s3 = byteBuffer.getShort();
            if (C0358.f6667.f4785) {
                b4 = byteBuffer.get();
                vjVarArr = new vj[5];
                for (int i4 = 0; i4 < vjVarArr.length; i4++) {
                    vjVarArr[i4] = new vj(byteBuffer);
                }
            }
            b3 = byteBuffer.get();
        } else {
            s = byteBuffer.getShort();
            i2 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            b = byteBuffer.get();
            if (byteBuffer.get() != 0) {
                b3 = 1;
            }
            iM968 = pa.m968(byteBuffer.getShort());
            iM9682 = pa.m968(byteBuffer.getShort());
            if (byteBuffer.get() != 0) {
                b3 = (byte) (b3 | 2);
            }
            b2 = byteBuffer.get();
            c0132 = new C0132(byteBuffer);
            if (i >= 20071002) {
                i3 = byteBuffer.getInt();
                s2 = byteBuffer.getShort();
            }
            if (i >= 20100629) {
                s3 = byteBuffer.getShort();
            }
        }
        return new C1154(s, i2, b, iM968, iM9682, b2, c0132, i3, s2, s3, b4, vjVarArr, b3);
    }
}
