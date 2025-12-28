package o;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.os.EnvironmentCompat;
import android.util.JsonWriter;
import android.util.Log;
import com.roworkshop.andro.c_activity;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.UUID;
import o.C0632;
import o.C0640;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dt implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dl f1093;

    dt(dl dlVar) {
        this.f1093 = dlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws IntentSender.SendIntentException, IOException {
        int iLongValue;
        dl dlVar = this.f1093;
        C0632.C0633 c0633 = C0632.f7498[i];
        if (dlVar.f1079) {
            new AlertDialog.Builder(C0358.f6674).setMessage("Already processing other purchase, can't continue with this one").show();
            return;
        }
        if (dlVar.f1080 == null) {
            new AlertDialog.Builder(C0358.f6674).setMessage("Can't start purchase process: not connected to Billing Server. Please try again later.").show();
            return;
        }
        if (C0358.f6667 != null) {
            CharArrayWriter charArrayWriter = new CharArrayWriter();
            JsonWriter jsonWriter = new JsonWriter(charArrayWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("account_id");
                jsonWriter.value(C0358.f6688.f6689);
                jsonWriter.name("server");
                jsonWriter.value(C0358.f6667 != null ? C0358.f6667.f4851 : EnvironmentCompat.MEDIA_UNKNOWN);
                jsonWriter.name("ragnarok_username");
                jsonWriter.value(C0358.f6681);
                jsonWriter.name("order_uid");
                jsonWriter.value(String.valueOf(C0358.f6667.f4851) + C0358.f6688.f6689 + "-" + UUID.randomUUID().toString());
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
                charArrayWriter.toCharArray();
                dlVar.f1079 = true;
                try {
                    C0640 c0640 = dlVar.f1080;
                    c_activity c_activityVar = C0358.f6674;
                    String str = c0633.f7503;
                    C0640.InterfaceC0642 interfaceC0642 = dlVar.f1076;
                    c0640.m1405("launchPurchaseFlow");
                    c0640.m1404("launchPurchaseFlow");
                    if (!"inapp".equals("subs") || c0640.f7523) {
                        try {
                            try {
                                InterfaceC0957 interfaceC0957 = c0640.f7519;
                                c0640.f7518.getPackageName();
                                Bundle bundleM1549 = interfaceC0957.m1549();
                                Object obj = bundleM1549.get("RESPONSE_CODE");
                                if (obj == null) {
                                    iLongValue = 0;
                                } else if (obj instanceof Integer) {
                                    iLongValue = ((Integer) obj).intValue();
                                } else {
                                    if (!(obj instanceof Long)) {
                                        Log.e(c0640.f7527, "In-app billing error: Unexpected type for bundle response code.");
                                        Log.e(c0640.f7527, "In-app billing error: " + obj.getClass().getName());
                                        throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
                                    }
                                    iLongValue = (int) ((Long) obj).longValue();
                                }
                                if (iLongValue != 0) {
                                    Log.e(c0640.f7527, "In-app billing error: " + ("Unable to buy item, Error response: " + C0640.m1403(iLongValue)));
                                    C0378 c0378 = new C0378(iLongValue, "Unable to buy item");
                                    if (interfaceC0642 != null) {
                                        interfaceC0642.mo555(c0378, null);
                                    }
                                } else {
                                    PendingIntent pendingIntent = (PendingIntent) bundleM1549.getParcelable("BUY_INTENT");
                                    c0640.f7520 = 10001;
                                    c0640.f7522 = interfaceC0642;
                                    c0640.f7524 = "inapp";
                                    IntentSender intentSender = pendingIntent.getIntentSender();
                                    Intent intent = new Intent();
                                    Integer num = 0;
                                    int iIntValue = num.intValue();
                                    Integer num2 = 0;
                                    int iIntValue2 = num2.intValue();
                                    Integer num3 = 0;
                                    c_activityVar.startIntentSenderForResult(intentSender, 10001, intent, iIntValue, iIntValue2, num3.intValue());
                                }
                            } catch (IntentSender.SendIntentException e) {
                                Log.e(c0640.f7527, "In-app billing error: " + ("SendIntentException while launching purchase flow for sku " + str));
                                e.printStackTrace();
                                C0378 c03782 = new C0378(-1004, "Failed to send intent.");
                                if (interfaceC0642 != null) {
                                    interfaceC0642.mo555(c03782, null);
                                }
                            }
                        } catch (RemoteException e2) {
                            Log.e(c0640.f7527, "In-app billing error: " + ("RemoteException while launching purchase flow for sku " + str));
                            e2.printStackTrace();
                            C0378 c03783 = new C0378(-1001, "Remote exception while starting purchase flow");
                            if (interfaceC0642 != null) {
                                interfaceC0642.mo555(c03783, null);
                            }
                        }
                    } else {
                        C0378 c03784 = new C0378(-1009, "Subscriptions are not available.");
                        if (interfaceC0642 != null) {
                            interfaceC0642.mo555(c03784, null);
                        }
                    }
                    je jeVar = C0358.f6674.f42;
                    if (jeVar.f1735 != null) {
                        C0358.f6674.mo139(new jt(jeVar));
                    }
                    C0358.f6674.mo139(new jr(jeVar, "Purchase in progress..."));
                } catch (IllegalStateException e3) {
                    throw new ut(e3, "Failed to start purchase process.", false);
                }
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }
}
