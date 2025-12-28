package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class wj extends pp {

    /* renamed from: Ą, reason: contains not printable characters */
    @vm(m1154 = 2)
    public short f5480;

    /* renamed from: ą, reason: contains not printable characters */
    @vm(m1154 = 5)
    public byte[] f5481;

    /* renamed from: ȃ, reason: contains not printable characters */
    @vm(m1154 = 1)
    public short f5482;

    public wj() {
    }

    public wj(String str, String str2) {
        byte[] bArrM987 = pa.m987(str, ow.LATIN, false);
        byte[] bArrM9872 = pa.m987(str2, ow.LATIN, false);
        this.f5482 = (short) bArrM987.length;
        this.f5480 = (short) bArrM9872.length;
        this.f5481 = ox.m946(bArrM987, bArrM9872);
    }

    @Override // o.tw, o.vg, o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return pg.CB_VERIFYPURCHASE.f4538;
    }
}
