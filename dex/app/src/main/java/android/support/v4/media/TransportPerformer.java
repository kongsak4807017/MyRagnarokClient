package android.support.v4.media;

import android.os.SystemClock;
import android.view.KeyEvent;
import org.apache.commons.net.finger.FingerClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class TransportPerformer {
    static final int AUDIOFOCUS_GAIN = 1;
    static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    static final int AUDIOFOCUS_LOSS = -1;
    static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;

    public abstract long onGetCurrentPosition();

    public abstract long onGetDuration();

    public abstract boolean onIsPlaying();

    public abstract void onPause();

    public abstract void onSeekTo(long j);

    public abstract void onStart();

    public abstract void onStop();

    public int onGetBufferPercentage() {
        return 100;
    }

    public int onGetTransportControlFlags() {
        return 60;
    }

    public boolean onMediaButtonDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case FingerClient.DEFAULT_PORT /* 79 */:
            case 85:
                if (onIsPlaying()) {
                    onPause();
                    break;
                } else {
                    onStart();
                    break;
                }
            case 86:
                onStop();
                break;
            case TransportMediator.KEYCODE_MEDIA_PLAY /* 126 */:
                onStart();
                break;
            case TransportMediator.KEYCODE_MEDIA_PAUSE /* 127 */:
                onPause();
                break;
        }
        return true;
    }

    public boolean onMediaButtonUp(int i, KeyEvent keyEvent) {
        return true;
    }

    public void onAudioFocusChange(int i) {
        char c = 0;
        switch (i) {
            case -1:
                c = 127;
                break;
        }
        if (c != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            onMediaButtonDown(TransportMediator.KEYCODE_MEDIA_PAUSE, new KeyEvent(jUptimeMillis, jUptimeMillis, 0, TransportMediator.KEYCODE_MEDIA_PAUSE, 0));
            onMediaButtonUp(TransportMediator.KEYCODE_MEDIA_PAUSE, new KeyEvent(jUptimeMillis, jUptimeMillis, 1, TransportMediator.KEYCODE_MEDIA_PAUSE, 0));
        }
    }
}
