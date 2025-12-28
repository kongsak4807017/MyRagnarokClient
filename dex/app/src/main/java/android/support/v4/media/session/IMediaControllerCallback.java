package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface IMediaControllerCallback extends IInterface {
    void onEvent(String str, Bundle bundle);

    void onExtrasChanged(Bundle bundle);

    void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat);

    void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat);

    void onQueueChanged(List<MediaSessionCompat.QueueItem> list);

    void onQueueTitleChanged(CharSequence charSequence);

    void onSessionDestroyed();

    void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo);

    public static abstract class Stub extends Binder implements IMediaControllerCallback {
        private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
        static final int TRANSACTION_onEvent = 1;
        static final int TRANSACTION_onExtrasChanged = 7;
        static final int TRANSACTION_onMetadataChanged = 4;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onQueueChanged = 5;
        static final int TRANSACTION_onQueueTitleChanged = 6;
        static final int TRANSACTION_onSessionDestroyed = 2;
        static final int TRANSACTION_onVolumeInfoChanged = 8;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMediaControllerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMediaControllerCallback)) {
                return (IMediaControllerCallback) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ParcelableVolumeInfo parcelableVolumeInfoCreateFromParcel;
            Bundle bundle;
            CharSequence charSequence;
            MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
            PlaybackStateCompat playbackStateCompatCreateFromParcel;
            Bundle bundle2;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    String string = parcel.readString();
                    if (0 != parcel.readInt()) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle2 = null;
                    }
                    onEvent(string, bundle2);
                    break;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSessionDestroyed();
                    break;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (0 != parcel.readInt()) {
                        playbackStateCompatCreateFromParcel = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    } else {
                        playbackStateCompatCreateFromParcel = null;
                    }
                    onPlaybackStateChanged(playbackStateCompatCreateFromParcel);
                    break;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (0 != parcel.readInt()) {
                        mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    } else {
                        mediaMetadataCompatCreateFromParcel = null;
                    }
                    onMetadataChanged(mediaMetadataCompatCreateFromParcel);
                    break;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onQueueChanged(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    break;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (0 != parcel.readInt()) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    } else {
                        charSequence = null;
                    }
                    onQueueTitleChanged(charSequence);
                    break;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (0 != parcel.readInt()) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle = null;
                    }
                    onExtrasChanged(bundle);
                    break;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (0 != parcel.readInt()) {
                        parcelableVolumeInfoCreateFromParcel = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    } else {
                        parcelableVolumeInfoCreateFromParcel = null;
                    }
                    onVolumeInfoChanged(parcelableVolumeInfoCreateFromParcel);
                    break;
                case 1598968902:
                    parcel2.writeString(DESCRIPTOR);
                    break;
            }
            return true;
        }

        static class Proxy implements IMediaControllerCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (mediaMetadataCompat != null) {
                        parcelObtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    this.mRemote.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (charSequence != null) {
                        parcelObtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (parcelableVolumeInfo != null) {
                        parcelObtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
