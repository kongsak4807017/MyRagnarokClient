package o;

import android.os.Handler;
import android.os.Message;
import o.ada;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adb extends Handler {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ada f466;

    adb(ada adaVar) {
        this.f466 = adaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ada.Cif cifPoll = this.f466.f455.poll();
        if (!cifPoll.f457) {
            int i = cifPoll.f456 - 1;
            cifPoll.f456 = i;
            if (i >= 0) {
                postDelayed(new adc(this, cifPoll), 3000L);
            }
        }
        this.f466.f454 = false;
        this.f466.m320();
    }
}
