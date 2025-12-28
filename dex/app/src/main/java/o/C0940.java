package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.魃, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0940 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f8240;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0940(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f8240 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        AbstractC0988 abstractC0988;
        AbstractC0988 abstractC09882;
        int integer = this.L.toInteger(2);
        int integer2 = this.L.toInteger(3);
        lm lmVar = C0358.f6664.f2005.get(integer2);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        if (abstractC0988 == null) {
            this.L.pushNumber(0.0d);
            return 1;
        }
        lm lmVar2 = C0358.f6664.f2005.get(integer2);
        if (lmVar2 == null) {
            abstractC09882 = null;
        } else {
            abstractC09882 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null);
        }
        AbstractC0988 abstractC09883 = abstractC09882;
        if (abstractC09882.f2002 == 0 && abstractC09883.f1999 == 0) {
            abstractC09883.f2002 = C0358.f6664.f2004.f2002;
            abstractC09883.f1999 = C0358.f6664.f2004.f1999;
        }
        switch (integer) {
            case 0:
                this.L.pushNumber(C0358.f6664.f2004.f1998);
                return 1;
            case 1:
                this.L.pushNumber(abstractC09883.f2002);
                this.L.pushNumber(abstractC09883.f1999);
                return 2;
            case 2:
                this.L.pushNumber(0.0d);
                return 1;
            case 3:
                this.L.pushNumber(abstractC09883.f2003.ordinal());
                abstractC09883.f2003 = nl.MOTION_STAND;
                return 1;
            case 4:
                this.L.pushNumber(abstractC09883.f8370);
                return 1;
            case 5:
                if (abstractC09883.f8354 != null) {
                    this.L.pushNumber(abstractC09883.f8354.f8409);
                } else {
                    this.L.pushNumber(0.0d);
                }
                return 1;
            case 6:
                if (this.f8240.f8877.f8666.f8673.get(Integer.valueOf(this.L.toInteger(4))) == null) {
                    this.L.pushNumber(3.0d);
                } else {
                    this.L.pushNumber(r0.f1404);
                }
                return 1;
            case 7:
                if (this.f8240.f8877.f8653 == null) {
                    this.L.pushNumber(1.0d);
                } else {
                    this.L.pushNumber(this.f8240.f8877.f8653.ordinal() + 1);
                }
                return 1;
            case 8:
                this.L.pushNumber(abstractC09883.f8346);
                return 1;
            case 9:
                this.L.pushNumber(abstractC09883.f8364);
                return 1;
            case 10:
                this.L.pushNumber(abstractC09883.f8358);
                return 1;
            case 11:
                this.L.pushNumber(abstractC09883.f8356);
                return 1;
            case 12:
                this.L.pushNumber(0.0d);
                return 1;
            case 13:
            case 14:
                int integer3 = this.L.toInteger(4);
                int integer4 = this.L.toInteger(5);
                if (integer3 != 0 && integer4 != 0) {
                    if (((int) Math.sqrt(Math.pow(abstractC09883.f2002 - C0358.f6664.f2005.get(this.f8240.f8877.f8661.f8689).f2002, 2.0d) + Math.pow(abstractC09883.f1999 - C0358.f6664.f2005.get(this.f8240.f8877.f8661.f8689).f1999, 2.0d))) <= this.f8240.f8877.f8666.f8673.get(Integer.valueOf(integer3)).f1404) {
                        C0358.f6671.mo454(new C0425(integer3, integer4, integer2));
                    }
                } else {
                    this.L.pushNumber(abstractC09883.f2002);
                    this.L.pushNumber(abstractC09883.f1999);
                }
                return 2;
            default:
                return 0;
        }
    }
}
