package o;

import java.util.Comparator;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class aed implements Comparator<JSONObject> {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ aec f575;

    aed(aec aecVar) {
        this.f575 = aecVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(JSONObject jSONObject, JSONObject jSONObject2) {
        return m401(jSONObject, jSONObject2);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m401(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject.getInt(ClientCookie.VERSION_ATTR) > jSONObject2.getInt(ClientCookie.VERSION_ATTR)) {
                return 0;
            }
            return 0;
        } catch (NullPointerException unused) {
            return 0;
        } catch (JSONException unused2) {
            return 0;
        }
    }
}
