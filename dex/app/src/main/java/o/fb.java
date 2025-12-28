package o;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.InputDeviceCompat;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fb extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0040[] f1240;

    /* renamed from: o.fb$鷭, reason: contains not printable characters */
    class C0040 {

        /* renamed from: 纫, reason: contains not printable characters */
        private static /* synthetic */ int[] f1241;

        /* renamed from: Ą, reason: contains not printable characters */
        boolean f1242;

        /* renamed from: ą, reason: contains not printable characters */
        TextView f1243;

        /* renamed from: Ć, reason: contains not printable characters */
        TextView f1244;

        /* renamed from: ć, reason: contains not printable characters */
        TextView f1245;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f1247;

        /* renamed from: Ȋ, reason: contains not printable characters */
        ImageView[] f1248 = new ImageView[3];

        /* renamed from: ˮ͈, reason: contains not printable characters */
        pj.C0079 f1249;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        TextView f1250;

        /* renamed from: 岱, reason: contains not printable characters */
        ProgressBar f1251;

        /* renamed from: 櫯, reason: contains not printable characters */
        RelativeLayout f1252;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f1253;

        /* renamed from: 鷭, reason: contains not printable characters */
        static /* synthetic */ int[] m590() {
            int[] iArr = f1241;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[pj.EnumC0078.valuesCustom().length];
            try {
                iArr2[pj.EnumC0078.eu.ordinal()] = 7;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[pj.EnumC0078.gb.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[pj.EnumC0078.id.ordinal()] = 8;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[pj.EnumC0078.ph.ordinal()] = 6;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[pj.EnumC0078.ru.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[pj.EnumC0078.sg.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[pj.EnumC0078.th.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[pj.EnumC0078.us.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f1241 = iArr2;
            return iArr2;
        }

        C0040(pj.C0079 c0079, int i, int i2, boolean z) {
            this.f1247 = -1;
            this.f1249 = c0079;
            this.f1247 = i;
            this.f1253 = i2;
            this.f1242 = z;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final void m591(int i) {
            int i2;
            String str;
            this.f1247 = i;
            if (this.f1251 != null) {
                this.f1251.setVisibility(this.f1247 == -1 ? 0 : 4);
            }
            if (this.f1245 != null) {
                this.f1245.setVisibility(this.f1247 == -1 ? 4 : 0);
            }
            if (this.f1247 >= 0) {
                if (this.f1247 < 75) {
                    i2 = -16711936;
                    str = "fast";
                } else if (this.f1247 < 200) {
                    i2 = InputDeviceCompat.SOURCE_ANY;
                    str = "average";
                } else {
                    i2 = SupportMenu.CATEGORY_MASK;
                    str = "slow";
                }
                if (this.f1245 != null) {
                    this.f1245.setText("Ping : " + this.f1247 + " (" + str + ")");
                    this.f1245.setTextColor(i2);
                    return;
                }
                return;
            }
            if (this.f1245 != null) {
                this.f1245.setText("Ping : 1000+ (slow or n/a)");
                this.f1245.setTextColor(SupportMenu.CATEGORY_MASK);
            }
        }
    }

    fb(pj.C0079[] c0079Arr, int[] iArr) {
        this.f1240 = new C0040[c0079Arr.length];
        for (int i = 0; i < this.f1240.length; i++) {
            this.f1240[i] = new C0040(c0079Arr[i], iArr[i], i, c0079Arr.length > 10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1240.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f1240[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fb.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
