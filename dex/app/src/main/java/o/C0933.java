package o;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import o.C0995;
import org.apache.commons.net.bsd.RCommandClient;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.ftp.FTPSClient;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;

/* renamed from: o.鬒, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0933 extends co {

    /* renamed from: ą, reason: contains not printable characters */
    static boolean f8220 = false;

    /* renamed from: ċ, reason: contains not printable characters */
    private static /* synthetic */ int[] f8221;

    /* renamed from: ć, reason: contains not printable characters */
    mj f8224;

    /* renamed from: ȃ, reason: contains not printable characters */
    lr f8225;

    /* renamed from: Ȋ, reason: contains not printable characters */
    pe f8226;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    lr f8227;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    mj f8228;

    /* renamed from: 岱, reason: contains not printable characters */
    long f8229;

    /* renamed from: 鷭, reason: contains not printable characters */
    cu f8231;

    /* renamed from: 櫯, reason: contains not printable characters */
    ArrayList<C0995> f8230 = new ArrayList<>();

    /* renamed from: Ą, reason: contains not printable characters */
    boolean f8222 = true;

    /* renamed from: Ć, reason: contains not printable characters */
    boolean f8223 = false;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1541() {
        int[] iArr = f8221;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[pe.valuesCustom().length];
        try {
            iArr2[pe.ABSORBSPIRITS.ordinal()] = 255;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[pe.AB_OFFERTORIUM.ordinal()] = 1033;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[pe.AB_OFFERTORIUM_RING.ordinal()] = 1043;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[pe.ACIDDEMON.ordinal()] = 539;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[pe.ADO_STR.ordinal()] = 723;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[pe.AGIUP.ordinal()] = 458;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[pe.AGIUP2.ordinal()] = 779;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[pe.AGIUP3.ordinal()] = 781;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[pe.AIMED_STR.ordinal()] = 747;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[pe.AIRTEXTURE.ordinal()] = 418;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[pe.AKAITSUKI.ordinal()] = 1011;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[pe.ALL_FULL_THROTTLE.ordinal()] = 1029;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[pe.ALL_RAY_OF_PROTECTION.ordinal()] = 1021;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[pe.ANGEL.ordinal()] = 373;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[pe.ANGEL2.ordinal()] = 340;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[pe.ANGEL3.ordinal()] = 584;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[pe.ANGELUS.ordinal()] = 43;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[pe.AQUA.ordinal()] = 41;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[pe.ARROWSHOT.ordinal()] = 66;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[pe.ARROWSTORM_STR.ordinal()] = 748;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[pe.ASPERSIO.ordinal()] = 88;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[pe.ASSUMPTIO.ordinal()] = 377;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[pe.ASSUMPTIO2.ordinal()] = 442;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[pe.ASURABODY.ordinal()] = 426;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[pe.ASURABODY_MONSTER.ordinal()] = 429;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[pe.ATTACKENERGY.ordinal()] = 439;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[pe.ATTACKENERGY2.ordinal()] = 440;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[pe.AURABLADE.ordinal()] = 369;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[pe.AURABLADE2.ordinal()] = 476;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[pe.AUTOCOUNTER.ordinal()] = 133;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[pe.BABY.ordinal()] = 410;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[pe.BABYBODY.ordinal()] = 422;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[pe.BABYBODY2.ordinal()] = 423;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[pe.BABYBODY_BACK.ordinal()] = 542;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[pe.BACKSTAP.ordinal()] = 277;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[pe.BAKU.ordinal()] = 637;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[pe.BANISHING_BUSTER.ordinal()] = 1048;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[pe.BANJJAKII.ordinal()] = 167;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[pe.BARRIER.ordinal()] = 65;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[pe.BASH.ordinal()] = 18;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[pe.BASH3D.ordinal()] = 368;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[pe.BASH3D2.ordinal()] = 379;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[pe.BASH3D3.ordinal()] = 401;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[pe.BASH3D4.ordinal()] = 402;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[pe.BASH3D5.ordinal()] = 630;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[pe.BASH3D6.ordinal()] = 887;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[pe.BAT.ordinal()] = 361;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[pe.BAT2.ordinal()] = 362;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[pe.BEGINASURA.ordinal()] = 330;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[pe.BEGINASURA1.ordinal()] = 469;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[pe.BEGINASURA11.ordinal()] = 512;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[pe.BEGINASURA2.ordinal()] = 470;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[pe.BEGINASURA3.ordinal()] = 471;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[pe.BEGINASURA4.ordinal()] = 472;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[pe.BEGINASURA5.ordinal()] = 473;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[pe.BEGINASURA6.ordinal()] = 474;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[pe.BEGINASURA7.ordinal()] = 475;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[pe.BEGINSPELL.ordinal()] = 14;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[pe.BEGINSPELL2.ordinal()] = 56;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[pe.BEGINSPELL3.ordinal()] = 57;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[pe.BEGINSPELL4.ordinal()] = 58;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[pe.BEGINSPELL5.ordinal()] = 59;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[pe.BEGINSPELL6.ordinal()] = 60;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[pe.BEGINSPELL7.ordinal()] = 61;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[pe.BEGINSPELL_150.ordinal()] = 882;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[pe.BEGINSPELL_N1.ordinal()] = 832;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[pe.BEGINSPELL_N2.ordinal()] = 833;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[pe.BEGINSPELL_N3.ordinal()] = 842;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr2[pe.BEGINSPELL_N4.ordinal()] = 843;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr2[pe.BEGINSPELL_N5.ordinal()] = 844;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr2[pe.BEGINSPELL_N6.ordinal()] = 845;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr2[pe.BEGINSPELL_N7.ordinal()] = 846;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr2[pe.BEGINSPELL_N8.ordinal()] = 847;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr2[pe.BEGINSPELL_YB.ordinal()] = 905;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr2[pe.BENEDICTIO.ordinal()] = 93;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr2[pe.BIG_PORTAL.ordinal()] = 563;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr2[pe.BIG_PORTAL2.ordinal()] = 564;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr2[pe.BLACKBODY.ordinal()] = 814;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr2[pe.BLACKDEVIL.ordinal()] = 489;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr2[pe.BLACK_NUMBER.ordinal()] = 663;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr2[pe.BLASTMINE.ordinal()] = 107;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr2[pe.BLASTMINEBOMB.ordinal()] = 108;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr2[pe.BLEEDING.ordinal()] = 671;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr2[pe.BLESSING.ordinal()] = 44;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr2[pe.BLIND.ordinal()] = 336;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr2[pe.BLIND_S.ordinal()] = 641;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr2[pe.BLITZBEAT.ordinal()] = 117;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr2[pe.BLOODDRAIN.ordinal()] = 218;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr2[pe.BLOODDRAIN2.ordinal()] = 1038;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr2[pe.BLUEBODY.ordinal()] = 544;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr2[pe.BLUECASTING.ordinal()] = 443;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr2[pe.BLUEFALL.ordinal()] = 559;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr2[pe.BLUEFALL_90.ordinal()] = 560;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr2[pe.BLUELIGHTBODY.ordinal()] = 1005;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr2[pe.BLUELINE.ordinal()] = 901;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr2[pe.BLUE_HIT.ordinal()] = 551;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr2[pe.BLUE_NUMBER.ordinal()] = 660;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr2[pe.BOTTOM.ordinal()] = 116;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr2[pe.BOTTOM2.ordinal()] = 139;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr2[pe.BOTTOM_ANI.ordinal()] = 829;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr2[pe.BOTTOM_APPLEIDUN.ordinal()] = 291;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr2[pe.BOTTOM_ASSASSINCROSS.ordinal()] = 289;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr2[pe.BOTTOM_BARRIER.ordinal()] = 785;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr2[pe.BOTTOM_BASILICA.ordinal()] = 376;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr2[pe.BOTTOM_BASILICA2.ordinal()] = 804;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr2[pe.BOTTOM_BLOODYLUST.ordinal()] = 831;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr2[pe.BOTTOM_BLUE.ordinal()] = 717;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr2[pe.BOTTOM_BLUE2.ordinal()] = 718;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr2[pe.BOTTOM_DE.ordinal()] = 242;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr2[pe.BOTTOM_DE2.ordinal()] = 941;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr2[pe.BOTTOM_DISSONANCE.ordinal()] = 279;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr2[pe.BOTTOM_DONTFORGETME.ordinal()] = 294;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr2[pe.BOTTOM_DRUMBATTLEFIELD.ordinal()] = 283;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            iArr2[pe.BOTTOM_ETERNALCHAOS.ordinal()] = 282;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            iArr2[pe.BOTTOM_EVILLAND.ordinal()] = 676;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            iArr2[pe.BOTTOM_FOGWALL.ordinal()] = 407;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            iArr2[pe.BOTTOM_FORTUNEKISS.ordinal()] = 295;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            iArr2[pe.BOTTOM_GOSPEL.ordinal()] = 372;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            iArr2[pe.BOTTOM_HERMODE.ordinal()] = 519;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            iArr2[pe.BOTTOM_HUMMING.ordinal()] = 293;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            iArr2[pe.BOTTOM_INTOABYSS.ordinal()] = 286;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            iArr2[pe.BOTTOM_LA.ordinal()] = 244;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            iArr2[pe.BOTTOM_LULLABY.ordinal()] = 280;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            iArr2[pe.BOTTOM_MAELSTROM.ordinal()] = 830;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            iArr2[pe.BOTTOM_MAG.ordinal()] = 320;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            iArr2[pe.BOTTOM_MANHOLE.ordinal()] = 824;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            iArr2[pe.BOTTOM_POEMBRAGI.ordinal()] = 290;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            iArr2[pe.BOTTOM_RICHMANKIM.ordinal()] = 281;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            iArr2[pe.BOTTOM_RINGNIBELUNGEN.ordinal()] = 284;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            iArr2[pe.BOTTOM_ROKISWEIL.ordinal()] = 285;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            iArr2[pe.BOTTOM_RUNNER.ordinal()] = 673;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            iArr2[pe.BOTTOM_SANC.ordinal()] = 321;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            iArr2[pe.BOTTOM_SERVICEFORYOU.ordinal()] = 296;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            iArr2[pe.BOTTOM_SIEGFRIED.ordinal()] = 287;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            iArr2[pe.BOTTOM_SPIDER.ordinal()] = 406;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            iArr2[pe.BOTTOM_STEALTH.ordinal()] = 786;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            iArr2[pe.BOTTOM_SUITON.ordinal()] = 622;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            iArr2[pe.BOTTOM_TRANSFER.ordinal()] = 674;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            iArr2[pe.BOTTOM_UGLYDANCE.ordinal()] = 292;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            iArr2[pe.BOTTOM_VI.ordinal()] = 243;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            iArr2[pe.BOTTOM_VO.ordinal()] = 241;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            iArr2[pe.BOTTOM_WHISTLE.ordinal()] = 288;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            iArr2[pe.BOT_REVERB.ordinal()] = 858;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            iArr2[pe.BOT_REVERB2.ordinal()] = 862;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            iArr2[pe.BOWLINGBASH.ordinal()] = 75;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            iArr2[pe.BOWLINGSELF.ordinal()] = 151;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            iArr2[pe.BRANDISH2.ordinal()] = 146;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            iArr2[pe.BRANDISHSPEAR.ordinal()] = 72;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            iArr2[pe.BUBBLE.ordinal()] = 111;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            iArr2[pe.BUBBLE_DROP.ordinal()] = 667;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            iArr2[pe.BULLSEYE.ordinal()] = 651;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            iArr2[pe.BUNSINJYUTSU.ordinal()] = 619;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            iArr2[pe.BUNSINJYUTSU2.ordinal()] = 754;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            iArr2[pe.BURNING.ordinal()] = 792;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            iArr2[pe.CALLZONE.ordinal()] = 342;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            iArr2[pe.CARTBOOST.ordinal()] = 393;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            iArr2[pe.CARTREVOLUTION.ordinal()] = 172;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            iArr2[pe.CARTTER.ordinal()] = 520;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            iArr2[pe.CASTSPIN.ordinal()] = 503;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            iArr2[pe.CASTSPIN2.ordinal()] = 777;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            iArr2[pe.CHAINCOMBO.ordinal()] = 275;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            iArr2[pe.CHAINGEHOLY.ordinal()] = 180;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            iArr2[pe.CHAINL_STR.ordinal()] = 736;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            iArr2[pe.CHANGECOLD.ordinal()] = 176;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            iArr2[pe.CHANGEDARK.ordinal()] = 174;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            iArr2[pe.CHANGEEARTH.ordinal()] = 179;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            iArr2[pe.CHANGEFIRE.ordinal()] = 175;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            iArr2[pe.CHANGEFLAME.ordinal()] = 178;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            iArr2[pe.CHANGEPOISON.ordinal()] = 181;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            iArr2[pe.CHANGEWIND.ordinal()] = 177;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            iArr2[pe.CHAREFFECT.ordinal()] = 935;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            iArr2[pe.CHEMICAL2.ordinal()] = 305;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            iArr2[pe.CHEMICAL2DASH.ordinal()] = 514;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            iArr2[pe.CHEMICAL2DASH2.ordinal()] = 837;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            iArr2[pe.CHEMICAL2DASH3.ordinal()] = 838;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            iArr2[pe.CHEMICAL2DASH4.ordinal()] = 906;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            iArr2[pe.CHEMICAL3.ordinal()] = 441;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            iArr2[pe.CHEMICAL3S.ordinal()] = 895;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            iArr2[pe.CHEMICAL4.ordinal()] = 625;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            iArr2[pe.CHEMICALBODY.ordinal()] = 502;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            iArr2[pe.CHEMICALPROTECTION.ordinal()] = 302;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            iArr2[pe.CHEMICAL_ALLRANGE.ordinal()] = 971;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            iArr2[pe.CHEMICAL_V.ordinal()] = 856;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            iArr2[pe.CHEMICAL_V2.ordinal()] = 860;
        } catch (NoSuchFieldError unused184) {
        }
        try {
            iArr2[pe.CHEMICAL_V3.ordinal()] = 865;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            iArr2[pe.CHERRYBLOSSOM.ordinal()] = 1015;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            iArr2[pe.CHIMTO.ordinal()] = 269;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            iArr2[pe.CHIMTO2.ordinal()] = 725;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            iArr2[pe.CHOOKGI.ordinal()] = 230;
        } catch (NoSuchFieldError unused189) {
        }
        try {
            iArr2[pe.CHOOKGI2.ordinal()] = 506;
        } catch (NoSuchFieldError unused190) {
        }
        try {
            iArr2[pe.CHOOKGI3.ordinal()] = 631;
        } catch (NoSuchFieldError unused191) {
        }
        try {
            iArr2[pe.CHOOKGI_FIRE.ordinal()] = 737;
        } catch (NoSuchFieldError unused192) {
        }
        try {
            iArr2[pe.CHOOKGI_GROUND.ordinal()] = 740;
        } catch (NoSuchFieldError unused193) {
        }
        try {
            iArr2[pe.CHOOKGI_N.ordinal()] = 835;
        } catch (NoSuchFieldError unused194) {
        }
        try {
            iArr2[pe.CHOOKGI_WATER.ordinal()] = 739;
        } catch (NoSuchFieldError unused195) {
        }
        try {
            iArr2[pe.CHOOKGI_WIND.ordinal()] = 738;
        } catch (NoSuchFieldError unused196) {
        }
        try {
            iArr2[pe.CIRCLELIGHT.ordinal()] = 705;
        } catch (NoSuchFieldError unused197) {
        }
        try {
            iArr2[pe.CIRCLEPOWER.ordinal()] = 759;
        } catch (NoSuchFieldError unused198) {
        }
        try {
            iArr2[pe.CIRCLEPOWER2.ordinal()] = 863;
        } catch (NoSuchFieldError unused199) {
        }
        try {
            iArr2[pe.CIRCLEPOWER3.ordinal()] = 867;
        } catch (NoSuchFieldError unused200) {
        }
        try {
            iArr2[pe.CIRCLEPOWER4.ordinal()] = 869;
        } catch (NoSuchFieldError unused201) {
        }
        try {
            iArr2[pe.CIRCLEPOWER5.ordinal()] = 873;
        } catch (NoSuchFieldError unused202) {
        }
        try {
            iArr2[pe.CIRCLEPOWER6.ordinal()] = 875;
        } catch (NoSuchFieldError unused203) {
        }
        try {
            iArr2[pe.CIRCLEPOWER7.ordinal()] = 877;
        } catch (NoSuchFieldError unused204) {
        }
        try {
            iArr2[pe.CIRCLEPOWER8.ordinal()] = 879;
        } catch (NoSuchFieldError unused205) {
        }
        try {
            iArr2[pe.CLAYMORE.ordinal()] = 109;
        } catch (NoSuchFieldError unused206) {
        }
        try {
            iArr2[pe.CLEARTIME.ordinal()] = 755;
        } catch (NoSuchFieldError unused207) {
        }
        try {
            iArr2[pe.CLOAKING.ordinal()] = 122;
        } catch (NoSuchFieldError unused208) {
        }
        try {
            iArr2[pe.CLOAKING2.ordinal()] = 746;
        } catch (NoSuchFieldError unused209) {
        }
        try {
            iArr2[pe.CLOAKING3.ordinal()] = 811;
        } catch (NoSuchFieldError unused210) {
        }
        try {
            iArr2[pe.CLOUD.ordinal()] = 231;
        } catch (NoSuchFieldError unused211) {
        }
        try {
            iArr2[pe.CLOUD2.ordinal()] = 232;
        } catch (NoSuchFieldError unused212) {
        }
        try {
            iArr2[pe.CLOUD3.ordinal()] = 235;
        } catch (NoSuchFieldError unused213) {
        }
        try {
            iArr2[pe.CLOUD4.ordinal()] = 517;
        } catch (NoSuchFieldError unused214) {
        }
        try {
            iArr2[pe.CLOUD5.ordinal()] = 518;
        } catch (NoSuchFieldError unused215) {
        }
        try {
            iArr2[pe.CLOUD6.ordinal()] = 594;
        } catch (NoSuchFieldError unused216) {
        }
        try {
            iArr2[pe.CLOUD7.ordinal()] = 699;
        } catch (NoSuchFieldError unused217) {
        }
        try {
            iArr2[pe.CLOUD8.ordinal()] = 700;
        } catch (NoSuchFieldError unused218) {
        }
        try {
            iArr2[pe.CLOUD9.ordinal()] = 947;
        } catch (NoSuchFieldError unused219) {
        }
        try {
            iArr2[pe.COBALT_TRAP.ordinal()] = 742;
        } catch (NoSuchFieldError unused220) {
        }
        try {
            iArr2[pe.COIN.ordinal()] = 12;
        } catch (NoSuchFieldError unused221) {
        }
        try {
            iArr2[pe.COLDHIT.ordinal()] = 53;
        } catch (NoSuchFieldError unused222) {
        }
        try {
            iArr2[pe.COLDSTATUS.ordinal()] = 942;
        } catch (NoSuchFieldError unused223) {
        }
        try {
            iArr2[pe.COLDTHROW.ordinal()] = 793;
        } catch (NoSuchFieldError unused224) {
        }
        try {
            iArr2[pe.COLDTHROW2.ordinal()] = 930;
        } catch (NoSuchFieldError unused225) {
        }
        try {
            iArr2[pe.COLORPAPER.ordinal()] = 349;
        } catch (NoSuchFieldError unused226) {
        }
        try {
            iArr2[pe.COMBOATTACK1.ordinal()] = 188;
        } catch (NoSuchFieldError unused227) {
        }
        try {
            iArr2[pe.COMBOATTACK2.ordinal()] = 189;
        } catch (NoSuchFieldError unused228) {
        }
        try {
            iArr2[pe.COMBOATTACK3.ordinal()] = 190;
        } catch (NoSuchFieldError unused229) {
        }
        try {
            iArr2[pe.COMBOATTACK4.ordinal()] = 191;
        } catch (NoSuchFieldError unused230) {
        }
        try {
            iArr2[pe.COMBOATTACK5.ordinal()] = 192;
        } catch (NoSuchFieldError unused231) {
        }
        try {
            iArr2[pe.CONCENTRATION.ordinal()] = 155;
        } catch (NoSuchFieldError unused232) {
        }
        try {
            iArr2[pe.CONCENTRATION2.ordinal()] = 752;
        } catch (NoSuchFieldError unused233) {
        }
        try {
            iArr2[pe.CONE.ordinal()] = 73;
        } catch (NoSuchFieldError unused234) {
        }
        try {
            iArr2[pe.COOKING_FAIL.ordinal()] = 611;
        } catch (NoSuchFieldError unused235) {
        }
        try {
            iArr2[pe.COOKING_OK.ordinal()] = 610;
        } catch (NoSuchFieldError unused236) {
        }
        try {
            iArr2[pe.COUPLECASTING.ordinal()] = 344;
        } catch (NoSuchFieldError unused237) {
        }
        try {
            iArr2[pe.CRASHAXE.ordinal()] = 797;
        } catch (NoSuchFieldError unused238) {
        }
        try {
            iArr2[pe.CRASHEARTH.ordinal()] = 104;
        } catch (NoSuchFieldError unused239) {
        }
        try {
            iArr2[pe.CRIMSON_STR.ordinal()] = 729;
        } catch (NoSuchFieldError unused240) {
        }
        try {
            iArr2[pe.CRITICALWOUND.ordinal()] = 679;
        } catch (NoSuchFieldError unused241) {
        }
        try {
            iArr2[pe.CRYSTAL_BLUE.ordinal()] = 675;
        } catch (NoSuchFieldError unused242) {
        }
        try {
            iArr2[pe.CURE.ordinal()] = 68;
        } catch (NoSuchFieldError unused243) {
        }
        try {
            iArr2[pe.CURSEATTACK.ordinal()] = 198;
        } catch (NoSuchFieldError unused244) {
        }
        try {
            iArr2[pe.C_MAKER.ordinal()] = 1046;
        } catch (NoSuchFieldError unused245) {
        }
        try {
            iArr2[pe.DAMAGE1.ordinal()] = 654;
        } catch (NoSuchFieldError unused246) {
        }
        try {
            iArr2[pe.DAMAGE1_2.ordinal()] = 655;
        } catch (NoSuchFieldError unused247) {
        }
        try {
            iArr2[pe.DAMAGE1_3.ordinal()] = 656;
        } catch (NoSuchFieldError unused248) {
        }
        try {
            iArr2[pe.DANCE1.ordinal()] = 849;
        } catch (NoSuchFieldError unused249) {
        }
        try {
            iArr2[pe.DANCE2.ordinal()] = 850;
        } catch (NoSuchFieldError unused250) {
        }
        try {
            iArr2[pe.DANCINGBLADE.ordinal()] = 1024;
        } catch (NoSuchFieldError unused251) {
        }
        try {
            iArr2[pe.DARKATTACK.ordinal()] = 186;
        } catch (NoSuchFieldError unused252) {
        }
        try {
            iArr2[pe.DARKBREATH.ordinal()] = 214;
        } catch (NoSuchFieldError unused253) {
        }
        try {
            iArr2[pe.DARKCASTING.ordinal()] = 456;
        } catch (NoSuchFieldError unused254) {
        }
        try {
            iArr2[pe.DARKCASTING2.ordinal()] = 828;
        } catch (NoSuchFieldError unused255) {
        }
        try {
            iArr2[pe.DA_SPACE.ordinal()] = 669;
        } catch (NoSuchFieldError unused256) {
        }
        try {
            iArr2[pe.DECAGILITY.ordinal()] = 40;
        } catch (NoSuchFieldError unused257) {
        }
        try {
            iArr2[pe.DEFENDER.ordinal()] = 224;
        } catch (NoSuchFieldError unused258) {
        }
        try {
            iArr2[pe.DEFFENDER.ordinal()] = 215;
        } catch (NoSuchFieldError unused259) {
        }
        try {
            iArr2[pe.DELUGE.ordinal()] = 238;
        } catch (NoSuchFieldError unused260) {
        }
        try {
            iArr2[pe.DEMONICFIRE.ordinal()] = 918;
        } catch (NoSuchFieldError unused261) {
        }
        try {
            iArr2[pe.DEMONICFIRE2.ordinal()] = 919;
        } catch (NoSuchFieldError unused262) {
        }
        try {
            iArr2[pe.DEMONICFIRE3.ordinal()] = 920;
        } catch (NoSuchFieldError unused263) {
        }
        try {
            iArr2[pe.DEMONICFIRE4.ordinal()] = 931;
        } catch (NoSuchFieldError unused264) {
        }
        try {
            iArr2[pe.DEMONSTRATION.ordinal()] = 304;
        } catch (NoSuchFieldError unused265) {
        }
        try {
            iArr2[pe.DESPERADO.ordinal()] = 639;
        } catch (NoSuchFieldError unused266) {
        }
        try {
            iArr2[pe.DETECT2.ordinal()] = 727;
        } catch (NoSuchFieldError unused267) {
        }
        try {
            iArr2[pe.DETECT3.ordinal()] = 780;
        } catch (NoSuchFieldError unused268) {
        }
        try {
            iArr2[pe.DETECT4.ordinal()] = 782;
        } catch (NoSuchFieldError unused269) {
        }
        try {
            iArr2[pe.DETECTING.ordinal()] = 121;
        } catch (NoSuchFieldError unused270) {
        }
        try {
            iArr2[pe.DETOXICATION.ordinal()] = 23;
        } catch (NoSuchFieldError unused271) {
        }
        try {
            iArr2[pe.DEVIL.ordinal()] = 374;
        } catch (NoSuchFieldError unused272) {
        }
        try {
            iArr2[pe.DEVIL1.ordinal()] = 477;
        } catch (NoSuchFieldError unused273) {
        }
        try {
            iArr2[pe.DEVIL10.ordinal()] = 486;
        } catch (NoSuchFieldError unused274) {
        }
        try {
            iArr2[pe.DEVIL2.ordinal()] = 478;
        } catch (NoSuchFieldError unused275) {
        }
        try {
            iArr2[pe.DEVIL3.ordinal()] = 479;
        } catch (NoSuchFieldError unused276) {
        }
        try {
            iArr2[pe.DEVIL4.ordinal()] = 480;
        } catch (NoSuchFieldError unused277) {
        }
        try {
            iArr2[pe.DEVIL5.ordinal()] = 481;
        } catch (NoSuchFieldError unused278) {
        }
        try {
            iArr2[pe.DEVIL6.ordinal()] = 482;
        } catch (NoSuchFieldError unused279) {
        }
        try {
            iArr2[pe.DEVIL7.ordinal()] = 483;
        } catch (NoSuchFieldError unused280) {
        }
        try {
            iArr2[pe.DEVIL8.ordinal()] = 484;
        } catch (NoSuchFieldError unused281) {
        }
        try {
            iArr2[pe.DEVIL9.ordinal()] = 485;
        } catch (NoSuchFieldError unused282) {
        }
        try {
            iArr2[pe.DEVIL_.ordinal()] = 1026;
        } catch (NoSuchFieldError unused283) {
        }
        try {
            iArr2[pe.DEVOTION.ordinal()] = 253;
        } catch (NoSuchFieldError unused284) {
        }
        try {
            iArr2[pe.DHOWL_STR.ordinal()] = 733;
        } catch (NoSuchFieldError unused285) {
        }
        try {
            iArr2[pe.DISPELL.ordinal()] = 237;
        } catch (NoSuchFieldError unused286) {
        }
        try {
            iArr2[pe.DOUBLECASTBODY.ordinal()] = 523;
        } catch (NoSuchFieldError unused287) {
        }
        try {
            iArr2[pe.DOUBLEGUMGANG.ordinal()] = 420;
        } catch (NoSuchFieldError unused288) {
        }
        try {
            iArr2[pe.DOUBLEGUMGANG2.ordinal()] = 487;
        } catch (NoSuchFieldError unused289) {
        }
        try {
            iArr2[pe.DOUBLEGUMGANG3.ordinal()] = 488;
        } catch (NoSuchFieldError unused290) {
        }
        try {
            iArr2[pe.DQ9_CHARGE.ordinal()] = 897;
        } catch (NoSuchFieldError unused291) {
        }
        try {
            iArr2[pe.DQ9_CHARGE2.ordinal()] = 898;
        } catch (NoSuchFieldError unused292) {
        }
        try {
            iArr2[pe.DQ9_CHARGE3.ordinal()] = 899;
        } catch (NoSuchFieldError unused293) {
        }
        try {
            iArr2[pe.DQ9_CHARGE4.ordinal()] = 900;
        } catch (NoSuchFieldError unused294) {
        }
        try {
            iArr2[pe.DRAGONFEAR.ordinal()] = 670;
        } catch (NoSuchFieldError unused295) {
        }
        try {
            iArr2[pe.DRAGONSMOKE.ordinal()] = 375;
        } catch (NoSuchFieldError unused296) {
        }
        try {
            iArr2[pe.DUST.ordinal()] = 691;
        } catch (NoSuchFieldError unused297) {
        }
        try {
            iArr2[pe.DUSTSTORM.ordinal()] = 1023;
        } catch (NoSuchFieldError unused298) {
        }
        try {
            iArr2[pe.D_TAIL.ordinal()] = 1050;
        } catch (NoSuchFieldError unused299) {
        }
        try {
            iArr2[pe.EARTHHIT.ordinal()] = 149;
        } catch (NoSuchFieldError unused300) {
        }
        try {
            iArr2[pe.EARTHSPIKE.ordinal()] = 81;
        } catch (NoSuchFieldError unused301) {
        }
        try {
            iArr2[pe.EARTHWALL.ordinal()] = 734;
        } catch (NoSuchFieldError unused302) {
        }
        try {
            iArr2[pe.EDP.ordinal()] = 495;
        } catch (NoSuchFieldError unused303) {
        }
        try {
            iArr2[pe.ELECTRIC.ordinal()] = 434;
        } catch (NoSuchFieldError unused304) {
        }
        try {
            iArr2[pe.ELECTRIC2.ordinal()] = 435;
        } catch (NoSuchFieldError unused305) {
        }
        try {
            iArr2[pe.ELECTRIC3.ordinal()] = 783;
        } catch (NoSuchFieldError unused306) {
        }
        try {
            iArr2[pe.ELECTRIC4.ordinal()] = 890;
        } catch (NoSuchFieldError unused307) {
        }
        try {
            iArr2[pe.EL_AQUAPLAY.ordinal()] = 951;
        } catch (NoSuchFieldError unused308) {
        }
        try {
            iArr2[pe.EL_BLAST.ordinal()] = 950;
        } catch (NoSuchFieldError unused309) {
        }
        try {
            iArr2[pe.EL_CHILLY_AIR.ordinal()] = 954;
        } catch (NoSuchFieldError unused310) {
        }
        try {
            iArr2[pe.EL_COOLER.ordinal()] = 956;
        } catch (NoSuchFieldError unused311) {
        }
        try {
            iArr2[pe.EL_CURSED_SOIL.ordinal()] = 955;
        } catch (NoSuchFieldError unused312) {
        }
        try {
            iArr2[pe.EL_GUST.ordinal()] = 949;
        } catch (NoSuchFieldError unused313) {
        }
        try {
            iArr2[pe.EL_HEATER.ordinal()] = 960;
        } catch (NoSuchFieldError unused314) {
        }
        try {
            iArr2[pe.EL_PETROLOGY.ordinal()] = 959;
        } catch (NoSuchFieldError unused315) {
        }
        try {
            iArr2[pe.EL_PYROTECHNIC.ordinal()] = 958;
        } catch (NoSuchFieldError unused316) {
        }
        try {
            iArr2[pe.EL_TROPIC.ordinal()] = 957;
        } catch (NoSuchFieldError unused317) {
        }
        try {
            iArr2[pe.EL_UPHEAVAL.ordinal()] = 952;
        } catch (NoSuchFieldError unused318) {
        }
        try {
            iArr2[pe.EL_WILD_STORM.ordinal()] = 953;
        } catch (NoSuchFieldError unused319) {
        }
        try {
            iArr2[pe.EMITTER.ordinal()] = 976;
        } catch (NoSuchFieldError unused320) {
        }
        try {
            iArr2[pe.ENCHANTPOISON.ordinal()] = 127;
        } catch (NoSuchFieldError unused321) {
        }
        try {
            iArr2[pe.ENDURE.ordinal()] = 13;
        } catch (NoSuchFieldError unused322) {
        }
        try {
            iArr2[pe.ENERGYCOAT.ordinal()] = 171;
        } catch (NoSuchFieldError unused323) {
        }
        try {
            iArr2[pe.ENERGYDRAIN.ordinal()] = 219;
        } catch (NoSuchFieldError unused324) {
        }
        try {
            iArr2[pe.ENERGYDRAIN2.ordinal()] = 380;
        } catch (NoSuchFieldError unused325) {
        }
        try {
            iArr2[pe.ENERGYDRAIN3.ordinal()] = 385;
        } catch (NoSuchFieldError unused326) {
        }
        try {
            iArr2[pe.ENERVATION.ordinal()] = 815;
        } catch (NoSuchFieldError unused327) {
        }
        try {
            iArr2[pe.ENERVATION2.ordinal()] = 816;
        } catch (NoSuchFieldError unused328) {
        }
        try {
            iArr2[pe.ENERVATION3.ordinal()] = 817;
        } catch (NoSuchFieldError unused329) {
        }
        try {
            iArr2[pe.ENERVATION4.ordinal()] = 818;
        } catch (NoSuchFieldError unused330) {
        }
        try {
            iArr2[pe.ENERVATION5.ordinal()] = 819;
        } catch (NoSuchFieldError unused331) {
        }
        try {
            iArr2[pe.ENERVATION6.ordinal()] = 820;
        } catch (NoSuchFieldError unused332) {
        }
        try {
            iArr2[pe.ENERVATION7.ordinal()] = 866;
        } catch (NoSuchFieldError unused333) {
        }
        try {
            iArr2[pe.ENHANCE.ordinal()] = 11;
        } catch (NoSuchFieldError unused334) {
        }
        try {
            iArr2[pe.ENTRY.ordinal()] = 8;
        } catch (NoSuchFieldError unused335) {
        }
        try {
            iArr2[pe.ENTRY2.ordinal()] = 346;
        } catch (NoSuchFieldError unused336) {
        }
        try {
            iArr2[pe.ERASER_CUTTER.ordinal()] = 962;
        } catch (NoSuchFieldError unused337) {
        }
        try {
            iArr2[pe.EVENT_CLOUD.ordinal()] = 1016;
        } catch (NoSuchFieldError unused338) {
        }
        try {
            iArr2[pe.EXIT.ordinal()] = 9;
        } catch (NoSuchFieldError unused339) {
        }
        try {
            iArr2[pe.EXIT2.ordinal()] = 316;
        } catch (NoSuchFieldError unused340) {
        }
        try {
            iArr2[pe.E_CHAIN.ordinal()] = 1057;
        } catch (NoSuchFieldError unused341) {
        }
        try {
            iArr2[pe.FALCONASSAULT.ordinal()] = 389;
        } catch (NoSuchFieldError unused342) {
        }
        try {
            iArr2[pe.FALLEN_ANGEL.ordinal()] = 1060;
        } catch (NoSuchFieldError unused343) {
        }
        try {
            iArr2[pe.FASTBLUEFALL.ordinal()] = 561;
        } catch (NoSuchFieldError unused344) {
        }
        try {
            iArr2[pe.FASTBLUEFALL_90.ordinal()] = 562;
        } catch (NoSuchFieldError unused345) {
        }
        try {
            iArr2[pe.FASTMOVE.ordinal()] = 245;
        } catch (NoSuchFieldError unused346) {
        }
        try {
            iArr2[pe.FIREARROW.ordinal()] = 33;
        } catch (NoSuchFieldError unused347) {
        }
        try {
            iArr2[pe.FIREBALL.ordinal()] = 26;
        } catch (NoSuchFieldError unused348) {
        }
        try {
            iArr2[pe.FIREBALL2.ordinal()] = 753;
        } catch (NoSuchFieldError unused349) {
        }
        try {
            iArr2[pe.FIREBALL3.ordinal()] = 808;
        } catch (NoSuchFieldError unused350) {
        }
        try {
            iArr2[pe.FIREBALL4.ordinal()] = 893;
        } catch (NoSuchFieldError unused351) {
        }
        try {
            iArr2[pe.FIREBALL5.ordinal()] = 915;
        } catch (NoSuchFieldError unused352) {
        }
        try {
            iArr2[pe.FIREBALL6.ordinal()] = 937;
        } catch (NoSuchFieldError unused353) {
        }
        try {
            iArr2[pe.FIREDANCE.ordinal()] = 1055;
        } catch (NoSuchFieldError unused354) {
        }
        try {
            iArr2[pe.FIREFLY.ordinal()] = 47;
        } catch (NoSuchFieldError unused355) {
        }
        try {
            iArr2[pe.FIREHIT.ordinal()] = 51;
        } catch (NoSuchFieldError unused356) {
        }
        try {
            iArr2[pe.FIREHIT2.ordinal()] = 605;
        } catch (NoSuchFieldError unused357) {
        }
        try {
            iArr2[pe.FIREIVY.ordinal()] = 120;
        } catch (NoSuchFieldError unused358) {
        }
        try {
            iArr2[pe.FIREPILLAR.ordinal()] = 98;
        } catch (NoSuchFieldError unused359) {
        }
        try {
            iArr2[pe.FIREPILLARBOMB.ordinal()] = 99;
        } catch (NoSuchFieldError unused360) {
        }
        try {
            iArr2[pe.FIREPILLARON.ordinal()] = 140;
        } catch (NoSuchFieldError unused361) {
        }
        try {
            iArr2[pe.FIREPILLARON2.ordinal()] = 720;
        } catch (NoSuchFieldError unused362) {
        }
        try {
            iArr2[pe.FIRESPLASHHIT.ordinal()] = 52;
        } catch (NoSuchFieldError unused363) {
        }
        try {
            iArr2[pe.FIRETHROW.ordinal()] = 789;
        } catch (NoSuchFieldError unused364) {
        }
        try {
            iArr2[pe.FIREWALL.ordinal()] = 27;
        } catch (NoSuchFieldError unused365) {
        }
        try {
            iArr2[pe.FIREWALL2.ordinal()] = 922;
        } catch (NoSuchFieldError unused366) {
        }
        try {
            iArr2[pe.FIRSTAID.ordinal()] = 311;
        } catch (NoSuchFieldError unused367) {
        }
        try {
            iArr2[pe.FLAMELAUNCHER.ordinal()] = 257;
        } catch (NoSuchFieldError unused368) {
        }
        try {
            iArr2[pe.FLARE_S.ordinal()] = 644;
        } catch (NoSuchFieldError unused369) {
        }
        try {
            iArr2[pe.FLASHER.ordinal()] = 101;
        } catch (NoSuchFieldError unused370) {
        }
        try {
            iArr2[pe.FLOWERCAST.ordinal()] = 490;
        } catch (NoSuchFieldError unused371) {
        }
        try {
            iArr2[pe.FLOWERCAST2.ordinal()] = 491;
        } catch (NoSuchFieldError unused372) {
        }
        try {
            iArr2[pe.FLOWERCAST3.ordinal()] = 492;
        } catch (NoSuchFieldError unused373) {
        }
        try {
            iArr2[pe.FLOWERLEAF.ordinal()] = 701;
        } catch (NoSuchFieldError unused374) {
        }
        try {
            iArr2[pe.FOOD01.ordinal()] = 595;
        } catch (NoSuchFieldError unused375) {
        }
        try {
            iArr2[pe.FOOD02.ordinal()] = 596;
        } catch (NoSuchFieldError unused376) {
        }
        try {
            iArr2[pe.FOOD03.ordinal()] = 597;
        } catch (NoSuchFieldError unused377) {
        }
        try {
            iArr2[pe.FOOD04.ordinal()] = 598;
        } catch (NoSuchFieldError unused378) {
        }
        try {
            iArr2[pe.FOOD05.ordinal()] = 599;
        } catch (NoSuchFieldError unused379) {
        }
        try {
            iArr2[pe.FOOD06.ordinal()] = 600;
        } catch (NoSuchFieldError unused380) {
        }
        try {
            iArr2[pe.FOOT.ordinal()] = 328;
        } catch (NoSuchFieldError unused381) {
        }
        try {
            iArr2[pe.FOOT2.ordinal()] = 329;
        } catch (NoSuchFieldError unused382) {
        }
        try {
            iArr2[pe.FOOT3.ordinal()] = 449;
        } catch (NoSuchFieldError unused383) {
        }
        try {
            iArr2[pe.FOOT4.ordinal()] = 450;
        } catch (NoSuchFieldError unused384) {
        }
        try {
            iArr2[pe.FORESTLIGHT.ordinal()] = 309;
        } catch (NoSuchFieldError unused385) {
        }
        try {
            iArr2[pe.FORESTLIGHT2.ordinal()] = 324;
        } catch (NoSuchFieldError unused386) {
        }
        try {
            iArr2[pe.FORESTLIGHT3.ordinal()] = 325;
        } catch (NoSuchFieldError unused387) {
        }
        try {
            iArr2[pe.FORESTLIGHT4.ordinal()] = 326;
        } catch (NoSuchFieldError unused388) {
        }
        try {
            iArr2[pe.FORESTLIGHT5.ordinal()] = 721;
        } catch (NoSuchFieldError unused389) {
        }
        try {
            iArr2[pe.FORESTLIGHT6.ordinal()] = 827;
        } catch (NoSuchFieldError unused390) {
        }
        try {
            iArr2[pe.FREEZE.ordinal()] = 135;
        } catch (NoSuchFieldError unused391) {
        }
        try {
            iArr2[pe.FREEZED.ordinal()] = 136;
        } catch (NoSuchFieldError unused392) {
        }
        try {
            iArr2[pe.FREEZING.ordinal()] = 110;
        } catch (NoSuchFieldError unused393) {
        }
        try {
            iArr2[pe.FREEZING_S.ordinal()] = 643;
        } catch (NoSuchFieldError unused394) {
        }
        try {
            iArr2[pe.FRESHSHRIMP.ordinal()] = 1052;
        } catch (NoSuchFieldError unused395) {
        }
        try {
            iArr2[pe.FROSTDIVER.ordinal()] = 29;
        } catch (NoSuchFieldError unused396) {
        }
        try {
            iArr2[pe.FROSTDIVER2.ordinal()] = 30;
        } catch (NoSuchFieldError unused397) {
        }
        try {
            iArr2[pe.FROSTDIVER3.ordinal()] = 803;
        } catch (NoSuchFieldError unused398) {
        }
        try {
            iArr2[pe.FROSTMISTY.ordinal()] = 791;
        } catch (NoSuchFieldError unused399) {
        }
        try {
            iArr2[pe.FROSTMYSTY.ordinal()] = 728;
        } catch (NoSuchFieldError unused400) {
        }
        try {
            iArr2[pe.FROSTWEAPON.ordinal()] = 258;
        } catch (NoSuchFieldError unused401) {
        }
        try {
            iArr2[pe.FVOICE.ordinal()] = 608;
        } catch (NoSuchFieldError unused402) {
        }
        try {
            iArr2[pe.GANBANTEIN.ordinal()] = 225;
        } catch (NoSuchFieldError unused403) {
        }
        try {
            iArr2[pe.GASPUSH.ordinal()] = 112;
        } catch (NoSuchFieldError unused404) {
        }
        try {
            iArr2[pe.GC_DARKCROW.ordinal()] = 1027;
        } catch (NoSuchFieldError unused405) {
        }
        try {
            iArr2[pe.GENSOU.ordinal()] = 1013;
        } catch (NoSuchFieldError unused406) {
        }
        try {
            iArr2[pe.GHOST.ordinal()] = 360;
        } catch (NoSuchFieldError unused407) {
        }
        try {
            iArr2[pe.GIANTBODY.ordinal()] = 424;
        } catch (NoSuchFieldError unused408) {
        }
        try {
            iArr2[pe.GIANTBODY2.ordinal()] = 425;
        } catch (NoSuchFieldError unused409) {
        }
        try {
            iArr2[pe.GI_EXPLOSION.ordinal()] = 516;
        } catch (NoSuchFieldError unused410) {
        }
        try {
            iArr2[pe.GLASSWALL.ordinal()] = 15;
        } catch (NoSuchFieldError unused411) {
        }
        try {
            iArr2[pe.GLASSWALL2.ordinal()] = 317;
        } catch (NoSuchFieldError unused412) {
        }
        try {
            iArr2[pe.GLASSWALL3.ordinal()] = 756;
        } catch (NoSuchFieldError unused413) {
        }
        try {
            iArr2[pe.GLASSWALL4.ordinal()] = 885;
        } catch (NoSuchFieldError unused414) {
        }
        try {
            iArr2[pe.GLORIA.ordinal()] = 77;
        } catch (NoSuchFieldError unused415) {
        }
        try {
            iArr2[pe.GLOW1.ordinal()] = 695;
        } catch (NoSuchFieldError unused416) {
        }
        try {
            iArr2[pe.GLOW11.ordinal()] = 703;
        } catch (NoSuchFieldError unused417) {
        }
        try {
            iArr2[pe.GLOW12.ordinal()] = 704;
        } catch (NoSuchFieldError unused418) {
        }
        try {
            iArr2[pe.GLOW2.ordinal()] = 696;
        } catch (NoSuchFieldError unused419) {
        }
        try {
            iArr2[pe.GLOW4.ordinal()] = 697;
        } catch (NoSuchFieldError unused420) {
        }
        try {
            iArr2[pe.GN_ILLUSIONDOPING.ordinal()] = 1035;
        } catch (NoSuchFieldError unused421) {
        }
        try {
            iArr2[pe.GRADIUS_LASER.ordinal()] = 886;
        } catch (NoSuchFieldError unused422) {
        }
        try {
            iArr2[pe.GRANDCROSS.ordinal()] = 228;
        } catch (NoSuchFieldError unused423) {
        }
        try {
            iArr2[pe.GRANDCROSS2.ordinal()] = 452;
        } catch (NoSuchFieldError unused424) {
        }
        try {
            iArr2[pe.GRAVITATION.ordinal()] = 524;
        } catch (NoSuchFieldError unused425) {
        }
        try {
            iArr2[pe.GRAYBODY.ordinal()] = 965;
        } catch (NoSuchFieldError unused426) {
        }
        try {
            iArr2[pe.GREEN99_3.ordinal()] = 680;
        } catch (NoSuchFieldError unused427) {
        }
        try {
            iArr2[pe.GREEN99_5.ordinal()] = 681;
        } catch (NoSuchFieldError unused428) {
        }
        try {
            iArr2[pe.GREEN99_6.ordinal()] = 682;
        } catch (NoSuchFieldError unused429) {
        }
        try {
            iArr2[pe.GREENBODY.ordinal()] = 540;
        } catch (NoSuchFieldError unused430) {
        }
        try {
            iArr2[pe.GREENCASTING.ordinal()] = 913;
        } catch (NoSuchFieldError unused431) {
        }
        try {
            iArr2[pe.GREEN_NUMBER.ordinal()] = 659;
        } catch (NoSuchFieldError unused432) {
        }
        try {
            iArr2[pe.GRIMTOOTH.ordinal()] = 125;
        } catch (NoSuchFieldError unused433) {
        }
        try {
            iArr2[pe.GRIMTOOTHATK.ordinal()] = 134;
        } catch (NoSuchFieldError unused434) {
        }
        try {
            iArr2[pe.GROUNDSAMPLE.ordinal()] = 515;
        } catch (NoSuchFieldError unused435) {
        }
        try {
            iArr2[pe.GROUNDSHAKE.ordinal()] = 896;
        } catch (NoSuchFieldError unused436) {
        }
        try {
            iArr2[pe.GROUNDSHAKE2.ordinal()] = 907;
        } catch (NoSuchFieldError unused437) {
        }
        try {
            iArr2[pe.GROUND_EXPLOSION.ordinal()] = 992;
        } catch (NoSuchFieldError unused438) {
        }
        try {
            iArr2[pe.GTHUNDER.ordinal()] = 798;
        } catch (NoSuchFieldError unused439) {
        }
        try {
            iArr2[pe.GUARD.ordinal()] = 338;
        } catch (NoSuchFieldError unused440) {
        }
        try {
            iArr2[pe.GUARD2.ordinal()] = 498;
        } catch (NoSuchFieldError unused441) {
        }
        try {
            iArr2[pe.GUARD3.ordinal()] = 677;
        } catch (NoSuchFieldError unused442) {
        }
        try {
            iArr2[pe.GUARD4.ordinal()] = 784;
        } catch (NoSuchFieldError unused443) {
        }
        try {
            iArr2[pe.GUIDEDATTACK.ordinal()] = 193;
        } catch (NoSuchFieldError unused444) {
        }
        try {
            iArr2[pe.GUMGANG.ordinal()] = 205;
        } catch (NoSuchFieldError unused445) {
        }
        try {
            iArr2[pe.GUMGANG2.ordinal()] = 263;
        } catch (NoSuchFieldError unused446) {
        }
        try {
            iArr2[pe.GUMGANG3.ordinal()] = 265;
        } catch (NoSuchFieldError unused447) {
        }
        try {
            iArr2[pe.GUMGANG4.ordinal()] = 775;
        } catch (NoSuchFieldError unused448) {
        }
        try {
            iArr2[pe.GUMGANG5.ordinal()] = 888;
        } catch (NoSuchFieldError unused449) {
        }
        try {
            iArr2[pe.GUMGANG6.ordinal()] = 936;
        } catch (NoSuchFieldError unused450) {
        }
        try {
            iArr2[pe.GUMGANG7.ordinal()] = 938;
        } catch (NoSuchFieldError unused451) {
        }
        try {
            iArr2[pe.GUMGANG8.ordinal()] = 939;
        } catch (NoSuchFieldError unused452) {
        }
        try {
            iArr2[pe.GUMGANG9.ordinal()] = 940;
        } catch (NoSuchFieldError unused453) {
        }
        try {
            iArr2[pe.GUMGANGNPC.ordinal()] = 457;
        } catch (NoSuchFieldError unused454) {
        }
        try {
            iArr2[pe.HALFSPHERE.ordinal()] = 438;
        } catch (NoSuchFieldError unused455) {
        }
        try {
            iArr2[pe.HALLUTIME.ordinal()] = 795;
        } catch (NoSuchFieldError unused456) {
        }
        try {
            iArr2[pe.HAMIBLOOD.ordinal()] = 573;
        } catch (NoSuchFieldError unused457) {
        }
        try {
            iArr2[pe.HAMICASTLE.ordinal()] = 572;
        } catch (NoSuchFieldError unused458) {
        }
        try {
            iArr2[pe.HAMIDEFENCE.ordinal()] = 571;
        } catch (NoSuchFieldError unused459) {
        }
        try {
            iArr2[pe.HAMMER_OF_GOD.ordinal()] = 1047;
        } catch (NoSuchFieldError unused460) {
        }
        try {
            iArr2[pe.HAPGYEOK.ordinal()] = 614;
        } catch (NoSuchFieldError unused461) {
        }
        try {
            iArr2[pe.HASTEUP.ordinal()] = 100;
        } catch (NoSuchFieldError unused462) {
        }
        try {
            iArr2[pe.HATED.ordinal()] = 545;
        } catch (NoSuchFieldError unused463) {
        }
        try {
            iArr2[pe.HATED2.ordinal()] = 574;
        } catch (NoSuchFieldError unused464) {
        }
        try {
            iArr2[pe.HAT_EFFECT.ordinal()] = 1014;
        } catch (NoSuchFieldError unused465) {
        }
        try {
            iArr2[pe.HEAL.ordinal()] = 314;
        } catch (NoSuchFieldError unused466) {
        }
        try {
            iArr2[pe.HEAL2.ordinal()] = 315;
        } catch (NoSuchFieldError unused467) {
        }
        try {
            iArr2[pe.HEAL3.ordinal()] = 322;
        } catch (NoSuchFieldError unused468) {
        }
        try {
            iArr2[pe.HEAL4.ordinal()] = 327;
        } catch (NoSuchFieldError unused469) {
        }
        try {
            iArr2[pe.HEALSP.ordinal()] = 16;
        } catch (NoSuchFieldError unused470) {
        }
        try {
            iArr2[pe.HEAL_N.ordinal()] = 834;
        } catch (NoSuchFieldError unused471) {
        }
        try {
            iArr2[pe.HEAL_N2.ordinal()] = 945;
        } catch (NoSuchFieldError unused472) {
        }
        try {
            iArr2[pe.HEARTASURA.ordinal()] = 881;
        } catch (NoSuchFieldError unused473) {
        }
        try {
            iArr2[pe.HEARTCASTING.ordinal()] = 345;
        } catch (NoSuchFieldError unused474) {
        }
        try {
            iArr2[pe.HEAT_BARREL.ordinal()] = 1058;
        } catch (NoSuchFieldError unused475) {
        }
        try {
            iArr2[pe.HEAVENSDRIVE.ordinal()] = 144;
        } catch (NoSuchFieldError unused476) {
        }
        try {
            iArr2[pe.HELLSPLANT.ordinal()] = 921;
        } catch (NoSuchFieldError unused477) {
        }
        try {
            iArr2[pe.HELL_STR.ordinal()] = 730;
        } catch (NoSuchFieldError unused478) {
        }
        try {
            iArr2[pe.HFLIMOON1.ordinal()] = 567;
        } catch (NoSuchFieldError unused479) {
        }
        try {
            iArr2[pe.HFLIMOON2.ordinal()] = 568;
        } catch (NoSuchFieldError unused480) {
        }
        try {
            iArr2[pe.HFLIMOON3.ordinal()] = 569;
        } catch (NoSuchFieldError unused481) {
        }
        try {
            iArr2[pe.HIDING.ordinal()] = 21;
        } catch (NoSuchFieldError unused482) {
        }
        try {
            iArr2[pe.HIT1.ordinal()] = 2;
        } catch (NoSuchFieldError unused483) {
        }
        try {
            iArr2[pe.HIT2.ordinal()] = 3;
        } catch (NoSuchFieldError unused484) {
        }
        try {
            iArr2[pe.HIT3.ordinal()] = 4;
        } catch (NoSuchFieldError unused485) {
        }
        try {
            iArr2[pe.HIT4.ordinal()] = 5;
        } catch (NoSuchFieldError unused486) {
        }
        try {
            iArr2[pe.HIT5.ordinal()] = 6;
        } catch (NoSuchFieldError unused487) {
        }
        try {
            iArr2[pe.HIT6.ordinal()] = 7;
        } catch (NoSuchFieldError unused488) {
        }
        try {
            iArr2[pe.HITBODY.ordinal()] = 419;
        } catch (NoSuchFieldError unused489) {
        }
        try {
            iArr2[pe.HITDARK.ordinal()] = 182;
        } catch (NoSuchFieldError unused490) {
        }
        try {
            iArr2[pe.HITLINE.ordinal()] = 332;
        } catch (NoSuchFieldError unused491) {
        }
        try {
            iArr2[pe.HITLINE2.ordinal()] = 378;
        } catch (NoSuchFieldError unused492) {
        }
        try {
            iArr2[pe.HITLINE3.ordinal()] = 430;
        } catch (NoSuchFieldError unused493) {
        }
        try {
            iArr2[pe.HITLINE4.ordinal()] = 431;
        } catch (NoSuchFieldError unused494) {
        }
        try {
            iArr2[pe.HITLINE5.ordinal()] = 432;
        } catch (NoSuchFieldError unused495) {
        }
        try {
            iArr2[pe.HITLINE6.ordinal()] = 433;
        } catch (NoSuchFieldError unused496) {
        }
        try {
            iArr2[pe.HITLINE7.ordinal()] = 436;
        } catch (NoSuchFieldError unused497) {
        }
        try {
            iArr2[pe.HITLINE8.ordinal()] = 889;
        } catch (NoSuchFieldError unused498) {
        }
        try {
            iArr2[pe.HITTEXTURE.ordinal()] = 556;
        } catch (NoSuchFieldError unused499) {
        }
        try {
            iArr2[pe.HOLYCROSS.ordinal()] = 247;
        } catch (NoSuchFieldError unused500) {
        }
        try {
            iArr2[pe.HOLYHIT.ordinal()] = 154;
        } catch (NoSuchFieldError unused501) {
        }
        try {
            iArr2[pe.HOMUNCASTING.ordinal()] = 566;
        } catch (NoSuchFieldError unused502) {
        }
        try {
            iArr2[pe.HO_UP.ordinal()] = 570;
        } catch (NoSuchFieldError unused503) {
        }
        try {
            iArr2[pe.HPTIME.ordinal()] = 333;
        } catch (NoSuchFieldError unused504) {
        }
        try {
            iArr2[pe.HYOUSENSOU.ordinal()] = 621;
        } catch (NoSuchFieldError unused505) {
        }
        try {
            iArr2[pe.HYOUSYOURAKU.ordinal()] = 638;
        } catch (NoSuchFieldError unused506) {
        }
        try {
            iArr2[pe.H_MINE.ordinal()] = 1059;
        } catch (NoSuchFieldError unused507) {
        }
        try {
            iArr2[pe.ICEARROW.ordinal()] = 28;
        } catch (NoSuchFieldError unused508) {
        }
        try {
            iArr2[pe.ICECRASH.ordinal()] = 137;
        } catch (NoSuchFieldError unused509) {
        }
        try {
            iArr2[pe.ICEWALL.ordinal()] = 76;
        } catch (NoSuchFieldError unused510) {
        }
        try {
            iArr2[pe.IGN_STR.ordinal()] = 724;
        } catch (NoSuchFieldError unused511) {
        }
        try {
            iArr2[pe.IMPOSITIO.ordinal()] = 86;
        } catch (NoSuchFieldError unused512) {
        }
        try {
            iArr2[pe.INCAGIDEX.ordinal()] = 45;
        } catch (NoSuchFieldError unused513) {
        }
        try {
            iArr2[pe.INCAGILITY.ordinal()] = 39;
        } catch (NoSuchFieldError unused514) {
        }
        try {
            iArr2[pe.INFRAREDSCAN.ordinal()] = 796;
        } catch (NoSuchFieldError unused515) {
        }
        try {
            iArr2[pe.INTIMIDATE.ordinal()] = 229;
        } catch (NoSuchFieldError unused516) {
        }
        try {
            iArr2[pe.INTIMIDATE2.ordinal()] = 800;
        } catch (NoSuchFieldError unused517) {
        }
        try {
            iArr2[pe.INTIMIDATE3.ordinal()] = 809;
        } catch (NoSuchFieldError unused518) {
        }
        try {
            iArr2[pe.INTIMIDATE4.ordinal()] = 812;
        } catch (NoSuchFieldError unused519) {
        }
        try {
            iArr2[pe.INVENOM.ordinal()] = 67;
        } catch (NoSuchFieldError unused520) {
        }
        try {
            iArr2[pe.INVINCIBLEOFF2.ordinal()] = 1025;
        } catch (NoSuchFieldError unused521) {
        }
        try {
            iArr2[pe.ISSEN.ordinal()] = 635;
        } catch (NoSuchFieldError unused522) {
        }
        try {
            iArr2[pe.ITEM315.ordinal()] = 706;
        } catch (NoSuchFieldError unused523) {
        }
        try {
            iArr2[pe.ITEM316.ordinal()] = 707;
        } catch (NoSuchFieldError unused524) {
        }
        try {
            iArr2[pe.ITEM317.ordinal()] = 708;
        } catch (NoSuchFieldError unused525) {
        }
        try {
            iArr2[pe.ITEM318.ordinal()] = 709;
        } catch (NoSuchFieldError unused526) {
        }
        try {
            iArr2[pe.ITEMFAST.ordinal()] = 521;
        } catch (NoSuchFieldError unused527) {
        }
        try {
            iArr2[pe.ITEMPOKJUK.ordinal()] = 510;
        } catch (NoSuchFieldError unused528) {
        }
        try {
            iArr2[pe.ITEM_CLOUD.ordinal()] = 579;
        } catch (NoSuchFieldError unused529) {
        }
        try {
            iArr2[pe.ITEM_CURSE.ordinal()] = 580;
        } catch (NoSuchFieldError unused530) {
        }
        try {
            iArr2[pe.ITEM_LIGHT.ordinal()] = 583;
        } catch (NoSuchFieldError unused531) {
        }
        try {
            iArr2[pe.ITEM_RAIN.ordinal()] = 582;
        } catch (NoSuchFieldError unused532) {
        }
        try {
            iArr2[pe.ITEM_THUNDER.ordinal()] = 578;
        } catch (NoSuchFieldError unused533) {
        }
        try {
            iArr2[pe.ITEM_ZZZ.ordinal()] = 581;
        } catch (NoSuchFieldError unused534) {
        }
        try {
            iArr2[pe.JOBCHANGE.ordinal()] = 158;
        } catch (NoSuchFieldError unused535) {
        }
        try {
            iArr2[pe.JOBLVUP.ordinal()] = 160;
        } catch (NoSuchFieldError unused536) {
        }
        try {
            iArr2[pe.JOBLVUP50.ordinal()] = 339;
        } catch (NoSuchFieldError unused537) {
        }
        try {
            iArr2[pe.JOBLVUP50_2.ordinal()] = 836;
        } catch (NoSuchFieldError unused538) {
        }
        try {
            iArr2[pe.JUMPBODY.ordinal()] = 447;
        } catch (NoSuchFieldError unused539) {
        }
        try {
            iArr2[pe.JUMPKICK.ordinal()] = 459;
        } catch (NoSuchFieldError unused540) {
        }
        try {
            iArr2[pe.KAAHI.ordinal()] = 593;
        } catch (NoSuchFieldError unused541) {
        }
        try {
            iArr2[pe.KAEN.ordinal()] = 636;
        } catch (NoSuchFieldError unused542) {
        }
        try {
            iArr2[pe.KAGEMUSYA.ordinal()] = 1006;
        } catch (NoSuchFieldError unused543) {
        }
        try {
            iArr2[pe.KAIHOU.ordinal()] = 991;
        } catch (NoSuchFieldError unused544) {
        }
        try {
            iArr2[pe.KAIHOU1.ordinal()] = 1010;
        } catch (NoSuchFieldError unused545) {
        }
        try {
            iArr2[pe.KAIZEL.ordinal()] = 592;
        } catch (NoSuchFieldError unused546) {
        }
        try {
            iArr2[pe.KASUMIKIRI.ordinal()] = 634;
        } catch (NoSuchFieldError unused547) {
        }
        try {
            iArr2[pe.KEEPING.ordinal()] = 216;
        } catch (NoSuchFieldError unused548) {
        }
        try {
            iArr2[pe.KG_KAGEHUMI.ordinal()] = 993;
        } catch (NoSuchFieldError unused549) {
        }
        try {
            iArr2[pe.KG_KYOMU.ordinal()] = 1003;
        } catch (NoSuchFieldError unused550) {
        }
        try {
            iArr2[pe.KICKEDBODY.ordinal()] = 417;
        } catch (NoSuchFieldError unused551) {
        }
        try {
            iArr2[pe.KIRIKAGE.ordinal()] = 632;
        } catch (NoSuchFieldError unused552) {
        }
        try {
            iArr2[pe.KOUENKA.ordinal()] = 620;
        } catch (NoSuchFieldError unused553) {
        }
        try {
            iArr2[pe.KO_HUUMARANKA.ordinal()] = 1004;
        } catch (NoSuchFieldError unused554) {
        }
        try {
            iArr2[pe.KO_IZAYOI.ordinal()] = 1001;
        } catch (NoSuchFieldError unused555) {
        }
        try {
            iArr2[pe.KO_JYUMONJIKIRI.ordinal()] = 998;
        } catch (NoSuchFieldError unused556) {
        }
        try {
            iArr2[pe.KO_MAKIBISHI.ordinal()] = 1009;
        } catch (NoSuchFieldError unused557) {
        }
        try {
            iArr2[pe.KO_SETSUDAN.ordinal()] = 999;
        } catch (NoSuchFieldError unused558) {
        }
        try {
            iArr2[pe.KO_ZENKAI_FIRE.ordinal()] = 996;
        } catch (NoSuchFieldError unused559) {
        }
        try {
            iArr2[pe.KO_ZENKAI_LAND.ordinal()] = 995;
        } catch (NoSuchFieldError unused560) {
        }
        try {
            iArr2[pe.KO_ZENKAI_WATER.ordinal()] = 994;
        } catch (NoSuchFieldError unused561) {
        }
        try {
            iArr2[pe.KO_ZENKAI_WIND.ordinal()] = 997;
        } catch (NoSuchFieldError unused562) {
        }
        try {
            iArr2[pe.KYRIE.ordinal()] = 114;
        } catch (NoSuchFieldError unused563) {
        }
        try {
            iArr2[pe.LAMADAN.ordinal()] = 494;
        } catch (NoSuchFieldError unused564) {
        }
        try {
            iArr2[pe.LANDBODY.ordinal()] = 448;
        } catch (NoSuchFieldError unused565) {
        }
        try {
            iArr2[pe.LANDPROTECTOR.ordinal()] = 240;
        } catch (NoSuchFieldError unused566) {
        }
        try {
            iArr2[pe.LAUAGNUS_STR.ordinal()] = 750;
        } catch (NoSuchFieldError unused567) {
        }
        try {
            iArr2[pe.LAULAMUS_STR.ordinal()] = 749;
        } catch (NoSuchFieldError unused568) {
        }
        try {
            iArr2[pe.LAVA_SLIDE.ordinal()] = 966;
        } catch (NoSuchFieldError unused569) {
        }
        try {
            iArr2[pe.LEVEL150.ordinal()] = 980;
        } catch (NoSuchFieldError unused570) {
        }
        try {
            iArr2[pe.LEVEL150_SUB.ordinal()] = 981;
        } catch (NoSuchFieldError unused571) {
        }
        try {
            iArr2[pe.LEVEL99.ordinal()] = 202;
        } catch (NoSuchFieldError unused572) {
        }
        try {
            iArr2[pe.LEVEL99_150.ordinal()] = 883;
        } catch (NoSuchFieldError unused573) {
        }
        try {
            iArr2[pe.LEVEL99_2.ordinal()] = 203;
        } catch (NoSuchFieldError unused574) {
        }
        try {
            iArr2[pe.LEVEL99_3.ordinal()] = 204;
        } catch (NoSuchFieldError unused575) {
        }
        try {
            iArr2[pe.LEVEL99_4.ordinal()] = 364;
        } catch (NoSuchFieldError unused576) {
        }
        try {
            iArr2[pe.LEVEL99_5.ordinal()] = 399;
        } catch (NoSuchFieldError unused577) {
        }
        try {
            iArr2[pe.LEVEL99_6.ordinal()] = 400;
        } catch (NoSuchFieldError unused578) {
        }
        try {
            iArr2[pe.LEVEL99_ORB1.ordinal()] = 978;
        } catch (NoSuchFieldError unused579) {
        }
        try {
            iArr2[pe.LEVEL99_ORB2.ordinal()] = 979;
        } catch (NoSuchFieldError unused580) {
        }
        try {
            iArr2[pe.LEXAETERNA.ordinal()] = 87;
        } catch (NoSuchFieldError unused581) {
        }
        try {
            iArr2[pe.LEXDIVINA.ordinal()] = 89;
        } catch (NoSuchFieldError unused582) {
        }
        try {
            iArr2[pe.LG_KINGS_GRACE.ordinal()] = 1037;
        } catch (NoSuchFieldError unused583) {
        }
        try {
            iArr2[pe.LIGHTBLADE.ordinal()] = 384;
        } catch (NoSuchFieldError unused584) {
        }
        try {
            iArr2[pe.LIGHTBOLT.ordinal()] = 31;
        } catch (NoSuchFieldError unused585) {
        }
        try {
            iArr2[pe.LIGHTNINGLOADER.ordinal()] = 259;
        } catch (NoSuchFieldError unused586) {
        }
        try {
            iArr2[pe.LIGHTNING_S.ordinal()] = 640;
        } catch (NoSuchFieldError unused587) {
        }
        try {
            iArr2[pe.LIGHTSPHERE.ordinal()] = 350;
        } catch (NoSuchFieldError unused588) {
        }
        try {
            iArr2[pe.LIGHTSPHERE2.ordinal()] = 383;
        } catch (NoSuchFieldError unused589) {
        }
        try {
            iArr2[pe.LINELINK.ordinal()] = 234;
        } catch (NoSuchFieldError unused590) {
        }
        try {
            iArr2[pe.LINELINK2.ordinal()] = 386;
        } catch (NoSuchFieldError unused591) {
        }
        try {
            iArr2[pe.LINELINK3.ordinal()] = 397;
        } catch (NoSuchFieldError unused592) {
        }
        try {
            iArr2[pe.LINELINK4.ordinal()] = 821;
        } catch (NoSuchFieldError unused593) {
        }
        try {
            iArr2[pe.LINKLIGHT.ordinal()] = 387;
        } catch (NoSuchFieldError unused594) {
        }
        try {
            iArr2[pe.LINKPARTICLE.ordinal()] = 851;
        } catch (NoSuchFieldError unused595) {
        }
        try {
            iArr2[pe.LINKPARTICLE2.ordinal()] = 933;
        } catch (NoSuchFieldError unused596) {
        }
        try {
            iArr2[pe.LKCONCENTRATION.ordinal()] = 371;
        } catch (NoSuchFieldError unused597) {
        }
        try {
            iArr2[pe.LOCKON.ordinal()] = 62;
        } catch (NoSuchFieldError unused598) {
        }
        try {
            iArr2[pe.LORD.ordinal()] = 92;
        } catch (NoSuchFieldError unused599) {
        }
        try {
            iArr2[pe.LOUD.ordinal()] = 313;
        } catch (NoSuchFieldError unused600) {
        }
        try {
            iArr2[pe.LVUP.ordinal()] = 159;
        } catch (NoSuchFieldError unused601) {
        }
        try {
            iArr2[pe.M01.ordinal()] = 585;
        } catch (NoSuchFieldError unused602) {
        }
        try {
            iArr2[pe.M02.ordinal()] = 586;
        } catch (NoSuchFieldError unused603) {
        }
        try {
            iArr2[pe.M03.ordinal()] = 587;
        } catch (NoSuchFieldError unused604) {
        }
        try {
            iArr2[pe.M04.ordinal()] = 588;
        } catch (NoSuchFieldError unused605) {
        }
        try {
            iArr2[pe.M05.ordinal()] = 589;
        } catch (NoSuchFieldError unused606) {
        }
        try {
            iArr2[pe.M06.ordinal()] = 590;
        } catch (NoSuchFieldError unused607) {
        }
        try {
            iArr2[pe.M07.ordinal()] = 591;
        } catch (NoSuchFieldError unused608) {
        }
        try {
            iArr2[pe.MACRO.ordinal()] = 970;
        } catch (NoSuchFieldError unused609) {
        }
        try {
            iArr2[pe.MADNESS_BLUE.ordinal()] = 627;
        } catch (NoSuchFieldError unused610) {
        }
        try {
            iArr2[pe.MADNESS_RED.ordinal()] = 628;
        } catch (NoSuchFieldError unused611) {
        }
        try {
            iArr2[pe.MAGENTA_TRAP.ordinal()] = 741;
        } catch (NoSuchFieldError unused612) {
        }
        try {
            iArr2[pe.MAGICALATTHIT.ordinal()] = 184;
        } catch (NoSuchFieldError unused613) {
        }
        try {
            iArr2[pe.MAGICALBULLET.ordinal()] = 646;
        } catch (NoSuchFieldError unused614) {
        }
        try {
            iArr2[pe.MAGICCRASHER.ordinal()] = 382;
        } catch (NoSuchFieldError unused615) {
        }
        try {
            iArr2[pe.MAGICCRASHER2.ordinal()] = 405;
        } catch (NoSuchFieldError unused616) {
        }
        try {
            iArr2[pe.MAGICROD.ordinal()] = 246;
        } catch (NoSuchFieldError unused617) {
        }
        try {
            iArr2[pe.MAGMA_FLOW.ordinal()] = 964;
        } catch (NoSuchFieldError unused618) {
        }
        try {
            iArr2[pe.MAGNIFICAT.ordinal()] = 78;
        } catch (NoSuchFieldError unused619) {
        }
        try {
            iArr2[pe.MAGNUM2.ordinal()] = 341;
        } catch (NoSuchFieldError unused620) {
        }
        try {
            iArr2[pe.MAGNUMBREAK.ordinal()] = 19;
        } catch (NoSuchFieldError unused621) {
        }
        try {
            iArr2[pe.MAGNUS.ordinal()] = 115;
        } catch (NoSuchFieldError unused622) {
        }
        try {
            iArr2[pe.MAIZE_TRAP.ordinal()] = 743;
        } catch (NoSuchFieldError unused623) {
        }
        try {
            iArr2[pe.MAKEBLUR.ordinal()] = 168;
        } catch (NoSuchFieldError unused624) {
        }
        try {
            iArr2[pe.MAKEFEINT.ordinal()] = 826;
        } catch (NoSuchFieldError unused625) {
        }
        try {
            iArr2[pe.MAKEHALLU.ordinal()] = 794;
        } catch (NoSuchFieldError unused626) {
        }
        try {
            iArr2[pe.MAKEHALLU2.ordinal()] = 927;
        } catch (NoSuchFieldError unused627) {
        }
        try {
            iArr2[pe.MANHOLE.ordinal()] = 825;
        } catch (NoSuchFieldError unused628) {
        }
        try {
            iArr2[pe.MAPAE.ordinal()] = 509;
        } catch (NoSuchFieldError unused629) {
        }
        try {
            iArr2[pe.MAPLE.ordinal()] = 335;
        } catch (NoSuchFieldError unused630) {
        }
        try {
            iArr2[pe.MAPPILLAR.ordinal()] = 233;
        } catch (NoSuchFieldError unused631) {
        }
        try {
            iArr2[pe.MAPPILLAR2.ordinal()] = 249;
        } catch (NoSuchFieldError unused632) {
        }
        try {
            iArr2[pe.MAPPILLAR3.ordinal()] = 261;
        } catch (NoSuchFieldError unused633) {
        }
        try {
            iArr2[pe.MAPPILLAR4.ordinal()] = 262;
        } catch (NoSuchFieldError unused634) {
        }
        try {
            iArr2[pe.MAPSPHERE.ordinal()] = 683;
        } catch (NoSuchFieldError unused635) {
        }
        try {
            iArr2[pe.MAPSPHERE2.ordinal()] = 702;
        } catch (NoSuchFieldError unused636) {
        }
        try {
            iArr2[pe.MAP_GHOST.ordinal()] = 694;
        } catch (NoSuchFieldError unused637) {
        }
        try {
            iArr2[pe.MAP_GREENLIGHT.ordinal()] = 712;
        } catch (NoSuchFieldError unused638) {
        }
        try {
            iArr2[pe.MAP_GREENLIGHT2.ordinal()] = 714;
        } catch (NoSuchFieldError unused639) {
        }
        try {
            iArr2[pe.MAP_MAGICWALL.ordinal()] = 713;
        } catch (NoSuchFieldError unused640) {
        }
        try {
            iArr2[pe.MAP_MAGICZONE.ordinal()] = 652;
        } catch (NoSuchFieldError unused641) {
        }
        try {
            iArr2[pe.MAP_MAGICZONE2.ordinal()] = 653;
        } catch (NoSuchFieldError unused642) {
        }
        try {
            iArr2[pe.MAP_MAGICZONE3.ordinal()] = 689;
        } catch (NoSuchFieldError unused643) {
        }
        try {
            iArr2[pe.MAP_MAGICZONE4.ordinal()] = 690;
        } catch (NoSuchFieldError unused644) {
        }
        try {
            iArr2[pe.MAXPOWER.ordinal()] = 106;
        } catch (NoSuchFieldError unused645) {
        }
        try {
            iArr2[pe.MELTDOWN.ordinal()] = 392;
        } catch (NoSuchFieldError unused646) {
        }
        try {
            iArr2[pe.MEMORIZE.ordinal()] = 507;
        } catch (NoSuchFieldError unused647) {
        }
        try {
            iArr2[pe.MENTALBREAK.ordinal()] = 183;
        } catch (NoSuchFieldError unused648) {
        }
        try {
            iArr2[pe.METEORSTORM.ordinal()] = 94;
        } catch (NoSuchFieldError unused649) {
        }
        try {
            iArr2[pe.MIDNIGHT_FRENZY.ordinal()] = 969;
        } catch (NoSuchFieldError unused650) {
        }
        try {
            iArr2[pe.MILSHIELD_STR.ordinal()] = 751;
        } catch (NoSuchFieldError unused651) {
        }
        try {
            iArr2[pe.MINI_TETRIS.ordinal()] = 359;
        } catch (NoSuchFieldError unused652) {
        }
        try {
            iArr2[pe.MIRESULT_MAKE_FAIL.ordinal()] = 1020;
        } catch (NoSuchFieldError unused653) {
        }
        try {
            iArr2[pe.MIRESULT_MAKE_OK.ordinal()] = 1019;
        } catch (NoSuchFieldError unused654) {
        }
        try {
            iArr2[pe.MOCHI.ordinal()] = 493;
        } catch (NoSuchFieldError unused655) {
        }
        try {
            iArr2[pe.MVP.ordinal()] = 70;
        } catch (NoSuchFieldError unused656) {
        }
        try {
            iArr2[pe.NAPALMBEAT.ordinal()] = 34;
        } catch (NoSuchFieldError unused657) {
        }
        try {
            iArr2[pe.NAPALMVALCAN.ordinal()] = 403;
        } catch (NoSuchFieldError unused658) {
        }
        try {
            iArr2[pe.NC_ANAL.ordinal()] = 788;
        } catch (NoSuchFieldError unused659) {
        }
        try {
            iArr2[pe.NC_MAGMA_ERUPTION.ordinal()] = 1036;
        } catch (NoSuchFieldError unused660) {
        }
        try {
            iArr2[pe.NIGHT.ordinal()] = 513;
        } catch (NoSuchFieldError unused661) {
        }
        try {
            iArr2[pe.NO100_FIRECRACKER.ordinal()] = 1008;
        } catch (NoSuchFieldError unused662) {
        }
        try {
            iArr2[pe.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused663) {
        }
        try {
            iArr2[pe.NORMAL_TRAP.ordinal()] = 745;
        } catch (NoSuchFieldError unused664) {
        }
        try {
            iArr2[pe.NPC_BURNT.ordinal()] = 1040;
        } catch (NoSuchFieldError unused665) {
        }
        try {
            iArr2[pe.NPC_CHILL.ordinal()] = 1041;
        } catch (NoSuchFieldError unused666) {
        }
        try {
            iArr2[pe.NPC_EARTHQUAKE.ordinal()] = 668;
        } catch (NoSuchFieldError unused667) {
        }
        try {
            iArr2[pe.NPC_SLOWCAST.ordinal()] = 678;
        } catch (NoSuchFieldError unused668) {
        }
        try {
            iArr2[pe.NPC_STOP.ordinal()] = 455;
        } catch (NoSuchFieldError unused669) {
        }
        try {
            iArr2[pe.NPC_STOP2.ordinal()] = 606;
        } catch (NoSuchFieldError unused670) {
        }
        try {
            iArr2[pe.NPC_STOP2_DEL.ordinal()] = 607;
        } catch (NoSuchFieldError unused671) {
        }
        try {
            iArr2[pe.NPC_WIDEWEB.ordinal()] = 1039;
        } catch (NoSuchFieldError unused672) {
        }
        try {
            iArr2[pe.OB_GENSOU.ordinal()] = 1007;
        } catch (NoSuchFieldError unused673) {
        }
        try {
            iArr2[pe.ORATIO.ordinal()] = 757;
        } catch (NoSuchFieldError unused674) {
        }
        try {
            iArr2[pe.OVERTHRUST.ordinal()] = 130;
        } catch (NoSuchFieldError unused675) {
        }
        try {
            iArr2[pe.PARTY.ordinal()] = 162;
        } catch (NoSuchFieldError unused676) {
        }
        try {
            iArr2[pe.PATTACK.ordinal()] = 22;
        } catch (NoSuchFieldError unused677) {
        }
        try {
            iArr2[pe.PEONG.ordinal()] = 413;
        } catch (NoSuchFieldError unused678) {
        }
        try {
            iArr2[pe.PERFECTION.ordinal()] = 105;
        } catch (NoSuchFieldError unused679) {
        }
        try {
            iArr2[pe.PETRIFYATTACK.ordinal()] = 197;
        } catch (NoSuchFieldError unused680) {
        }
        try {
            iArr2[pe.PHARMACY_FAIL.ordinal()] = 308;
        } catch (NoSuchFieldError unused681) {
        }
        try {
            iArr2[pe.PHARMACY_OK.ordinal()] = 307;
        } catch (NoSuchFieldError unused682) {
        }
        try {
            iArr2[pe.PIERCE.ordinal()] = 83;
        } catch (NoSuchFieldError unused683) {
        }
        try {
            iArr2[pe.PIERCEBODY.ordinal()] = 504;
        } catch (NoSuchFieldError unused684) {
        }
        try {
            iArr2[pe.PIERCESELF.ordinal()] = 150;
        } catch (NoSuchFieldError unused685) {
        }
        try {
            iArr2[pe.PINKBODY.ordinal()] = 398;
        } catch (NoSuchFieldError unused686) {
        }
        try {
            iArr2[pe.PINK_NUMBER.ordinal()] = 666;
        } catch (NoSuchFieldError unused687) {
        }
        try {
            iArr2[pe.PNEUMA.ordinal()] = 143;
        } catch (NoSuchFieldError unused688) {
        }
        try {
            iArr2[pe.PNG_TEST.ordinal()] = 904;
        } catch (NoSuchFieldError unused689) {
        }
        try {
            iArr2[pe.POISON.ordinal()] = 337;
        } catch (NoSuchFieldError unused690) {
        }
        try {
            iArr2[pe.POISONATTACK.ordinal()] = 194;
        } catch (NoSuchFieldError unused691) {
        }
        try {
            iArr2[pe.POISONHIT.ordinal()] = 55;
        } catch (NoSuchFieldError unused692) {
        }
        try {
            iArr2[pe.POISONREACT.ordinal()] = 128;
        } catch (NoSuchFieldError unused693) {
        }
        try {
            iArr2[pe.POISONREACT2.ordinal()] = 129;
        } catch (NoSuchFieldError unused694) {
        }
        try {
            iArr2[pe.POISONSMOKE.ordinal()] = 774;
        } catch (NoSuchFieldError unused695) {
        }
        try {
            iArr2[pe.POISONSMOKE2.ordinal()] = 926;
        } catch (NoSuchFieldError unused696) {
        }
        try {
            iArr2[pe.POISONWAV.ordinal()] = 773;
        } catch (NoSuchFieldError unused697) {
        }
        try {
            iArr2[pe.POISON_MIST.ordinal()] = 961;
        } catch (NoSuchFieldError unused698) {
        }
        try {
            iArr2[pe.POISON_S.ordinal()] = 642;
        } catch (NoSuchFieldError unused699) {
        }
        try {
            iArr2[pe.POKJUK.ordinal()] = 299;
        } catch (NoSuchFieldError unused700) {
        }
        try {
            iArr2[pe.POKJUK_SOUND.ordinal()] = 303;
        } catch (NoSuchFieldError unused701) {
        }
        try {
            iArr2[pe.POK_BIRTH.ordinal()] = 687;
        } catch (NoSuchFieldError unused702) {
        }
        try {
            iArr2[pe.POK_CHRISTMAS.ordinal()] = 688;
        } catch (NoSuchFieldError unused703) {
        }
        try {
            iArr2[pe.POK_JAP.ordinal()] = 711;
        } catch (NoSuchFieldError unused704) {
        }
        try {
            iArr2[pe.POK_LOVE.ordinal()] = 684;
        } catch (NoSuchFieldError unused705) {
        }
        try {
            iArr2[pe.POK_VALEN.ordinal()] = 686;
        } catch (NoSuchFieldError unused706) {
        }
        try {
            iArr2[pe.POK_WHITE.ordinal()] = 685;
        } catch (NoSuchFieldError unused707) {
        }
        try {
            iArr2[pe.PONG.ordinal()] = 201;
        } catch (NoSuchFieldError unused708) {
        }
        try {
            iArr2[pe.PORTAL.ordinal()] = 38;
        } catch (NoSuchFieldError unused709) {
        }
        try {
            iArr2[pe.PORTAL2.ordinal()] = 319;
        } catch (NoSuchFieldError unused710) {
        }
        try {
            iArr2[pe.PORTAL3.ordinal()] = 343;
        } catch (NoSuchFieldError unused711) {
        }
        try {
            iArr2[pe.PORTAL4.ordinal()] = 391;
        } catch (NoSuchFieldError unused712) {
        }
        try {
            iArr2[pe.PORTAL5.ordinal()] = 404;
        } catch (NoSuchFieldError unused713) {
        }
        try {
            iArr2[pe.POTION1.ordinal()] = 206;
        } catch (NoSuchFieldError unused714) {
        }
        try {
            iArr2[pe.POTION2.ordinal()] = 207;
        } catch (NoSuchFieldError unused715) {
        }
        try {
            iArr2[pe.POTION3.ordinal()] = 208;
        } catch (NoSuchFieldError unused716) {
        }
        try {
            iArr2[pe.POTION4.ordinal()] = 209;
        } catch (NoSuchFieldError unused717) {
        }
        try {
            iArr2[pe.POTION5.ordinal()] = 210;
        } catch (NoSuchFieldError unused718) {
        }
        try {
            iArr2[pe.POTION6.ordinal()] = 211;
        } catch (NoSuchFieldError unused719) {
        }
        try {
            iArr2[pe.POTION7.ordinal()] = 212;
        } catch (NoSuchFieldError unused720) {
        }
        try {
            iArr2[pe.POTION8.ordinal()] = 213;
        } catch (NoSuchFieldError unused721) {
        }
        try {
            iArr2[pe.POTIONPILLAR.ordinal()] = 223;
        } catch (NoSuchFieldError unused722) {
        }
        try {
            iArr2[pe.POTION_.ordinal()] = 221;
        } catch (NoSuchFieldError unused723) {
        }
        try {
            iArr2[pe.POTION_BERSERK.ordinal()] = 222;
        } catch (NoSuchFieldError unused724) {
        }
        try {
            iArr2[pe.POTION_BERSERK2.ordinal()] = 758;
        } catch (NoSuchFieldError unused725) {
        }
        try {
            iArr2[pe.POTION_CON.ordinal()] = 220;
        } catch (NoSuchFieldError unused726) {
        }
        try {
            iArr2[pe.PRESSEDBODY.ordinal()] = 415;
        } catch (NoSuchFieldError unused727) {
        }
        try {
            iArr2[pe.PRESSURE.ordinal()] = 367;
        } catch (NoSuchFieldError unused728) {
        }
        try {
            iArr2[pe.PRESSURE2.ordinal()] = 908;
        } catch (NoSuchFieldError unused729) {
        }
        try {
            iArr2[pe.PRESSURE3.ordinal()] = 932;
        } catch (NoSuchFieldError unused730) {
        }
        try {
            iArr2[pe.PRIMECHARGE.ordinal()] = 884;
        } catch (NoSuchFieldError unused731) {
        }
        try {
            iArr2[pe.PRIMECHARGE2.ordinal()] = 910;
        } catch (NoSuchFieldError unused732) {
        }
        try {
            iArr2[pe.PRIMECHARGE3.ordinal()] = 911;
        } catch (NoSuchFieldError unused733) {
        }
        try {
            iArr2[pe.PRIMECHARGE4.ordinal()] = 912;
        } catch (NoSuchFieldError unused734) {
        }
        try {
            iArr2[pe.PROVIDENCE.ordinal()] = 250;
        } catch (NoSuchFieldError unused735) {
        }
        try {
            iArr2[pe.PROVOKE.ordinal()] = 69;
        } catch (NoSuchFieldError unused736) {
        }
        try {
            iArr2[pe.PURPLEBODY.ordinal()] = 770;
        } catch (NoSuchFieldError unused737) {
        }
        try {
            iArr2[pe.PURPLE_NUMBER.ordinal()] = 662;
        } catch (NoSuchFieldError unused738) {
        }
        try {
            iArr2[pe.QUAGMIRE.ordinal()] = 97;
        } catch (NoSuchFieldError unused739) {
        }
        try {
            iArr2[pe.QUAKEBODY.ordinal()] = 428;
        } catch (NoSuchFieldError unused740) {
        }
        try {
            iArr2[pe.QUAKEBODY2.ordinal()] = 460;
        } catch (NoSuchFieldError unused741) {
        }
        try {
            iArr2[pe.QUAKEBODY3.ordinal()] = 552;
        } catch (NoSuchFieldError unused742) {
        }
        try {
            iArr2[pe.QUAKEBODY4.ordinal()] = 604;
        } catch (NoSuchFieldError unused743) {
        }
        try {
            iArr2[pe.RAIN.ordinal()] = 163;
        } catch (NoSuchFieldError unused744) {
        }
        try {
            iArr2[pe.RAINBOW.ordinal()] = 412;
        } catch (NoSuchFieldError unused745) {
        }
        try {
            iArr2[pe.RAIN_PARTICLE.ordinal()] = 859;
        } catch (NoSuchFieldError unused746) {
        }
        try {
            iArr2[pe.RAIN_PARTICLE2.ordinal()] = 946;
        } catch (NoSuchFieldError unused747) {
        }
        try {
            iArr2[pe.RAPIDSHOWER.ordinal()] = 645;
        } catch (NoSuchFieldError unused748) {
        }
        try {
            iArr2[pe.RA_UNLIMIT.ordinal()] = 1042;
        } catch (NoSuchFieldError unused749) {
        }
        try {
            iArr2[pe.READYPORTAL.ordinal()] = 37;
        } catch (NoSuchFieldError unused750) {
        }
        try {
            iArr2[pe.READYPORTAL2.ordinal()] = 318;
        } catch (NoSuchFieldError unused751) {
        }
        try {
            iArr2[pe.RECOGNIZED.ordinal()] = 805;
        } catch (NoSuchFieldError unused752) {
        }
        try {
            iArr2[pe.RECOGNIZED2.ordinal()] = 810;
        } catch (NoSuchFieldError unused753) {
        }
        try {
            iArr2[pe.RECOVERY.ordinal()] = 80;
        } catch (NoSuchFieldError unused754) {
        }
        try {
            iArr2[pe.REDBODY.ordinal()] = 370;
        } catch (NoSuchFieldError unused755) {
        }
        try {
            iArr2[pe.REDLIGHTBODY.ordinal()] = 546;
        } catch (NoSuchFieldError unused756) {
        }
        try {
            iArr2[pe.REDLINE.ordinal()] = 802;
        } catch (NoSuchFieldError unused757) {
        }
        try {
            iArr2[pe.RED_CROSS.ordinal()] = 1000;
        } catch (NoSuchFieldError unused758) {
        }
        try {
            iArr2[pe.RED_HIT.ordinal()] = 550;
        } catch (NoSuchFieldError unused759) {
        }
        try {
            iArr2[pe.RED_NUMBER.ordinal()] = 661;
        } catch (NoSuchFieldError unused760) {
        }
        try {
            iArr2[pe.REFINEFAIL.ordinal()] = 157;
        } catch (NoSuchFieldError unused761) {
        }
        try {
            iArr2[pe.REFINEOK.ordinal()] = 156;
        } catch (NoSuchFieldError unused762) {
        }
        try {
            iArr2[pe.REFLECTBODY.ordinal()] = 421;
        } catch (NoSuchFieldError unused763) {
        }
        try {
            iArr2[pe.REFLECTSHIELD.ordinal()] = 254;
        } catch (NoSuchFieldError unused764) {
        }
        try {
            iArr2[pe.REJECTSWORD.ordinal()] = 394;
        } catch (NoSuchFieldError unused765) {
        }
        try {
            iArr2[pe.REMOVETRAP.ordinal()] = 102;
        } catch (NoSuchFieldError unused766) {
        }
        try {
            iArr2[pe.REPAIRTIME.ordinal()] = 787;
        } catch (NoSuchFieldError unused767) {
        }
        try {
            iArr2[pe.REPAIRWEAPON.ordinal()] = 103;
        } catch (NoSuchFieldError unused768) {
        }
        try {
            iArr2[pe.RESURRECTION.ordinal()] = 79;
        } catch (NoSuchFieldError unused769) {
        }
        try {
            iArr2[pe.REVIVE.ordinal()] = 142;
        } catch (NoSuchFieldError unused770) {
        }
        try {
            iArr2[pe.RG_COIN.ordinal()] = 276;
        } catch (NoSuchFieldError unused771) {
        }
        try {
            iArr2[pe.RG_COIN2.ordinal()] = 497;
        } catch (NoSuchFieldError unused772) {
        }
        try {
            iArr2[pe.RG_COIN3.ordinal()] = 629;
        } catch (NoSuchFieldError unused773) {
        }
        try {
            iArr2[pe.RG_COIN4.ordinal()] = 772;
        } catch (NoSuchFieldError unused774) {
        }
        try {
            iArr2[pe.RG_COIN5.ordinal()] = 822;
        } catch (NoSuchFieldError unused775) {
        }
        try {
            iArr2[pe.RG_COIN6.ordinal()] = 871;
        } catch (NoSuchFieldError unused776) {
        }
        try {
            iArr2[pe.RG_COIN7.ordinal()] = 909;
        } catch (NoSuchFieldError unused777) {
        }
        try {
            iArr2[pe.RICHS_COIN_A.ordinal()] = 1056;
        } catch (NoSuchFieldError unused778) {
        }
        try {
            iArr2[pe.RK_DRAGONBREATH_WATER.ordinal()] = 1028;
        } catch (NoSuchFieldError unused779) {
        }
        try {
            iArr2[pe.RK_LUXANIMA.ordinal()] = 1031;
        } catch (NoSuchFieldError unused780) {
        }
        try {
            iArr2[pe.RO2YEAR.ordinal()] = 547;
        } catch (NoSuchFieldError unused781) {
        }
        try {
            iArr2[pe.ROLLING1.ordinal()] = 760;
        } catch (NoSuchFieldError unused782) {
        }
        try {
            iArr2[pe.ROLLING10.ordinal()] = 769;
        } catch (NoSuchFieldError unused783) {
        }
        try {
            iArr2[pe.ROLLING2.ordinal()] = 761;
        } catch (NoSuchFieldError unused784) {
        }
        try {
            iArr2[pe.ROLLING3.ordinal()] = 762;
        } catch (NoSuchFieldError unused785) {
        }
        try {
            iArr2[pe.ROLLING4.ordinal()] = 763;
        } catch (NoSuchFieldError unused786) {
        }
        try {
            iArr2[pe.ROLLING5.ordinal()] = 764;
        } catch (NoSuchFieldError unused787) {
        }
        try {
            iArr2[pe.ROLLING6.ordinal()] = 765;
        } catch (NoSuchFieldError unused788) {
        }
        try {
            iArr2[pe.ROLLING7.ordinal()] = 766;
        } catch (NoSuchFieldError unused789) {
        }
        try {
            iArr2[pe.ROLLING8.ordinal()] = 767;
        } catch (NoSuchFieldError unused790) {
        }
        try {
            iArr2[pe.ROLLING9.ordinal()] = 768;
        } catch (NoSuchFieldError unused791) {
        }
        try {
            iArr2[pe.ROLLINGCAST.ordinal()] = 839;
        } catch (NoSuchFieldError unused792) {
        }
        try {
            iArr2[pe.ROTATE_BG.ordinal()] = 987;
        } catch (NoSuchFieldError unused793) {
        }
        try {
            iArr2[pe.ROTATE_HUUMARANKA.ordinal()] = 986;
        } catch (NoSuchFieldError unused794) {
        }
        try {
            iArr2[pe.ROTATE_LINE_BLUE.ordinal()] = 1002;
        } catch (NoSuchFieldError unused795) {
        }
        try {
            iArr2[pe.ROTATE_LINE_GRAY.ordinal()] = 988;
        } catch (NoSuchFieldError unused796) {
        }
        try {
            iArr2[pe.RUN.ordinal()] = 444;
        } catch (NoSuchFieldError unused797) {
        }
        try {
            iArr2[pe.RUN_MAKE_FAILURE.ordinal()] = 1018;
        } catch (NoSuchFieldError unused798) {
        }
        try {
            iArr2[pe.RUN_MAKE_OK.ordinal()] = 1017;
        } catch (NoSuchFieldError unused799) {
        }
        try {
            iArr2[pe.RUWACH.ordinal()] = 35;
        } catch (NoSuchFieldError unused800) {
        }
        try {
            iArr2[pe.SAINTWING.ordinal()] = 347;
        } catch (NoSuchFieldError unused801) {
        }
        try {
            iArr2[pe.SAKURA.ordinal()] = 165;
        } catch (NoSuchFieldError unused802) {
        }
        try {
            iArr2[pe.SANCTUARY.ordinal()] = 85;
        } catch (NoSuchFieldError unused803) {
        }
        try {
            iArr2[pe.SANDMAN.ordinal()] = 141;
        } catch (NoSuchFieldError unused804) {
        }
        try {
            iArr2[pe.SANDWIND.ordinal()] = 48;
        } catch (NoSuchFieldError unused805) {
        }
        try {
            iArr2[pe.SCREEN_QUAKE.ordinal()] = 565;
        } catch (NoSuchFieldError unused806) {
        }
        try {
            iArr2[pe.SC_ESCAPE.ordinal()] = 1044;
        } catch (NoSuchFieldError unused807) {
        }
        try {
            iArr2[pe.SECRA.ordinal()] = 861;
        } catch (NoSuchFieldError unused808) {
        }
        try {
            iArr2[pe.SECRA2.ordinal()] = 864;
        } catch (NoSuchFieldError unused809) {
        }
        try {
            iArr2[pe.SEISMICWEAPON.ordinal()] = 260;
        } catch (NoSuchFieldError unused810) {
        }
        try {
            iArr2[pe.SELFSCROLL.ordinal()] = 902;
        } catch (NoSuchFieldError unused811) {
        }
        try {
            iArr2[pe.SHIELDBOOMERANG.ordinal()] = 251;
        } catch (NoSuchFieldError unused812) {
        }
        try {
            iArr2[pe.SHIELDBOOMERANG2.ordinal()] = 496;
        } catch (NoSuchFieldError unused813) {
        }
        try {
            iArr2[pe.SHIELDBOOMERANG3.ordinal()] = 522;
        } catch (NoSuchFieldError unused814) {
        }
        try {
            iArr2[pe.SHIELDBOOMERANG4.ordinal()] = 776;
        } catch (NoSuchFieldError unused815) {
        }
        try {
            iArr2[pe.SHIELDCHARGE.ordinal()] = 248;
        } catch (NoSuchFieldError unused816) {
        }
        try {
            iArr2[pe.SHOCKWAVE.ordinal()] = 147;
        } catch (NoSuchFieldError unused817) {
        }
        try {
            iArr2[pe.SHOCKWAVE2.ordinal()] = 928;
        } catch (NoSuchFieldError unused818) {
        }
        try {
            iArr2[pe.SHOCKWAVEHIT.ordinal()] = 148;
        } catch (NoSuchFieldError unused819) {
        }
        try {
            iArr2[pe.SHOOTPARTICLE.ordinal()] = 857;
        } catch (NoSuchFieldError unused820) {
        }
        try {
            iArr2[pe.SHRINK.ordinal()] = 601;
        } catch (NoSuchFieldError unused821) {
        }
        try {
            iArr2[pe.SIGHT.ordinal()] = 24;
        } catch (NoSuchFieldError unused822) {
        }
        try {
            iArr2[pe.SIGHT2.ordinal()] = 603;
        } catch (NoSuchFieldError unused823) {
        }
        try {
            iArr2[pe.SIGHTRASHER.ordinal()] = 64;
        } catch (NoSuchFieldError unused824) {
        }
        try {
            iArr2[pe.SIGNUM.ordinal()] = 42;
        } catch (NoSuchFieldError unused825) {
        }
        try {
            iArr2[pe.SILENCEATTACK.ordinal()] = 195;
        } catch (NoSuchFieldError unused826) {
        }
        try {
            iArr2[pe.SILENT_BREEZE.ordinal()] = 963;
        } catch (NoSuchFieldError unused827) {
        }
        try {
            iArr2[pe.SKIDTRAP.ordinal()] = 71;
        } catch (NoSuchFieldError unused828) {
        }
        try {
            iArr2[pe.SLEEPATTACK.ordinal()] = 199;
        } catch (NoSuchFieldError unused829) {
        }
        try {
            iArr2[pe.SLIM.ordinal()] = 499;
        } catch (NoSuchFieldError unused830) {
        }
        try {
            iArr2[pe.SLIM2.ordinal()] = 500;
        } catch (NoSuchFieldError unused831) {
        }
        try {
            iArr2[pe.SLIM3.ordinal()] = 501;
        } catch (NoSuchFieldError unused832) {
        }
        try {
            iArr2[pe.SLOWPOISON.ordinal()] = 138;
        } catch (NoSuchFieldError unused833) {
        }
        try {
            iArr2[pe.SLUGSHOT.ordinal()] = 1049;
        } catch (NoSuchFieldError unused834) {
        }
        try {
            iArr2[pe.SMA.ordinal()] = 553;
        } catch (NoSuchFieldError unused835) {
        }
        try {
            iArr2[pe.SMA2.ordinal()] = 554;
        } catch (NoSuchFieldError unused836) {
        }
        try {
            iArr2[pe.SMA3.ordinal()] = 558;
        } catch (NoSuchFieldError unused837) {
        }
        try {
            iArr2[pe.SMA_READY.ordinal()] = 548;
        } catch (NoSuchFieldError unused838) {
        }
        try {
            iArr2[pe.SMOKE.ordinal()] = 46;
        } catch (NoSuchFieldError unused839) {
        }
        try {
            iArr2[pe.SNOW.ordinal()] = 164;
        } catch (NoSuchFieldError unused840) {
        }
        try {
            iArr2[pe.SONICBLOW.ordinal()] = 123;
        } catch (NoSuchFieldError unused841) {
        }
        try {
            iArr2[pe.SONICBLOW2.ordinal()] = 145;
        } catch (NoSuchFieldError unused842) {
        }
        try {
            iArr2[pe.SONICBLOWHIT.ordinal()] = 124;
        } catch (NoSuchFieldError unused843) {
        }
        try {
            iArr2[pe.SONIC_CLAW.ordinal()] = 967;
        } catch (NoSuchFieldError unused844) {
        }
        try {
            iArr2[pe.SOULBREAKER.ordinal()] = 363;
        } catch (NoSuchFieldError unused845) {
        }
        try {
            iArr2[pe.SOULBREAKER2.ordinal()] = 411;
        } catch (NoSuchFieldError unused846) {
        }
        try {
            iArr2[pe.SOULBREAKER3.ordinal()] = 722;
        } catch (NoSuchFieldError unused847) {
        }
        try {
            iArr2[pe.SOULBREAKER4.ordinal()] = 735;
        } catch (NoSuchFieldError unused848) {
        }
        try {
            iArr2[pe.SOULBURN.ordinal()] = 408;
        } catch (NoSuchFieldError unused849) {
        }
        try {
            iArr2[pe.SOULCHANGE.ordinal()] = 409;
        } catch (NoSuchFieldError unused850) {
        }
        try {
            iArr2[pe.SOULLIGHT.ordinal()] = 508;
        } catch (NoSuchFieldError unused851) {
        }
        try {
            iArr2[pe.SOULLIGHT2.ordinal()] = 852;
        } catch (NoSuchFieldError unused852) {
        }
        try {
            iArr2[pe.SOULLIGHT3.ordinal()] = 934;
        } catch (NoSuchFieldError unused853) {
        }
        try {
            iArr2[pe.SOULLINK.ordinal()] = 505;
        } catch (NoSuchFieldError unused854) {
        }
        try {
            iArr2[pe.SOULSTRIKE.ordinal()] = 17;
        } catch (NoSuchFieldError unused855) {
        }
        try {
            iArr2[pe.SOULSTRIKE2.ordinal()] = 453;
        } catch (NoSuchFieldError unused856) {
        }
        try {
            iArr2[pe.SO_ELEMENTAL_SHIELD.ordinal()] = 1032;
        } catch (NoSuchFieldError unused857) {
        }
        try {
            iArr2[pe.SPEARBMR.ordinal()] = 82;
        } catch (NoSuchFieldError unused858) {
        }
        try {
            iArr2[pe.SPEARBMRSELF.ordinal()] = 153;
        } catch (NoSuchFieldError unused859) {
        }
        try {
            iArr2[pe.SPEARQUICKEN.ordinal()] = 252;
        } catch (NoSuchFieldError unused860) {
        }
        try {
            iArr2[pe.SPEARSTABSELF.ordinal()] = 152;
        } catch (NoSuchFieldError unused861) {
        }
        try {
            iArr2[pe.SPELLBREAKER.ordinal()] = 236;
        } catch (NoSuchFieldError unused862) {
        }
        try {
            iArr2[pe.SPHERE.ordinal()] = 74;
        } catch (NoSuchFieldError unused863) {
        }
        try {
            iArr2[pe.SPHEREWIND.ordinal()] = 348;
        } catch (NoSuchFieldError unused864) {
        }
        try {
            iArr2[pe.SPHEREWIND2.ordinal()] = 396;
        } catch (NoSuchFieldError unused865) {
        }
        try {
            iArr2[pe.SPINEDBODY.ordinal()] = 416;
        } catch (NoSuchFieldError unused866) {
        }
        try {
            iArr2[pe.SPINEDBODY2.ordinal()] = 468;
        } catch (NoSuchFieldError unused867) {
        }
        try {
            iArr2[pe.SPINMOVE.ordinal()] = 892;
        } catch (NoSuchFieldError unused868) {
        }
        try {
            iArr2[pe.SPLASHER.ordinal()] = 131;
        } catch (NoSuchFieldError unused869) {
        }
        try {
            iArr2[pe.SPRAYPOND.ordinal()] = 50;
        } catch (NoSuchFieldError unused870) {
        }
        try {
            iArr2[pe.SPREADATTACK.ordinal()] = 647;
        } catch (NoSuchFieldError unused871) {
        }
        try {
            iArr2[pe.SPRINGTRAP.ordinal()] = 113;
        } catch (NoSuchFieldError unused872) {
        }
        try {
            iArr2[pe.SPRINKLESAND.ordinal()] = 312;
        } catch (NoSuchFieldError unused873) {
        }
        try {
            iArr2[pe.SPR_LIGHTPRINT.ordinal()] = 903;
        } catch (NoSuchFieldError unused874) {
        }
        try {
            iArr2[pe.SPR_LIGHTPRINT2.ordinal()] = 925;
        } catch (NoSuchFieldError unused875) {
        }
        try {
            iArr2[pe.SPR_LIGHTPRINT3.ordinal()] = 943;
        } catch (NoSuchFieldError unused876) {
        }
        try {
            iArr2[pe.SPR_MASH.ordinal()] = 731;
        } catch (NoSuchFieldError unused877) {
        }
        try {
            iArr2[pe.SPR_PARTICLE.ordinal()] = 853;
        } catch (NoSuchFieldError unused878) {
        }
        try {
            iArr2[pe.SPR_PARTICLE2.ordinal()] = 854;
        } catch (NoSuchFieldError unused879) {
        }
        try {
            iArr2[pe.SPR_PLANT.ordinal()] = 855;
        } catch (NoSuchFieldError unused880) {
        }
        try {
            iArr2[pe.SPR_PLANT10.ordinal()] = 924;
        } catch (NoSuchFieldError unused881) {
        }
        try {
            iArr2[pe.SPR_PLANT11.ordinal()] = 929;
        } catch (NoSuchFieldError unused882) {
        }
        try {
            iArr2[pe.SPR_PLANT2.ordinal()] = 868;
        } catch (NoSuchFieldError unused883) {
        }
        try {
            iArr2[pe.SPR_PLANT3.ordinal()] = 870;
        } catch (NoSuchFieldError unused884) {
        }
        try {
            iArr2[pe.SPR_PLANT4.ordinal()] = 872;
        } catch (NoSuchFieldError unused885) {
        }
        try {
            iArr2[pe.SPR_PLANT5.ordinal()] = 874;
        } catch (NoSuchFieldError unused886) {
        }
        try {
            iArr2[pe.SPR_PLANT6.ordinal()] = 876;
        } catch (NoSuchFieldError unused887) {
        }
        try {
            iArr2[pe.SPR_PLANT7.ordinal()] = 878;
        } catch (NoSuchFieldError unused888) {
        }
        try {
            iArr2[pe.SPR_PLANT8.ordinal()] = 880;
        } catch (NoSuchFieldError unused889) {
        }
        try {
            iArr2[pe.SPR_PLANT9.ordinal()] = 917;
        } catch (NoSuchFieldError unused890) {
        }
        try {
            iArr2[pe.SPR_SOULE.ordinal()] = 732;
        } catch (NoSuchFieldError unused891) {
        }
        try {
            iArr2[pe.SPTIME.ordinal()] = 334;
        } catch (NoSuchFieldError unused892) {
        }
        try {
            iArr2[pe.SR_FLASHCOMBO.ordinal()] = 1030;
        } catch (NoSuchFieldError unused893) {
        }
        try {
            iArr2[pe.STASIS.ordinal()] = 801;
        } catch (NoSuchFieldError unused894) {
        }
        try {
            iArr2[pe.STATUS_STATE.ordinal()] = 166;
        } catch (NoSuchFieldError unused895) {
        }
        try {
            iArr2[pe.STEAL.ordinal()] = 20;
        } catch (NoSuchFieldError unused896) {
        }
        try {
            iArr2[pe.STEALCOIN.ordinal()] = 270;
        } catch (NoSuchFieldError unused897) {
        }
        try {
            iArr2[pe.STEELBODY.ordinal()] = 256;
        } catch (NoSuchFieldError unused898) {
        }
        try {
            iArr2[pe.STIN.ordinal()] = 549;
        } catch (NoSuchFieldError unused899) {
        }
        try {
            iArr2[pe.STIN2.ordinal()] = 555;
        } catch (NoSuchFieldError unused900) {
        }
        try {
            iArr2[pe.STIN3.ordinal()] = 557;
        } catch (NoSuchFieldError unused901) {
        }
        try {
            iArr2[pe.STIN4.ordinal()] = 623;
        } catch (NoSuchFieldError unused902) {
        }
        try {
            iArr2[pe.STIN5.ordinal()] = 626;
        } catch (NoSuchFieldError unused903) {
        }
        try {
            iArr2[pe.STIN6.ordinal()] = 771;
        } catch (NoSuchFieldError unused904) {
        }
        try {
            iArr2[pe.STONECURSE.ordinal()] = 25;
        } catch (NoSuchFieldError unused905) {
        }
        try {
            iArr2[pe.STONERING.ordinal()] = 799;
        } catch (NoSuchFieldError unused906) {
        }
        try {
            iArr2[pe.STOPEFFECT.ordinal()] = 446;
        } catch (NoSuchFieldError unused907) {
        }
        try {
            iArr2[pe.STOPRUN.ordinal()] = 445;
        } catch (NoSuchFieldError unused908) {
        }
        try {
            iArr2[pe.STORMGUST.ordinal()] = 91;
        } catch (NoSuchFieldError unused909) {
        }
        try {
            iArr2[pe.STORMKICK.ordinal()] = 437;
        } catch (NoSuchFieldError unused910) {
        }
        try {
            iArr2[pe.STORMKICK1.ordinal()] = 461;
        } catch (NoSuchFieldError unused911) {
        }
        try {
            iArr2[pe.STORMKICK2.ordinal()] = 462;
        } catch (NoSuchFieldError unused912) {
        }
        try {
            iArr2[pe.STORMKICK3.ordinal()] = 463;
        } catch (NoSuchFieldError unused913) {
        }
        try {
            iArr2[pe.STORMKICK4.ordinal()] = 464;
        } catch (NoSuchFieldError unused914) {
        }
        try {
            iArr2[pe.STORMKICK5.ordinal()] = 465;
        } catch (NoSuchFieldError unused915) {
        }
        try {
            iArr2[pe.STORMKICK6.ordinal()] = 466;
        } catch (NoSuchFieldError unused916) {
        }
        try {
            iArr2[pe.STORMKICK7.ordinal()] = 467;
        } catch (NoSuchFieldError unused917) {
        }
        try {
            iArr2[pe.STORM_MIN.ordinal()] = 710;
        } catch (NoSuchFieldError unused918) {
        }
        try {
            iArr2[pe.STRETCH.ordinal()] = 813;
        } catch (NoSuchFieldError unused919) {
        }
        try {
            iArr2[pe.STRIPARMOR.ordinal()] = 273;
        } catch (NoSuchFieldError unused920) {
        }
        try {
            iArr2[pe.STRIPHELM.ordinal()] = 274;
        } catch (NoSuchFieldError unused921) {
        }
        try {
            iArr2[pe.STRIPSHIELD.ordinal()] = 272;
        } catch (NoSuchFieldError unused922) {
        }
        try {
            iArr2[pe.STRIPWEAPON.ordinal()] = 271;
        } catch (NoSuchFieldError unused923) {
        }
        try {
            iArr2[pe.STUNATTACK.ordinal()] = 196;
        } catch (NoSuchFieldError unused924) {
        }
        try {
            iArr2[pe.SUFFRAGIUM.ordinal()] = 90;
        } catch (NoSuchFieldError unused925) {
        }
        try {
            iArr2[pe.SUICIDE.ordinal()] = 187;
        } catch (NoSuchFieldError unused926) {
        }
        try {
            iArr2[pe.SUI_EXPLOSION.ordinal()] = 185;
        } catch (NoSuchFieldError unused927) {
        }
        try {
            iArr2[pe.SUMMONSLAVE.ordinal()] = 217;
        } catch (NoSuchFieldError unused928) {
        }
        try {
            iArr2[pe.SU_CHATTERING.ordinal()] = 1054;
        } catch (NoSuchFieldError unused929) {
        }
        try {
            iArr2[pe.SU_GROOMING.ordinal()] = 1053;
        } catch (NoSuchFieldError unused930) {
        }
        try {
            iArr2[pe.S_STORM.ordinal()] = 1051;
        } catch (NoSuchFieldError unused931) {
        }
        try {
            iArr2[pe.TAE_READY.ordinal()] = 451;
        } catch (NoSuchFieldError unused932) {
        }
        try {
            iArr2[pe.TALK_FROSTJOKE.ordinal()] = 297;
        } catch (NoSuchFieldError unused933) {
        }
        try {
            iArr2[pe.TALK_SCREAM.ordinal()] = 298;
        } catch (NoSuchFieldError unused934) {
        }
        try {
            iArr2[pe.TAMINGFAILED.ordinal()] = 170;
        } catch (NoSuchFieldError unused935) {
        }
        try {
            iArr2[pe.TAMINGSUCCESS.ordinal()] = 169;
        } catch (NoSuchFieldError unused936) {
        }
        try {
            iArr2[pe.TANJI.ordinal()] = 267;
        } catch (NoSuchFieldError unused937) {
        }
        try {
            iArr2[pe.TANJI2.ordinal()] = 414;
        } catch (NoSuchFieldError unused938) {
        }
        try {
            iArr2[pe.TAROTCARD1.ordinal()] = 525;
        } catch (NoSuchFieldError unused939) {
        }
        try {
            iArr2[pe.TAROTCARD10.ordinal()] = 534;
        } catch (NoSuchFieldError unused940) {
        }
        try {
            iArr2[pe.TAROTCARD11.ordinal()] = 535;
        } catch (NoSuchFieldError unused941) {
        }
        try {
            iArr2[pe.TAROTCARD12.ordinal()] = 536;
        } catch (NoSuchFieldError unused942) {
        }
        try {
            iArr2[pe.TAROTCARD13.ordinal()] = 537;
        } catch (NoSuchFieldError unused943) {
        }
        try {
            iArr2[pe.TAROTCARD14.ordinal()] = 538;
        } catch (NoSuchFieldError unused944) {
        }
        try {
            iArr2[pe.TAROTCARD2.ordinal()] = 526;
        } catch (NoSuchFieldError unused945) {
        }
        try {
            iArr2[pe.TAROTCARD3.ordinal()] = 527;
        } catch (NoSuchFieldError unused946) {
        }
        try {
            iArr2[pe.TAROTCARD4.ordinal()] = 528;
        } catch (NoSuchFieldError unused947) {
        }
        try {
            iArr2[pe.TAROTCARD5.ordinal()] = 529;
        } catch (NoSuchFieldError unused948) {
        }
        try {
            iArr2[pe.TAROTCARD6.ordinal()] = 530;
        } catch (NoSuchFieldError unused949) {
        }
        try {
            iArr2[pe.TAROTCARD7.ordinal()] = 531;
        } catch (NoSuchFieldError unused950) {
        }
        try {
            iArr2[pe.TAROTCARD8.ordinal()] = 532;
        } catch (NoSuchFieldError unused951) {
        }
        try {
            iArr2[pe.TAROTCARD9.ordinal()] = 533;
        } catch (NoSuchFieldError unused952) {
        }
        try {
            iArr2[pe.TATAMI.ordinal()] = 633;
        } catch (NoSuchFieldError unused953) {
        }
        try {
            iArr2[pe.TEIHIT1.ordinal()] = 264;
        } catch (NoSuchFieldError unused954) {
        }
        try {
            iArr2[pe.TEIHIT1T.ordinal()] = 891;
        } catch (NoSuchFieldError unused955) {
        }
        try {
            iArr2[pe.TEIHIT1X.ordinal()] = 268;
        } catch (NoSuchFieldError unused956) {
        }
        try {
            iArr2[pe.TEIHIT2.ordinal()] = 266;
        } catch (NoSuchFieldError unused957) {
        }
        try {
            iArr2[pe.TEIHIT3.ordinal()] = 278;
        } catch (NoSuchFieldError unused958) {
        }
        try {
            iArr2[pe.TELEKHIT.ordinal()] = 200;
        } catch (NoSuchFieldError unused959) {
        }
        try {
            iArr2[pe.TELEPORTATION.ordinal()] = 36;
        } catch (NoSuchFieldError unused960) {
        }
        try {
            iArr2[pe.TELEPORTATION2.ordinal()] = 306;
        } catch (NoSuchFieldError unused961) {
        }
        try {
            iArr2[pe.TEMP_FAIL.ordinal()] = 613;
        } catch (NoSuchFieldError unused962) {
        }
        try {
            iArr2[pe.TEMP_OK.ordinal()] = 612;
        } catch (NoSuchFieldError unused963) {
        }
        try {
            iArr2[pe.TETRA.ordinal()] = 806;
        } catch (NoSuchFieldError unused964) {
        }
        try {
            iArr2[pe.TETRACASTING.ordinal()] = 807;
        } catch (NoSuchFieldError unused965) {
        }
        try {
            iArr2[pe.TETRA_FIRE.ordinal()] = 972;
        } catch (NoSuchFieldError unused966) {
        }
        try {
            iArr2[pe.TETRA_GROUND.ordinal()] = 975;
        } catch (NoSuchFieldError unused967) {
        }
        try {
            iArr2[pe.TETRA_WATER.ordinal()] = 973;
        } catch (NoSuchFieldError unused968) {
        }
        try {
            iArr2[pe.TETRA_WIND.ordinal()] = 974;
        } catch (NoSuchFieldError unused969) {
        }
        try {
            iArr2[pe.THROWITEM.ordinal()] = 300;
        } catch (NoSuchFieldError unused970) {
        }
        try {
            iArr2[pe.THROWITEM10.ordinal()] = 618;
        } catch (NoSuchFieldError unused971) {
        }
        try {
            iArr2[pe.THROWITEM11.ordinal()] = 916;
        } catch (NoSuchFieldError unused972) {
        }
        try {
            iArr2[pe.THROWITEM2.ordinal()] = 301;
        } catch (NoSuchFieldError unused973) {
        }
        try {
            iArr2[pe.THROWITEM3.ordinal()] = 310;
        } catch (NoSuchFieldError unused974) {
        }
        try {
            iArr2[pe.THROWITEM4.ordinal()] = 541;
        } catch (NoSuchFieldError unused975) {
        }
        try {
            iArr2[pe.THROWITEM4_1.ordinal()] = 982;
        } catch (NoSuchFieldError unused976) {
        }
        try {
            iArr2[pe.THROWITEM5.ordinal()] = 543;
        } catch (NoSuchFieldError unused977) {
        }
        try {
            iArr2[pe.THROWITEM6.ordinal()] = 602;
        } catch (NoSuchFieldError unused978) {
        }
        try {
            iArr2[pe.THROWITEM7.ordinal()] = 615;
        } catch (NoSuchFieldError unused979) {
        }
        try {
            iArr2[pe.THROWITEM8.ordinal()] = 616;
        } catch (NoSuchFieldError unused980) {
        }
        try {
            iArr2[pe.THROWITEM9.ordinal()] = 617;
        } catch (NoSuchFieldError unused981) {
        }
        try {
            iArr2[pe.THROW_BAKURETSU.ordinal()] = 985;
        } catch (NoSuchFieldError unused982) {
        }
        try {
            iArr2[pe.THROW_HAPPOKUNAI.ordinal()] = 983;
        } catch (NoSuchFieldError unused983) {
        }
        try {
            iArr2[pe.THROW_MULTIPLE_COIN.ordinal()] = 984;
        } catch (NoSuchFieldError unused984) {
        }
        try {
            iArr2[pe.THUNDERSTORM.ordinal()] = 32;
        } catch (NoSuchFieldError unused985) {
        }
        try {
            iArr2[pe.THUNDERSTORM2.ordinal()] = 624;
        } catch (NoSuchFieldError unused986) {
        }
        try {
            iArr2[pe.TINDER_BREAKER.ordinal()] = 968;
        } catch (NoSuchFieldError unused987) {
        }
        try {
            iArr2[pe.TOPRANK.ordinal()] = 161;
        } catch (NoSuchFieldError unused988) {
        }
        try {
            iArr2[pe.TORCH.ordinal()] = 49;
        } catch (NoSuchFieldError unused989) {
        }
        try {
            iArr2[pe.TORCH_GREEN.ordinal()] = 693;
        } catch (NoSuchFieldError unused990) {
        }
        try {
            iArr2[pe.TORCH_PURPLE.ordinal()] = 698;
        } catch (NoSuchFieldError unused991) {
        }
        try {
            iArr2[pe.TORCH_RED.ordinal()] = 692;
        } catch (NoSuchFieldError unused992) {
        }
        try {
            iArr2[pe.TRACKCASTING.ordinal()] = 648;
        } catch (NoSuchFieldError unused993) {
        }
        try {
            iArr2[pe.TRACKING.ordinal()] = 649;
        } catch (NoSuchFieldError unused994) {
        }
        try {
            iArr2[pe.TRANSBLUEBODY.ordinal()] = 381;
        } catch (NoSuchFieldError unused995) {
        }
        try {
            iArr2[pe.TRIPLEACTION.ordinal()] = 650;
        } catch (NoSuchFieldError unused996) {
        }
        try {
            iArr2[pe.TRIPLEATTACK.ordinal()] = 331;
        } catch (NoSuchFieldError unused997) {
        }
        try {
            iArr2[pe.TRIPLEATTACK2.ordinal()] = 390;
        } catch (NoSuchFieldError unused998) {
        }
        try {
            iArr2[pe.TRIPLEATTACK3.ordinal()] = 395;
        } catch (NoSuchFieldError unused999) {
        }
        try {
            iArr2[pe.TRIPLEATTACK4.ordinal()] = 894;
        } catch (NoSuchFieldError unused1000) {
        }
        try {
            iArr2[pe.TRUESIGHT.ordinal()] = 388;
        } catch (NoSuchFieldError unused1001) {
        }
        try {
            iArr2[pe.TURNUNDEAD.ordinal()] = 84;
        } catch (NoSuchFieldError unused1002) {
        }
        try {
            iArr2[pe.TWILIGHT1.ordinal()] = 575;
        } catch (NoSuchFieldError unused1003) {
        }
        try {
            iArr2[pe.TWILIGHT2.ordinal()] = 576;
        } catch (NoSuchFieldError unused1004) {
        }
        try {
            iArr2[pe.TWILIGHT3.ordinal()] = 577;
        } catch (NoSuchFieldError unused1005) {
        }
        try {
            iArr2[pe.TWOHANDQUICKEN.ordinal()] = 132;
        } catch (NoSuchFieldError unused1006) {
        }
        try {
            iArr2[pe.UNDEADBODY.ordinal()] = 657;
        } catch (NoSuchFieldError unused1007) {
        }
        try {
            iArr2[pe.UNDEADBODY_DEL.ordinal()] = 658;
        } catch (NoSuchFieldError unused1008) {
        }
        try {
            iArr2[pe.VACUUM.ordinal()] = 923;
        } catch (NoSuchFieldError unused1009) {
        }
        try {
            iArr2[pe.VALLENTINE.ordinal()] = 365;
        } catch (NoSuchFieldError unused1010) {
        }
        try {
            iArr2[pe.VALLENTINE2.ordinal()] = 366;
        } catch (NoSuchFieldError unused1011) {
        }
        try {
            iArr2[pe.VENOMDUST.ordinal()] = 126;
        } catch (NoSuchFieldError unused1012) {
        }
        try {
            iArr2[pe.VENOMDUST2.ordinal()] = 173;
        } catch (NoSuchFieldError unused1013) {
        }
        try {
            iArr2[pe.VENOMFOG.ordinal()] = 1022;
        } catch (NoSuchFieldError unused1014) {
        }
        try {
            iArr2[pe.VENOMIMPRESS.ordinal()] = 790;
        } catch (NoSuchFieldError unused1015) {
        }
        try {
            iArr2[pe.VERDURE_TRAP.ordinal()] = 744;
        } catch (NoSuchFieldError unused1016) {
        }
        try {
            iArr2[pe.VIOLENTGALE.ordinal()] = 239;
        } catch (NoSuchFieldError unused1017) {
        }
        try {
            iArr2[pe.VOLCANIC_ASH.ordinal()] = 977;
        } catch (NoSuchFieldError unused1018) {
        }
        try {
            iArr2[pe.VOLCANO.ordinal()] = 227;
        } catch (NoSuchFieldError unused1019) {
        }
        try {
            iArr2[pe.VULCANWAV.ordinal()] = 778;
        } catch (NoSuchFieldError unused1020) {
        }
        try {
            iArr2[pe.WALLOFTHORN.ordinal()] = 914;
        } catch (NoSuchFieldError unused1021) {
        }
        try {
            iArr2[pe.WARP.ordinal()] = 10;
        } catch (NoSuchFieldError unused1022) {
        }
        try {
            iArr2[pe.WARPZONE.ordinal()] = 63;
        } catch (NoSuchFieldError unused1023) {
        }
        try {
            iArr2[pe.WARPZONE2.ordinal()] = 323;
        } catch (NoSuchFieldError unused1024) {
        }
        try {
            iArr2[pe.WATERBALL.ordinal()] = 118;
        } catch (NoSuchFieldError unused1025) {
        }
        try {
            iArr2[pe.WATERBALL2.ordinal()] = 119;
        } catch (NoSuchFieldError unused1026) {
        }
        try {
            iArr2[pe.WATERBALL3.ordinal()] = 944;
        } catch (NoSuchFieldError unused1027) {
        }
        try {
            iArr2[pe.WATERFALL.ordinal()] = 351;
        } catch (NoSuchFieldError unused1028) {
        }
        try {
            iArr2[pe.WATERFALL_90.ordinal()] = 352;
        } catch (NoSuchFieldError unused1029) {
        }
        try {
            iArr2[pe.WATERFALL_ANI.ordinal()] = 823;
        } catch (NoSuchFieldError unused1030) {
        }
        try {
            iArr2[pe.WATERFALL_SMALL.ordinal()] = 353;
        } catch (NoSuchFieldError unused1031) {
        }
        try {
            iArr2[pe.WATERFALL_SMALL_90.ordinal()] = 354;
        } catch (NoSuchFieldError unused1032) {
        }
        try {
            iArr2[pe.WATERFALL_SMALL_T2.ordinal()] = 357;
        } catch (NoSuchFieldError unused1033) {
        }
        try {
            iArr2[pe.WATERFALL_SMALL_T2_90.ordinal()] = 358;
        } catch (NoSuchFieldError unused1034) {
        }
        try {
            iArr2[pe.WATERFALL_T2.ordinal()] = 355;
        } catch (NoSuchFieldError unused1035) {
        }
        try {
            iArr2[pe.WATERFALL_T2_90.ordinal()] = 356;
        } catch (NoSuchFieldError unused1036) {
        }
        try {
            iArr2[pe.WATER_BELOW.ordinal()] = 840;
        } catch (NoSuchFieldError unused1037) {
        }
        try {
            iArr2[pe.WATER_FADE.ordinal()] = 841;
        } catch (NoSuchFieldError unused1038) {
        }
        try {
            iArr2[pe.WATER_SMOKE.ordinal()] = 848;
        } catch (NoSuchFieldError unused1039) {
        }
        try {
            iArr2[pe.WEWISH.ordinal()] = 719;
        } catch (NoSuchFieldError unused1040) {
        }
        try {
            iArr2[pe.WHITE_NUMBER.ordinal()] = 664;
        } catch (NoSuchFieldError unused1041) {
        }
        try {
            iArr2[pe.WIDECONFUSE.ordinal()] = 672;
        } catch (NoSuchFieldError unused1042) {
        }
        try {
            iArr2[pe.WIND.ordinal()] = 226;
        } catch (NoSuchFieldError unused1043) {
        }
        try {
            iArr2[pe.WINDCUTTER.ordinal()] = 726;
        } catch (NoSuchFieldError unused1044) {
        }
        try {
            iArr2[pe.WINDHIT.ordinal()] = 54;
        } catch (NoSuchFieldError unused1045) {
        }
        try {
            iArr2[pe.WINK.ordinal()] = 609;
        } catch (NoSuchFieldError unused1046) {
        }
        try {
            iArr2[pe.WL_TELEKINESIS_INTENSE.ordinal()] = 1034;
        } catch (NoSuchFieldError unused1047) {
        }
        try {
            iArr2[pe.WM_FRIGG_SONG.ordinal()] = 1045;
        } catch (NoSuchFieldError unused1048) {
        }
        try {
            iArr2[pe.YELLOWFLY1.ordinal()] = 715;
        } catch (NoSuchFieldError unused1049) {
        }
        try {
            iArr2[pe.YELLOWFLY2.ordinal()] = 716;
        } catch (NoSuchFieldError unused1050) {
        }
        try {
            iArr2[pe.YELLOWFLY3.ordinal()] = 948;
        } catch (NoSuchFieldError unused1051) {
        }
        try {
            iArr2[pe.YELLOW_NUMBER.ordinal()] = 665;
        } catch (NoSuchFieldError unused1052) {
        }
        try {
            iArr2[pe.YUFITEL.ordinal()] = 95;
        } catch (NoSuchFieldError unused1053) {
        }
        try {
            iArr2[pe.YUFITEL2.ordinal()] = 454;
        } catch (NoSuchFieldError unused1054) {
        }
        try {
            iArr2[pe.YUFITELHIT.ordinal()] = 96;
        } catch (NoSuchFieldError unused1055) {
        }
        try {
            iArr2[pe.ZANGETSU.ordinal()] = 1012;
        } catch (NoSuchFieldError unused1056) {
        }
        try {
            iArr2[pe._05VAL.ordinal()] = 511;
        } catch (NoSuchFieldError unused1057) {
        }
        try {
            iArr2[pe._2011RWC.ordinal()] = 989;
        } catch (NoSuchFieldError unused1058) {
        }
        try {
            iArr2[pe._2011RWC2.ordinal()] = 990;
        } catch (NoSuchFieldError unused1059) {
        }
        try {
            iArr2[pe._4WAYBODY.ordinal()] = 427;
        } catch (NoSuchFieldError unused1060) {
        }
        f8221 = iArr2;
        return iArr2;
    }

    protected final void finalize() {
        if (this.f8231 != null) {
            this.f8231.m496();
        }
        if (this.f8230 != null) {
            Iterator<C0995> it = this.f8230.iterator();
            while (it.hasNext()) {
                it.next().m1576();
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final lr m1544() {
        if (this.f8227 != null) {
            return this.f8227;
        }
        if (this.f8224 != null && this.f8224.f2076 != null) {
            return this.f8224.f2076;
        }
        return new lr(0.0f, 0.0f, 0.0f);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private cu m1542(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith(".str")) {
            lowerCase = String.valueOf(lowerCase) + ".str";
        }
        cu cuVar = (cu) cp.m491(lowerCase.replace("\\", "/"), cu.class);
        this.f8231 = cuVar;
        return cuVar;
    }

    C0933(mh mhVar, pe peVar) {
        m1543(mhVar, null, peVar);
    }

    C0933(mj mjVar, mj mjVar2, pe peVar) {
        m1543(mjVar, mjVar2, peVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1543(mj mjVar, mj mjVar2, pe peVar) {
        this.f8226 = peVar;
        this.f8227 = null;
        this.f8225 = null;
        this.f8224 = mjVar;
        this.f8228 = mjVar2;
        this.f8229 = 0 == 0 ? System.currentTimeMillis() : 0L;
        Random random = new Random(System.currentTimeMillis());
        switch (m1541()[peVar.ordinal()]) {
            case 2:
                C0995 c0995 = new C0995(this, EnumC0224.EP_3DCYLINDER);
                c0995.f8455 = (hr) cp.m491("effect/ring_blue.tga", hr.class);
                c0995.f8446.f2019 = 10.0f;
                c0995.f8438 = 166L;
                c0995.f8440 = 166L;
                c0995.m1577(c0995.f8433, 2, 0.0f, 5.25f, 0.0f, 0.0f, -0.5f, 1.0f);
                lr lrVarM793 = new lr(m1544()).m793(this.f8225 != null ? this.f8225 : (this.f8228 == null || this.f8228.f2076 == null) ? new lr(0.0f, 0.0f, 0.0f) : this.f8228.f2076);
                float fAtan2 = (float) ((Math.atan2(lrVarM793.f2019, Math.sqrt((lrVarM793.f2020 * lrVarM793.f2020) + (lrVarM793.f2018 * lrVarM793.f2018))) / 3.141592653589793d) * 180.0d);
                c0995.m1577(c0995.f8442, 2, fAtan2, fAtan2, 0.0f, 0.0f, 0.0f, 1.0f);
                float fAtan22 = (float) ((Math.atan2(lrVarM793.f2020, lrVarM793.f2018) / 3.141592653589793d) * 180.0d);
                c0995.m1577(c0995.f8442, 1, fAtan22, fAtan22, 0.0f, 0.0f, 0.0f, 1.0f);
                c0995.m1577(c0995.f8453, 0, 5.0f, 5.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                c0995.m1577(c0995.f8453, 1, 10.0f, 10.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                c0995.m1577(c0995.f8453, 2, 3.5f, 3.5f, 0.0f, 0.0f, 0.0f, 1.0f);
                c0995.f8450 = 0.5f;
                this.f8230.add(c0995);
                for (int i = 0; i < 6; i++) {
                    C0995 c09952 = new C0995(this, EnumC0224.EP_3DPARTICLE);
                    c09952.f8455 = (hr) cp.m491("이팩트/particle1", hr.class);
                    c09952.m1577(c09952.f8453, 0, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                    c09952.m1577(c09952.f8453, 1, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                    c09952.f8430 = true;
                    c09952.m1577(c09952.f8453, 0, 1.1f, 1.1f, -0.5f, 0.0f, 0.0f, 1.0f);
                    c09952.f8453[1] = c09952.f8453[0];
                    c09952.f8440 = 292L;
                    c09952.f8438 = ((long) (((Math.random() * 2.0d) - 1.0d) * 192.0d)) + 292;
                    c09952.f8451 = 50L;
                    c09952.f8446.f2019 = 10.0f;
                    c09952.m1577(c09952.f8433, 3, 5.5f, 19.872f, 1.5f, 6.5f, -0.5f, -1.0f);
                    if ((i & 1) > 0) {
                        c09952.m1577(c09952.f8433, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                        float[] fArr = c09952.f8433[1].f8457;
                        fArr[2] = fArr[2] - 50.0f;
                    }
                    c09952.m1577(c09952.f8442, 2, 50.0f, 50.0f, -50.0f, 0.0f, 0.0f, 1.0f);
                    c09952.m1577(c09952.f8442, 1, fAtan22 + ((i & 1) > 0 ? 180 : 0), fAtan22 + ((i & 1) > 0 ? 180 : 0), -40.0f, 0.0f, 0.0f, 1.0f);
                    c09952.f8450 = 1.0f;
                    this.f8230.add(c09952);
                }
                break;
            case 3:
                C0358.f6663.m1535("effect/ef_hit2.wav", 1.0f);
                for (int i2 = 0; i2 < 8; i2++) {
                    C0995 c09953 = new C0995(this, EnumC0224.EP_2DTEXTURE_BOTTOM);
                    c09953.f8455 = (hr) cp.m491("effect/lens" + ((i2 & 1) + 1) + ".tga", hr.class);
                    c09953.f8446.f2019 = 10.0f;
                    c09953.f8440 = 333L;
                    c09953.f8438 = ((long) (((Math.random() * 2.0d) - 1.0d) * 166.0d)) + 333;
                    c09953.m1577(c09953.f8433, 3, 2.5f, 54.0f, 2.5f, 45.0f, -0.5f, 1.0f);
                    c09953.m1577(c09953.f8453, 0, 12.5f, 0.0f, 7.5f, 0.0f, -1.0f, 1.0f);
                    c09953.m1577(c09953.f8453, 1, 30.0f, 100.0f, -10.0f, 0.0f, 0.625f, -1.0f);
                    c09953.m1577(c09953.f8442, 0, i2 * 45, i2 * 45, 15.0f, 0.0f, 0.0f, 1.0f);
                    c09953.f8450 = 0.25f;
                    this.f8230.add(c09953);
                }
                break;
            case 12:
                m1542(f8220 ? "memor_min" : "Maemor");
                break;
            case 15:
            case 317:
                m1542("SafetyWall");
                break;
            case 18:
                C0358.f6663.m1535("effect/ef_bash.wav", 1.0f);
                C0995 c09954 = new C0995(this, EnumC0224.EP_CIRCLE);
                c09954.f8446.f2019 = 10.0f;
                c09954.f8438 = 667L;
                c09954.f8440 = 667L;
                c09954.f8455 = (hr) cp.m491("effect/alpha_down.tga", hr.class);
                c09954.m1577(c09954.f8453, 0, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                c09954.m1577(c09954.f8453, 1, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                c09954.f8454 = 0.6666667f;
                c09954.f8450 = 0.25f;
                c09954.f8444 = 0.15f;
                this.f8230.add(c09954);
                for (int i3 = 0; i3 < 20; i3++) {
                    C0995 c09955 = new C0995(this, EnumC0224.EP_2DFLASH);
                    c09955.f8446.f2019 = 10.0f;
                    c09955.f8438 = 667L;
                    c09955.f8440 = 667L;
                    c09955.f8455 = (hr) cp.m491("effect/alpha_center.tga", hr.class);
                    c09955.m1577(c09955.f8453, 1, 40.0f, 180.0f, -20.0f, 60.0f, 0.0f, 1.0f);
                    c09955.m1577(c09955.f8453, 3, 1.75f, 1.75f, 1.25f, 0.0f, 0.0f, 1.0f);
                    c09955.m1577(c09955.f8442, 0, 180.0f, 76.0f, -180.0f, 78.0f, -0.7f, 1.0f);
                    c09955.f8454 = 0.78431374f;
                    c09955.f8450 = 0.6666667f;
                    c09955.f8444 = 0.25f;
                    c09955.f8449 = 1.0f;
                    this.f8230.add(c09955);
                }
                break;
            case 19:
                C0358.f6663.m1535("effect/EF_MagnumBreak.wav", 1.0f);
                C0995 c09956 = new C0995(this, EnumC0224.EP_3DRING);
                c09956.f8431 = true;
                c09956.f8438 = 500L;
                c09956.f8440 = 500L;
                c09956.f8455 = (hr) cp.m491("effect/ring_yellow.tga", hr.class);
                c09956.m1577(c09956.f8442, 2, 90.0f, 90.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                c09956.m1577(c09956.f8433, 3, 0.0f, 37.5f, 0.0f, 0.0f, -0.5f, 1.0f);
                c09956.m1577(c09956.f8453, 0, 12.5f, 12.5f, 0.0f, 0.0f, 0.0f, 1.0f);
                c09956.f8444 = 0.5f;
                c09956.f8450 = 0.5f;
                this.f8230.add(c09956);
                C0995 c09957 = new C0995(this, EnumC0224.EP_3DSPHERE);
                c09957.f8438 = 500L;
                c09957.f8440 = 500L;
                c09957.f8455 = (hr) cp.m491("effect/대폭발.tga", hr.class);
                c09957.m1577(c09957.f8442, 2, 0.0f, 90.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                c09957.m1577(c09957.f8453, 0, 0.0f, 25.0f, 0.0f, 0.0f, -0.5f, 1.0f);
                C0995.Cif[] cifArr = c09957.f8453;
                C0995.Cif[] cifArr2 = c09957.f8453;
                C0995.Cif cif = c09957.f8453[0];
                cifArr2[2] = cif;
                cifArr[1] = cif;
                c09957.f8444 = 0.5f;
                c09957.f8450 = 0.5f;
                this.f8230.add(c09957);
                break;
            case 25:
            case 197:
                m1542("StoneCurse");
                break;
            case 27:
                m1542("Firewall" + (random.nextInt(2) + 1));
                break;
            case 31:
                m1542("Lightning");
                break;
            case 32:
                m1542("ThunderStorm");
                break;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                m1542("Cross");
                break;
            case 43:
            case 719:
                m1542(f8220 ? "jong_mini" : "Angelus");
                break;
            case 51:
            case 605:
                m1542("FireHit" + (random.nextInt(3) + 1));
                break;
            case 54:
                m1542("WindHit" + (random.nextInt(3) + 1));
                break;
            case 67:
                m1542("Invenom");
                break;
            case 68:
                m1542(f8220 ? "cure_min" : "Cure");
                break;
            case TFTP.DEFAULT_PORT /* 69 */:
                m1542("Provoke");
                break;
            case 70:
                m1542("Mvp");
                break;
            case 71:
                m1542("SkidTrap");
                break;
            case 72:
                m1542("Brandish");
                break;
            case 77:
                m1542(f8220 ? "gloria_min" : "Gloria");
                break;
            case 78:
                m1542(f8220 ? "magnificat_min" : "Magnificat");
                break;
            case FingerClient.DEFAULT_PORT /* 79 */:
                m1542(f8220 ? "resurrection_min" : "Resurrection");
                break;
            case vh.f5370 /* 80 */:
                m1542("Recovery");
                break;
            case 85:
                m1542("Sanctuary");
                break;
            case 86:
                m1542("Impositio");
                break;
            case 87:
                m1542(f8220 ? "lexaeterna_min" : "LexAeterna");
                break;
            case 88:
                m1542("Aspersio");
                break;
            case 89:
                m1542("LexDivina");
                break;
            case 90:
                m1542(f8220 ? "suffragium_min" : "Suffragium");
                break;
            case 91:
                m1542("StormGust");
                break;
            case 92:
                m1542("Lord");
                break;
            case 93:
                m1542("Benedictio");
                break;
            case 94:
                m1542("Meteor" + (random.nextInt(3) + 1));
                break;
            case 97:
                m1542("Quagmire").f1003 = false;
                break;
            case 98:
                m1542("FirePillar");
                break;
            case 99:
                m1542("FirePillarBomb");
                break;
            case 103:
                m1542("RepairWeapon");
                break;
            case 104:
                m1542("CrashEarth");
                break;
            case 105:
                m1542(f8220 ? "WeaponPerfection_min" : "WeaponPerfection");
                break;
            case 106:
                m1542(f8220 ? "maximize_min" : "MaximizePower");
                break;
            case 108:
                m1542("BlastMine");
                break;
            case 109:
                m1542("Claymore");
                break;
            case 110:
                m1542("Freezing");
                break;
            case 111:
                m1542("Bubble" + (random.nextInt(4) + 1));
                break;
            case 112:
                m1542("GasPush");
                break;
            case 113:
                m1542("Spring");
                break;
            case 114:
                m1542(f8220 ? "kyrie_min" : "Kyrie");
                break;
            case 115:
                m1542("Magnus");
                break;
            case TransportMediator.KEYCODE_MEDIA_PLAY /* 126 */:
                m1542("VenomDust");
                break;
            case 128:
                m1542("PoisonReact_1st");
                break;
            case 129:
                m1542("PoisonReact");
                break;
            case 131:
                m1542("VenomSplasher");
                break;
            case 132:
            case TelnetCommand.WONT /* 252 */:
            case 371:
                m1542("TwoHand");
                break;
            case 133:
                m1542("AutoCounter");
                break;
            case 135:
                m1542("Freeze");
                break;
            case 136:
                m1542("Freezed");
                break;
            case 137:
                m1542("IceCrash");
                break;
            case 138:
                m1542("slowp");
                break;
            case 141:
                m1542("SandMan");
                break;
            case IMAP.DEFAULT_PORT /* 143 */:
                m1542("Pneuma" + (random.nextInt(3) + 1));
                break;
            case 145:
                m1542("SonicBlow");
                break;
            case 146:
                m1542("Brandish2");
                break;
            case 147:
                m1542("ShockWave");
                break;
            case 148:
                m1542("ShockWaveHit");
                break;
            case 149:
                m1542("EarthHit");
                break;
            case FTPReply.FILE_STATUS_OK /* 150 */:
                m1542("Pierce");
                break;
            case 151:
                m1542("Bowling");
                break;
            case 152:
                m1542("SpearStab");
                break;
            case 153:
                m1542("SpearBoomerang");
                break;
            case 154:
                m1542("HolyHit");
                break;
            case 155:
            case 752:
                m1542("Concentration");
                break;
            case 156:
                m1542("bs_RefineSuccess");
                break;
            case 157:
                m1542("bs_RefineFailed");
                break;
            case 158:
                m1542("JobChange");
                break;
            case 159:
                m1542("LevelUP");
                break;
            case 160:
                m1542("JobLvUP");
                break;
            case 169:
                m1542("TamingSuccess");
                break;
            case 170:
                m1542("TamingFailed");
                break;
            case 171:
                m1542("EnergyCoat");
                break;
            case 172:
                m1542("CartRevolution");
                break;
            case 183:
                m1542("MentalBreak");
                break;
            case 184:
                m1542("magical");
                break;
            case 185:
                m1542("sui_explosion");
                break;
            case 187:
                m1542("suicide");
                break;
            case 188:
                m1542("yunta_1");
                break;
            case 189:
                m1542("yunta_2");
                break;
            case 190:
                m1542("yunta_3");
                break;
            case 191:
                m1542("yunta_4");
                break;
            case 192:
                m1542("yunta_5");
                break;
            case 193:
                m1542("homing");
                break;
            case 194:
                m1542("poison");
                break;
            case 195:
                m1542("silence");
                break;
            case 196:
                m1542("stun");
                break;
            case NNTPReply.DEBUG_OUTPUT /* 199 */:
                m1542("sleep");
                break;
            case 201:
                m1542("Pong" + (random.nextInt(3) + 1));
                break;
            case HttpStatus.SC_PARTIAL_CONTENT /* 206 */:
                m1542("빨간포션");
                break;
            case HttpStatus.SC_MULTI_STATUS /* 207 */:
                m1542("주홍포션");
                break;
            case 208:
                m1542("노란포션");
                break;
            case 209:
                m1542("하얀포션");
                break;
            case 210:
                m1542("파란포션");
                break;
            case 211:
                m1542("초록포션");
                break;
            case FTPReply.DIRECTORY_STATUS /* 212 */:
                m1542("fruit");
                break;
            case FTPReply.FILE_STATUS /* 213 */:
                m1542("fruit_");
                break;
            case FTPReply.NAME_SYSTEM_TYPE /* 215 */:
                m1542("Deffender");
                break;
            case 216:
                m1542("Keeping");
                break;
            case 220:
                m1542("집중");
                break;
            case 221:
                m1542("각성");
                break;
            case NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS /* 222 */:
            case 758:
                m1542("버서크");
                break;
            case TelnetCommand.EOF /* 236 */:
                m1542("spell");
                break;
            case TelnetCommand.SUSP /* 237 */:
                m1542("디스펠");
                break;
            case TelnetCommand.AYT /* 246 */:
                m1542("매직로드");
                break;
            case TelnetCommand.EC /* 247 */:
                m1542("holy_cross");
                break;
            case TelnetCommand.EL /* 248 */:
                m1542("shield_charge");
                break;
            case 250:
                m1542("providence");
                break;
            case TelnetCommand.DO /* 253 */:
                m1542("devotion");
                break;
            case 257:
                m1542("enc_fire");
                break;
            case 258:
                m1542("enc_ice");
                break;
            case 259:
                m1542("enc_wind");
                break;
            case 260:
                m1542("enc_earth");
                break;
            case 270:
                m1542("steal_coin");
                break;
            case 271:
                m1542("strip_weapon");
                break;
            case 272:
                m1542("strip_shield");
                break;
            case 273:
                m1542("strip_armor");
                break;
            case 274:
                m1542("strip_helm");
                break;
            case 275:
                m1542("연환");
                break;
            case HttpStatus.SC_TEMPORARY_REDIRECT /* 307 */:
                m1542("p_success");
                break;
            case 308:
                m1542("p_failed");
                break;
            case 311:
                this.f8227 = new lr(m1544());
                C0358.f6663.m1535("_heal_effect", 1.0f);
                C0995 c09958 = new C0995(this, EnumC0224.EP_2DTEXTURE);
                c09958.f8434 = new float[]{0.5f, 0.5f, 1.0f};
                c09958.f8446.f2019 = 12.0f;
                c09958.f8438 = 3000L;
                c09958.f8440 = 3000L;
                c09958.m1577(c09958.f8453, 3, 180.0f, 720.0f, -180.0f, 0.0f, 0.0f, 1.0f);
                c09958.f8455 = (hr) cp.m491("effect/pikapika2.bmp", hr.class);
                c09958.m1577(c09958.f8453, 0, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                c09958.m1577(c09958.f8453, 1, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                c09958.f8447 = 5.0f;
                c09958.m1577(c09958.f8442, 0, 180.0f, 180.0f, -180.0f, 0.0f, 0.0f, 1.0f);
                c09958.f8454 = 0.3137255f;
                c09958.f8450 = 0.11111111f;
                c09958.f8444 = 0.44444445f;
                c09958.f8430 = true;
                this.f8230.add(c09958);
                break;
            case 313:
                m1542("loud");
                break;
            case 339:
                m1542("look 158");
                break;
            case 373:
                m1542("angel");
                break;
            case 374:
            case 1026:
                m1542("devil");
                break;
            case 392:
                m1542("melt");
                break;
            case 393:
                m1542("cart");
                break;
            case 394:
                m1542("sword");
                break;
            case HttpStatus.SC_REQUEST_TIMEOUT /* 408 */:
                m1542("소울번");
                break;
            case HttpStatus.SC_CONFLICT /* 409 */:
                m1542("사람효과");
                break;
            case 442:
                m1542("asum");
                break;
            case 493:
                m1542("찹쌀떡");
                break;
            case 494:
                m1542("ramadan");
                break;
            case 509:
                m1542("mapae");
                break;
            case 510:
            case 614:
                m1542("itempokjuk");
                break;
            case 567:
                m1542("moonlight_1");
                break;
            case 568:
                m1542("moonlight_2");
                break;
            case 569:
                m1542("moonlight_3");
                break;
            case 570:
                m1542("h_levelup");
                break;
            case 571:
                m1542("defense");
                break;
            case 595:
                m1542("food_str");
                break;
            case 596:
                m1542("food_int");
                break;
            case 597:
                m1542("food_vit");
                break;
            case 598:
                m1542("food_agi");
                break;
            case 599:
                m1542("food_dex");
                break;
            case 600:
                m1542("food_luk");
                break;
            case 610:
                m1542("cook_suc");
                break;
            case 611:
                m1542("cook_fail");
                break;
            case 637:
                m1542("fire dragon");
                break;
            case 638:
                m1542("icy");
                break;
            case 648:
                m1542("트랙킹");
                break;
            case 651:
                m1542("불스아이");
                break;
            case 670:
            case 672:
                m1542("dfear");
                break;
            case 671:
                m1542("wideb");
                break;
            case 679:
                m1542("cwound");
                break;
            case 701:
                m1542("flower_leaf");
                break;
            case 706:
                m1542("mobile_ef02");
                break;
            case 707:
                m1542("mobile_ef01");
                break;
            case 708:
                m1542("mobile_ef03");
                break;
            case 710:
                m1542("storm_min");
                break;
            case 711:
                m1542("pokjuk_jap");
                break;
            case 723:
                m1542("ado");
                break;
            case 724:
                m1542("이그니션브레이크");
                break;
            case 729:
                m1542("crimson_r");
                break;
            case 730:
                m1542("hell_in");
                break;
            case 733:
                m1542("dragon_h");
                break;
            case 736:
                m1542("chainlight");
                break;
            case 747:
                m1542("aimed");
                break;
            case 748:
                m1542("arrowstorm");
                break;
            case 749:
                m1542("laulamus");
                break;
            case 750:
                m1542("lauagnus");
                break;
            case 751:
                m1542("mil_shield");
                break;
            case 797:
                m1542("powerswing");
                break;
            case 815:
                m1542("enervation");
                break;
            case 816:
                m1542("groomy");
                break;
            case 817:
                m1542("ignorance");
                break;
            case 818:
                m1542("laziness");
                break;
            case 819:
                m1542("unlucky");
                break;
            case 820:
                m1542("weakness");
                break;
            case 922:
                m1542("Firewall_per");
                break;
            case 928:
                m1542("hunter_shockwave_blue");
                break;
            case 961:
                m1542("poison_mist");
                break;
            case 962:
                m1542("eraser_cutter");
                break;
            case 966:
                m1542("lava_slide");
                break;
            case 967:
                m1542("sonic_claw");
                break;
            case 968:
                m1542("tinder");
                break;
            case 969:
                m1542("mid_frenzy");
                break;
            case 977:
                m1542("vash00");
                break;
            case FTPSClient.DEFAULT_FTPS_DATA_PORT /* 989 */:
                m1542("rwc2011");
                break;
            case FTPSClient.DEFAULT_FTPS_PORT /* 990 */:
                m1542("rwc2011_2");
                break;
            case 1008:
                m1542("100");
                break;
            case 1017:
                m1542("rune_success");
                break;
            case 1018:
                m1542("rune_fail");
                break;
            case 1019:
                m1542("changematerial_su");
                break;
            case 1020:
                m1542("changematerial_fa");
                break;
            case 1021:
                m1542("Guardian");
                break;
            case 1022:
                m1542("bubble%d_1");
                break;
            case RCommandClient.MAX_CLIENT_PORT /* 1023 */:
                m1542("dust");
                break;
            case 1024:
                m1542("dancingblade");
                break;
            case InputDeviceCompat.SOURCE_GAMEPAD /* 1025 */:
                m1542("INVINCIBLEOFF2");
                break;
            case 1027:
                m1542("gc_darkcrow");
                break;
            case 1029:
                m1542("all_full_throttle");
                break;
            case 1030:
                m1542("sr_flashcombo");
                break;
            case 1031:
                m1542("rk_luxanima");
                break;
            case 1032:
                m1542("so_elemental_shield");
                break;
            case 1033:
                m1542("AB_OFFERTORIUM");
                break;
            case 1035:
                m1542("GN_ILLUSIONDOPING");
                break;
            case 1036:
                m1542("NC_MAGMA_ERUPTION");
                break;
            case 1041:
                m1542("chill");
                break;
            case 1043:
                m1542("WL_TELEKINESIS_INTENSE");
                break;
        }
        if (this.f8230.size() == 0) {
            this.f8230 = null;
        }
    }
}
