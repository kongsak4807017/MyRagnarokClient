package o;

import o.vq;

/* renamed from: o.廑, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0683 extends vr implements vf {

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private static /* synthetic */ int[] f7618;

    C0683() {
    }

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m1415() {
        int[] iArr = f7618;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[vq.EnumC0119.valuesCustom().length];
        try {
            iArr2[vq.EnumC0119.FAIL_FILE_NOT_EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[vq.EnumC0119.FAIL_UNKNOWN_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[vq.EnumC0119.SUCCESS_STARTING_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vq.EnumC0119.SUCCESS_STARTING_UNPACKED_TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f7618 = iArr2;
        return iArr2;
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        m1416(new String(this.f5423), this.f5424, this.f5421, this.f5422);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1416(String str, vq.EnumC0119 enumC0119, long j, long j2) {
        du duVar;
        boolean z = true;
        if (C0358.f6676 != null) {
            duVar = C0358.f6676.f1081;
        } else if (C0358.f6674.f45 != null) {
            duVar = C0358.f6674.f45;
        } else {
            throw new nv();
        }
        switch (m1415()[enumC0119.ordinal()]) {
            case 1:
                break;
            case 2:
                duVar.m561();
                return;
            case 3:
                throw new nv("Failed to retrieve resource: " + String.valueOf(str));
            case 4:
                z = false;
                break;
            default:
                throw new nv();
        }
        duVar.m563(str, j, j2, z);
    }
}
