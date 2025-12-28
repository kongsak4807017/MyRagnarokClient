package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class aah {

    /* renamed from: ć, reason: contains not printable characters */
    static final /* synthetic */ boolean f162;

    /* renamed from: ą, reason: contains not printable characters */
    protected byte[] f163;

    /* renamed from: Ć, reason: contains not printable characters */
    protected int f164;

    static {
        f162 = !aah.class.desiredAssertionStatus();
    }

    public aah(byte[] bArr) {
        this.f163 = bArr;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final int m207() {
        if (f162 || this.f163 != null) {
            return this.f164;
        }
        throw new AssertionError();
    }

    /* renamed from: ˮ͈ */
    public void mo197(int i) {
        if (!f162 && this.f163 == null) {
            throw new AssertionError();
        }
        if (!f162 && (i < 0 || i >= this.f163.length)) {
            throw new AssertionError(i);
        }
        this.f164 = i;
    }
}
