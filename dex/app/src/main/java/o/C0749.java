package o;

import android.widget.SeekBar;

/* renamed from: o.梗, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0749 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0502 f7741;

    C0749(C0502 c0502) {
        this.f7741 = c0502;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f7741.f6983.setText(String.valueOf(i + 2));
    }
}
