package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;
import net.hockeyapp.android.UpdateActivity;
import o.aca;
import org.apache.http.HttpHeaders;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class adi extends AsyncTask<Void, Integer, Long> {

    /* renamed from: ą, reason: contains not printable characters */
    protected ProgressDialog f482;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    protected String f485;

    /* renamed from: 櫯, reason: contains not printable characters */
    protected acp f486;

    /* renamed from: 鷭, reason: contains not printable characters */
    protected Context f487;

    /* renamed from: ȃ, reason: contains not printable characters */
    protected String f484 = UUID.randomUUID() + ".apk";

    /* renamed from: Ą, reason: contains not printable characters */
    protected String f481 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download";

    /* renamed from: Ć, reason: contains not printable characters */
    private String f483 = null;

    @Override // android.os.AsyncTask
    protected /* synthetic */ Long doInBackground(Void[] voidArr) {
        return mo340();
    }

    public adi(Activity activity, String str, acp acpVar) {
        this.f487 = activity;
        this.f485 = str;
        this.f486 = acpVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m343(UpdateActivity updateActivity) {
        this.f487 = updateActivity;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m341() {
        this.f487 = null;
        this.f482 = null;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    protected Long mo340() throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnectionM338 = m338(new URL(this.f485 + "&type=apk"), 6);
                httpURLConnectionM338.connect();
                int contentLength = httpURLConnectionM338.getContentLength();
                String contentType = httpURLConnectionM338.getContentType();
                if (contentType != null && contentType.contains("text")) {
                    this.f483 = "The requested download does not appear to be a file.";
                    return 0L;
                }
                File file = new File(this.f481);
                if (!file.mkdirs() && !file.exists()) {
                    throw new IOException("Could not create the dir(s):" + file.getAbsolutePath());
                }
                File file2 = new File(file, this.f484);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnectionM338.getInputStream());
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    j += i;
                    publishProgress(Integer.valueOf(Math.round((j * 100.0f) / contentLength)));
                    fileOutputStream.write(bArr, 0, i);
                }
                fileOutputStream.flush();
                Long lValueOf = Long.valueOf(j);
                try {
                    fileOutputStream.close();
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return lValueOf;
            } catch (IOException e2) {
                e2.printStackTrace();
                if (0 != 0) {
                    try {
                        outputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return 0L;
                    }
                }
                if (0 != 0) {
                    inputStream.close();
                }
                return 0L;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                    throw th;
                }
            }
            if (0 != 0) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected static HttpURLConnection m338(URL url, int i) throws IOException {
        HttpURLConnection httpURLConnection;
        while (true) {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.addRequestProperty("User-Agent", "HockeySDK/Android");
            httpURLConnection.setInstanceFollowRedirects(true);
            if (Build.VERSION.SDK_INT <= 9) {
                httpURLConnection.setRequestProperty("connection", "close");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if ((responseCode != 301 && responseCode != 302 && responseCode != 303) || i == 0) {
                return httpURLConnection;
            }
            URL url2 = new URL(httpURLConnection.getHeaderField(HttpHeaders.LOCATION));
            if (url.getProtocol().equals(url2.getProtocol())) {
                break;
            }
            httpURLConnection.disconnect();
            i--;
            url = url2;
        }
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: 鷭, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        try {
            if (this.f482 == null) {
                this.f482 = new ProgressDialog(this.f487);
                this.f482.setProgressStyle(1);
                this.f482.setMessage("Loading...");
                this.f482.setCancelable(false);
                this.f482.show();
            }
            this.f482.setProgress(numArr[0].intValue());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: 鷭, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void onPostExecute(Long l) {
        String string;
        if (this.f482 != null) {
            try {
                this.f482.dismiss();
            } catch (Exception unused) {
            }
        }
        if (l.longValue() > 0) {
            this.f486.mo307(this);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(new File(this.f481, this.f484)), "application/vnd.android.package-archive");
            intent.setFlags(268435456);
            this.f487.startActivity(intent);
            return;
        }
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f487);
            builder.setTitle(aca.C0005.hockeyapp_download_failed_dialog_title);
            if (this.f483 == null) {
                string = this.f487.getString(aca.C0005.hockeyapp_download_failed_dialog_message);
            } else {
                string = this.f483;
            }
            builder.setMessage(string);
            builder.setNegativeButton(aca.C0005.hockeyapp_download_failed_dialog_negative_button, new adj(this));
            builder.setPositiveButton(aca.C0005.hockeyapp_download_failed_dialog_positive_button, new adk(this));
            builder.create().show();
        } catch (Exception unused2) {
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    protected final String m339() {
        return this.f485 + "&type=apk";
    }
}
