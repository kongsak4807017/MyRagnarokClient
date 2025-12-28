package o;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import o.C0804;

/* renamed from: o.궱, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0987 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.C0806 f8341;

    ViewOnClickListenerC0987(C0804.C0806 c0806) {
        this.f8341 = c0806;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        short s;
        C0804.C0806 c0806 = this.f8341;
        ArrayList<C0804.C0807> arrayListM1479 = ((C0804.C0808) C0804.this.f7869.getAdapter()).m1479();
        short s2 = 0;
        while (true) {
            if (s2 >= 12) {
                s = -1;
                break;
            }
            boolean z = false;
            Iterator<C0804.C0807> it = arrayListM1479.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f7917.f3266 == s2) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                s = s2;
                break;
            }
            s2 = (short) (s2 + 1);
        }
        if (s == -1) {
            Toast.makeText(C0358.f6674, "Failed to create character: no slots available", 1).show();
            return;
        }
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Creating character"));
        int progress = c0806.f7905.getProgress() + 1;
        int i = 10 - progress;
        int progress2 = c0806.f7909.getProgress() + 1;
        int i2 = 10 - progress2;
        int progress3 = c0806.f7903.getProgress() + 1;
        int i3 = 10 - progress3;
        if (C0358.f6667.f4782) {
            b bVar = C0358.f6671;
            String string = c0806.f7904.getText().toString();
            short s3 = s;
            int i4 = c0806.f7910;
            int i5 = c0806.f7898;
            EnumC0134 enumC0134 = (C0358.f6667.f4782 && c0806.f7906.isChecked()) ? EnumC0134.SUMMONER : EnumC0134.NOVICE;
            bVar.mo454(new C0210(string, s3, i4, i5, enumC0134, c0806.f7912.isChecked() ? EnumC0765.MALE : EnumC0765.FEMALE));
        } else {
            C0358.f6671.mo454(new C0212(c0806.f7904.getText().toString(), (byte) s, (short) c0806.f7898, (short) c0806.f7910, i, i3, i2, progress, progress2, progress3));
        }
        ((InputMethodManager) C0358.f6674.getSystemService("input_method")).hideSoftInputFromWindow(c0806.f7904.getWindowToken(), 0);
    }
}
