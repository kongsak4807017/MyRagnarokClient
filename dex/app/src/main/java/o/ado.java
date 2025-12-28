package o;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.os.EnvironmentCompat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import o.aca;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ado extends adh<Void, Void, HashMap<String, String>> {

    /* renamed from: Ą, reason: contains not printable characters */
    private String f503;

    /* renamed from: ą, reason: contains not printable characters */
    private String f504;

    /* renamed from: Ć, reason: contains not printable characters */
    private String f505;

    /* renamed from: ć, reason: contains not printable characters */
    private String f506;

    /* renamed from: ȃ, reason: contains not printable characters */
    private String f508;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private boolean f509;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private Handler f510;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private List<Uri> f511;

    /* renamed from: 岱, reason: contains not printable characters */
    private String f512;

    /* renamed from: 櫯, reason: contains not printable characters */
    public ProgressDialog f513;

    /* renamed from: 鷭, reason: contains not printable characters */
    public Context f515;

    /* renamed from: ċ, reason: contains not printable characters */
    private boolean f507 = true;

    /* renamed from: 纫, reason: contains not printable characters */
    private int f514 = -1;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        if (!this.f509 || this.f512 == null) {
            if (this.f509) {
                return null;
            }
            if (this.f511.isEmpty()) {
                return m349();
            }
            HashMap<String, String> mapM348 = m348();
            if (mapM348 != null && (str = mapM348.get("status")) != null && str.startsWith("2") && this.f515 != null) {
                File file = new File(this.f515.getCacheDir(), "HockeyApp");
                if (file.exists()) {
                    for (File file2 : file.listFiles()) {
                        if (file2 != null) {
                            file2.delete();
                        }
                    }
                }
            }
            return mapM348;
        }
        return m347();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        HashMap map = (HashMap) obj;
        if (this.f513 != null) {
            try {
                this.f513.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f510 != null) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            if (map != null) {
                bundle.putString("request_type", (String) map.get("type"));
                bundle.putString("feedback_response", (String) map.get("response"));
                bundle.putString("feedback_status", (String) map.get("status"));
            } else {
                bundle.putString("request_type", EnvironmentCompat.MEDIA_UNKNOWN);
            }
            message.setData(bundle);
            this.f510.sendMessage(message);
        }
    }

    public ado(Context context, String str, String str2, String str3, String str4, String str5, List<Uri> list, String str6, Handler handler, boolean z) throws PackageManager.NameNotFoundException {
        this.f515 = context;
        this.f508 = str;
        this.f503 = str2;
        this.f504 = str3;
        this.f505 = str4;
        this.f506 = str5;
        this.f511 = list;
        this.f512 = str6;
        this.f510 = handler;
        this.f509 = z;
        if (context != null) {
            aba.m282(context);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        String string = this.f515.getString(aca.C0005.hockeyapp_feedback_sending_feedback_text);
        if (this.f509) {
            string = this.f515.getString(aca.C0005.hockeyapp_feedback_fetching_feedback_text);
        }
        if ((this.f513 == null || !this.f513.isShowing()) && this.f507) {
            this.f513 = ProgressDialog.show(this.f515, "", string, true, false);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private HashMap<String, String> m349() {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "send");
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HashMap map2 = new HashMap();
                map2.put("name", this.f503);
                map2.put("email", this.f504);
                map2.put("subject", this.f505);
                map2.put("text", this.f506);
                map2.put("bundle_identifier", aba.f319);
                map2.put("bundle_short_version", aba.f320);
                map2.put("bundle_version", aba.f322);
                map2.put("os_version", aba.f315);
                map2.put("oem", aba.f318);
                map2.put("model", aba.f317);
                if (this.f512 != null) {
                    this.f508 += this.f512 + "/";
                }
                adu aduVar = new adu(this.f508);
                aduVar.f535 = this.f512 != null ? HttpPut.METHOD_NAME : HttpPost.METHOD_NAME;
                HttpURLConnection httpURLConnectionM357 = aduVar.m359(map2).m357();
                httpURLConnection = httpURLConnectionM357;
                httpURLConnectionM357.connect();
                map.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                String strM337 = adh.m337(bufferedInputStream);
                bufferedInputStream.close();
                map.put("response", strM337);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            return map;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private HashMap<String, String> m348() {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "send");
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HashMap map2 = new HashMap();
                map2.put("name", this.f503);
                map2.put("email", this.f504);
                map2.put("subject", this.f505);
                map2.put("text", this.f506);
                map2.put("bundle_identifier", aba.f319);
                map2.put("bundle_short_version", aba.f320);
                map2.put("bundle_version", aba.f322);
                map2.put("os_version", aba.f315);
                map2.put("oem", aba.f318);
                map2.put("model", aba.f317);
                if (this.f512 != null) {
                    this.f508 += this.f512 + "/";
                }
                adu aduVar = new adu(this.f508);
                aduVar.f535 = this.f512 != null ? HttpPut.METHOD_NAME : HttpPost.METHOD_NAME;
                HttpURLConnection httpURLConnectionM357 = aduVar.m358(map2, this.f515, this.f511).m357();
                httpURLConnection = httpURLConnectionM357;
                httpURLConnectionM357.connect();
                map.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                String strM337 = adh.m337(bufferedInputStream);
                bufferedInputStream.close();
                map.put("response", strM337);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            return map;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private HashMap<String, String> m347() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f508 + adz.m384(this.f512));
        if (this.f514 != -1) {
            sb.append("?last_message_id=" + this.f514);
        }
        HashMap<String, String> map = new HashMap<>();
        HttpURLConnection httpURLConnectionM357 = null;
        try {
            try {
                httpURLConnectionM357 = new adu(sb.toString()).m357();
                map.put("type", "fetch");
                httpURLConnectionM357.connect();
                map.put("status", String.valueOf(httpURLConnectionM357.getResponseCode()));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnectionM357.getInputStream());
                String strM337 = adh.m337(bufferedInputStream);
                bufferedInputStream.close();
                map.put("response", strM337);
                if (httpURLConnectionM357 != null) {
                    httpURLConnectionM357.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (httpURLConnectionM357 != null) {
                    httpURLConnectionM357.disconnect();
                }
            }
            return map;
        } catch (Throwable th) {
            if (httpURLConnectionM357 != null) {
                httpURLConnectionM357.disconnect();
            }
            throw th;
        }
    }
}
