package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̐, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0324 extends ub {

    /* renamed from: o.ˮ̐$鷭, reason: contains not printable characters */
    enum EnumC0325 {
        party,
        guild,
        siege,
        mineffect,
        nolockon,
        countpk,
        nopartyformation,
        bg,
        noitemconsumption,
        usecart,
        summonstarmiracle;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0325[] valuesCustom() {
            EnumC0325[] enumC0325ArrValuesCustom = values();
            int length = enumC0325ArrValuesCustom.length;
            EnumC0325[] enumC0325Arr = new EnumC0325[length];
            System.arraycopy(enumC0325ArrValuesCustom, 0, enumC0325Arr, 0, length);
            return enumC0325Arr;
        }
    }

    C0324() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2459;
        byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        if (((1 << EnumC0325.party.ordinal()) & i3) > 0) {
            C0358.f6669.f2063.f6884 = ni.FREEPVPZONE;
            C0358.f6669.f2063.f6879 = nj.ARENA;
        }
        if (((1 << EnumC0325.guild.ordinal()) & i3) > 0) {
            C0358.f6669.f2063.f6884 = ni.AGITZONE;
            C0358.f6669.f2063.f6879 = nj.AGIT;
        }
        if (((1 << EnumC0325.siege.ordinal()) & i3) > 0) {
            C0358.f6669.f2063.f6884 = ni.AGITZONE;
            C0358.f6669.f2063.f6879 = nj.AGIT;
        }
    }
}
