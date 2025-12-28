package o;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Date;
import java.util.UUID;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class abj implements Thread.UncaughtExceptionHandler {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f342;

    /* renamed from: 櫯, reason: contains not printable characters */
    private boolean f343;

    /* renamed from: 鷭, reason: contains not printable characters */
    abi f344;

    public abj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, abi abiVar, boolean z) {
        this.f343 = false;
        this.f342 = uncaughtExceptionHandler;
        this.f343 = z;
        this.f344 = abiVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws IOException {
        abz.m303();
        if (aba.f323 == null) {
            this.f342.uncaughtException(thread, th);
            return;
        }
        abi abiVar = this.f344;
        Date date = new Date();
        Date date2 = new Date(abb.f325);
        th.printStackTrace(new PrintWriter(new StringWriter()));
        String string = UUID.randomUUID().toString();
        acq acqVar = new acq(string, th);
        acqVar.f407 = aba.f319;
        acqVar.f401 = aba.f322;
        acqVar.f403 = aba.f320;
        acqVar.f402 = date2;
        acqVar.f397 = date;
        acqVar.f398 = aba.f315;
        acqVar.f399 = aba.f316;
        acqVar.f400 = aba.f318;
        acqVar.f405 = aba.f317;
        if (thread != null) {
            acqVar.f409 = thread.getName() + "-" + thread.getId();
        }
        if (aba.f321 != null) {
            acqVar.f404 = aba.f321;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(aba.f323 + "/" + acqVar.f408 + ".stacktrace"));
                bufferedWriter = bufferedWriter2;
                acq.m317(bufferedWriter2, "Package", acqVar.f407);
                acq.m317(bufferedWriter, "Version Code", acqVar.f401);
                acq.m317(bufferedWriter, "Version Name", acqVar.f403);
                acq.m317(bufferedWriter, "Android", acqVar.f398);
                acq.m317(bufferedWriter, "Android Build", acqVar.f399);
                acq.m317(bufferedWriter, "Manufacturer", acqVar.f400);
                acq.m317(bufferedWriter, "Model", acqVar.f405);
                acq.m317(bufferedWriter, "Thread", acqVar.f409);
                acq.m317(bufferedWriter, "CrashReporter Key", acqVar.f404);
                acq.m317(bufferedWriter, "Start Date", acq.f396.format(acqVar.f402));
                acq.m317(bufferedWriter, "Date", acq.f396.format(acqVar.f397));
                bufferedWriter.write("\n");
                bufferedWriter.write(acqVar.f406);
                bufferedWriter.flush();
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    if (adt.f529 <= 6) {
                        Log.e("HockeyApp", "Error saving crash report!", e);
                    }
                }
            } catch (IOException e2) {
                if (adt.f529 <= 6) {
                    Log.e("HockeyApp", "Error saving crash report!", e2);
                }
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException e3) {
                        if (adt.f529 <= 6) {
                            Log.e("HockeyApp", "Error saving crash report!", e3);
                        }
                    }
                }
            }
            if (abiVar != null) {
                try {
                    String strSubstring = null;
                    if (!TextUtils.isEmpty(null)) {
                        String str = null;
                        if (str.length() > 255) {
                            String str2 = null;
                            strSubstring = str2.substring(0, 255);
                        }
                    }
                    m297(strSubstring, string + ".user");
                    String strSubstring2 = null;
                    if (!TextUtils.isEmpty(null)) {
                        String str3 = null;
                        if (str3.length() > 255) {
                            String str4 = null;
                            strSubstring2 = str4.substring(0, 255);
                        }
                    }
                    m297(strSubstring2, string + ".contact");
                    m297(null, string + ".description");
                } catch (IOException e4) {
                    if (adt.f529 <= 6) {
                        Log.e("HockeyApp", "Error saving crash meta data!", e4);
                    }
                }
            }
            if (!this.f343) {
                this.f342.uncaughtException(thread, th);
            } else {
                Process.killProcess(Process.myPid());
                System.exit(10);
            }
        } catch (Throwable th2) {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e5) {
                    if (adt.f529 <= 6) {
                        Log.e("HockeyApp", "Error saving crash report!", e5);
                    }
                }
            }
            throw th2;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m297(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            String str3 = aba.f323 + "/" + str2;
            if (!TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) > 0) {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str3));
                bufferedWriter = bufferedWriter2;
                bufferedWriter2.write(str);
                bufferedWriter.flush();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException unused) {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (Throwable th) {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            throw th;
        }
    }
}
