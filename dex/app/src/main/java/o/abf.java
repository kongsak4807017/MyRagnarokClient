package o;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import org.apache.http.client.methods.HttpPost;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class abf extends Thread {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final /* synthetic */ acs f338 = null;

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ abi f339;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ WeakReference f340;

    abf(WeakReference weakReference, abi abiVar, acs acsVar) {
        this.f340 = weakReference;
        this.f339 = abiVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.f340;
        abi abiVar = this.f339;
        acs acsVar = this.f338;
        String[] strArrM295 = abb.m295();
        Boolean boolValueOf = false;
        if (strArrM295 != null && strArrM295.length > 0) {
            new StringBuilder("Found ").append(strArrM295.length).append(" stacktrace(s).");
            for (int i = 0; i < strArrM295.length; i++) {
                HttpURLConnection httpURLConnection = null;
                try {
                    try {
                        String str = strArrM295[i];
                        String strM284 = abb.m284(weakReference, str);
                        if (strM284.length() > 0) {
                            String strM2842 = abb.m284(weakReference, str.replace(".stacktrace", ".user"));
                            String strM2843 = abb.m284(weakReference, str.replace(".stacktrace", ".contact"));
                            if (acsVar != null) {
                                String str2 = acsVar.f415;
                                if (!TextUtils.isEmpty(str2)) {
                                    strM2842 = str2;
                                }
                                String str3 = acsVar.f416;
                                if (!TextUtils.isEmpty(str3)) {
                                    strM2843 = str3;
                                }
                            }
                            String strM2844 = abb.m284(weakReference, str.replace(".stacktrace", ".description"));
                            String str4 = acsVar != null ? acsVar.f417 : "";
                            if (!TextUtils.isEmpty(strM2844)) {
                                str4 = !TextUtils.isEmpty(str4) ? String.format("%s\n\nLog:\n%s", str4, strM2844) : String.format("Log:\n%s", strM2844);
                            }
                            HashMap map = new HashMap();
                            map.put("raw", strM284);
                            map.put("userID", strM2842);
                            map.put("contact", strM2843);
                            map.put("description", str4);
                            map.put("sdk", "HockeySDK");
                            map.put("sdk_version", "4.1.0-alpha.2");
                            adu aduVar = new adu(abb.f327 + "api/2/apps/" + abb.f328 + "/crashes/");
                            aduVar.f535 = HttpPost.METHOD_NAME;
                            HttpURLConnection httpURLConnectionM357 = aduVar.m359(map).m357();
                            httpURLConnection = httpURLConnectionM357;
                            int responseCode = httpURLConnectionM357.getResponseCode();
                            boolValueOf = Boolean.valueOf(responseCode == 202 || responseCode == 201);
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (boolValueOf.booleanValue()) {
                            abb.m285(weakReference, strArrM295[i]);
                            if (abiVar != null) {
                                abb.m287(weakReference, strArrM295[i]);
                            }
                        } else if (abiVar != null) {
                            abb.m291((WeakReference<Context>) weakReference, strArrM295[i]);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        if (boolValueOf.booleanValue()) {
                            abb.m285(weakReference, strArrM295[i]);
                            if (abiVar != null) {
                                abb.m287(weakReference, strArrM295[i]);
                            }
                        } else if (abiVar != null) {
                            abb.m291((WeakReference<Context>) weakReference, strArrM295[i]);
                        }
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    if (boolValueOf.booleanValue()) {
                        abb.m285(weakReference, strArrM295[i]);
                        if (abiVar != null) {
                            abb.m287(weakReference, strArrM295[i]);
                        }
                    } else if (abiVar != null) {
                        abb.m291((WeakReference<Context>) weakReference, strArrM295[i]);
                    }
                    throw th;
                }
            }
        }
        abb.f326 = false;
    }
}
