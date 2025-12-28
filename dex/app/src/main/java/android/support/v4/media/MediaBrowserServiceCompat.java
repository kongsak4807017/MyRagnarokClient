package android.support.v4.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserServiceCompatApi21;
import android.support.v4.media.MediaBrowserServiceCompatApi23;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    private static final boolean DBG = false;
    public static final String KEY_MEDIA_ITEM = "media_item";
    private static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    private static final String TAG = "MediaBrowserServiceCompat";
    private final ArrayMap<IBinder, ConnectionRecord> mConnections = new ArrayMap<>();
    private final ServiceHandler mHandler = new ServiceHandler();
    private MediaBrowserServiceImpl mImpl;
    MediaSessionCompat.Token mSession;

    interface MediaBrowserServiceImpl {
        IBinder onBind(Intent intent);

        void onCreate();
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface ResultFlags {
    }

    interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String str, MediaSessionCompat.Token token, Bundle bundle);

        void onConnectFailed();

        void onLoadChildren(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle);
    }

    public abstract BrowserRoot onGetRoot(String str, int i, Bundle bundle);

    public abstract void onLoadChildren(String str, Result<List<MediaBrowserCompat.MediaItem>> result);

    class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {
        private Messenger mMessenger;

        MediaBrowserServiceImplBase() {
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            if (MediaBrowserServiceCompat.SERVICE_INTERFACE.equals(intent.getAction())) {
                return this.mMessenger.getBinder();
            }
            return null;
        }
    }

    class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl {
        private Object mServiceObj;

        MediaBrowserServiceImplApi21() {
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mServiceObj = MediaBrowserServiceCompatApi21.createService();
            MediaBrowserServiceCompatApi21.onCreate(this.mServiceObj, MediaBrowserServiceCompat.this.new ServiceImplApi21());
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            return MediaBrowserServiceCompatApi21.onBind(this.mServiceObj, intent);
        }
    }

    class MediaBrowserServiceImplApi23 implements MediaBrowserServiceImpl {
        private Object mServiceObj;

        MediaBrowserServiceImplApi23() {
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mServiceObj = MediaBrowserServiceCompatApi23.createService();
            MediaBrowserServiceCompatApi23.onCreate(this.mServiceObj, (MediaBrowserServiceCompatApi23.ServiceImplApi23) new ServiceImplApi23());
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            return MediaBrowserServiceCompatApi23.onBind(this.mServiceObj, intent);
        }
    }

    final class ServiceHandler extends Handler {
        private final ServiceImpl mServiceImpl;

        private ServiceHandler() {
            this.mServiceImpl = new ServiceImpl();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    this.mServiceImpl.connect(data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS), MediaBrowserServiceCompat.this.new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 2:
                    this.mServiceImpl.disconnect(MediaBrowserServiceCompat.this.new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 3:
                    this.mServiceImpl.addSubscription(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getBundle(MediaBrowserProtocol.DATA_OPTIONS), MediaBrowserServiceCompat.this.new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 4:
                    this.mServiceImpl.removeSubscription(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getBundle(MediaBrowserProtocol.DATA_OPTIONS), MediaBrowserServiceCompat.this.new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 5:
                    this.mServiceImpl.getMediaItem(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER));
                    break;
                case 6:
                    this.mServiceImpl.registerCallbacks(MediaBrowserServiceCompat.this.new ServiceCallbacksCompat(message.replyTo));
                    break;
                default:
                    new StringBuilder("Unhandled message: ").append(message).append("\n  Service version: 1\n  Client version: ").append(message.arg1);
                    break;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(MediaBrowserProtocol.DATA_CALLING_UID, Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }

        public final void postOrRun(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final ServiceImpl getServiceImpl() {
            return this.mServiceImpl;
        }
    }

    class ConnectionRecord {
        ServiceCallbacks callbacks;
        String pkg;
        BrowserRoot root;
        Bundle rootHints;
        HashMap<String, List<Bundle>> subscriptions;

        private ConnectionRecord() {
            this.subscriptions = new HashMap<>();
        }
    }

    public static class Result<T> {
        private Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendResultCalled;

        Result(Object obj) {
            this.mDebug = obj;
        }

        public void sendResult(T t) {
            if (this.mSendResultCalled) {
                throw new IllegalStateException("sendResult() called twice for: " + this.mDebug);
            }
            this.mSendResultCalled = true;
            onResultSent(t, this.mFlags);
        }

        public void detach() {
            if (this.mDetachCalled) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.mDebug);
            }
            if (this.mSendResultCalled) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.mDebug);
            }
            this.mDetachCalled = true;
        }

        boolean isDone() {
            if (this.mDetachCalled || this.mSendResultCalled) {
                return true;
            }
            return MediaBrowserServiceCompat.DBG;
        }

        void setFlags(int i) {
            this.mFlags = i;
        }

        void onResultSent(T t, int i) {
        }
    }

    class ServiceImpl {
        private ServiceImpl() {
        }

        public void connect(final String str, final int i, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            if (MediaBrowserServiceCompat.this.isValidPackage(str, i)) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.ServiceImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                        MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                        ConnectionRecord connectionRecord = new ConnectionRecord();
                        connectionRecord.pkg = str;
                        connectionRecord.rootHints = bundle;
                        connectionRecord.callbacks = serviceCallbacks;
                        connectionRecord.root = MediaBrowserServiceCompat.this.onGetRoot(str, i, bundle);
                        if (connectionRecord.root != null) {
                            try {
                                MediaBrowserServiceCompat.this.mConnections.put(iBinderAsBinder, connectionRecord);
                                if (MediaBrowserServiceCompat.this.mSession != null) {
                                    serviceCallbacks.onConnect(connectionRecord.root.getRootId(), MediaBrowserServiceCompat.this.mSession, connectionRecord.root.getExtras());
                                    return;
                                }
                                return;
                            } catch (RemoteException unused) {
                                MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                                return;
                            }
                        }
                        try {
                            serviceCallbacks.onConnectFailed();
                        } catch (RemoteException unused2) {
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i + " package=" + str);
        }

        public void disconnect(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.ServiceImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserServiceCompat.this.mConnections.remove(serviceCallbacks.asBinder());
                }
            });
        }

        public void addSubscription(final String str, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.ServiceImpl.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.addSubscription(str, connectionRecord, bundle);
                    }
                }
            });
        }

        public void removeSubscription(final String str, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.ServiceImpl.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.removeSubscription(str, connectionRecord, bundle);
                    }
                }
            });
        }

        public void getMediaItem(final String str, final ResultReceiver resultReceiver) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.ServiceImpl.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaBrowserServiceCompat.this.performLoadItem(str, resultReceiver);
                    }
                });
            }
        }

        public void registerCallbacks(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.ServiceImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                    ConnectionRecord connectionRecord = new ConnectionRecord();
                    connectionRecord.callbacks = serviceCallbacks;
                    MediaBrowserServiceCompat.this.mConnections.put(iBinderAsBinder, connectionRecord);
                }
            });
        }
    }

    class ServiceImplApi21 implements MediaBrowserServiceCompatApi21.ServiceImplApi21 {
        final ServiceImpl mServiceImpl;

        ServiceImplApi21() {
            this.mServiceImpl = MediaBrowserServiceCompat.this.mHandler.getServiceImpl();
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi21.ServiceImplApi21
        public void connect(String str, Bundle bundle, MediaBrowserServiceCompatApi21.ServiceCallbacks serviceCallbacks) {
            this.mServiceImpl.connect(str, Binder.getCallingUid(), bundle, MediaBrowserServiceCompat.this.new ServiceCallbacksApi21(serviceCallbacks));
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi21.ServiceImplApi21
        public void disconnect(MediaBrowserServiceCompatApi21.ServiceCallbacks serviceCallbacks) {
            this.mServiceImpl.disconnect(MediaBrowserServiceCompat.this.new ServiceCallbacksApi21(serviceCallbacks));
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi21.ServiceImplApi21
        public void addSubscription(String str, MediaBrowserServiceCompatApi21.ServiceCallbacks serviceCallbacks) {
            this.mServiceImpl.addSubscription(str, null, MediaBrowserServiceCompat.this.new ServiceCallbacksApi21(serviceCallbacks));
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi21.ServiceImplApi21
        public void removeSubscription(String str, MediaBrowserServiceCompatApi21.ServiceCallbacks serviceCallbacks) {
            this.mServiceImpl.removeSubscription(str, null, MediaBrowserServiceCompat.this.new ServiceCallbacksApi21(serviceCallbacks));
        }
    }

    class ServiceImplApi23 extends ServiceImplApi21 implements MediaBrowserServiceCompatApi23.ServiceImplApi23 {
        private ServiceImplApi23() {
            super();
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompatApi23.ServiceImplApi23
        public void getMediaItem(String str, final MediaBrowserServiceCompatApi23.ItemCallback itemCallback) {
            this.mServiceImpl.getMediaItem(str, new ResultReceiver(MediaBrowserServiceCompat.this.mHandler) { // from class: android.support.v4.media.MediaBrowserServiceCompat.ServiceImplApi23.1
                @Override // android.support.v4.os.ResultReceiver
                protected void onReceiveResult(int i, Bundle bundle) {
                    MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
                    Parcel parcelObtain = null;
                    if (mediaItem != null) {
                        parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                    }
                    itemCallback.onItemLoaded(i, bundle, parcelObtain);
                }
            });
        }
    }

    class ServiceCallbacksCompat implements ServiceCallbacks {
        final Messenger mCallbacks;

        ServiceCallbacksCompat(Messenger messenger) {
            this.mCallbacks = messenger;
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
            return this.mCallbacks.getBinder();
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 1);
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN, token);
            bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, bundle);
            sendRequest(1, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() throws RemoteException {
            sendRequest(2, null);
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            if (list != null) {
                bundle2.putParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            sendRequest(3, bundle2);
        }

        private void sendRequest(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            this.mCallbacks.send(messageObtain);
        }
    }

    class ServiceCallbacksApi21 implements ServiceCallbacks {
        final MediaBrowserServiceCompatApi21.ServiceCallbacks mCallbacks;
        Messenger mMessenger;

        ServiceCallbacksApi21(MediaBrowserServiceCompatApi21.ServiceCallbacks serviceCallbacks) {
            this.mCallbacks = serviceCallbacks;
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
            return this.mCallbacks.asBinder();
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(String str, MediaSessionCompat.Token token, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
            BundleCompat.putBinder(bundle, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER, this.mMessenger.getBinder());
            bundle.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 1);
            this.mCallbacks.onConnect(str, token.getToken(), bundle);
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() {
            this.mCallbacks.onConnectFailed();
        }

        @Override // android.support.v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
            ArrayList arrayList = null;
            if (list != null) {
                arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
            }
            this.mCallbacks.onLoadChildren(str, arrayList);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 23) {
            this.mImpl = new MediaBrowserServiceImplApi23();
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.mImpl = new MediaBrowserServiceImplApi21();
        } else {
            this.mImpl = new MediaBrowserServiceImplBase();
        }
        this.mImpl.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mImpl.onBind(intent);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void onLoadChildren(String str, Result<List<MediaBrowserCompat.MediaItem>> result, Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(String str, Result<MediaBrowserCompat.MediaItem> result) {
        result.sendResult(null);
    }

    public void setSessionToken(final MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        }
        if (this.mSession != null) {
            throw new IllegalStateException("The session token has already been set.");
        }
        this.mSession = token;
        this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.mConnections.keySet()) {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get(iBinder);
                    try {
                        connectionRecord.callbacks.onConnect(connectionRecord.root.getRootId(), token, connectionRecord.root.getExtras());
                    } catch (RemoteException unused) {
                        MediaBrowserServiceCompat.this.mConnections.remove(iBinder);
                    }
                }
            }
        });
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.mSession;
    }

    public void notifyChildrenChanged(String str) {
        notifyChildrenChangedInternal(str, null);
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        notifyChildrenChangedInternal(str, bundle);
    }

    private void notifyChildrenChangedInternal(final String str, final Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.mHandler.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserServiceCompat.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = MediaBrowserServiceCompat.this.mConnections.keySet().iterator();
                while (it.hasNext()) {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.mConnections.get((IBinder) it.next());
                    List<Bundle> list = connectionRecord.subscriptions.get(str);
                    if (list != null) {
                        Iterator<Bundle> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Bundle next = it2.next();
                                if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, next)) {
                                    MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, next);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return DBG;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return DBG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscription(String str, ConnectionRecord connectionRecord, Bundle bundle) {
        List<Bundle> arrayList = connectionRecord.subscriptions.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<Bundle> it = arrayList.iterator();
        while (it.hasNext()) {
            if (MediaBrowserCompatUtils.areSameOptions(bundle, it.next())) {
                return;
            }
        }
        arrayList.add(bundle);
        connectionRecord.subscriptions.put(str, arrayList);
        performLoadChildren(str, connectionRecord, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeSubscription(String str, ConnectionRecord connectionRecord, Bundle bundle) {
        boolean z = DBG;
        List<Bundle> list = connectionRecord.subscriptions.get(str);
        if (list != null) {
            Iterator<Bundle> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Bundle next = it.next();
                if (MediaBrowserCompatUtils.areSameOptions(bundle, next)) {
                    z = true;
                    list.remove(next);
                    break;
                }
            }
            if (list.size() == 0) {
                connectionRecord.subscriptions.remove(str);
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performLoadChildren(final String str, final ConnectionRecord connectionRecord, final Bundle bundle) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: android.support.v4.media.MediaBrowserServiceCompat.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // android.support.v4.media.MediaBrowserServiceCompat.Result
            public void onResultSent(List<MediaBrowserCompat.MediaItem> list, int i) {
                if (MediaBrowserServiceCompat.this.mConnections.get(connectionRecord.callbacks.asBinder()) != connectionRecord) {
                    return;
                }
                try {
                    connectionRecord.callbacks.onLoadChildren(str, (i & 1) != 0 ? MediaBrowserCompatUtils.applyOptions(list, bundle) : list, bundle);
                } catch (RemoteException unused) {
                }
            }
        };
        if (bundle == null) {
            onLoadChildren(str, result);
        } else {
            onLoadChildren(str, result, bundle);
        }
        if (!result.isDone()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + connectionRecord.pkg + " id=" + str);
        }
    }

    private List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * (i - 1);
        int size = i3 + i2;
        if (i <= 0 || i2 <= 0 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i3, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performLoadItem(String str, final ResultReceiver resultReceiver) {
        Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: android.support.v4.media.MediaBrowserServiceCompat.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // android.support.v4.media.MediaBrowserServiceCompat.Result
            public void onResultSent(MediaBrowserCompat.MediaItem mediaItem, int i) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaItem);
                resultReceiver.send(0, bundle);
            }
        };
        onLoadItem(str, result);
        if (!result.isDone()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    public static final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        private final Bundle mExtras;
        private final String mRootId;

        public BrowserRoot(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
            }
            this.mRootId = str;
            this.mExtras = bundle;
        }

        public final String getRootId() {
            return this.mRootId;
        }

        public final Bundle getExtras() {
            return this.mExtras;
        }
    }
}
