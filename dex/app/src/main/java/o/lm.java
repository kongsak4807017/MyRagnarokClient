package o;

import android.util.Log;
import com.roworkshop.andro.c_point;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class lm implements Cloneable {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f1996;

    /* renamed from: Ů, reason: contains not printable characters */
    nu f1997;

    /* renamed from: ů, reason: contains not printable characters */
    int f1998;

    /* renamed from: ű, reason: contains not printable characters */
    public int f1999;

    /* renamed from: ų, reason: contains not printable characters */
    int f2001;

    /* renamed from: يٗ, reason: contains not printable characters */
    public int f2002;

    /* renamed from: Ų, reason: contains not printable characters */
    public c_point f2000 = new c_point();

    /* renamed from: చ, reason: contains not printable characters */
    nl f2003 = nl.MOTION_STAND;

    public /* bridge */ /* synthetic */ Object clone() {
        return (lm) super.clone();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] m777() {
        int[] iArr = f1996;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[nu.valuesCustom().length];
        try {
            iArr2[nu.ALL.ordinal()] = 12;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[nu.CHAT.ordinal()] = 10;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[nu.ELEM.ordinal()] = 11;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nu.HOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nu.ITEM.ordinal()] = 7;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nu.MER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[nu.MOB.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[nu.NPC.ordinal()] = 9;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[nu.NUL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[nu.PC.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[nu.PET.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[nu.SKILL.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        f1996 = iArr2;
        return iArr2;
    }

    @Deprecated
    lm() {
    }

    @Deprecated
    lm(nu nuVar, int i, int i2, int i3, int i4, int i5, int i6) {
        m776(nuVar, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m776(nu nuVar, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f1997 = nuVar;
        this.f1998 = i;
        this.f2001 = i2;
        this.f2002 = i3;
        this.f1999 = i4;
        this.f2000.x = i5;
        this.f2000.y = i6;
    }

    /* renamed from: 鷭 */
    void mo460(oj ojVar) {
        m776(nu.m898(ojVar), ojVar.f3332, ojVar.f3304, ojVar.f3311.x, ojVar.f3311.y, 0, 0);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final lm m778() {
        return (lm) super.clone();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static AbstractC0988 m775(oj ojVar) {
        nu nuVarM898 = nu.m898(ojVar);
        switch (m777()[nuVarM898.ordinal()]) {
            case 2:
                return new bh(ojVar);
            case 3:
                return new C0475(ojVar);
            case 4:
                return new bi(ojVar);
            case 5:
                return new C0983(ojVar);
            case 6:
                return new C0673(ojVar);
            case 7:
            case 8:
            case 10:
            default:
                String str = "Unsupported unit type: " + nuVarM898;
                Log.e("AndRO", str);
                throw new nv(str);
            case 9:
                return new i(ojVar);
            case 11:
                return new C0842(ojVar);
        }
    }
}
