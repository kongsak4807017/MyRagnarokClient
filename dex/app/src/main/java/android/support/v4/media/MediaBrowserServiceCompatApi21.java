package android.support.v4.media;

import android.content.Intent;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.support.v4.media.IMediaBrowserServiceAdapterApi21;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class MediaBrowserServiceCompatApi21 {

    public interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String str, Object obj, Bundle bundle);

        void onConnectFailed();

        void onLoadChildren(String str, List<Parcel> list);
    }

    public interface ServiceImplApi21 {
        void addSubscription(String str, ServiceCallbacks serviceCallbacks);

        void connect(String str, Bundle bundle, ServiceCallbacks serviceCallbacks);

        void disconnect(ServiceCallbacks serviceCallbacks);

        void removeSubscription(String str, ServiceCallbacks serviceCallbacks);
    }

    MediaBrowserServiceCompatApi21() {
    }

    public static Object createService() {
        return new MediaBrowserServiceAdaptorApi21();
    }

    public static void onCreate(Object obj, ServiceImplApi21 serviceImplApi21) {
        ((MediaBrowserServiceAdaptorApi21) obj).onCreate(serviceImplApi21);
    }

    public static IBinder onBind(Object obj, Intent intent) {
        return ((MediaBrowserServiceAdaptorApi21) obj).onBind(intent);
    }

    public static class ServiceCallbacksApi21 implements ServiceCallbacks {
        private static Object sNullParceledListSliceObj;
        private final IMediaBrowserServiceCallbacksAdapterApi21 mCallbacks;

        static {
            MediaBrowser.MediaItem mediaItem = new MediaBrowser.MediaItem(new MediaDescription.Builder().setMediaId("android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM").build(), 0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediaItem);
            sNullParceledListSliceObj = ParceledListSliceAdapterApi21.newInstance(arrayList);
        }

        ServiceCallbacksApi21(Object obj) {
            this.mCallbacks = new IMediaBrowserServiceCallbacksAdapterApi21(obj);
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi21.ServiceCallbacks
        public IBinder asBinder() {
            return this.mCallbacks.asBinder();
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi21.ServiceCallbacks
        public void onConnect(String str, Object obj, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.mCallbacks.onConnect(str, obj, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi21.ServiceCallbacks
        public void onConnectFailed() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.mCallbacks.onConnectFailed();
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi21.ServiceCallbacks
        public void onLoadChildren(String str, List<Parcel> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object objNewInstance;
            ArrayList arrayList = null;
            if (list != null) {
                arrayList = new ArrayList();
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            if (Build.VERSION.SDK_INT > 23) {
                objNewInstance = arrayList == null ? null : ParceledListSliceAdapterApi21.newInstance(arrayList);
            } else {
                objNewInstance = arrayList == null ? sNullParceledListSliceObj : ParceledListSliceAdapterApi21.newInstance(arrayList);
            }
            this.mCallbacks.onLoadChildren(str, objNewInstance);
        }
    }

    static class MediaBrowserServiceAdaptorApi21 {
        ServiceBinderProxyApi21 mBinder;

        MediaBrowserServiceAdaptorApi21() {
        }

        public void onCreate(ServiceImplApi21 serviceImplApi21) {
            this.mBinder = new ServiceBinderProxyApi21(serviceImplApi21);
        }

        public IBinder onBind(Intent intent) {
            if (MediaBrowserServiceCompat.SERVICE_INTERFACE.equals(intent.getAction())) {
                return this.mBinder;
            }
            return null;
        }

        static class ServiceBinderProxyApi21 extends IMediaBrowserServiceAdapterApi21.Stub {
            final ServiceImplApi21 mServiceImpl;

            ServiceBinderProxyApi21(ServiceImplApi21 serviceImplApi21) {
                this.mServiceImpl = serviceImplApi21;
            }

            @Override // android.support.v4.media.IMediaBrowserServiceAdapterApi21.Stub
            public void connect(String str, Bundle bundle, Object obj) {
                this.mServiceImpl.connect(str, bundle, new ServiceCallbacksApi21(obj));
            }

            @Override // android.support.v4.media.IMediaBrowserServiceAdapterApi21.Stub
            public void disconnect(Object obj) {
                this.mServiceImpl.disconnect(new ServiceCallbacksApi21(obj));
            }

            @Override // android.support.v4.media.IMediaBrowserServiceAdapterApi21.Stub
            public void addSubscription(String str, Object obj) {
                this.mServiceImpl.addSubscription(str, new ServiceCallbacksApi21(obj));
            }

            @Override // android.support.v4.media.IMediaBrowserServiceAdapterApi21.Stub
            public void removeSubscription(String str, Object obj) {
                this.mServiceImpl.removeSubscription(str, new ServiceCallbacksApi21(obj));
            }

            @Override // android.support.v4.media.IMediaBrowserServiceAdapterApi21.Stub
            public void getMediaItem(String str, ResultReceiver resultReceiver) {
            }
        }
    }
}
