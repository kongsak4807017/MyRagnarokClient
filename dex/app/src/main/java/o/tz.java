package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class tz {

    /* renamed from: 櫯, reason: contains not printable characters */
    private int f4995 = -1;

    /* renamed from: 鷭, reason: contains not printable characters */
    private boolean f4996;

    /* renamed from: 鷭 */
    protected abstract void mo520(long j, long j2, int i);

    public tz(boolean z) {
        this.f4996 = true;
        this.f4996 = true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1101(long j, long j2) {
        int i = (int) ((100 * j) / j2);
        if (this.f4996) {
            if (i == this.f4995) {
                return;
            } else {
                this.f4995 = i;
            }
        }
        mo520(j, j2, i);
    }
}
