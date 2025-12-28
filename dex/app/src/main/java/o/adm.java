package o;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.Map;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adm extends adh<Void, Void, Boolean> {

    /* renamed from: Ą, reason: contains not printable characters */
    private final int f491;

    /* renamed from: ą, reason: contains not printable characters */
    private final String f492;

    /* renamed from: Ć, reason: contains not printable characters */
    private final Map<String, String> f493;

    /* renamed from: ȃ, reason: contains not printable characters */
    private boolean f494 = true;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public ProgressDialog f495;

    /* renamed from: 櫯, reason: contains not printable characters */
    public Handler f496;

    /* renamed from: 鷭, reason: contains not printable characters */
    public Context f497;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m345();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f495 != null) {
            try {
                this.f495.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f496 != null) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putBoolean("success", bool.booleanValue());
            message.setData(bundle);
            this.f496.sendMessage(message);
        }
    }

    public adm(Context context, Handler handler, String str, int i, Map<String, String> map) throws PackageManager.NameNotFoundException {
        this.f497 = context;
        this.f496 = handler;
        this.f492 = str;
        this.f491 = i;
        this.f493 = map;
        if (context != null) {
            aba.m282(context);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        if ((this.f495 == null || !this.f495.isShowing()) && this.f494) {
            this.f495 = ProgressDialog.show(this.f497, "", "Please wait...", true, false);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private Boolean m345() {
        HttpURLConnection httpURLConnectionM357;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                int i = this.f491;
                Map<String, String> map = this.f493;
                if (i == 1) {
                    adu aduVar = new adu(this.f492);
                    aduVar.f535 = HttpPost.METHOD_NAME;
                    httpURLConnectionM357 = aduVar.m359(map).m357();
                } else if (i == 2) {
                    adu aduVar2 = new adu(this.f492);
                    aduVar2.f535 = HttpPost.METHOD_NAME;
                    aduVar2.f534.put("Authorization", "Basic " + adq.m351((map.get("email") + ":" + map.get("password")).getBytes()));
                    httpURLConnectionM357 = aduVar2.m357();
                } else {
                    if (i != 3) {
                        throw new IllegalArgumentException("Login mode " + i + " not supported.");
                    }
                    httpURLConnectionM357 = new adu(this.f492 + "?" + map.get("type") + "=" + map.get("id")).m357();
                }
                HttpURLConnection httpURLConnection2 = httpURLConnectionM357;
                httpURLConnectionM357.connect();
                if (httpURLConnection2.getResponseCode() == 200) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
                    String strM337 = adh.m337(bufferedInputStream);
                    bufferedInputStream.close();
                    if (!TextUtils.isEmpty(strM337)) {
                        Boolean boolValueOf = Boolean.valueOf(m346(strM337));
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        return boolValueOf;
                    }
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private boolean m346(String str) throws JSONException {
        SharedPreferences sharedPreferences = this.f497.getSharedPreferences("net.hockeyapp.android.login", 0);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("status");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            if (this.f491 == 1) {
                if (string.equals("identified")) {
                    String string2 = jSONObject.getString("iuid");
                    if (!TextUtils.isEmpty(string2)) {
                        sharedPreferences.edit().putString("iuid", string2).apply();
                        return true;
                    }
                    return false;
                }
                return false;
            }
            if (this.f491 == 2) {
                if (string.equals("authorized")) {
                    String string3 = jSONObject.getString("auid");
                    if (!TextUtils.isEmpty(string3)) {
                        sharedPreferences.edit().putString("auid", string3).apply();
                        return true;
                    }
                    return false;
                }
                return false;
            }
            if (this.f491 == 3) {
                if (string.equals("validated")) {
                    return true;
                }
                sharedPreferences.edit().remove("iuid").remove("auid").apply();
                return false;
            }
            throw new IllegalArgumentException("Login mode " + this.f491 + " not supported.");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
