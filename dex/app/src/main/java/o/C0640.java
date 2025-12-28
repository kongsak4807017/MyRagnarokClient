package o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;

/* renamed from: o.刴, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0640 {

    /* renamed from: Ą, reason: contains not printable characters */
    String f7517;

    /* renamed from: ą, reason: contains not printable characters */
    public Context f7518;

    /* renamed from: Ć, reason: contains not printable characters */
    public InterfaceC0957 f7519;

    /* renamed from: ć, reason: contains not printable characters */
    public int f7520;

    /* renamed from: ȃ, reason: contains not printable characters */
    boolean f7521;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public InterfaceC0642 f7522;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public boolean f7523;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public String f7524;

    /* renamed from: 岱, reason: contains not printable characters */
    String f7525;

    /* renamed from: 櫯, reason: contains not printable characters */
    boolean f7526;

    /* renamed from: 鷭, reason: contains not printable characters */
    public String f7527;

    /* renamed from: o.刴$if, reason: invalid class name */
    public interface Cif {
    }

    /* renamed from: o.刴$ˮ͈, reason: contains not printable characters */
    public interface InterfaceC0641 {
    }

    /* renamed from: o.刴$櫯, reason: contains not printable characters */
    public interface InterfaceC0642 {
        /* renamed from: 鷭 */
        void mo555(C0378 c0378, C1067 c1067);
    }

    /* renamed from: o.刴$鷭, reason: contains not printable characters */
    public interface InterfaceC0643 {
        /* renamed from: 鷭 */
        void mo554(C1067 c1067, C0378 c0378);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final boolean m1406(int i, int i2, Intent intent) {
        int iLongValue;
        boolean z;
        if (i != this.f7520) {
            return false;
        }
        m1405("handleActivityResult");
        this.f7517 = "";
        this.f7521 = false;
        if (intent == null) {
            Log.e(this.f7527, "In-app billing error: Null data in IAB activity result.");
            C0378 c0378 = new C0378(-1002, "Null data in IAB result");
            if (this.f7522 != null) {
                this.f7522.mo555(c0378, null);
                return true;
            }
            return true;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            Log.e(this.f7527, "In-app billing error: Intent with no response code, assuming OK (known issue)");
            iLongValue = 0;
        } else if (obj instanceof Integer) {
            iLongValue = ((Integer) obj).intValue();
        } else {
            if (!(obj instanceof Long)) {
                Log.e(this.f7527, "In-app billing error: Unexpected type for intent response code.");
                Log.e(this.f7527, "In-app billing error: " + obj.getClass().getName());
                throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
            }
            iLongValue = (int) ((Long) obj).longValue();
        }
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i2 == -1 && iLongValue == 0) {
            new StringBuilder("Extras: ").append(intent.getExtras());
            if (stringExtra == null || stringExtra2 == null) {
                Log.e(this.f7527, "In-app billing error: BUG: either purchaseData or dataSignature is null.");
                intent.getExtras();
                C0378 c03782 = new C0378(-1008, "IAB returned null purchaseData or dataSignature");
                if (this.f7522 != null) {
                    this.f7522.mo555(c03782, null);
                    return true;
                }
                return true;
            }
            try {
                C1067 c1067 = new C1067(this.f7524, stringExtra, stringExtra2);
                String str = c1067.f8845;
                String str2 = this.f7525;
                if (stringExtra == null) {
                    Log.e("IABUtil/Security", "data is null");
                    z = false;
                } else {
                    z = TextUtils.isEmpty(stringExtra2) || C0898.m1525(C0898.m1524(str2), stringExtra, stringExtra2);
                }
                if (!z) {
                    Log.e(this.f7527, "In-app billing error: " + ("Purchase signature verification FAILED for sku " + str));
                    C0378 c03783 = new C0378(-1003, "Signature verification failed for sku " + str);
                    if (this.f7522 != null) {
                        this.f7522.mo555(c03783, c1067);
                        return true;
                    }
                    return true;
                }
                if (this.f7522 != null) {
                    this.f7522.mo555(new C0378(0, "Success"), c1067);
                    return true;
                }
                return true;
            } catch (JSONException e) {
                Log.e(this.f7527, "In-app billing error: Failed to parse purchase data.");
                e.printStackTrace();
                C0378 c03784 = new C0378(-1002, "Failed to parse purchase data.");
                if (this.f7522 != null) {
                    this.f7522.mo555(c03784, null);
                    return true;
                }
                return true;
            }
        }
        if (i2 == -1) {
            m1403(iLongValue);
            if (this.f7522 != null) {
                this.f7522.mo555(new C0378(iLongValue, "Problem purchashing item."), null);
                return true;
            }
            return true;
        }
        if (i2 == 0) {
            m1403(iLongValue);
            C0378 c03785 = new C0378(-1005, "User canceled.");
            if (this.f7522 != null) {
                this.f7522.mo555(c03785, null);
                return true;
            }
            return true;
        }
        Log.e(this.f7527, "In-app billing error: " + ("Purchase failed. Result code: " + Integer.toString(i2) + ". Response: " + m1403(iLongValue)));
        C0378 c03786 = new C0378(-1006, "Unknown purchase response.");
        if (this.f7522 != null) {
            this.f7522.mo555(c03786, null);
            return true;
        }
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static String m1403(int i) {
        String[] strArrSplit = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] strArrSplit2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= -1000) {
            int i2 = (-1000) - i;
            return (i2 < 0 || i2 >= strArrSplit2.length) ? String.valueOf(String.valueOf(i)) + ":Unknown IAB Helper Error" : strArrSplit2[i2];
        }
        if (i < 0 || i >= strArrSplit.length) {
            return String.valueOf(String.valueOf(i)) + ":Unknown";
        }
        return strArrSplit[i];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1405(String str) {
        if (!this.f7526) {
            Log.e(this.f7527, "In-app billing error: " + ("Illegal state for operation (" + str + "): IAB helper is not set up."));
            throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m1404(String str) {
        if (this.f7521) {
            throw new IllegalStateException("Can't start async operation (" + str + ") because another async operation(" + this.f7517 + ") is in progress.");
        }
        this.f7517 = str;
        this.f7521 = true;
    }
}
