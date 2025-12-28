package o;

import com.roworkshop.ro.grf;

/* renamed from: o.呏, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0648 extends tv {
    @Override // o.tv
    /* renamed from: 鷭 */
    protected final int mo1090(String str) {
        return grf.open(str);
    }

    @Override // o.tv
    /* renamed from: 鷭 */
    public final int mo1092(byte[] bArr, byte[] bArr2) {
        return grf.append(bArr, bArr2);
    }

    @Override // o.tv
    /* renamed from: 鷭 */
    public final int mo1091(byte[] bArr) {
        return grf.delete(bArr);
    }

    @Override // o.tv
    /* renamed from: 鷭 */
    public final void mo1093() {
        grf.free();
    }
}
