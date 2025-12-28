package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adr {

    /* renamed from: o.adr$鷭, reason: contains not printable characters */
    public static class C0011 {

        /* renamed from: 鷭, reason: contains not printable characters */
        public static final adr f528 = new adr();
    }

    private adr() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static acy m354(String str) throws JSONException {
        acy acyVar = null;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("feedback");
                acu acuVar = new acu();
                JSONArray jSONArray = jSONObject2.getJSONArray("messages");
                ArrayList<acx> arrayList = null;
                if (jSONArray.length() > 0) {
                    arrayList = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getJSONObject(i).getString("subject").toString();
                        String string2 = jSONArray.getJSONObject(i).getString("text").toString();
                        String string3 = jSONArray.getJSONObject(i).getString("oem").toString();
                        String string4 = jSONArray.getJSONObject(i).getString("model").toString();
                        String string5 = jSONArray.getJSONObject(i).getString("os_version").toString();
                        String string6 = jSONArray.getJSONObject(i).getString("created_at").toString();
                        int i2 = jSONArray.getJSONObject(i).getInt("id");
                        String string7 = jSONArray.getJSONObject(i).getString("token").toString();
                        int i3 = jSONArray.getJSONObject(i).getInt("via");
                        String string8 = jSONArray.getJSONObject(i).getString("user_string").toString();
                        String string9 = jSONArray.getJSONObject(i).getString("clean_text").toString();
                        String string10 = jSONArray.getJSONObject(i).getString("name").toString();
                        String string11 = jSONArray.getJSONObject(i).getString("app_id").toString();
                        JSONArray jSONArrayOptJSONArray = jSONArray.getJSONObject(i).optJSONArray("attachments");
                        List<acv> listEmptyList = Collections.emptyList();
                        if (jSONArrayOptJSONArray != null) {
                            listEmptyList = new ArrayList<>();
                            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                                int i5 = jSONArrayOptJSONArray.getJSONObject(i4).getInt("id");
                                int i6 = jSONArrayOptJSONArray.getJSONObject(i4).getInt("feedback_message_id");
                                String string12 = jSONArrayOptJSONArray.getJSONObject(i4).getString("file_name");
                                String string13 = jSONArrayOptJSONArray.getJSONObject(i4).getString("url");
                                String string14 = jSONArrayOptJSONArray.getJSONObject(i4).getString("created_at");
                                String string15 = jSONArrayOptJSONArray.getJSONObject(i4).getString("updated_at");
                                acv acvVar = new acv();
                                acvVar.f429 = i5;
                                acvVar.f428 = i6;
                                acvVar.f427 = string12;
                                acvVar.f426 = string13;
                                acvVar.f424 = string14;
                                acvVar.f425 = string15;
                                listEmptyList.add(acvVar);
                            }
                        }
                        acx acxVar = new acx();
                        acxVar.f443 = string11;
                        acxVar.f437 = string9;
                        acxVar.f432 = string6;
                        acxVar.f433 = i2;
                        acxVar.f436 = string4;
                        acxVar.f435 = string10;
                        acxVar.f438 = string3;
                        acxVar.f431 = string5;
                        acxVar.f444 = string;
                        acxVar.f442 = string2;
                        acxVar.f434 = string7;
                        acxVar.f441 = string8;
                        acxVar.f439 = i3;
                        acxVar.f440 = listEmptyList;
                        arrayList.add(acxVar);
                    }
                }
                acuVar.f419 = arrayList;
                try {
                    acuVar.f423 = jSONObject2.getString("name").toString();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                try {
                    acuVar.f422 = jSONObject2.getString("email").toString();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                try {
                    acuVar.f421 = jSONObject2.getInt("id");
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                try {
                    acuVar.f420 = jSONObject2.getString("created_at").toString();
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                acy acyVar2 = new acy();
                acyVar = acyVar2;
                acyVar2.f446 = acuVar;
                try {
                    acyVar.f447 = jSONObject.getString("status").toString();
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
                try {
                    acyVar.f445 = jSONObject.getString("token").toString();
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
        return acyVar;
    }
}
