package o;

import java.nio.ByteBuffer;

/* renamed from: o.冱, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0637 {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0638[] f7510;

    /* renamed from: o.冱$鷭, reason: contains not printable characters */
    class C0638 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        byte f7512;

        /* renamed from: 櫯, reason: contains not printable characters */
        short f7513;

        /* renamed from: 鷭, reason: contains not printable characters */
        short f7514;

        C0638(ByteBuffer byteBuffer) {
            this.f7514 = byteBuffer.getShort();
            this.f7513 = byteBuffer.getShort();
            this.f7512 = byteBuffer.get();
        }

        C0638(vj vjVar) {
            this.f7514 = vjVar.f5397;
            this.f7513 = vjVar.f5396;
            this.f7512 = vjVar.f5395;
        }
    }

    C0637(ByteBuffer byteBuffer) {
        this.f7510 = new C0638[5];
        for (int i = 0; i < 5; i++) {
            this.f7510[i] = new C0638(byteBuffer);
        }
    }

    public C0637(vj[] vjVarArr) {
        this.f7510 = new C0638[5];
        for (int i = 0; i < 5; i++) {
            this.f7510[i] = new C0638(vjVarArr[i]);
        }
    }
}
