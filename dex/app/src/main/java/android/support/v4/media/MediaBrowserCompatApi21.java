package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class MediaBrowserCompatApi21 {
    static final String NULL_MEDIA_ITEM_ID = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    interface ConnectionCallback {
        void onConnected();

        void onConnectionFailed();

        void onConnectionSuspended();
    }

    interface SubscriptionCallback {
        void onChildrenLoaded(String str, List<Parcel> list);

        void onError(String str);
    }

    MediaBrowserCompatApi21() {
    }

    public static Object createConnectionCallback(ConnectionCallback connectionCallback) {
        return new ConnectionCallbackProxy(connectionCallback);
    }

    public static Object createBrowser(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static void connect(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static void disconnect(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static boolean isConnected(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    public static ComponentName getServiceComponent(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    public static String getRoot(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    public static Bundle getExtras(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static Object getSessionToken(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static Object createSubscriptionCallback(SubscriptionCallback subscriptionCallback) {
        return new SubscriptionCallbackProxy(subscriptionCallback);
    }

    public static void subscribe(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void unsubscribe(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }

    static class ConnectionCallbackProxy<T extends ConnectionCallback> extends MediaBrowser.ConnectionCallback {
        protected final T mConnectionCallback;

        public ConnectionCallbackProxy(T t) {
            this.mConnectionCallback = t;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.mConnectionCallback.onConnected();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.mConnectionCallback.onConnectionSuspended();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.mConnectionCallback.onConnectionFailed();
        }
    }

    static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends MediaBrowser.SubscriptionCallback {
        protected final T mSubscriptionCallback;

        public SubscriptionCallbackProxy(T t) {
            this.mSubscriptionCallback = t;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            ArrayList arrayList = null;
            if (list != null && list.size() == 1 && list.get(0).getMediaId().equals(MediaBrowserCompatApi21.NULL_MEDIA_ITEM_ID)) {
                list = null;
            }
            if (list != null) {
                arrayList = new ArrayList();
                for (MediaBrowser.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
            }
            this.mSubscriptionCallback.onChildrenLoaded(str, arrayList);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str) {
            this.mSubscriptionCallback.onError(str);
        }
    }
}
