package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class wa extends pp {

    /* renamed from: Ą, reason: contains not printable characters */
    @vm(m1154 = 2)
    public int f5453;

    /* renamed from: ą, reason: contains not printable characters */
    @vm(m1154 = 3)
    public short f5454;

    /* renamed from: ȃ, reason: contains not printable characters */
    @vm(m1154 = 1)
    public int f5457;

    /* renamed from: Ȋ, reason: contains not printable characters */
    @vm(m1154 = 8)
    public char[] f5458;

    /* renamed from: Ć, reason: contains not printable characters */
    @vm(m1154 = 4)
    public char[] f5455 = new char[24];

    /* renamed from: ć, reason: contains not printable characters */
    @vm(m1154 = 5)
    public char[] f5456 = new char[16];

    /* renamed from: ˮ͍, reason: contains not printable characters */
    @vm(m1154 = 6)
    public char[] f5459 = new char[64];

    /* renamed from: 岱, reason: contains not printable characters */
    @vm(m1154 = 7)
    public char[] f5460 = new char[128];

    @Override // o.tw, o.vg, o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return pg.CB_CRASHREPORT.f4538;
    }

    private wa(int i, int i2, short s, String str, String str2, String str3, String str4, String str5) {
        this.f5457 = i;
        this.f5453 = i2;
        this.f5454 = s;
        if (str != null) {
            pa.m981(str, this.f5455);
        }
        if (str2 != null) {
            pa.m981(str2, this.f5456);
        }
        if (str3 != null) {
            pa.m981(str3, this.f5459);
        }
        if (str4 != null) {
            pa.m981(str4, this.f5460);
        }
        this.f5458 = str5.toCharArray();
    }
}
