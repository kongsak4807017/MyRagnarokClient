package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class NotificationManagerCompatEclair {
    NotificationManagerCompatEclair() {
    }

    static void cancelNotification(NotificationManager notificationManager, String str, int i) {
        notificationManager.cancel(str, i);
    }

    public static void postNotification(NotificationManager notificationManager, String str, int i, Notification notification) {
        notificationManager.notify(str, i, notification);
    }
}
