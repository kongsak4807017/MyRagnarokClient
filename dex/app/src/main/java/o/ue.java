package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ue {

    /* renamed from: Ą, reason: contains not printable characters */
    public int f5055;

    /* renamed from: ą, reason: contains not printable characters */
    public C0089[] f5056;

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f5057;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public byte f5058;

    /* renamed from: 櫯, reason: contains not printable characters */
    public byte f5059;

    /* renamed from: 鷭, reason: contains not printable characters */
    public byte[] f5060 = new byte[4];

    /* renamed from: o.ue$if, reason: invalid class name */
    public abstract class Cif {

        /* renamed from: Ć, reason: contains not printable characters */
        public byte f5061;

        public Cif() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        public final boolean m1114() {
            return this.f5061 == 0 || this.f5061 == 2 || this.f5061 == 3 || this.f5061 == 4 || this.f5061 == 6;
        }
    }

    /* renamed from: o.ue$櫯, reason: contains not printable characters */
    public class C0089 extends Cif {

        /* renamed from: ȃ, reason: contains not printable characters */
        public short f5064;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public short f5065;

        /* renamed from: 櫯, reason: contains not printable characters */
        public short f5066;

        /* renamed from: 鷭, reason: contains not printable characters */
        public short f5067;

        public C0089() {
            super();
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        public final C0090 m1115() {
            C0090 c0090 = ue.this.new C0090();
            c0090.f5073 = this.f5067 / 100.0f;
            c0090.f5072 = this.f5066 / 100.0f;
            c0090.f5071 = this.f5065 / 100.0f;
            c0090.f5070 = this.f5064 / 100.0f;
            c0090.f5061 = this.f5061;
            return c0090;
        }
    }

    /* renamed from: o.ue$鷭, reason: contains not printable characters */
    public class C0090 extends Cif {

        /* renamed from: Ą, reason: contains not printable characters */
        public byte[] f5068;

        /* renamed from: ȃ, reason: contains not printable characters */
        public float f5070;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float f5071;

        /* renamed from: 櫯, reason: contains not printable characters */
        public float f5072;

        /* renamed from: 鷭, reason: contains not printable characters */
        public float f5073;

        public C0090() {
            super();
            this.f5068 = new byte[3];
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final C0089 m1112(int i) {
        if (this.f5057 <= 0 || this.f5055 <= 0 || i < 0 || i >= this.f5056.length || this.f5056[i] == null) {
            return null;
        }
        return this.f5056[i];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final boolean m1113(int i, int i2, int i3) {
        C0089 c0089M1112;
        if (this.f5057 <= 0 || this.f5055 <= 0) {
            throw new RuntimeException("GAT file not loaded (bad width/height)");
        }
        if (i < 0 || i >= this.f5057 || i2 < 0 || i2 >= this.f5055 || (c0089M1112 = m1112((this.f5057 * i2) + i)) == null) {
            return false;
        }
        if (i3 > 0 && !c0089M1112.m1114()) {
            return false;
        }
        if (i3 == 0 && c0089M1112.m1114()) {
            return false;
        }
        return true;
    }
}
