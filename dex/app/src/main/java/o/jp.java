package o;

import android.app.AlertDialog;
import android.view.ViewGroup;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jp implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ int f1855;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ int f1856;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f1857;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f1858;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1859;

    jp(je jeVar, String str, String str2, int i, int i2) {
        this.f1859 = jeVar;
        this.f1858 = str;
        this.f1857 = str2;
        this.f1856 = i;
        this.f1855 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1859.f1735 == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
            if (this.f1859.f1813.f1844.getParent() != null) {
                ((ViewGroup) this.f1859.f1813.f1844.getParent()).removeView(this.f1859.f1813.f1844);
            }
            builder.setView(this.f1859.f1813.f1844);
            builder.setPositiveButton("Cancel", new jq(this));
            builder.setCancelable(false);
            this.f1859.f1735 = builder.show();
            this.f1859.f1813.f1841.setMax(100);
            this.f1859.f1813.f1839.setMax(100);
            this.f1859.f1813.f1841.setVisibility(0);
            this.f1859.f1813.f1841.setVisibility(0);
        }
        this.f1859.f1813.f1843.setText(this.f1858);
        this.f1859.f1813.f1842.setText(this.f1857);
        if (this.f1856 != -1) {
            this.f1859.f1813.f1841.setProgress(this.f1856);
        } else {
            this.f1859.f1813.f1841.setVisibility(8);
        }
        if (this.f1855 != -1) {
            this.f1859.f1813.f1839.setProgress(this.f1855);
        } else {
            this.f1859.f1813.f1839.setVisibility(8);
        }
    }
}
