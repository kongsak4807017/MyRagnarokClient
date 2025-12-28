package o;

import android.widget.SeekBar;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lf implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ kv f1955;

    lf(kv kvVar) {
        this.f1955 = kvVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        kv kvVar = this.f1955;
        c_activity c_activityVar = C0358.f6674;
        c_activity c_activityVar2 = C0358.f6674;
        kvVar.f1933 = new c_point((int) ((c_activityVar.getResources().getDisplayMetrics().densityDpi / 160.0f) * (kv.f1912 + i)), (int) ((c_activityVar2.getResources().getDisplayMetrics().densityDpi / 160.0f) * (kv.f1912 + i)));
        this.f1955.f1917 = i;
        kv.m755(this.f1955);
        this.f1955.m743();
        this.f1955.m745();
    }
}
