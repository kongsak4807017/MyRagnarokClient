package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aak extends aah {

    /* renamed from: 鷭, reason: contains not printable characters */
    private int f177;

    public aak(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m221() {
        if (this.f163 != null) {
            this.f177 = yu.m1180(this.f163, this.f164);
        }
        return this.f177;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m223(aak aakVar) {
        int i = aakVar.m207();
        this.f177 = i;
        if (this.f163 != null) {
            yu.m1182(this.f163, this.f164, i);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m222(int i) {
        this.f177 = i;
        if (this.f163 != null) {
            yu.m1182(this.f163, this.f164, i);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State[");
        sb.append("\n  pos=");
        sb.append(this.f164);
        sb.append("\n  size=");
        sb.append(4);
        sb.append("\n  next=");
        if (this.f163 != null) {
            this.f177 = yu.m1180(this.f163, this.f164);
        }
        sb.append(this.f177);
        sb.append("\n]");
        return sb.toString();
    }
}
