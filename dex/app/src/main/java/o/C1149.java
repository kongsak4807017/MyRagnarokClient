package o;

import com.roworkshop.andro.c_activity;
import o.Cif;

/* renamed from: o.휺, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class C1149 implements Cif.InterfaceC0053 {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f9004;

    /* renamed from: 櫯, reason: contains not printable characters */
    private static final byte[] f9003 = {101, -49, 106, -95, 47, 15, -2, -4, 26, 2, 10, -75, 75, 8, 22, -8, 5, 24, -8, 6, -47};

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static int f9002 = 40;

    public C1149(c_activity c_activityVar) {
        this.f9004 = c_activityVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m1652() {
        int i = 4;
        byte[] bArr = f9003;
        int i2 = 0;
        byte[] bArr2 = new byte[18];
        byte b = 0 + 69;
        if (bArr == null) {
            i = 4 + 1;
            b = (4 + 69) - 7;
        }
        while (true) {
            bArr2[i2] = b;
            int i3 = i2;
            i2++;
            if (i3 == 17) {
                return new String(bArr2, 0);
            }
            i++;
            b = (b + bArr[i]) - 7;
        }
    }

    @Override // o.Cif.InterfaceC0053
    /* renamed from: 鷭 */
    public final void mo673(boolean z) {
        if (z) {
            throw new ut(m1652());
        }
    }
}
