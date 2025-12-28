package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class vo extends pp {

    /* renamed from: ȃ, reason: contains not printable characters */
    @vm(m1154 = 1)
    public C0118[] f5406;

    /* renamed from: o.vo$鷭, reason: contains not printable characters */
    public class C0118 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        @vm(m1154 = 3)
        public long f5408;

        /* renamed from: 櫯, reason: contains not printable characters */
        @vm(m1154 = 2)
        public char[] f5409;

        /* renamed from: 鷭, reason: contains not printable characters */
        @vm(m1154 = 1)
        public long f5410;

        private C0118() {
            this.f5409 = new char[64];
        }

        public C0118(C0141 c0141, String str, long j, long j2) {
            vo.this = c0141;
            this.f5409 = new char[64];
            System.arraycopy(str.toCharArray(), 0, this.f5409, 0, str.length());
            this.f5408 = j;
            this.f5410 = j2;
        }

        public boolean equals(Object obj) {
            if (obj.getClass() != C0118.class) {
                return false;
            }
            C0118 c0118 = (C0118) obj;
            if (!new String(this.f5409).equals(new String(c0118.f5409)) || this.f5408 != c0118.f5408 || this.f5410 != c0118.f5410) {
                return false;
            }
            return true;
        }
    }

    @Override // o.tw, o.vg, o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return pg.BC_CLIENTCHECKSUM.f4538;
    }
}
