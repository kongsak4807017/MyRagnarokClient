package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import net.hockeyapp.android.UpdateActivity;
import o.aca;
import org.json.JSONArray;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ade extends add {

    /* renamed from: ą, reason: contains not printable characters */
    protected boolean f475;

    /* renamed from: Ć, reason: contains not printable characters */
    private Activity f476;

    /* renamed from: ć, reason: contains not printable characters */
    private AlertDialog f477;

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ void m334(ade adeVar, JSONArray jSONArray) {
        if (adeVar.f476 != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = adeVar.f476.getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            Fragment fragmentFindFragmentByTag = adeVar.f476.getFragmentManager().findFragmentByTag("hockey_update_dialog");
            if (fragmentFindFragmentByTag != null) {
                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
            }
            fragmentTransactionBeginTransaction.addToBackStack(null);
            try {
                ((DialogFragment) (adeVar.f469 != null ? aci.class : aci.class).getMethod("newInstance", JSONArray.class, String.class).invoke(null, jSONArray, adeVar.m330("apk"))).show(fragmentTransactionBeginTransaction, "hockey_update_dialog");
            } catch (Exception e) {
                if (adt.f529 <= 6) {
                    Log.e("HockeyApp", "An exception happened while showing the update fragment:");
                }
                e.printStackTrace();
                if (adt.f529 <= 6) {
                    Log.e("HockeyApp", "Showing update activity instead.");
                }
                adeVar.m336(jSONArray, (Boolean) false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ade(WeakReference<Activity> weakReference, String str, String str2, acn acnVar, boolean z) {
        super(weakReference, str, str2, acnVar);
        this.f476 = null;
        this.f477 = null;
        this.f475 = false;
        if (weakReference != null) {
            this.f476 = weakReference.get();
        }
        this.f475 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.add, android.os.AsyncTask
    /* renamed from: 鷭 */
    public final void onPostExecute(JSONArray jSONArray) throws PackageManager.NameNotFoundException {
        super.onPostExecute(jSONArray);
        if (jSONArray != null && this.f475) {
            aeb.m389(this.f476, jSONArray.toString());
            if (this.f476 == null || this.f476.isFinishing()) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f476);
            builder.setTitle(aca.C0005.hockeyapp_update_dialog_title);
            if (!this.f471.booleanValue()) {
                builder.setMessage(aca.C0005.hockeyapp_update_dialog_message);
                builder.setNegativeButton(aca.C0005.hockeyapp_update_dialog_negative_button, new adf(this));
                builder.setPositiveButton(aca.C0005.hockeyapp_update_dialog_positive_button, new adg(this, jSONArray));
                this.f477 = builder.create();
                this.f477.show();
                return;
            }
            Toast.makeText(this.f476, String.format(this.f476.getString(aca.C0005.hockeyapp_update_mandatory_toast), adz.m379(this.f476)), 1).show();
            m336(jSONArray, (Boolean) true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: 鷭, reason: contains not printable characters */
    public void m336(JSONArray jSONArray, Boolean bool) {
        Class<UpdateActivity> cls = null;
        if (this.f469 != null) {
            cls = UpdateActivity.class;
        }
        if (cls == null) {
            cls = UpdateActivity.class;
        }
        if (this.f476 != null) {
            Intent intent = new Intent();
            intent.setClass(this.f476, cls);
            intent.putExtra("json", jSONArray.toString());
            intent.putExtra("url", m330("apk"));
            this.f476.startActivity(intent);
            if (bool.booleanValue()) {
                this.f476.finish();
            }
        }
        super.mo331();
        this.f476 = null;
        this.f477 = null;
    }

    @Override // o.add
    /* renamed from: 鷭 */
    protected final void mo331() {
        super.mo331();
        this.f476 = null;
        this.f477 = null;
    }
}
