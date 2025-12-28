package o;

import android.media.MediaPlayer;

/* renamed from: o.䒀, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0577 implements MediaPlayer.OnPreparedListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0919 f7367;

    C0577(C0919 c0919) {
        this.f7367 = c0919;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.start();
    }
}
