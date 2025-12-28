package android.support.v4.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.support.v4.media.IMediaBrowserServiceCallbacksAdapterApi21;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class IMediaBrowserServiceAdapterApi21 {
    IMediaBrowserServiceAdapterApi21() {
    }

    static abstract class Stub extends Binder implements IInterface {
        private static final String DESCRIPTOR = "android.service.media.IMediaBrowserService";
        private static final int TRANSACTION_addSubscription = 3;
        private static final int TRANSACTION_connect = 1;
        private static final int TRANSACTION_disconnect = 2;
        private static final int TRANSACTION_getMediaItem = 5;
        private static final int TRANSACTION_removeSubscription = 4;

        public abstract void addSubscription(String str, Object obj);

        public abstract void connect(String str, Bundle bundle, Object obj);

        public abstract void disconnect(Object obj);

        public abstract void getMediaItem(String str, ResultReceiver resultReceiver);

        public abstract void removeSubscription(String str, Object obj);

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ResultReceiver resultReceiver;
            Bundle bundle;
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    } else {
                        bundle = null;
                    }
                    connect(string, bundle, IMediaBrowserServiceCallbacksAdapterApi21.Stub.asInterface(parcel.readStrongBinder()));
                    break;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    disconnect(IMediaBrowserServiceCallbacksAdapterApi21.Stub.asInterface(parcel.readStrongBinder()));
                    break;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    addSubscription(parcel.readString(), IMediaBrowserServiceCallbacksAdapterApi21.Stub.asInterface(parcel.readStrongBinder()));
                    break;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    removeSubscription(parcel.readString(), IMediaBrowserServiceCallbacksAdapterApi21.Stub.asInterface(parcel.readStrongBinder()));
                    break;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String string2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                    } else {
                        resultReceiver = null;
                    }
                    getMediaItem(string2, resultReceiver);
                    break;
                case 1598968902:
                    parcel2.writeString(DESCRIPTOR);
                    break;
            }
            return true;
        }
    }
}
