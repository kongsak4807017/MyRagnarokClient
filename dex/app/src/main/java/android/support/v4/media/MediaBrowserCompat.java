package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaBrowserCompatApi21;
import android.support.v4.media.MediaBrowserCompatApi23;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class MediaBrowserCompat {
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    private static final String TAG = "MediaBrowserCompat";
    private final MediaBrowserImpl mImpl;

    interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        String getRoot();

        ComponentName getServiceComponent();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, Bundle bundle);
    }

    interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mImpl = new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.mImpl = new MediaBrowserImplApi21(context, componentName, connectionCallback, bundle);
        } else {
            this.mImpl = new MediaBrowserServiceImplBase(context, componentName, connectionCallback, bundle);
        }
    }

    public final void connect() {
        this.mImpl.connect();
    }

    public final void disconnect() {
        this.mImpl.disconnect();
    }

    public final boolean isConnected() {
        return this.mImpl.isConnected();
    }

    public final ComponentName getServiceComponent() {
        return this.mImpl.getServiceComponent();
    }

    public final String getRoot() {
        return this.mImpl.getRoot();
    }

    public final Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public final MediaSessionCompat.Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public final void subscribe(String str, SubscriptionCallback subscriptionCallback) {
        this.mImpl.subscribe(str, null, subscriptionCallback);
    }

    public final void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        if (bundle == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.mImpl.subscribe(str, bundle, subscriptionCallback);
    }

    public final void unsubscribe(String str) {
        this.mImpl.unsubscribe(str, null);
    }

    public final void unsubscribe(String str, Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.mImpl.unsubscribe(str, bundle);
    }

    public final void getItem(String str, ItemCallback itemCallback) {
        this.mImpl.getItem(str, itemCallback);
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Flags {
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.mFlags = i;
            this.mDescription = mediaDescriptionCompat;
        }

        private MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.mFlags);
            sb.append(", mDescription=").append(this.mDescription);
            sb.append('}');
            return sb.toString();
        }

        public int getFlags() {
            return this.mFlags;
        }

        public boolean isBrowsable() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.mFlags & 2) != 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public String getMediaId() {
            return this.mDescription.getMediaId();
        }
    }

    public static class ConnectionCallback {
        private ConnectionCallbackInternal mConnectionCallbackInternal;
        final Object mConnectionCallbackObj;

        interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public ConnectionCallback() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.mConnectionCallbackObj = MediaBrowserCompatApi21.createConnectionCallback(new StubApi21());
            } else {
                this.mConnectionCallbackObj = null;
            }
        }

        public void onConnected() {
        }

        public void onConnectionSuspended() {
        }

        public void onConnectionFailed() {
        }

        void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }

        class StubApi21 implements MediaBrowserCompatApi21.ConnectionCallback {
            private StubApi21() {
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnected() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnectionSuspended() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.ConnectionCallback
            public void onConnectionFailed() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }
        }
    }

    public static abstract class SubscriptionCallback {
        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str) {
        }

        public void onError(String str, Bundle bundle) {
        }
    }

    static class SubscriptionCallbackApi21 extends SubscriptionCallback {
        private Bundle mOptions;
        SubscriptionCallback mSubscriptionCallback;
        private final Object mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(new StubApi21());

        public SubscriptionCallbackApi21(SubscriptionCallback subscriptionCallback, Bundle bundle) {
            this.mSubscriptionCallback = subscriptionCallback;
            this.mOptions = bundle;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaItem> list) {
            this.mSubscriptionCallback.onChildrenLoaded(str, list);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
            this.mSubscriptionCallback.onChildrenLoaded(str, list, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onError(String str) {
            this.mSubscriptionCallback.onError(str);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            this.mSubscriptionCallback.onError(str, bundle);
        }

        class StubApi21 implements MediaBrowserCompatApi21.SubscriptionCallback {
            private StubApi21() {
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback
            public void onChildrenLoaded(String str, List<Parcel> list) {
                ArrayList arrayList = null;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Parcel parcel : list) {
                        parcel.setDataPosition(0);
                        arrayList.add(MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                if (SubscriptionCallbackApi21.this.mOptions != null) {
                    SubscriptionCallbackApi21.this.onChildrenLoaded(str, MediaBrowserCompatUtils.applyOptions(arrayList, SubscriptionCallbackApi21.this.mOptions), SubscriptionCallbackApi21.this.mOptions);
                } else {
                    SubscriptionCallbackApi21.this.onChildrenLoaded(str, arrayList);
                }
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi21.SubscriptionCallback
            public void onError(String str) {
                if (SubscriptionCallbackApi21.this.mOptions != null) {
                    SubscriptionCallbackApi21.this.onError(str, SubscriptionCallbackApi21.this.mOptions);
                } else {
                    SubscriptionCallbackApi21.this.onError(str);
                }
            }
        }
    }

    public static abstract class ItemCallback {
        final Object mItemCallbackObj;

        public ItemCallback() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.mItemCallbackObj = MediaBrowserCompatApi23.createItemCallback(new StubApi23());
            } else {
                this.mItemCallbackObj = null;
            }
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }

        public void onError(String str) {
        }

        class StubApi23 implements MediaBrowserCompatApi23.ItemCallback {
            private StubApi23() {
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi23.ItemCallback
            public void onItemLoaded(Parcel parcel) {
                parcel.setDataPosition(0);
                MediaItem mediaItemCreateFromParcel = MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                ItemCallback.this.onItemLoaded(mediaItemCreateFromParcel);
            }

            @Override // android.support.v4.media.MediaBrowserCompatApi23.ItemCallback
            public void onError(String str) {
                ItemCallback.this.onError(str);
            }
        }
    }

    static class MediaBrowserServiceImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        private static final int CONNECT_STATE_CONNECTED = 2;
        private static final int CONNECT_STATE_CONNECTING = 1;
        private static final int CONNECT_STATE_DISCONNECTED = 0;
        private static final int CONNECT_STATE_SUSPENDED = 3;
        private static final boolean DBG = false;
        private final ConnectionCallback mCallback;
        private Messenger mCallbacksMessenger;
        private final Context mContext;
        private Bundle mExtras;
        private MediaSessionCompat.Token mMediaSessionToken;
        private final Bundle mRootHints;
        private String mRootId;
        private ServiceBinderWrapper mServiceBinderWrapper;
        private final ComponentName mServiceComponent;
        private MediaServiceConnection mServiceConnection;
        private final CallbackHandler mHandler = new CallbackHandler(this);
        private final ArrayMap<String, Subscription> mSubscriptions = new ArrayMap<>();
        private int mState = 0;

        public MediaBrowserServiceImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (connectionCallback == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.mContext = context;
            this.mServiceComponent = componentName;
            this.mCallback = connectionCallback;
            this.mRootHints = bundle;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            if (this.mState != 0) {
                throw new IllegalStateException("connect() called while not disconnected (state=" + getStateLabel(this.mState) + ")");
            }
            if (this.mServiceBinderWrapper != null) {
                throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + this.mServiceBinderWrapper);
            }
            if (this.mCallbacksMessenger != null) {
                throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + this.mCallbacksMessenger);
            }
            this.mState = 1;
            Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
            intent.setComponent(this.mServiceComponent);
            final MediaServiceConnection mediaServiceConnection = new MediaServiceConnection();
            this.mServiceConnection = mediaServiceConnection;
            boolean zBindService = DBG;
            try {
                zBindService = this.mContext.bindService(intent, this.mServiceConnection, 1);
            } catch (Exception unused) {
                Log.e(MediaBrowserCompat.TAG, "Failed binding to service " + this.mServiceComponent);
            }
            if (!zBindService) {
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceImplBase.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (mediaServiceConnection == MediaBrowserServiceImplBase.this.mServiceConnection) {
                            MediaBrowserServiceImplBase.this.forceCloseConnection();
                            MediaBrowserServiceImplBase.this.mCallback.onConnectionFailed();
                        }
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            if (this.mCallbacksMessenger != null) {
                try {
                    this.mServiceBinderWrapper.disconnect(this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    new StringBuilder("RemoteException during connect for ").append(this.mServiceComponent);
                }
            }
            forceCloseConnection();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void forceCloseConnection() {
            if (this.mServiceConnection != null) {
                this.mContext.unbindService(this.mServiceConnection);
            }
            this.mState = 0;
            this.mServiceConnection = null;
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mRootId = null;
            this.mMediaSessionToken = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            if (this.mState == 2) {
                return true;
            }
            return DBG;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            if (!isConnected()) {
                throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.mState + ")");
            }
            return this.mServiceComponent;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            if (!isConnected()) {
                throw new IllegalStateException("getRoot() called while not connected(state=" + getStateLabel(this.mState) + ")");
            }
            return this.mRootId;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            if (!isConnected()) {
                throw new IllegalStateException("getExtras() called while not connected (state=" + getStateLabel(this.mState) + ")");
            }
            return this.mExtras;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (!isConnected()) {
                throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.mState + ")");
            }
            return this.mMediaSessionToken;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("parentId is empty.");
            }
            if (subscriptionCallback == null) {
                throw new IllegalArgumentException("callback is null");
            }
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            subscription.setCallbackForOptions(subscriptionCallback, bundle);
            if (this.mState == 2) {
                try {
                    this.mServiceBinderWrapper.addSubscription(str, bundle, this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("parentId is empty.");
            }
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription != null && subscription.remove(bundle) && this.mState == 2) {
                try {
                    this.mServiceBinderWrapper.removeSubscription(str, bundle, this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                }
            }
            if (subscription != null && subscription.isEmpty()) {
                this.mSubscriptions.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty.");
            }
            if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null.");
            }
            if (this.mState != 2) {
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceImplBase.2
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            try {
                this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler));
            } catch (RemoteException unused) {
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceImplBase.3
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (!isCurrent(messenger, "onConnect")) {
                return;
            }
            if (this.mState != 1) {
                getStateLabel(this.mState);
                return;
            }
            this.mRootId = str;
            this.mMediaSessionToken = token;
            this.mExtras = bundle;
            this.mState = 2;
            this.mCallback.onConnected();
            try {
                for (Map.Entry<String, Subscription> entry : this.mSubscriptions.entrySet()) {
                    String key = entry.getKey();
                    Iterator<Bundle> it = entry.getValue().getOptionsList().iterator();
                    while (it.hasNext()) {
                        this.mServiceBinderWrapper.addSubscription(key, it.next(), this.mCallbacksMessenger);
                    }
                }
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
            Log.e(MediaBrowserCompat.TAG, "onConnectFailed for " + this.mServiceComponent);
            if (!isCurrent(messenger, "onConnectFailed")) {
                return;
            }
            if (this.mState != 1) {
                getStateLabel(this.mState);
            } else {
                forceCloseConnection();
                this.mCallback.onConnectionFailed();
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle) {
            Subscription subscription;
            SubscriptionCallback callback;
            if (isCurrent(messenger, "onLoadChildren") && (subscription = this.mSubscriptions.get(str)) != null && (callback = subscription.getCallback(bundle)) != null) {
                if (bundle == null) {
                    callback.onChildrenLoaded(str, list);
                } else {
                    callback.onChildrenLoaded(str, list, bundle);
                }
            }
        }

        private static String getStateLabel(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTED";
                case 1:
                    return "CONNECT_STATE_CONNECTING";
                case 2:
                    return "CONNECT_STATE_CONNECTED";
                case 3:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    return "UNKNOWN/" + i;
            }
        }

        private boolean isCurrent(Messenger messenger, String str) {
            if (this.mCallbacksMessenger != messenger) {
                if (this.mState != 0) {
                    new StringBuilder().append(str).append(" for ").append(this.mServiceComponent).append(" with mCallbacksMessenger=").append(this.mCallbacksMessenger).append(" this=").append(this);
                    return DBG;
                }
                return DBG;
            }
            return true;
        }

        void dump() {
            new StringBuilder("  mServiceComponent=").append(this.mServiceComponent);
            new StringBuilder("  mCallback=").append(this.mCallback);
            new StringBuilder("  mRootHints=").append(this.mRootHints);
            getStateLabel(this.mState);
            new StringBuilder("  mServiceConnection=").append(this.mServiceConnection);
            new StringBuilder("  mServiceBinderWrapper=").append(this.mServiceBinderWrapper);
            new StringBuilder("  mCallbacksMessenger=").append(this.mCallbacksMessenger);
            new StringBuilder("  mMediaSessionToken=").append(this.mMediaSessionToken);
        }

        class MediaServiceConnection implements ServiceConnection {
            private MediaServiceConnection() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceImplBase.MediaServiceConnection.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!MediaServiceConnection.this.isCurrent("onServiceConnected")) {
                            return;
                        }
                        MediaBrowserServiceImplBase.this.mServiceBinderWrapper = new ServiceBinderWrapper(iBinder);
                        MediaBrowserServiceImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserServiceImplBase.this.mHandler);
                        MediaBrowserServiceImplBase.this.mHandler.setCallbacksMessenger(MediaBrowserServiceImplBase.this.mCallbacksMessenger);
                        MediaBrowserServiceImplBase.this.mState = 1;
                        try {
                            MediaBrowserServiceImplBase.this.mServiceBinderWrapper.connect(MediaBrowserServiceImplBase.this.mContext, MediaBrowserServiceImplBase.this.mRootHints, MediaBrowserServiceImplBase.this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
                            new StringBuilder("RemoteException during connect for ").append(MediaBrowserServiceImplBase.this.mServiceComponent);
                        }
                    }
                });
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(final ComponentName componentName) {
                postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceImplBase.MediaServiceConnection.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
                            MediaBrowserServiceImplBase.this.mServiceBinderWrapper = null;
                            MediaBrowserServiceImplBase.this.mCallbacksMessenger = null;
                            MediaBrowserServiceImplBase.this.mHandler.setCallbacksMessenger(null);
                            MediaBrowserServiceImplBase.this.mState = 3;
                            MediaBrowserServiceImplBase.this.mCallback.onConnectionSuspended();
                        }
                    }
                });
            }

            private void postOrRun(Runnable runnable) {
                if (Thread.currentThread() != MediaBrowserServiceImplBase.this.mHandler.getLooper().getThread()) {
                    MediaBrowserServiceImplBase.this.mHandler.post(runnable);
                } else {
                    runnable.run();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isCurrent(String str) {
                if (MediaBrowserServiceImplBase.this.mServiceConnection != this) {
                    if (MediaBrowserServiceImplBase.this.mState != 0) {
                        new StringBuilder().append(str).append(" for ").append(MediaBrowserServiceImplBase.this.mServiceComponent).append(" with mServiceConnection=").append(MediaBrowserServiceImplBase.this.mServiceConnection).append(" this=").append(this);
                        return MediaBrowserServiceImplBase.DBG;
                    }
                    return MediaBrowserServiceImplBase.DBG;
                }
                return true;
            }
        }
    }

    static class MediaBrowserImplApi21 implements ConnectionCallback.ConnectionCallbackInternal, MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        private static final boolean DBG = false;
        protected Object mBrowserObj;
        private Messenger mCallbacksMessenger;
        private ServiceBinderWrapper mServiceBinderWrapper;
        private final ComponentName mServiceComponent;
        private final CallbackHandler mHandler = new CallbackHandler(this);
        private final ArrayMap<String, Subscription> mSubscriptions = new ArrayMap<>();

        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.mServiceComponent = componentName;
            connectionCallback.setInternalConnectionCallback(this);
            this.mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentName, connectionCallback.mConnectionCallbackObj, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            MediaBrowserCompatApi21.connect(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            MediaBrowserCompatApi21.disconnect(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return MediaBrowserCompatApi21.isConnected(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            return MediaBrowserCompatApi21.getServiceComponent(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            return MediaBrowserCompatApi21.getRoot(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            return MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            return MediaSessionCompat.Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            SubscriptionCallbackApi21 subscriptionCallbackApi21 = new SubscriptionCallbackApi21(subscriptionCallback, bundle);
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            subscription.setCallbackForOptions(subscriptionCallbackApi21, bundle);
            if (MediaBrowserCompatApi21.isConnected(this.mBrowserObj)) {
                if (bundle == null || this.mServiceBinderWrapper == null) {
                    MediaBrowserCompatApi21.subscribe(this.mBrowserObj, str, subscriptionCallbackApi21.mSubscriptionCallbackObj);
                } else {
                    try {
                        this.mServiceBinderWrapper.addSubscription(str, bundle, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("parentId is empty.");
            }
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription != null && subscription.remove(bundle)) {
                if (bundle == null || this.mServiceBinderWrapper == null) {
                    if (this.mServiceBinderWrapper != null || subscription.isEmpty()) {
                        MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
                    }
                } else if (this.mServiceBinderWrapper == null) {
                    try {
                        this.mServiceBinderWrapper.removeSubscription(str, bundle, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                    }
                }
            }
            if (subscription != null && subscription.isEmpty()) {
                this.mSubscriptions.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty.");
            }
            if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null.");
            }
            if (!MediaBrowserCompatApi21.isConnected(this.mBrowserObj)) {
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.1
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            if (this.mServiceBinderWrapper == null) {
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.2
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onItemLoaded(null);
                    }
                });
                return;
            }
            try {
                this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler));
            } catch (RemoteException unused) {
                this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.3
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
            IBinder binder;
            Bundle extras = MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
            if (extras != null && (binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER)) != null) {
                this.mServiceBinderWrapper = new ServiceBinderWrapper(binder);
                this.mCallbacksMessenger = new Messenger(this.mHandler);
                this.mHandler.setCallbacksMessenger(this.mCallbacksMessenger);
                try {
                    this.mServiceBinderWrapper.registerCallbackMessenger(this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                }
                onServiceConnected(this.mCallbacksMessenger, null, null, null);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            for (Map.Entry<String, Subscription> entry : this.mSubscriptions.entrySet()) {
                String key = entry.getKey();
                Subscription value = entry.getValue();
                List<Bundle> optionsList = value.getOptionsList();
                List<SubscriptionCallback> callbacks = value.getCallbacks();
                for (int i = 0; i < optionsList.size(); i++) {
                    if (optionsList.get(i) == null) {
                        MediaBrowserCompatApi21.subscribe(this.mBrowserObj, key, ((SubscriptionCallbackApi21) callbacks.get(i)).mSubscriptionCallbackObj);
                    } else {
                        try {
                            this.mServiceBinderWrapper.addSubscription(key, optionsList.get(i), this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle) {
            Subscription subscription;
            if (this.mCallbacksMessenger == messenger && (subscription = this.mSubscriptions.get(str)) != null) {
                subscription.getCallback(bundle).onChildrenLoaded(str, list, bundle);
            }
        }
    }

    static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
            MediaBrowserCompatApi23.getItem(this.mBrowserObj, str, itemCallback.mItemCallbackObj);
        }
    }

    static class Subscription {
        private final List<SubscriptionCallback> mCallbacks = new ArrayList();
        private final List<Bundle> mOptionsList = new ArrayList();

        public boolean isEmpty() {
            return this.mCallbacks.isEmpty();
        }

        public List<Bundle> getOptionsList() {
            return this.mOptionsList;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.mCallbacks;
        }

        public void setCallbackForOptions(SubscriptionCallback subscriptionCallback, Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.mOptionsList.get(i), bundle)) {
                    this.mCallbacks.set(i, subscriptionCallback);
                    return;
                }
            }
            this.mCallbacks.add(subscriptionCallback);
            this.mOptionsList.add(bundle);
        }

        public boolean remove(Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.mOptionsList.get(i), bundle)) {
                    this.mCallbacks.remove(i);
                    this.mOptionsList.remove(i);
                    return true;
                }
            }
            return false;
        }

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.mOptionsList.get(i), bundle)) {
                    return this.mCallbacks.get(i);
                }
            }
            return null;
        }
    }

    static class CallbackHandler extends Handler {
        private final MediaBrowserServiceCallbackImpl mCallbackImpl;
        private WeakReference<Messenger> mCallbacksMessengerRef;

        CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.mCallbackImpl = mediaBrowserServiceCallbackImpl;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.mCallbacksMessengerRef == null) {
            }
            Bundle data = message.getData();
            data.setClassLoader(MediaSessionCompat.class.getClassLoader());
            switch (message.what) {
                case 1:
                    this.mCallbackImpl.onServiceConnected(this.mCallbacksMessengerRef.get(), data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                    break;
                case 2:
                    this.mCallbackImpl.onConnectionFailed(this.mCallbacksMessengerRef.get());
                    break;
                case 3:
                    this.mCallbackImpl.onLoadChildren(this.mCallbacksMessengerRef.get(), data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), data.getBundle(MediaBrowserProtocol.DATA_OPTIONS));
                    break;
                default:
                    new StringBuilder("Unhandled message: ").append(message).append("\n  Client version: 1\n  Service version: ").append(message.arg1);
                    break;
            }
        }

        void setCallbacksMessenger(Messenger messenger) {
            this.mCallbacksMessengerRef = new WeakReference<>(messenger);
        }
    }

    static class ServiceBinderWrapper {
        private Messenger mMessenger;

        public ServiceBinderWrapper(IBinder iBinder) {
            this.mMessenger = new Messenger(iBinder);
        }

        void connect(Context context, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, bundle);
            sendRequest(1, bundle2, messenger);
        }

        void disconnect(Messenger messenger) throws RemoteException {
            sendRequest(2, null, messenger);
        }

        void addSubscription(String str, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            sendRequest(3, bundle2, messenger);
        }

        void removeSubscription(String str, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            sendRequest(4, bundle2, messenger);
        }

        void getMediaItem(String str, ResultReceiver resultReceiver) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            sendRequest(5, bundle, null);
        }

        void registerCallbackMessenger(Messenger messenger) throws RemoteException {
            sendRequest(6, null, messenger);
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.mMessenger.send(messageObtain);
        }
    }

    static class ItemReceiver extends ResultReceiver {
        private final ItemCallback mCallback;
        private final String mMediaId;

        ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.mMediaId = str;
            this.mCallback = itemCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                this.mCallback.onError(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable instanceof MediaItem) {
                this.mCallback.onItemLoaded((MediaItem) parcelable);
            } else {
                this.mCallback.onError(this.mMediaId);
            }
        }
    }
}
