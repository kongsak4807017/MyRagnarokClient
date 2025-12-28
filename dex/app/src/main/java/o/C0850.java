package o;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import java.lang.Thread;

/* renamed from: o.蚟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0850 implements Thread.UncaughtExceptionHandler {

    /* renamed from: 鷭, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f7960 = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1489(Thread thread, Throwable th) {
        Class<?> cls = th.getClass();
        if ((cls == ut.class && !((ut) th).f5346) || cls == us.class || cls == OutOfMemoryError.class) {
            System.exit(1);
        } else {
            this.f7960.uncaughtException(thread, th);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1488(String str, String str2, Thread thread, Throwable th) {
        ((ClipboardManager) C0358.f6674.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str2));
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setMessage(String.valueOf(str) + " has been copied to clipboard");
        builder.setCancelable(true);
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0801(this, thread, th));
        builder.show();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m1487(Thread thread, Throwable th) {
        if (C0358.f6685 != null) {
            C0358.f6685.f1700.interrupt();
        }
        if (C0358.f6674 != null && C0358.f6674.f47 != null) {
            C0358.f6674.f47 = null;
        }
        if (C0358.f6669 != null && C0358.f6669.f2066 != null) {
            C0851 c0851 = C0358.f6669.f2066;
            RunnableC0986 runnableC0986 = new RunnableC0986(this);
            synchronized (c0851) {
                c0851.f7979.add(runnableC0986);
            }
        }
        if (C0358.f6675 != null) {
            C0358.f6675.f1700.interrupt();
            C0358.f6675 = null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        if (th.getClass() == uw.class) {
            builder.setTitle("Resource not found");
            builder.setPositiveButton("Copy and quit", new DialogInterfaceOnClickListenerC0917(this, th, thread));
            builder.setNegativeButton("Quit", new DialogInterfaceOnClickListenerC0963(this, thread, th));
        } else if (th.getClass() == OutOfMemoryError.class) {
            builder.setTitle("Out of memory");
        } else if (th.getClass() == us.class) {
            builder.setTitle("Corrupted patch file");
            builder.setPositiveButton("Delete file and quit", new DialogInterfaceOnClickListenerC0758(this, th, thread));
            builder.setNeutralButton("Copy file name and quit", new DialogInterfaceOnClickListenerC1098(this, th, thread));
            builder.setNegativeButton("Quit", new DialogInterfaceOnClickListenerC0903(this, thread, th));
        } else {
            builder.setTitle("Fatal Error");
        }
        builder.setMessage(th.getMessage());
        builder.setCancelable(true);
        if (oc.f3250 == my.all) {
            th.printStackTrace();
        }
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC1123(this, thread, th)).show();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!Thread.currentThread().getName().equals("main")) {
            C0358.f6674.mo139(new RunnableC0980(this, thread, th));
        } else {
            this.f7960.uncaughtException(thread, th);
        }
    }
}
