package o;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adw {

    /* renamed from: ȃ, reason: contains not printable characters */
    private SharedPreferences.Editor f536;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private SharedPreferences f537;

    /* renamed from: 櫯, reason: contains not printable characters */
    public SharedPreferences.Editor f538;

    /* renamed from: 鷭, reason: contains not printable characters */
    public SharedPreferences f539;

    /* renamed from: o.adw$鷭, reason: contains not printable characters */
    public static class C0012 {

        /* renamed from: 鷭, reason: contains not printable characters */
        public static final adw f540 = new adw();
    }

    private adw() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m367(Context context, String str) {
        if (context != null) {
            this.f537 = context.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
            if (this.f537 != null) {
                this.f536 = this.f537.edit();
                this.f536.putString("net.hockeyapp.android.prefs_key_feedback_token", str);
                this.f536.apply();
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final String m366(Context context) {
        if (context == null) {
            return null;
        }
        this.f537 = context.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
        if (this.f537 == null) {
            return null;
        }
        return this.f537.getString("net.hockeyapp.android.prefs_key_feedback_token", null);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final String m365(Context context) {
        if (context == null) {
            return null;
        }
        this.f539 = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
        if (this.f539 == null) {
            return null;
        }
        return this.f539.getString("net.hockeyapp.android.prefs_key_name_email", null);
    }
}
