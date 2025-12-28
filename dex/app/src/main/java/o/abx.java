package o;

import android.content.DialogInterface;
import net.hockeyapp.android.PaintActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class abx implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ PaintActivity f368;

    public abx(PaintActivity paintActivity) {
        this.f368 = paintActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                this.f368.finish();
                break;
            case -1:
                this.f368.m163();
                break;
        }
    }
}
