package o;

import org.json.JSONObject;

/* renamed from: o.묜, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C1067 {

    /* renamed from: Ą, reason: contains not printable characters */
    long f8841;

    /* renamed from: ą, reason: contains not printable characters */
    int f8842;

    /* renamed from: Ć, reason: contains not printable characters */
    String f8843;

    /* renamed from: ć, reason: contains not printable characters */
    String f8844;

    /* renamed from: ȃ, reason: contains not printable characters */
    String f8845;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    String f8846;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public String f8847;

    /* renamed from: 岱, reason: contains not printable characters */
    public String f8848;

    /* renamed from: 櫯, reason: contains not printable characters */
    String f8849;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f8850;

    public C1067(String str, String str2, String str3) {
        this.f8850 = str;
        this.f8847 = str2;
        JSONObject jSONObject = new JSONObject(this.f8847);
        this.f8849 = jSONObject.optString("orderId");
        this.f8846 = jSONObject.optString("packageName");
        this.f8845 = jSONObject.optString("productId");
        this.f8841 = jSONObject.optLong("purchaseTime");
        this.f8842 = jSONObject.optInt("purchaseState");
        this.f8843 = jSONObject.optString("developerPayload");
        this.f8844 = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.f8848 = str3;
    }

    public final String toString() {
        return "PurchaseInfo(type:" + this.f8850 + "):" + this.f8847;
    }
}
