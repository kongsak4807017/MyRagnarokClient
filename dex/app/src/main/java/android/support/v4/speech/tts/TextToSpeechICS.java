package android.support.v4.speech.tts;

import android.content.Context;
import android.os.Build;
import android.speech.tts.TextToSpeech;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class TextToSpeechICS {
    private static final String TAG = "android.support.v4.speech.tts";

    TextToSpeechICS() {
    }

    static TextToSpeech construct(Context context, TextToSpeech.OnInitListener onInitListener, String str) {
        if (Build.VERSION.SDK_INT < 14) {
            if (str == null) {
                return new TextToSpeech(context, onInitListener);
            }
            return new TextToSpeech(context, onInitListener);
        }
        return new TextToSpeech(context, onInitListener, str);
    }
}
