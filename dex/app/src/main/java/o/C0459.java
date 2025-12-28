package o;

import java.nio.ByteBuffer;

/* renamed from: o.ᄈ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0459 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final String[] f6906;

    C0459() {
    }

    static {
        String[] strArr = new String[89];
        strArr[1] = "Not enough SP";
        strArr[2] = "Not enough HP";
        strArr[3] = "Not enough materials";
        strArr[4] = "You can't use this skill yet";
        strArr[5] = "Not enough Zeny";
        strArr[6] = "You can't use this skill with this weapon";
        strArr[7] = "Red Gemstone required";
        strArr[8] = "Blue Gemstone required";
        strArr[9] = "You can't use skills while overweight";
        strArr[11] = "You can't use skills on this target";
        strArr[13] = "You carry too many ancilla";
        strArr[14] = "Holy Water required";
        strArr[15] = "Ancilla required";
        strArr[16] = "Duplicate distance";
        strArr[17] = "Partner is required for this skill";
        strArr[18] = "Wrong direction";
        strArr[19] = "Can't summon anymore";
        strArr[20] = "Not enough spiritballs";
        strArr[21] = "Imitation skill not exists";
        strArr[22] = "Imitation failed";
        strArr[23] = "Unable to use a skill";
        strArr[24] = "Paintbrush required";
        strArr[26] = "Can't use this skill in this area";
        strArr[27] = "Your friend's HP is too low";
        strArr[31] = "Weapon blocking is not active";
        strArr[32] = "Poisoned weapon required";
        strArr[33] = "Mado required";
        strArr[37] = "Cannonball required";
        strArr[40] = "You are not hovering";
        strArr[43] = "Poison required";
        strArr[50] = "Can't use this skill in Mado";
        strArr[51] = "Spellbook required";
        strArr[52] = "Spellbook is too difficult";
        strArr[53] = "Not enough spellbook points";
        strArr[54] = "Spellbook failed";
        strArr[57] = "Thorns seed required";
        strArr[60] = "Bomb mushroom spore required";
        strArr[71] = "Need [VAL:ITEMID] ([BTYPE:NUM])";
        strArr[72] = "[VAL:ITEMID] not equipped";
        strArr[73] = "This skill is bound with other skill";
        strArr[74] = "[BTYPE:NUM] spiritballs required";
        strArr[75] = "Explosion spirits required";
        strArr[76] = "Too many HP to use this skill";
        strArr[77] = "Banding state required";
        strArr[79] = "Elemental spirit required";
        strArr[80] = "Not enough intimacy";
        strArr[81] = "Fighter mode required";
        strArr[82] = "Grappler mode required";
        strArr[83] = "Cannot set chat room while vending";
        strArr[84] = "Insufficient bullets";
        strArr[85] = "[BTYPE:NUM] coins required";
        strArr[87] = "Cannot use skill in this map";
        strArr[88] = "Summoned SP is not enough";
        f6906 = strArr;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 272;
        byteBuffer.getShort();
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        int i4 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        byteBuffer.get();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        int iM967 = pa.m967(b);
        String strReplace = null;
        if (iM967 >= 0 && iM967 < f6906.length && (strReplace = f6906[iM967]) != null) {
            if (strReplace.contains("[VAL:ITEMID]")) {
                C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(i4);
                strReplace = strReplace.replace("[VAL:ITEMID]", c0432M1648 == null ? null : c0432M1648.m1328(true));
            }
            if (strReplace.contains("[BTYPE:NUM]")) {
                strReplace = strReplace.replace("[BTYPE:NUM]", String.valueOf(i3));
            }
        }
        if (strReplace == null) {
            strReplace = "Skill has failed";
        }
        C0358.f6674.f42.f1792.m1432(strReplace, 16711680);
    }
}
