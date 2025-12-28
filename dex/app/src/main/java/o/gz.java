package o;

import android.widget.SeekBar;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gz implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gy f1447;

    gz(gy gyVar) {
        this.f1447 = gyVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f1447.m614(i + 1);
    }
}
