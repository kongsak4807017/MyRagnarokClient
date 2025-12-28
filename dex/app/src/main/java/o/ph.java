package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class ph {

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final C0072[] f4539;

    static {
        C0072[] c0072Arr = new C0072[13000];
        f4539 = c0072Arr;
        C0072[] c0072Arr2 = f4539;
        C0072 c0072 = new C0072();
        c0072.f4549 = 2;
        c0072.f4550 = 2;
        c0072.f4543 = pe.HIT2;
        c0072Arr2[5] = c0072;
        c0072Arr[46] = c0072;
        C0072[] c0072Arr3 = f4539;
        C0072 c00722 = new C0072();
        c00722.f4549 = 2;
        c00722.f4550 = 2;
        c00722.f4544 = pe.FIREHIT;
        c0072Arr3[7] = c00722.m1021(new Cif(pe.MAGNUMBREAK));
        f4539[142] = new C0072().m1021(new Cif(pe.FIRSTAID));
    }

    /* renamed from: o.ph$鷭, reason: contains not printable characters */
    public static class C0072 {

        /* renamed from: Ą, reason: contains not printable characters */
        public pe f4543;

        /* renamed from: Ć, reason: contains not printable characters */
        public String f4545;

        /* renamed from: ć, reason: contains not printable characters */
        public Cif[] f4546;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f4549;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f4550;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public pe f4548 = pe.BASH;

        /* renamed from: ȃ, reason: contains not printable characters */
        public pe f4547 = pe.BASH;

        /* renamed from: ą, reason: contains not printable characters */
        public pe f4544 = pe.HIT1;

        C0072() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final C0072 m1021(Cif cif) {
            int length = this.f4546 == null ? 1 : this.f4546.length + 1;
            Cif[] cifArr = new Cif[length];
            int i = 0;
            while (i < length - 1) {
                cifArr[i] = this.f4546[i];
                i++;
            }
            cifArr[i] = cif;
            this.f4546 = cifArr;
            return this;
        }
    }

    /* renamed from: o.ph$if, reason: invalid class name */
    public static class Cif {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public short f4540 = 0;

        /* renamed from: 櫯, reason: contains not printable characters */
        public pe f4541;

        /* renamed from: 鷭, reason: contains not printable characters */
        public pe f4542;

        Cif(pe peVar) {
            this.f4542 = peVar;
        }
    }
}
