package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class add extends AsyncTask<Void, String, JSONArray> {

    /* renamed from: Ą, reason: contains not printable characters */
    protected acn f469;

    /* renamed from: ą, reason: contains not printable characters */
    private long f470;

    /* renamed from: ȃ, reason: contains not printable characters */
    protected Boolean f471 = false;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public Context f472;

    /* renamed from: 櫯, reason: contains not printable characters */
    protected String f473;

    /* renamed from: 鷭, reason: contains not printable characters */
    protected String f474;

    @Override // android.os.AsyncTask
    protected /* synthetic */ JSONArray doInBackground(Void[] voidArr) {
        return m326();
    }

    public add(WeakReference<? extends Context> weakReference, String str, String str2, acn acnVar) throws PackageManager.NameNotFoundException {
        long j;
        this.f474 = null;
        this.f473 = null;
        this.f472 = null;
        this.f470 = 0L;
        this.f473 = str2;
        this.f474 = str;
        this.f469 = acnVar;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            this.f472 = context.getApplicationContext();
            Context context2 = context;
            if (acb.m306(context)) {
                SharedPreferences sharedPreferences = context2.getSharedPreferences("HockeyApp", 0);
                long j2 = sharedPreferences.getLong("usageTime" + aba.f322, 0L);
                if (j2 < 0) {
                    sharedPreferences.edit().remove("usageTime" + aba.f322).apply();
                    j = 0;
                } else {
                    j = j2 / 1000;
                }
            } else {
                j = 0;
            }
            this.f470 = j;
            aba.m282(context);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private JSONArray m326() throws NumberFormatException, IOException {
        try {
            int i = Integer.parseInt(aba.f322);
            Context context = this.f472;
            JSONArray jSONArray = new JSONArray(context != null ? context.getSharedPreferences("HockeyApp", 0).getString(aeb.f570, "[]") : "[]");
            if (m329(jSONArray, i)) {
                return jSONArray;
            }
            URLConnection uRLConnectionOpenConnection = new URL(m330("json")).openConnection();
            uRLConnectionOpenConnection.addRequestProperty("User-Agent", "HockeySDK/Android");
            if (Build.VERSION.SDK_INT <= 9) {
                uRLConnectionOpenConnection.setRequestProperty("connection", "close");
            }
            uRLConnectionOpenConnection.connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRLConnectionOpenConnection.getInputStream());
            String strM328 = m328(bufferedInputStream);
            bufferedInputStream.close();
            JSONArray jSONArray2 = new JSONArray(strM328);
            if (m329(jSONArray2, i)) {
                return m327(jSONArray2);
            }
            return null;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private boolean m329(JSONArray jSONArray, int i) throws JSONException {
        boolean z = false;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                boolean z2 = jSONObject.getInt(ClientCookie.VERSION_ATTR) > i;
                boolean z3 = jSONObject.getInt(ClientCookie.VERSION_ATTR) == i && aec.m396(this.f472, jSONObject.getLong("timestamp"));
                String string = jSONObject.getString("minimum_os_version");
                String str = Build.VERSION.RELEASE;
                boolean z4 = aec.m391(string, (str == null || str.equalsIgnoreCase("L")) ? "5.0" : str.equalsIgnoreCase("M") ? "6.0" : str.equalsIgnoreCase("N") ? "7.0" : Pattern.matches("^[a-zA-Z]+", str) ? "99.0" : str) <= 0;
                if ((z2 || z3) && z4) {
                    if (jSONObject.has("mandatory")) {
                        this.f471 = Boolean.valueOf(this.f471.booleanValue() | jSONObject.getBoolean("mandatory"));
                    }
                    z = true;
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static JSONArray m327(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < Math.min(jSONArray.length(), 25); i++) {
            try {
                jSONArray2.put(jSONArray.get(i));
            } catch (JSONException unused) {
            }
        }
        return jSONArray2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: 鷭, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void onPostExecute(JSONArray jSONArray) {
        if (jSONArray != null && this.f469 != null) {
            this.f469.mo315(jSONArray, m330("apk"));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected void mo331() {
        this.f474 = null;
        this.f473 = null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected final String m330(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f474);
        sb.append("api/2/apps/");
        sb.append(this.f473 != null ? this.f473 : this.f472.getPackageName());
        sb.append("?format=" + str);
        if (Settings.Secure.getString(this.f472.getContentResolver(), "android_id") != null) {
            sb.append("&udid=" + m325(Settings.Secure.getString(this.f472.getContentResolver(), "android_id")));
        }
        sb.append("&os=Android");
        sb.append("&os_version=" + m325(aba.f315));
        sb.append("&device=" + m325(aba.f317));
        sb.append("&oem=" + m325(aba.f318));
        sb.append("&app_version=" + m325(aba.f322));
        sb.append("&sdk=" + m325("HockeySDK"));
        sb.append("&sdk_version=" + m325("4.1.0-alpha.2"));
        sb.append("&lang=" + m325(Locale.getDefault().getLanguage()));
        sb.append("&usage_time=" + this.f470);
        return sb.toString();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static String m325(String str) {
        try {
            return URLEncoder.encode(str, HTTP.UTF_8);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m328(BufferedInputStream bufferedInputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream), 1024);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line + "\n");
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
