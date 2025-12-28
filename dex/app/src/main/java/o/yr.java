package o;

import java.io.File;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class yr implements yn {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final yl f5994;

    /* renamed from: 鷭, reason: contains not printable characters */
    final File f5995;

    public yr(yl ylVar, File file) {
        this.f5994 = ylVar;
        this.f5995 = file;
    }

    @Override // o.yn
    /* renamed from: 鷭 */
    public final yv mo1172() {
        return new yv(this.f5995);
    }

    @Override // o.yn
    /* renamed from: 櫯 */
    public final long mo1171() {
        return this.f5995.length();
    }
}
