package android.support.v4.app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.RemoteInputCompatBase;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class RemoteInput extends RemoteInputCompatBase.RemoteInput {
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final RemoteInputCompatBase.RemoteInput.Factory FACTORY;
    private static final Impl IMPL;
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    private static final String TAG = "RemoteInput";
    private final boolean mAllowFreeFormInput;
    private final CharSequence[] mChoices;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    interface Impl {
        void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle);

        Bundle getResultsFromIntent(Intent intent);
    }

    private RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
        this.mResultKey = str;
        this.mLabel = charSequence;
        this.mChoices = charSequenceArr;
        this.mAllowFreeFormInput = z;
        this.mExtras = bundle;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final String getResultKey() {
        return this.mResultKey;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final CharSequence getLabel() {
        return this.mLabel;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final CharSequence[] getChoices() {
        return this.mChoices;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormInput;
    }

    @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput
    public final Bundle getExtras() {
        return this.mExtras;
    }

    public static final class Builder {
        private CharSequence[] mChoices;
        private CharSequence mLabel;
        private final String mResultKey;
        private boolean mAllowFreeFormInput = true;
        private Bundle mExtras = new Bundle();

        public Builder(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.mResultKey = str;
        }

        public final Builder setLabel(CharSequence charSequence) {
            this.mLabel = charSequence;
            return this;
        }

        public final Builder setChoices(CharSequence[] charSequenceArr) {
            this.mChoices = charSequenceArr;
            return this;
        }

        public final Builder setAllowFreeFormInput(boolean z) {
            this.mAllowFreeFormInput = z;
            return this;
        }

        public final Builder addExtras(Bundle bundle) {
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            return this;
        }

        public final Bundle getExtras() {
            return this.mExtras;
        }

        public final RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormInput, this.mExtras);
        }
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        return IMPL.getResultsFromIntent(intent);
    }

    public static void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
        IMPL.addResultsToIntent(remoteInputArr, intent, bundle);
    }

    static class ImplBase implements Impl {
        ImplBase() {
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Bundle getResultsFromIntent(Intent intent) {
            return null;
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
        }
    }

    static class ImplJellybean implements Impl {
        ImplJellybean() {
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatJellybean.getResultsFromIntent(intent);
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
            RemoteInputCompatJellybean.addResultsToIntent(remoteInputArr, intent, bundle);
        }
    }

    static class ImplApi20 implements Impl {
        ImplApi20() {
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatApi20.getResultsFromIntent(intent);
        }

        @Override // android.support.v4.app.RemoteInput.Impl
        public void addResultsToIntent(RemoteInput[] remoteInputArr, Intent intent, Bundle bundle) {
            RemoteInputCompatApi20.addResultsToIntent(remoteInputArr, intent, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            IMPL = new ImplApi20();
        } else if (Build.VERSION.SDK_INT >= 16) {
            IMPL = new ImplJellybean();
        } else {
            IMPL = new ImplBase();
        }
        FACTORY = new RemoteInputCompatBase.RemoteInput.Factory() { // from class: android.support.v4.app.RemoteInput.1
            @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory
            public final RemoteInput build(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
                return new RemoteInput(str, charSequence, charSequenceArr, z, bundle);
            }

            @Override // android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory
            public final RemoteInput[] newArray(int i) {
                return new RemoteInput[i];
            }
        };
    }
}
