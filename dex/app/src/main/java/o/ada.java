package o;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import o.aca;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ada {

    /* renamed from: 櫯, reason: contains not printable characters */
    boolean f454;

    /* renamed from: 鷭, reason: contains not printable characters */
    public Queue<Cif> f455;

    /* renamed from: o.ada$鷭, reason: contains not printable characters */
    public static class C0009 {

        /* renamed from: 鷭, reason: contains not printable characters */
        public static final ada f465 = new ada(null);
    }

    /* synthetic */ ada(adb adbVar) {
        this();
    }

    private ada() {
        this.f455 = new LinkedList();
        this.f454 = false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m320() {
        Cif cifPeek;
        if (!this.f454 && (cifPeek = this.f455.peek()) != null) {
            AsyncTaskC0008 asyncTaskC0008 = new AsyncTaskC0008(cifPeek, new adb(this));
            this.f454 = true;
            adp.m350(asyncTaskC0008);
        }
    }

    /* renamed from: o.ada$if, reason: invalid class name */
    public static class Cif {

        /* renamed from: ȃ, reason: contains not printable characters */
        int f456;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        boolean f457;

        /* renamed from: 櫯, reason: contains not printable characters */
        final aee f458;

        /* renamed from: 鷭, reason: contains not printable characters */
        final acv f459;

        public /* synthetic */ Cif(acv acvVar, aee aeeVar, adb adbVar) {
            this(acvVar, aeeVar);
        }

        private Cif(acv acvVar, aee aeeVar) {
            this.f459 = acvVar;
            this.f458 = aeeVar;
            this.f457 = false;
            this.f456 = 2;
        }
    }

    /* renamed from: o.ada$櫯, reason: contains not printable characters */
    static class AsyncTaskC0008 extends AsyncTask<Void, Integer, Boolean> {

        /* renamed from: 櫯, reason: contains not printable characters */
        private final Handler f463;

        /* renamed from: 鷭, reason: contains not printable characters */
        private final Cif f464;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        private File f462 = aba.m280();

        /* renamed from: ȃ, reason: contains not printable characters */
        private Bitmap f461 = null;

        /* renamed from: Ą, reason: contains not printable characters */
        private int f460 = 0;

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return m322();
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            aee aeeVar = this.f464.f458;
            this.f464.f457 = bool2.booleanValue();
            if (bool2.booleanValue()) {
                aeeVar.setImage(this.f461, this.f460);
            } else {
                if (!(this.f464.f456 > 0)) {
                    aeeVar.f583.setText(aca.C0005.hockeyapp_feedback_attachment_error);
                }
            }
            this.f463.sendEmptyMessage(0);
        }

        @Override // android.os.AsyncTask
        protected final /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        }

        public AsyncTaskC0008(Cif cif, adb adbVar) {
            this.f464 = cif;
            this.f463 = adbVar;
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        private Boolean m322() throws IOException {
            File[] fileArrListFiles;
            acv acvVar = this.f464.f459;
            File fileM280 = aba.m280();
            boolean z = fileM280.exists() && fileM280.isDirectory() && (fileArrListFiles = fileM280.listFiles(new acw(acvVar))) != null && fileArrListFiles.length == 1;
            if (!z) {
                if (adt.f529 <= 6) {
                    Log.e("HockeyApp", "Downloading...");
                }
                boolean zM323 = m323(acvVar.f426, new StringBuilder().append(acvVar.f428).append(acvVar.f429).toString());
                if (zM323) {
                    m321();
                }
                return Boolean.valueOf(zM323);
            }
            if (adt.f529 <= 6) {
                Log.e("HockeyApp", "Cached...");
            }
            m321();
            return true;
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        private void m321() {
            try {
                acv acvVar = this.f464.f459;
                String string = new StringBuilder().append(acvVar.f428).append(acvVar.f429).toString();
                aee aeeVar = this.f464.f458;
                this.f460 = adv.m362(new File(this.f462, string));
                this.f461 = adv.m364(new File(this.f462, string), this.f460 == 1 ? aeeVar.f577 : aeeVar.f581, this.f460 == 1 ? aeeVar.f578 : aeeVar.f576);
            } catch (IOException e) {
                e.printStackTrace();
                this.f461 = null;
            }
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        private boolean m323(String str, String str2) throws IOException {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.addRequestProperty("User-Agent", "HockeySDK/Android");
                httpURLConnection.setInstanceFollowRedirects(true);
                if (Build.VERSION.SDK_INT <= 9) {
                    httpURLConnection.setRequestProperty("connection", "close");
                }
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                String headerField = httpURLConnection.getHeaderField("Status");
                if (headerField != null && !headerField.startsWith("200")) {
                    return false;
                }
                File file = new File(this.f462, str2);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    j += i;
                    publishProgress(Integer.valueOf((int) ((100 * j) / contentLength)));
                    fileOutputStream.write(bArr, 0, i);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                return j > 0;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
    }
}
