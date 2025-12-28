package o;

import android.support.v4.internal.view.SupportMenu;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aaj extends aah {

    /* renamed from: ȃ, reason: contains not printable characters */
    private int f173;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private int f174;

    /* renamed from: 櫯, reason: contains not printable characters */
    private int f175;

    /* renamed from: 鷭, reason: contains not printable characters */
    private int f176;

    public aaj(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m220(aaj aajVar) {
        aaj aajVar2 = new aaj(this.f163);
        int i = aajVar.m207();
        this.f173 = i;
        if (this.f163 != null) {
            yu.m1182(this.f163, this.f164 + 8, i);
        }
        if (this.f163 != null) {
            this.f173 = yu.m1180(this.f163, this.f164 + 8);
        }
        aajVar2.mo197(this.f173);
        if (aajVar2.f163 != null) {
            aajVar2.f174 = yu.m1180(aajVar2.f163, aajVar2.f164 + 4);
        }
        int i2 = aajVar2.f174;
        this.f174 = i2;
        if (this.f163 != null) {
            yu.m1182(this.f163, this.f164 + 4, i2);
        }
        int i3 = m207();
        aajVar2.f174 = i3;
        if (aajVar2.f163 != null) {
            yu.m1182(aajVar2.f163, aajVar2.f164 + 4, i3);
        }
        if (this.f163 != null) {
            this.f174 = yu.m1180(this.f163, this.f164 + 4);
        }
        aajVar2.mo197(this.f174);
        int i4 = m207();
        aajVar2.f173 = i4;
        if (aajVar2.f163 != null) {
            yu.m1182(aajVar2.f163, aajVar2.f164 + 8, i4);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m218() {
        aaj aajVar = new aaj(this.f163);
        if (this.f163 != null) {
            this.f173 = yu.m1180(this.f163, this.f164 + 8);
        }
        aajVar.mo197(this.f173);
        if (this.f163 != null) {
            this.f174 = yu.m1180(this.f163, this.f164 + 4);
        }
        int i = this.f174;
        aajVar.f174 = i;
        if (aajVar.f163 != null) {
            yu.m1182(aajVar.f163, aajVar.f164 + 4, i);
        }
        if (this.f163 != null) {
            this.f174 = yu.m1180(this.f163, this.f164 + 4);
        }
        aajVar.mo197(this.f174);
        if (this.f163 != null) {
            this.f173 = yu.m1180(this.f163, this.f164 + 8);
        }
        int i2 = this.f173;
        aajVar.f173 = i2;
        if (aajVar.f163 != null) {
            yu.m1182(aajVar.f163, aajVar.f164 + 8, i2);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m216() {
        if (this.f163 != null) {
            this.f174 = yu.m1180(this.f163, this.f164 + 4);
        }
        return this.f174;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m217(aaj aajVar) {
        int i = aajVar.m207();
        this.f174 = i;
        if (this.f163 != null) {
            yu.m1182(this.f163, this.f164 + 4, i);
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final int m214() {
        if (this.f163 != null) {
            byte[] bArr = this.f163;
            int i = this.f164 + 2;
            this.f175 = ((short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255))) & 65535;
        }
        return this.f175;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m219(int i) {
        this.f175 = 65535 & i;
        if (this.f163 != null) {
            byte[] bArr = this.f163;
            int i2 = this.f164 + 2;
            short s = (short) i;
            bArr[i2 + 1] = (byte) (s >>> 8);
            bArr[i2] = (byte) (s & 255);
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final void m215(aaj aajVar) {
        int i = aajVar.m207();
        this.f173 = i;
        if (this.f163 != null) {
            yu.m1182(this.f163, this.f164 + 8, i);
        }
    }

    /* renamed from: Ą, reason: contains not printable characters */
    public final int m212() {
        if (this.f163 != null) {
            byte[] bArr = this.f163;
            int i = this.f164;
            this.f176 = ((short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255))) & 65535;
        }
        return this.f176;
    }

    /* renamed from: ą, reason: contains not printable characters */
    public final void m213() {
        this.f176 = SupportMenu.USER_MASK;
        if (this.f163 != null) {
            byte[] bArr = this.f163;
            int i = this.f164;
            bArr[i + 1] = -1;
            bArr[i] = -1;
        }
    }
}
