package o;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import net.hockeyapp.android.LoginActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class abu extends Handler {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ LoginActivity f361;

    public abu(LoginActivity loginActivity) {
        this.f361 = loginActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.getData().getBoolean("success")) {
            this.f361.finish();
            if (abv.f366 != null) {
                return;
            } else {
                return;
            }
        }
        Toast.makeText(this.f361, "Login failed. Check your credentials.", 1).show();
    }
}
