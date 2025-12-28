package o;

import java.util.Random;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class mh extends mj {

    /* renamed from: Ȋ, reason: contains not printable characters */
    static int f2115 = 0;

    /* renamed from: 띥, reason: contains not printable characters */
    private static /* synthetic */ int[] f2116;

    /* renamed from: ċ, reason: contains not printable characters */
    hq f2117;

    /* renamed from: ē, reason: contains not printable characters */
    boolean f2118;

    /* renamed from: 纫, reason: contains not printable characters */
    Random f2119 = new Random(System.currentTimeMillis());

    @Override // o.mj
    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo846(pe peVar) {
        super.mo846(peVar);
    }

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m854() {
        int[] iArr = f2116;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0890.valuesCustom().length];
        try {
            iArr2[EnumC0890.AB_EPICLESIS.ordinal()] = 62;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0890.AL_PNEUMA.ordinal()] = 6;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0890.AL_WARP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0890.AM_DEMONSTRATION.ordinal()] = 45;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0890.AS_VENOMDUST.ordinal()] = 14;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0890.BA_APPLEIDUN.ordinal()] = 38;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC0890.BA_ASSASSINCROSS.ordinal()] = 36;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC0890.BA_DISSONANCE.ordinal()] = 34;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EnumC0890.BA_POEMBRAGI.ordinal()] = 37;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[EnumC0890.BA_WHISTLE.ordinal()] = 35;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[EnumC0890.BD_DRUMBATTLEFIELD.ordinal()] = 29;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[EnumC0890.BD_ETERNALCHAOS.ordinal()] = 28;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[EnumC0890.BD_INTOABYSS.ordinal()] = 32;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[EnumC0890.BD_LULLABY.ordinal()] = 26;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[EnumC0890.BD_RICHMANKIM.ordinal()] = 27;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[EnumC0890.BD_RINGNIBELUNGEN.ordinal()] = 30;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[EnumC0890.BD_ROKISWEIL.ordinal()] = 31;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[EnumC0890.BD_SIEGFRIED.ordinal()] = 33;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[EnumC0890.CG_HERMODE.ordinal()] = 52;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[EnumC0890.CG_MOONLIT.ordinal()] = 48;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[EnumC0890.DC_DONTFORGETME.ordinal()] = 41;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[EnumC0890.DC_FORTUNEKISS.ordinal()] = 42;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[EnumC0890.DC_HUMMING.ordinal()] = 40;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[EnumC0890.DC_SERVICEFORYOU.ordinal()] = 43;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[EnumC0890.DC_UGLYDANCE.ordinal()] = 39;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[EnumC0890.DUMMYSKILL.ordinal()] = 7;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[EnumC0890.EL_FIRE_MANTLE.ordinal()] = 97;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[EnumC0890.EL_POWER_OF_GAIA.ordinal()] = 100;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[EnumC0890.EL_WATER_BARRIER.ordinal()] = 98;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[EnumC0890.EL_ZEPHYR.ordinal()] = 99;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[EnumC0890.GC_POISONSMOKE.ordinal()] = 85;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[EnumC0890.GD_GLORYWOUNDS.ordinal()] = 58;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[EnumC0890.GD_HAWKEYES.ordinal()] = 60;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[EnumC0890.GD_LEADERSHIP.ordinal()] = 57;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[EnumC0890.GD_SOULCOLD.ordinal()] = 59;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[EnumC0890.GN_DEMONIC_FIRE.ordinal()] = 91;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[EnumC0890.GN_FIRE_EXPANSION_SMOKE_POWDER.ordinal()] = 92;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[EnumC0890.GN_FIRE_EXPANSION_TEAR_GAS.ordinal()] = 93;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[EnumC0890.GN_HELLS_PLANT.ordinal()] = 94;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[EnumC0890.GN_THORNS_TRAP.ordinal()] = 89;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[EnumC0890.GN_WALLOFTHORN.ordinal()] = 90;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[EnumC0890.GS_GROUNDDRIFT.ordinal()] = 56;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[EnumC0890.HP_BASILICA.ordinal()] = 47;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[EnumC0890.HT_ANKLESNARE.ordinal()] = 13;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[EnumC0890.HT_BLASTMINE.ordinal()] = 11;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[EnumC0890.HT_CLAYMORETRAP.ordinal()] = 20;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[EnumC0890.HT_FLASHER.ordinal()] = 18;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[EnumC0890.HT_FREEZINGTRAP.ordinal()] = 19;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[EnumC0890.HT_LANDMINE.ordinal()] = 15;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[EnumC0890.HT_SANDMAN.ordinal()] = 17;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[EnumC0890.HT_SHOCKWAVE.ordinal()] = 16;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[EnumC0890.HT_SKIDTRAP.ordinal()] = 12;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[EnumC0890.HT_TALKIEBOX.ordinal()] = 21;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[EnumC0890.HW_GRAVITATION.ordinal()] = 51;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[EnumC0890.KO_MAKIBISHI.ordinal()] = 109;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[EnumC0890.KO_ZENKAI.ordinal()] = 108;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[EnumC0890.LG_BANDING.ordinal()] = 96;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[EnumC0890.MG_FIREWALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[EnumC0890.MG_SAFETYWALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[EnumC0890.MH_LAVA_SLIDE.ordinal()] = 106;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[EnumC0890.MH_POISON_MIST.ordinal()] = 105;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[EnumC0890.MH_VOLCANIC_ASH.ordinal()] = 107;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[EnumC0890.NC_MAGMA_ERUPTION.ordinal()] = 112;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[EnumC0890.NC_NEUTRALBARRIER.ordinal()] = 86;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[EnumC0890.NC_STEALTHFIELD.ordinal()] = 87;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[EnumC0890.NJ_KAENSIN.ordinal()] = 55;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[EnumC0890.NJ_SUITON.ordinal()] = 53;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[EnumC0890.NJ_TATAMIGAESHI.ordinal()] = 54;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr2[EnumC0890.NPC_EVILLAND.ordinal()] = 61;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr2[EnumC0890.NPC_VENOMFOG.ordinal()] = 110;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr2[EnumC0890.PA_GOSPEL.ordinal()] = 46;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr2[EnumC0890.PF_FOGWALL.ordinal()] = 49;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr2[EnumC0890.PF_SPIDERWEB.ordinal()] = 50;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr2[EnumC0890.PR_MAGNUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr2[EnumC0890.PR_SANCTUARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr2[EnumC0890.RA_CLUSTERBOMB.ordinal()] = 77;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr2[EnumC0890.RA_COBALTTRAP.ordinal()] = 71;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr2[EnumC0890.RA_ELECTRICSHOCKER.ordinal()] = 76;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr2[EnumC0890.RA_FIRINGTRAP.ordinal()] = 74;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr2[EnumC0890.RA_ICEBOUNDTRAP.ordinal()] = 75;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr2[EnumC0890.RA_MAGENTATRAP.ordinal()] = 70;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr2[EnumC0890.RA_MAIZETRAP.ordinal()] = 72;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr2[EnumC0890.RA_VERDURETRAP.ordinal()] = 73;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr2[EnumC0890.RG_GRAFFITI.ordinal()] = 44;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr2[EnumC0890.RL_B_TRAP.ordinal()] = 113;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr2[EnumC0890.SA_DELUGE.ordinal()] = 23;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr2[EnumC0890.SA_LANDPROTECTOR.ordinal()] = 25;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr2[EnumC0890.SA_VIOLENTGALE.ordinal()] = 24;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr2[EnumC0890.SA_VOLCANO.ordinal()] = 22;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr2[EnumC0890.SC_BLOODYLUST.ordinal()] = 68;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr2[EnumC0890.SC_CHAOSPANIC.ordinal()] = 66;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr2[EnumC0890.SC_DIMENSIONDOOR.ordinal()] = 65;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr2[EnumC0890.SC_FEINTBOMB.ordinal()] = 69;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr2[EnumC0890.SC_MAELSTROM.ordinal()] = 67;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr2[EnumC0890.SC_MANHOLE.ordinal()] = 64;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr2[EnumC0890.SC_SCAPE.ordinal()] = 111;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr2[EnumC0890.SO_CLOUD_KILL.ordinal()] = 84;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr2[EnumC0890.SO_EARTH_INSIGNIA.ordinal()] = 104;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr2[EnumC0890.SO_ELECTRICWALK.ordinal()] = 81;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr2[EnumC0890.SO_FIREWALK.ordinal()] = 80;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr2[EnumC0890.SO_FIRE_INSIGNIA.ordinal()] = 101;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr2[EnumC0890.SO_PSYCHIC_WAVE.ordinal()] = 83;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr2[EnumC0890.SO_VACUUM_EXTREME.ordinal()] = 95;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr2[EnumC0890.SO_WARMER.ordinal()] = 88;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr2[EnumC0890.SO_WATER_INSIGNIA.ordinal()] = 102;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr2[EnumC0890.SO_WIND_INSIGNIA.ordinal()] = 103;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr2[EnumC0890.WL_EARTHSTRAIN.ordinal()] = 63;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr2[EnumC0890.WM_POEMOFNETHERWORLD.ordinal()] = 82;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr2[EnumC0890.WM_REVERBERATION.ordinal()] = 78;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr2[EnumC0890.WM_SEVERE_RAINSTORM.ordinal()] = 79;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr2[EnumC0890.WZ_FIREPILLAR.ordinal()] = 8;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr2[EnumC0890.WZ_ICEWALL.ordinal()] = 9;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr2[EnumC0890.WZ_QUAGMIRE.ordinal()] = 10;
        } catch (NoSuchFieldError unused113) {
        }
        f2116 = iArr2;
        return iArr2;
    }

    mh(hq hqVar) {
        pe peVar;
        this.f2118 = false;
        this.f2117 = hqVar;
        switch (m854()[this.f2117.f1499.ordinal()]) {
            case 1:
                peVar = pe.GLASSWALL2;
                break;
            case 2:
                peVar = pe.FIREWALL;
                break;
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                peVar = null;
                break;
            case 4:
                peVar = pe.BOTTOM_SANC;
                break;
            case 5:
                peVar = pe.BOTTOM_MAG;
                break;
            case 10:
                peVar = pe.QUAGMIRE;
                break;
            case 14:
                peVar = pe.VENOMDUST2;
                break;
        }
        if (peVar != null) {
            C0358.f6685.mo139(new mi(this, peVar));
        }
        this.f2118 = hqVar.f1499 == null;
        this.f7638 = new hs((hr) cp.m491("shadow", hr.class));
    }
}
