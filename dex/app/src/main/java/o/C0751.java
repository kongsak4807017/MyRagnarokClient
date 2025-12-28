package o;

import o.C1035;
import o.C1035.C1037;
import o.C1035.C1038;
import o.xm;

/* renamed from: o.椫, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0751 extends xm implements vf {

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] f7744;

    C0751() {
    }

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m1448() {
        int[] iArr = f7744;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[xm.EnumC0127.valuesCustom().length];
        try {
            iArr2[xm.EnumC0127.ACCESSORYID.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[xm.EnumC0127.HAIRSTYLEID.ordinal()] = 6;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[xm.EnumC0127.HUNGER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[xm.EnumC0127.INTIMACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[xm.EnumC0127.PERFORMANCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[xm.EnumC0127.PET_EXISTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        f7744 = iArr2;
        return iArr2;
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        md mdVarM818 = C0358.f6669.m818(this.f5633);
        if (mdVarM818 == null) {
        }
        if (C0358.f6664.f2004.f8641 == null) {
            C0358.f6664.f2004.f8641 = C0358.f6664.f2004.new C1037();
        }
        if (C0358.f6664.f2004.f8641.f8675 == null) {
            C0358.f6664.f2004.f8641.f8675 = C0358.f6664.f2004.new C1038();
        }
        C1035.C1038 c1038 = C0358.f6664.f2004.f8641.f8675;
        c1038.f8684 = mdVarM818.f2101.f1997;
        bi biVar = null;
        if (mdVarM818 != null && mdVarM818.f2101.f1997 == nu.PET) {
            Cloneable cloneable = mdVarM818.f2101;
            biVar = (bi) (bi.class.isAssignableFrom(cloneable.getClass()) ? cloneable : null);
        }
        if (this.f5634 < 0 || this.f5634 >= xm.EnumC0127.valuesCustom().length) {
            nz.m907("Unexpected PKT_MC_PETPARAM type=" + ((int) this.f5634) + " param=" + this.f5632);
            return;
        }
        switch (m1448()[xm.EnumC0127.valuesCustom()[this.f5634].ordinal()]) {
            case 1:
                if (C0358.f6664.f2004.f8641 == null) {
                    C0358.f6664.f2004.f8641 = C0358.f6664.f2004.new C1037();
                }
                c1038.f8689 = this.f5633;
                mdVarM818.f2101.f1998 = this.f5633;
                break;
            case 2:
                if (C0358.f6664.f2004.f8641 != null && c1038.f8689 == this.f5633) {
                    c1038.f8683 = (short) this.f5632;
                    break;
                }
                break;
            case 3:
                if (C0358.f6664.f2004.f8641 != null && c1038.f8689 == this.f5633) {
                    c1038.f8681 = (short) this.f5632;
                    mdVarM818.m847(c1038);
                    break;
                }
                break;
            case 4:
                if (biVar != null) {
                    biVar.f820 = this.f5632;
                }
                if (C0358.f6664.f2004.f8641 != null && c1038.f8689 == this.f5633) {
                    C0358.f6664.f2004.f8641.f8677 = this.f5632;
                }
                if (biVar != null) {
                    mdVarM818.m860();
                    break;
                }
                break;
            case 5:
                if (biVar != null) {
                    switch (this.f5632) {
                        case 1:
                            if (biVar != null) {
                                mv mvVar = mv.PERFORMANCE1;
                                mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar, mdVarM818.f2130), System.currentTimeMillis());
                                mdVarM818.f2126 = mvVar;
                                mdVarM818.m834();
                                break;
                            }
                            break;
                        case 2:
                            if (biVar != null) {
                                mv mvVar2 = mv.PERFORMANCE2;
                                mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar2, mdVarM818.f2130), System.currentTimeMillis());
                                mdVarM818.f2126 = mvVar2;
                                mdVarM818.m834();
                                break;
                            }
                            break;
                        case 3:
                            if (biVar != null) {
                                mv mvVar3 = mv.PERFORMANCE3;
                                mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar3, mdVarM818.f2130), System.currentTimeMillis());
                                mdVarM818.f2126 = mvVar3;
                                mdVarM818.m834();
                                break;
                            }
                            break;
                        case 4:
                            if (biVar != null) {
                                mv mvVar4 = mv.PERFORMANCE4;
                                mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar4, mdVarM818.f2130), System.currentTimeMillis());
                                mdVarM818.f2126 = mvVar4;
                                mdVarM818.m834();
                                break;
                            }
                            break;
                    }
                }
                break;
            case 6:
                if (biVar != null) {
                    biVar.f819 = this.f5632;
                }
                if (C0358.f6664.f2004.f8641 != null && c1038.f8689 == this.f5633) {
                    C0358.f6664.f2004.f8641.f8674 = this.f5632;
                }
                if (biVar != null) {
                    mdVarM818.m860();
                    break;
                }
                break;
        }
    }
}
