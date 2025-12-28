package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aec {

    /* renamed from: ȃ, reason: contains not printable characters */
    private int f571;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private acl f572;

    /* renamed from: 櫯, reason: contains not printable characters */
    private JSONObject f573;

    /* renamed from: 鷭, reason: contains not printable characters */
    private ArrayList<JSONObject> f574;

    public aec(Activity activity, String str, acl aclVar) throws JSONException {
        this.f572 = aclVar;
        m395(activity, str);
        Collections.sort(this.f574, new aed(this));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m395(Activity activity, String str) throws JSONException {
        this.f573 = new JSONObject();
        this.f574 = new ArrayList<>();
        this.f571 = this.f572.mo169();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int iMo169 = this.f572.mo169();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                boolean z = jSONObject.getInt(ClientCookie.VERSION_ATTR) > iMo169;
                boolean z2 = jSONObject.getInt(ClientCookie.VERSION_ATTR) == iMo169 && m396(activity, jSONObject.getLong("timestamp"));
                if (z || z2) {
                    this.f573 = jSONObject;
                    iMo169 = jSONObject.getInt(ClientCookie.VERSION_ATTR);
                }
                this.f574.add(jSONObject);
            }
        } catch (NullPointerException unused) {
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final String m400() {
        return m394(this.f573, "shortversion", "") + " (" + m394(this.f573, ClientCookie.VERSION_ATTR, "") + ")";
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: 櫯, reason: contains not printable characters */
    public final String m399() {
        return new SimpleDateFormat("dd.MM.yyyy").format(new Date(1000 * m393(this.f573, "timestamp")));
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final long m398() {
        boolean zBooleanValue = Boolean.valueOf(m394(this.f573, "external", "false")).booleanValue();
        long jM393 = m393(this.f573, "appsize");
        if (zBooleanValue && jM393 == 0) {
            return -1L;
        }
        return jM393;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m394(JSONObject jSONObject, String str, String str2) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static long m393(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getLong(str);
        } catch (JSONException unused) {
            return 0L;
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final String m397() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body style='padding: 0px 0px 20px 0px'>");
        int i = 0;
        Iterator<JSONObject> it = this.f574.iterator();
        while (it.hasNext()) {
            JSONObject next = it.next();
            if (i > 0) {
                sb.append((Object) "<hr style='border-top: 1px solid #c8c8c8; border-bottom: 0px; margin: 40px 10px 0px 10px;' />");
            }
            int i2 = i;
            StringBuilder sb2 = new StringBuilder();
            int iM392 = m392(this.f573);
            int iM3922 = m392(next);
            String strM390 = m390(next);
            sb2.append("<div style='padding: 20px 10px 10px;'><strong>");
            if (i2 == 0) {
                sb2.append("Newest version:");
            } else {
                sb2.append("Version " + strM390 + " (" + iM3922 + "): ");
                if (iM3922 != iM392 && iM3922 == this.f571) {
                    this.f571 = -1;
                    sb2.append("[INSTALLED]");
                }
            }
            sb2.append("</strong></div>");
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            String strM394 = m394(next, "notes", "");
            sb3.append("<div style='padding: 0px 10px;'>");
            if (strM394.trim().length() == 0) {
                sb3.append("<em>No information.</em>");
            } else {
                sb3.append(strM394);
            }
            sb3.append("</div>");
            sb.append(sb3.toString());
            i++;
        }
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m392(JSONObject jSONObject) {
        try {
            return jSONObject.getInt(ClientCookie.VERSION_ATTR);
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static String m390(JSONObject jSONObject) {
        try {
            return jSONObject.getString("shortversion");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static int m391(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        try {
            Scanner scanner = new Scanner(str.replaceAll("\\-.*", ""));
            Scanner scanner2 = new Scanner(str2.replaceAll("\\-.*", ""));
            scanner.useDelimiter("\\.");
            scanner2.useDelimiter("\\.");
            while (scanner.hasNextInt() && scanner2.hasNextInt()) {
                int iNextInt = scanner.nextInt();
                int iNextInt2 = scanner2.nextInt();
                if (iNextInt < iNextInt2) {
                    return -1;
                }
                if (iNextInt > iNextInt2) {
                    return 1;
                }
            }
            if (scanner.hasNextInt()) {
                return 1;
            }
            if (scanner2.hasNextInt()) {
                return -1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean m396(Context context, long j) {
        if (context == null) {
            return false;
        }
        try {
            return j > (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir).lastModified() / 1000) + 1800;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
