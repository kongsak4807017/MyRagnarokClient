package o;

import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jx extends ClickableSpan {

    /* renamed from: 鷭, reason: contains not printable characters */
    private final /* synthetic */ String[] f1874;

    jx(String[] strArr) {
        this.f1874 = strArr;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Toast.makeText(view.getContext(), String.valueOf(this.f1874[0]) + " " + this.f1874[1] + "," + this.f1874[2], 0).show();
    }
}
