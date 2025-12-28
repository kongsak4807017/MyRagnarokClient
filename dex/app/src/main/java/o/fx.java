package o;

import android.media.AudioTrack;
import java.security.InvalidParameterException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fx {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    long f1295;

    /* renamed from: 櫯, reason: contains not printable characters */
    AudioTrack f1296;

    /* renamed from: 鷭, reason: contains not printable characters */
    fy f1297;

    fx(fy fyVar) {
        int i;
        int i2;
        if (fyVar.f1298.f2041 == 1) {
            i = 4;
        } else if (fyVar.f1298.f2041 == 2) {
            i = 12;
        } else {
            throw new InvalidParameterException("Invalid channels");
        }
        if (fyVar.f1298.f2039 == 8) {
            i2 = 3;
        } else if (fyVar.f1298.f2039 == 16) {
            i2 = 2;
        } else {
            throw new InvalidParameterException("Invalid encoding");
        }
        this.f1296 = new AudioTrack(3, fyVar.f1298.f2040, i, i2, fyVar.f1298.f2038, 0);
        this.f1296.write(fyVar.f1298.f2036, fyVar.f1298.f2037, fyVar.f1298.f2038);
        this.f1297 = fyVar;
    }
}
