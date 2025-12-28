package o;

import android.support.v4.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.pj;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;

/* renamed from: o.섭, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1085 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f8864;

    C1085() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1629() {
        int[] iArr = f8864;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[pj.aux.valuesCustom().length];
        try {
            iArr2[pj.aux.AevaRO.ordinal()] = 7;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[pj.aux.AlbertaServer.ordinal()] = 64;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[pj.aux.AmatsuRO.ordinal()] = 42;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[pj.aux.AtlasRO.ordinal()] = 8;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[pj.aux.AustinRO.ordinal()] = 50;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[pj.aux.BalikRagnaPH.ordinal()] = 107;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[pj.aux.BarnabyRO.ordinal()] = 37;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[pj.aux.BgRO.ordinal()] = 87;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[pj.aux.Blytanias.ordinal()] = 71;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[pj.aux.BrightRO.ordinal()] = 51;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[pj.aux.BurnRO.ordinal()] = 103;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[pj.aux.C2RO.ordinal()] = 85;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[pj.aux.ChaosReborn.ordinal()] = 56;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[pj.aux.ChenRO.ordinal()] = 11;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[pj.aux.Class2RO.ordinal()] = 23;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[pj.aux.Classic2RoInTh.ordinal()] = 47;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[pj.aux.ClassicRONet.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[pj.aux.CrazyPoring.ordinal()] = 68;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[pj.aux.CreativeKingsRO.ordinal()] = 32;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[pj.aux.CrownRO.ordinal()] = 21;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[pj.aux.DarkRO.ordinal()] = 105;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[pj.aux.Daro.ordinal()] = 48;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[pj.aux.EarlyRO.ordinal()] = 102;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[pj.aux.Eden3.ordinal()] = 22;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[pj.aux.EliteRO.ordinal()] = 106;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[pj.aux.EosRagnarokOnline.ordinal()] = 25;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[pj.aux.ForceRO.ordinal()] = 89;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[pj.aux.FreePlayRoCom.ordinal()] = 43;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[pj.aux.FreeRO.ordinal()] = 9;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[pj.aux.FreeRoWeb.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[pj.aux.GRANDRO.ordinal()] = 77;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[pj.aux.GachoRO.ordinal()] = 58;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[pj.aux.GarciaRO.ordinal()] = 70;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[pj.aux.Gugusjungs57572.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[pj.aux.IfritRagnarokCom.ordinal()] = 41;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[pj.aux.InfamyRO.ordinal()] = 16;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[pj.aux.KafraRO.ordinal()] = 55;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[pj.aux.KryptGamingClassic.ordinal()] = 90;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[pj.aux.LeonardRO.ordinal()] = 40;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[pj.aux.LevelRO.ordinal()] = 94;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[pj.aux.LeviathanRO.ordinal()] = 100;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[pj.aux.LibRO.ordinal()] = 60;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[pj.aux.LidiaRO.ordinal()] = 33;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[pj.aux.LucianoRO.ordinal()] = 69;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[pj.aux.MOTR.ordinal()] = 4;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[pj.aux.MOTR_home.ordinal()] = 5;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[pj.aux.MidgardRO.ordinal()] = 110;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[pj.aux.MobiRO.ordinal()] = 27;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[pj.aux.Modify_Full.ordinal()] = 75;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[pj.aux.MyRO.ordinal()] = 10;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[pj.aux.MyRebornRO.ordinal()] = 79;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[pj.aux.NewFenrirRoGameNet.ordinal()] = 92;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[pj.aux.Newyear.ordinal()] = 76;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[pj.aux.NorseRO.ordinal()] = 62;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[pj.aux.OMGRO.ordinal()] = 73;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[pj.aux.OSRO2019.ordinal()] = 91;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[pj.aux.OcrClassicCom.ordinal()] = 83;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[pj.aux.OfficialragnarokCom.ordinal()] = 95;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[pj.aux.OldchaosROCom.ordinal()] = 31;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[pj.aux.OldschoolragnarokCom.ordinal()] = 66;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[pj.aux.OsirisRO.ordinal()] = 97;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[pj.aux.PayonRO.ordinal()] = 96;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[pj.aux.PhRoNet.ordinal()] = 109;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[pj.aux.PhoenixRO.ordinal()] = 20;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[pj.aux.PhoenixRO2.ordinal()] = 82;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[pj.aux.PinoyRO.ordinal()] = 72;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[pj.aux.PlayLokiServerCom.ordinal()] = 29;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[pj.aux.PlayValhallaNet.ordinal()] = 104;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr2[pj.aux.PlayragnarokPh.ordinal()] = 17;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr2[pj.aux.PlayvalhallaPh.ordinal()] = 46;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr2[pj.aux.ROClashed.ordinal()] = 88;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr2[pj.aux.ROComfy.ordinal()] = 98;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr2[pj.aux.ROProviderValkyrie.ordinal()] = 13;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr2[pj.aux.Ragnaclan.ordinal()] = 38;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr2[pj.aux.Ragnajapan.ordinal()] = 101;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr2[pj.aux.RagnarevivalCom.ordinal()] = 35;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr2[pj.aux.Ragnarevo.ordinal()] = 67;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr2[pj.aux.RagnarokIsLife.ordinal()] = 93;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr2[pj.aux.RagnarokPuzzle.ordinal()] = 74;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr2[pj.aux.RagnarokReturnPh.ordinal()] = 57;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr2[pj.aux.RebirthRO_Ancyker.ordinal()] = 36;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr2[pj.aux.RelaxRO.ordinal()] = 86;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr2[pj.aux.RoFaction.ordinal()] = 53;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr2[pj.aux.RoFreedom.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr2[pj.aux.RoHeimdallCom.ordinal()] = 44;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr2[pj.aux.RoPronteraEp5.ordinal()] = 99;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr2[pj.aux.RoRetro.ordinal()] = 59;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr2[pj.aux.SakrayPh.ordinal()] = 78;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr2[pj.aux.SarahServer.ordinal()] = 18;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr2[pj.aux.SecretRO.ordinal()] = 61;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr2[pj.aux.ShinServer.ordinal()] = 24;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr2[pj.aux.SolaceRO.ordinal()] = 108;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr2[pj.aux.SuccessRoNet.ordinal()] = 19;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr2[pj.aux.ThaiRoInTh.ordinal()] = 39;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr2[pj.aux.Thai_id9169.ordinal()] = 45;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr2[pj.aux.TheClassicROCom.ordinal()] = 14;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr2[pj.aux.TitanRO.ordinal()] = 52;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr2[pj.aux.Trinity_Reborn_Full.ordinal()] = 63;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr2[pj.aux.TyrServer.ordinal()] = 26;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr2[pj.aux.WeDevGames.ordinal()] = 12;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr2[pj.aux.WeloveRo.ordinal()] = 54;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr2[pj.aux.XileRO.ordinal()] = 6;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr2[pj.aux.XileRO2019.ordinal()] = 80;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr2[pj.aux.XileROOS.ordinal()] = 28;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr2[pj.aux.eA.ordinal()] = 111;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr2[pj.aux.eSport2019.ordinal()] = 81;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr2[pj.aux.fRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr2[pj.aux.hiclassro.ordinal()] = 65;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr2[pj.aux.iPlayRo201804.ordinal()] = 49;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr2[pj.aux.iRO_Renewal.ordinal()] = 1;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr2[pj.aux.kRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused111) {
        }
        f8864 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 18259;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        an anVar = (an) C0358.f6671.f765;
        qo qoVar = new qo(s, s2, s3, anVar.f675.get(C0427.class).f680, anVar.f675.get(C0678.class).f680, anVar.f675.get(C0425.class).f680, anVar.f675.get(C0889.class).f680);
        switch (m1629()[C0358.f6667.f4771.ordinal()]) {
            case 12:
                C0358.f6671.f751 = new si(qoVar);
                break;
            case 13:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
            case 48:
            case 50:
            case 70:
            case vh.f5370 /* 80 */:
            default:
                throw new UnsupportedOperationException();
            case 14:
                C0358.f6671.f751 = new sf(qoVar);
                break;
            case 15:
                C0358.f6671.f751 = new qb(qoVar);
                break;
            case 17:
                C0358.f6671.f751 = new rm(qoVar);
                break;
            case 22:
                C0358.f6671.f751 = new qf(qoVar);
                break;
            case 38:
                C0358.f6671.f751 = new ro(qoVar);
                break;
            case 39:
                C0358.f6671.f751 = new se(qoVar);
                break;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                C0358.f6671.f751 = new pt(qoVar);
                break;
            case 43:
                C0358.f6671.f751 = new qj(qoVar);
                break;
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                C0358.f6671.f751 = new qn(qoVar);
                break;
            case 49:
                C0358.f6671.f751 = new qp(qoVar);
                break;
            case 51:
                C0358.f6671.f751 = new px(qoVar);
                break;
            case 52:
                C0358.f6671.f751 = new sg(qoVar);
                break;
            case 53:
                C0358.f6671.f751 = new rx(qoVar);
                break;
            case 54:
                C0358.f6671.f751 = new sj(qoVar);
                break;
            case 55:
                C0358.f6671.f751 = new qq(qoVar);
                break;
            case 56:
                C0358.f6671.f751 = new qa(qoVar);
                break;
            case 57:
                C0358.f6671.f751 = new rt(qoVar);
                break;
            case 58:
                C0358.f6671.f751 = new qk(qoVar);
                break;
            case 59:
                C0358.f6671.f751 = new sa(qoVar);
                break;
            case 60:
                C0358.f6671.f751 = new qu(qoVar);
                break;
            case 61:
                C0358.f6671.f751 = new sc(qoVar);
                break;
            case 62:
                C0358.f6671.f751 = new rb(qoVar);
                break;
            case 63:
                C0358.f6671.f751 = new sh(qoVar);
                break;
            case 64:
                C0358.f6671.f751 = new ps(qoVar);
                break;
            case 65:
                C0358.f6671.f751 = new qm(qoVar);
                break;
            case 66:
                C0358.f6671.f751 = new re(qoVar);
                break;
            case 67:
                C0358.f6671.f751 = new rq(qoVar);
                break;
            case 68:
                C0358.f6671.f751 = new qc(qoVar);
                break;
            case TFTP.DEFAULT_PORT /* 69 */:
                C0358.f6671.f751 = new qv(qoVar);
                break;
            case 71:
                C0358.f6671.f751 = new pw(qoVar);
                break;
            case 72:
                C0358.f6671.f751 = new rl(qoVar);
                break;
            case 73:
                C0358.f6671.f751 = new rf(qoVar);
                break;
            case 74:
                C0358.f6671.f751 = new rs(qoVar);
                break;
            case 75:
                C0358.f6671.f751 = new qx(qoVar);
                break;
            case 76:
                C0358.f6671.f751 = new ra(qoVar);
                break;
            case 77:
                C0358.f6671.f751 = new ql(qoVar);
                break;
            case 78:
                C0358.f6671.f751 = new sb(qoVar);
                break;
            case FingerClient.DEFAULT_PORT /* 79 */:
                C0358.f6671.f751 = new qy(qoVar);
                break;
            case 81:
                C0358.f6671.f751 = new qh(qoVar);
                break;
            case 82:
                C0358.f6671.f751 = new rj(qoVar);
                break;
            case 83:
                C0358.f6671.f751 = new rc(qoVar);
                break;
            case 84:
                C0358.f6671.f751 = new ry(qoVar);
                break;
            case 85:
                C0358.f6671.f751 = new pz(qoVar);
                break;
            case 86:
                C0358.f6671.f751 = new ru(qoVar);
                break;
            case 87:
                C0358.f6671.f751 = new pv(qoVar);
                break;
            case 88:
                C0358.f6671.f751 = new rv(qoVar);
                break;
            case 89:
                C0358.f6671.f751 = new qi(qoVar);
                break;
            case 90:
                C0358.f6671.f751 = new qr(qoVar);
                break;
            case 91:
                C0358.f6671.f751 = new rh(qoVar);
                break;
            case 92:
                C0358.f6671.f751 = new qz(qoVar);
                break;
            case 93:
                C0358.f6671.f751 = new rr(qoVar);
                break;
            case 94:
                C0358.f6671.f751 = new qs(qoVar);
                break;
            case 95:
                C0358.f6671.f751 = new rd(qoVar);
                break;
            case 96:
                C0358.f6671.f751 = new ri(qoVar);
                break;
            case 97:
                C0358.f6671.f751 = new rg(qoVar);
                break;
            case 98:
                C0358.f6671.f751 = new rw(qoVar);
                break;
            case 99:
                C0358.f6671.f751 = new rz(qoVar);
                break;
            case 100:
                C0358.f6671.f751 = new qt(qoVar);
                break;
            case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                C0358.f6671.f751 = new rp(qoVar);
                break;
            case HttpStatus.SC_PROCESSING /* 102 */:
                C0358.f6671.f751 = new qe(qoVar);
                break;
            case 103:
                C0358.f6671.f751 = new py(qoVar);
                break;
            case 104:
                C0358.f6671.f751 = new rn(qoVar);
                break;
            case 105:
                C0358.f6671.f751 = new qd(qoVar);
                break;
            case 106:
                C0358.f6671.f751 = new qg(qoVar);
                break;
            case 107:
                C0358.f6671.f751 = new pu(qoVar);
                break;
            case 108:
                C0358.f6671.f751 = new sd(qoVar);
                break;
            case 109:
                C0358.f6671.f751 = new rk(qoVar);
                break;
            case 110:
                C0358.f6671.f751 = new qw(qoVar);
                break;
        }
        pr prVar = C0358.f6671.f751;
        prVar.m1084(bArr, bArr.length, prVar.f4948);
        ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).position(0);
        int i3 = byteBuffer2.getInt();
        byteBuffer2.getLong();
        short s4 = byteBuffer2.getShort();
        int i4 = byteBuffer2.getInt();
        int i5 = byteBuffer2.getInt();
        int i6 = byteBuffer2.getInt();
        if (i6 != C0358.f6667.f4800) {
            nz.m907("Server uses different packet version from your client server: " + i6 + ", client: " + C0358.f6667.f4800 + "!");
        }
        if (s4 == 48059 && C0358.f6671.f757.f777 != ns.LOGIN) {
            nz.m907("Gepard server type mismatch (login)");
        } else if (s4 == 43690 && C0358.f6671.f757.f777 != ns.MAP) {
            nz.m907("Gepard server type mismatch (map)");
        }
        if (i4 != C0358.f6671.f751.mo1079()) {
            nz.m907("Gepard license ID mismatch");
        }
        b bVar = C0358.f6671;
        if (i5 != 2016122701) {
            nz.m907("Gepard code version mismatch");
        }
        if (i3 != C0358.f6671.f751.m1080(bArr, 4, bArr.length - 4)) {
            nz.m907("Gepard data hash mismatch");
        }
        C0358.f6671.mo454(new C0216());
        if (C0358.f6671.f757.f777 == ns.LOGIN) {
            if (C0358.f6667.f4808 && C0358.f6667.f4771 != pj.aux.Eden3) {
                C0358.f6671.mo454(new C0964(C0358.f6681, C0358.f6672, C0358.f6667.f4770, C0358.f6667.f4847, false));
            } else {
                C0358.f6671.mo454(new C0832(C0358.f6681, C0358.f6672, C0358.f6667.f4770, C0358.f6667.f4847));
            }
        }
    }
}
