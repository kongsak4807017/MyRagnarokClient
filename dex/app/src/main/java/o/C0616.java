package o;

import java.util.Arrays;

/* renamed from: o.䱌, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0616 {

    /* renamed from: 鷭, reason: contains not printable characters */
    Cif f7475 = new Cif();

    /* renamed from: 櫯, reason: contains not printable characters */
    Cif f7474 = new Cif();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    C0617 f7473 = new C0617();

    /* renamed from: ȃ, reason: contains not printable characters */
    C0412[] f7472 = new C0412[0];

    C0616() {
    }

    /* renamed from: o.䱌$if, reason: invalid class name */
    class Cif {

        /* renamed from: 櫯, reason: contains not printable characters */
        int f7477;

        /* renamed from: 鷭, reason: contains not printable characters */
        ok[] f7478 = new ok[0];

        Cif() {
        }
    }

    /* renamed from: o.䱌$鷭, reason: contains not printable characters */
    class C0617 {

        /* renamed from: 櫯, reason: contains not printable characters */
        int f7480;

        /* renamed from: 鷭, reason: contains not printable characters */
        C0424[] f7481 = new C0424[0];

        C0617() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: 鷭, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0616 clone() {
        C0616 c0616 = new C0616();
        c0616.f7475.f7478 = (ok[]) Arrays.copyOf(this.f7475.f7478, this.f7475.f7478.length);
        c0616.f7475.f7477 = this.f7475.f7477;
        if (this.f7474 != null) {
            c0616.f7474.f7478 = (ok[]) Arrays.copyOf(this.f7474.f7478, this.f7474.f7478.length);
            c0616.f7474.f7477 = this.f7474.f7477;
        }
        if (this.f7473 != null && this.f7473.f7481 != null) {
            c0616.f7473.f7481 = (C0424[]) Arrays.copyOf(this.f7473.f7481, this.f7473.f7481.length);
            c0616.f7473.f7480 = this.f7473.f7480;
        }
        return c0616;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1398(ir irVar, lv lvVar, C0424[] c0424Arr, C1157 c1157) {
        if (c0424Arr == null) {
            this.f7473 = null;
        } else {
            this.f7473 = new C0617();
            this.f7473.f7481 = new C0424[c0424Arr.length];
            for (C0424 c0424 : c0424Arr) {
                if (!m1396(c0424.f6826, c1157)) {
                    C0424[] c0424Arr2 = this.f7473.f7481;
                    C0617 c0617 = this.f7473;
                    int i = c0617.f7480;
                    c0617.f7480 = i + 1;
                    c0424Arr2[i] = c0424;
                }
            }
        }
        if (lvVar == null) {
            this.f7474 = null;
        } else {
            this.f7474 = new Cif();
            this.f7474.f7478 = new ok[lvVar.f2033.length];
            for (ok okVar : lvVar.f2033) {
                if (!m1396(okVar.f3337, c1157)) {
                    ok[] okVarArr = this.f7474.f7478;
                    Cif cif = this.f7474;
                    int i2 = cif.f7477;
                    cif.f7477 = i2 + 1;
                    okVarArr[i2] = okVar;
                }
            }
        }
        if (irVar == null) {
            this.f7475 = null;
            return;
        }
        this.f7475 = new Cif();
        this.f7475.f7478 = new ok[irVar.f1663.length];
        for (ok okVar2 : irVar.f1663) {
            if (!m1396(okVar2.f3337, c1157)) {
                ok[] okVarArr2 = this.f7475.f7478;
                Cif cif2 = this.f7475;
                int i3 = cif2.f7477;
                cif2.f7477 = i3 + 1;
                okVarArr2[i3] = okVar2;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static boolean m1396(C1030 c1030, C1157 c1157) {
        float f = oc.f3234 * 5.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(c1157.f9031[i] - c1030.f8557[i]) > c1030.f8558[i] + f) {
                return true;
            }
        }
        return false;
    }
}
