package o;

import o.C1035;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.훯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1148 extends JavaFunction {

    /* renamed from: 櫯, reason: contains not printable characters */
    private static /* synthetic */ int[] f9000;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f9001;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1148(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f9001 = c1095;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] m1650() {
        int[] iArr = f9000;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[nc.valuesCustom().length];
        try {
            iArr2[nc.ATTACK_AREA_CMD.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[nc.ATTACK_OBJECT_CMD.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[nc.FOLLOW_CMD.ordinal()] = 10;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nc.HOLD_CMD.ordinal()] = 7;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nc.MOVE_CMD.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nc.NONE_CMD.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[nc.PATROL_CMD.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[nc.SKILL_AREA_CMD.ordinal()] = 9;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[nc.SKILL_OBJECT_CMD.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[nc.STOP_CMD.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f9000 = iArr2;
        return iArr2;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        int integer = this.L.toInteger(2);
        this.L.newTable();
        C1035.Cif cif = this.f9001.f8877;
        if (integer == 0 || cif == null || integer != this.f9001.f8877.f8661.f8689) {
            return 0;
        }
        int i = this.f9001.f8877.f8665;
        switch (m1650()[this.f9001.f8877.f8654.ordinal()]) {
            case 1:
            case 3:
            case 7:
            case 10:
                this.L.pushNumber(1.0d);
                this.L.pushNumber(this.f9001.f8877.f8654.ordinal());
                this.L.setTable(-3);
                break;
            case 2:
                this.L.pushNumber(1.0d);
                this.L.pushNumber(this.f9001.f8877.f8654.ordinal());
                this.L.setTable(-3);
                this.L.pushNumber(2.0d);
                this.L.pushNumber(cif.f8649);
                this.L.setTable(-3);
                this.L.pushNumber(3.0d);
                this.L.pushNumber(cif.f8650);
                this.L.setTable(-3);
                break;
            case 4:
                this.L.pushNumber(1.0d);
                this.L.pushNumber(this.f9001.f8877.f8654.ordinal());
                this.L.setTable(-3);
                this.L.pushNumber(2.0d);
                this.L.pushNumber(i);
                this.L.setTable(-3);
                break;
            case 8:
                this.L.pushNumber(1.0d);
                this.L.pushNumber(this.f9001.f8877.f8654.ordinal());
                this.L.setTable(-3);
                this.L.pushNumber(2.0d);
                this.L.pushNumber(cif.f8671);
                this.L.setTable(-3);
                this.L.pushNumber(3.0d);
                this.L.pushNumber(cif.f8651);
                this.L.setTable(-3);
                this.L.pushNumber(4.0d);
                this.L.pushNumber(i);
                this.L.setTable(-3);
                break;
            case 9:
                this.L.pushNumber(1.0d);
                this.L.pushNumber(this.f9001.f8877.f8654.ordinal());
                this.L.setTable(-3);
                this.L.pushNumber(1.0d);
                this.L.pushNumber(cif.f8671);
                this.L.setTable(-3);
                this.L.pushNumber(2.0d);
                this.L.pushNumber(cif.f8651);
                this.L.setTable(-3);
                this.L.pushNumber(3.0d);
                this.L.pushNumber(cif.f8649);
                this.L.setTable(-3);
                this.L.pushNumber(4.0d);
                this.L.pushNumber(cif.f8650);
                this.L.setTable(-3);
                break;
        }
        this.f9001.f8877.f8654 = nc.NONE_CMD;
        return 1;
    }
}
