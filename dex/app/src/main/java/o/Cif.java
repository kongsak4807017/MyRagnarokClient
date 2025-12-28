package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v4.os.EnvironmentCompat;
import android.text.TextUtils;
import com.roworkshop.andro.c_activity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@TargetApi(14)
/* renamed from: o.if, reason: invalid class name */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class Cif {

    /* renamed from: ܕ, reason: contains not printable characters */
    @SuppressLint({"StaticFieldLeak"})
    private static Cif f1594;

    /* renamed from: ċ, reason: contains not printable characters */
    private final Context f1597;

    /* renamed from: 櫯, reason: contains not printable characters */
    private static final String[] f1596 = {"15555215554", "15555215556", "15555215558", "15555215560", "15555215562", "15555215564", "15555215566", "15555215568", "15555215570", "15555215572", "15555215574", "15555215576", "15555215578", "15555215580", "15555215582", "15555215584"};

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static final String[] f1592 = {"000000000000000", "e21833235b6eef10", "012345678912345"};

    /* renamed from: ȃ, reason: contains not printable characters */
    private static final String[] f1590 = {"310260000000000"};

    /* renamed from: Ą, reason: contains not printable characters */
    private static final String[] f1586 = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: ą, reason: contains not printable characters */
    private static final String[] f1587 = {"goldfish"};

    /* renamed from: Ć, reason: contains not printable characters */
    private static final String[] f1588 = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: ć, reason: contains not printable characters */
    private static final String[] f1589 = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private static final String[] f1593 = {"fstab.andy", "ueventd.andy.rc"};

    /* renamed from: 岱, reason: contains not printable characters */
    private static final String[] f1595 = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};

    /* renamed from: Ȋ, reason: contains not printable characters */
    private static final C0356[] f1591 = {new C0356("init.svc.qemud", null), new C0356("init.svc.qemu-props", null), new C0356("qemu.hw.mainkeys", null), new C0356("qemu.sf.fake_camera", null), new C0356("qemu.sf.lcd_density", null), new C0356("ro.bootloader", EnvironmentCompat.MEDIA_UNKNOWN), new C0356("ro.bootmode", EnvironmentCompat.MEDIA_UNKNOWN), new C0356("ro.hardware", "goldfish"), new C0356("ro.kernel.android.qemud", null), new C0356("ro.kernel.qemu.gles", null), new C0356("ro.kernel.qemu", "1"), new C0356("ro.product.device", "generic"), new C0356("ro.product.model", "sdk"), new C0356("ro.product.name", "sdk"), new C0356("ro.serialno", null)};

    /* renamed from: 纫, reason: contains not printable characters */
    private boolean f1599 = false;

    /* renamed from: 鷭, reason: contains not printable characters */
    public boolean f1601 = false;

    /* renamed from: 䒧, reason: contains not printable characters */
    private boolean f1598 = true;

    /* renamed from: 躆, reason: contains not printable characters */
    private List<String> f1600 = new ArrayList();

    /* renamed from: o.if$鷭, reason: contains not printable characters */
    public interface InterfaceC0053 {
        /* renamed from: 鷭, reason: contains not printable characters */
        void mo673(boolean z);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static Cif m669(c_activity c_activityVar) {
        if (c_activityVar == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        if (f1594 == null) {
            f1594 = new Cif(c_activityVar.getApplicationContext());
        }
        return f1594;
    }

    private Cif(Context context) {
        this.f1597 = context;
        this.f1600.add("com.google.android.launcher.layouts.genymotion");
        this.f1600.add("com.bluestacks");
        this.f1600.add("com.bignox.app");
        this.f1600.add("com.vphone.launcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa  */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ boolean m671(o.Cif r10) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Cif.m671(o.if):boolean");
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static boolean m667() throws IOException {
        for (File file : new File[]{new File("/proc/tty/drivers"), new File("/proc/cpuinfo")}) {
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String str = new String(bArr);
                for (String str2 : f1587) {
                    if (str.contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private boolean m672(String[] strArr, String str) {
        File file;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            if (ContextCompat.checkSelfPermission(this.f1597, "android.permission.READ_EXTERNAL_STORAGE") == 0 && str2.contains("/") && str.equals("Nox")) {
                file = new File(Environment.getExternalStorageDirectory() + str2);
            } else {
                file = new File(str2);
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private boolean m666() throws IOException {
        if (ContextCompat.checkSelfPermission(this.f1597, "android.permission.INTERNET") != 0) {
            return false;
        }
        String[] strArr = {"/system/bin/netcfg"};
        StringBuilder sb = new StringBuilder();
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
            new File("/system/bin/");
            InputStream inputStream = processBuilder.start().getInputStream();
            byte[] bArr = new byte[1024];
            while (inputStream.read(bArr) != -1) {
                sb.append(new String(bArr));
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str : string.split("\n")) {
            if ((str.contains("wlan0") || str.contains("tunl0") || str.contains("eth0")) && str.contains("10.0.2.15")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m668(Context context, String str) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ void m670() {
    }
}
