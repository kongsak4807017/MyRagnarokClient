package android.support.v4.media;

import android.view.KeyEvent;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
interface TransportMediatorCallback {
    long getPlaybackPosition();

    void handleAudioFocusChange(int i);

    void handleKey(KeyEvent keyEvent);

    void playbackPositionUpdate(long j);
}
