package o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpHost;
import org.apache.http.cookie.ClientCookie;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class pj {

    /* renamed from: 櫯, reason: contains not printable characters */
    public EnumC0076 f4609;

    public static String FORCE_SERVER_IP = "127.0.0.1"; // Set your server IP here
    public static int FORCE_SERVER_PORT = 6900; // Set your server Port here

    /* renamed from: 鷭, reason: contains not printable characters */
    public EnumC0075 f4610;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public String f4608 = null;

    /* renamed from: ȃ, reason: contains not printable characters */
    public ArrayList<C0079> f4607 = new ArrayList<>();

    /* renamed from: o.pj$if, reason: invalid class name */
    public enum Cif {
        Korea,
        America,
        Japan,
        China,
        Taiwan,
        Thai,
        Indonesia,
        Philippine,
        Malaysia,
        Singapore,
        Germany,
        India,
        Brazil,
        Australia,
        Russia,
        Vietnam,
        Unknown,
        Chile,
        France,
        UAE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }
    }

    /* renamed from: o.pj$Ć, reason: contains not printable characters */
    public enum EnumC0075 {
        KOREA,
        AMERICA,
        RUSSIA,
        FRANCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0075[] valuesCustom() {
            EnumC0075[] enumC0075ArrValuesCustom = values();
            int length = enumC0075ArrValuesCustom.length;
            EnumC0075[] enumC0075Arr = new EnumC0075[length];
            System.arraycopy(enumC0075ArrValuesCustom, 0, enumC0075Arr, 0, length);
            return enumC0075Arr;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static EnumC0075 m1030(String str) {
            EnumC0075[] enumC0075ArrValuesCustom = valuesCustom();
            String upperCase = str.toUpperCase();
            for (EnumC0075 enumC0075 : enumC0075ArrValuesCustom) {
                if (upperCase.equals(enumC0075.name())) {
                    return enumC0075;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pj$ȃ, reason: contains not printable characters */
    public enum EnumC0076 {
        PRIMARY,
        SAKRAY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0076[] valuesCustom() {
            EnumC0076[] enumC0076ArrValuesCustom = values();
            int length = enumC0076ArrValuesCustom.length;
            EnumC0076[] enumC0076Arr = new EnumC0076[length];
            System.arraycopy(enumC0076ArrValuesCustom, 0, enumC0076Arr, 0, length);
            return enumC0076Arr;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static EnumC0076 m1032(String str) {
            EnumC0076[] enumC0076ArrValuesCustom = valuesCustom();
            String upperCase = str.toUpperCase();
            for (EnumC0076 enumC0076 : enumC0076ArrValuesCustom) {
                if (upperCase.equals(enumC0076.name())) {
                    return enumC0076;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pj$Ą, reason: contains not printable characters */
    public enum EnumC0074 {
        AEGIS,
        ATHENA,
        HERCULES;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0074[] valuesCustom() {
            EnumC0074[] enumC0074ArrValuesCustom = values();
            int length = enumC0074ArrValuesCustom.length;
            EnumC0074[] enumC0074Arr = new EnumC0074[length];
            System.arraycopy(enumC0074ArrValuesCustom, 0, enumC0074Arr, 0, length);
            return enumC0074Arr;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static EnumC0074 m1028(String str) {
            for (EnumC0074 enumC0074 : valuesCustom()) {
                if (enumC0074.name().equalsIgnoreCase(str)) {
                    return enumC0074;
                }
            }
            return null;
        }
    }

    public enum aux {
        iRO_Renewal,
        fRO,
        kRO,
        MOTR,
        MOTR_home,
        XileRO,
        AevaRO,
        AtlasRO,
        FreeRO,
        MyRO,
        ChenRO,
        WeDevGames,
        ROProviderValkyrie,
        TheClassicROCom,
        ClassicRONet,
        InfamyRO,
        PlayragnarokPh,
        SarahServer,
        SuccessRoNet,
        PhoenixRO,
        CrownRO,
        Eden3,
        Class2RO,
        ShinServer,
        EosRagnarokOnline,
        TyrServer,
        MobiRO,
        XileROOS,
        PlayLokiServerCom,
        FreeRoWeb,
        OldchaosROCom,
        CreativeKingsRO,
        LidiaRO,
        Gugusjungs57572,
        RagnarevivalCom,
        RebirthRO_Ancyker,
        BarnabyRO,
        Ragnaclan,
        ThaiRoInTh,
        LeonardRO,
        IfritRagnarokCom,
        AmatsuRO,
        FreePlayRoCom,
        RoHeimdallCom,
        Thai_id9169,
        PlayvalhallaPh,
        Classic2RoInTh,
        Daro,
        iPlayRo201804,
        AustinRO,
        BrightRO,
        TitanRO,
        RoFaction,
        WeloveRo,
        KafraRO,
        ChaosReborn,
        RagnarokReturnPh,
        GachoRO,
        RoRetro,
        LibRO,
        SecretRO,
        NorseRO,
        Trinity_Reborn_Full,
        AlbertaServer,
        hiclassro,
        OldschoolragnarokCom,
        Ragnarevo,
        CrazyPoring,
        LucianoRO,
        GarciaRO,
        Blytanias,
        PinoyRO,
        OMGRO,
        RagnarokPuzzle,
        Modify_Full,
        Newyear,
        GRANDRO,
        SakrayPh,
        MyRebornRO,
        XileRO2019,
        eSport2019,
        PhoenixRO2,
        OcrClassicCom,
        RoFreedom,
        C2RO,
        RelaxRO,
        BgRO,
        ROClashed,
        ForceRO,
        KryptGamingClassic,
        OSRO2019,
        NewFenrirRoGameNet,
        RagnarokIsLife,
        LevelRO,
        OfficialragnarokCom,
        PayonRO,
        OsirisRO,
        ROComfy,
        RoPronteraEp5,
        LeviathanRO,
        Ragnajapan,
        EarlyRO,
        BurnRO,
        PlayValhallaNet,
        DarkRO,
        EliteRO,
        BalikRagnaPH,
        SolaceRO,
        PhRoNet,
        MidgardRO,
        eA;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static aux[] valuesCustom() {
            aux[] auxVarArrValuesCustom = values();
            int length = auxVarArrValuesCustom.length;
            aux[] auxVarArr = new aux[length];
            System.arraycopy(auxVarArrValuesCustom, 0, auxVarArr, 0, length);
            return auxVarArr;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static aux m1025(String str) {
            for (aux auxVar : valuesCustom()) {
                if (str.equalsIgnoreCase(auxVar.name())) {
                    return auxVar;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pj$櫯, reason: contains not printable characters */
    public enum EnumC0078 {
        ru,
        gb,
        us,
        sg,
        th,
        ph,
        eu,
        id;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0078[] valuesCustom() {
            EnumC0078[] enumC0078ArrValuesCustom = values();
            int length = enumC0078ArrValuesCustom.length;
            EnumC0078[] enumC0078Arr = new EnumC0078[length];
            System.arraycopy(enumC0078ArrValuesCustom, 0, enumC0078Arr, 0, length);
            return enumC0078Arr;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static EnumC0078 m1036(String str) {
            for (EnumC0078 enumC0078 : valuesCustom()) {
                if (str.equalsIgnoreCase(enumC0078.name())) {
                    return enumC0078;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pj$ˮ͈, reason: contains not printable characters */
    public enum EnumC0077 {
        official,
        neoncube,
        thor;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0077[] valuesCustom() {
            EnumC0077[] enumC0077ArrValuesCustom = values();
            int length = enumC0077ArrValuesCustom.length;
            EnumC0077[] enumC0077Arr = new EnumC0077[length];
            System.arraycopy(enumC0077ArrValuesCustom, 0, enumC0077Arr, 0, length);
            return enumC0077Arr;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static EnumC0077 m1034(String str) {
            for (EnumC0077 enumC0077 : valuesCustom()) {
                if (str.equalsIgnoreCase(enumC0077.name())) {
                    return enumC0077;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pj$鷭, reason: contains not printable characters */
    public class C0079 {

        /* renamed from: Ą, reason: contains not printable characters */
        public int f4769;

        /* renamed from: ą, reason: contains not printable characters */
        public int f4770;

        /* renamed from: Ć, reason: contains not printable characters */
        public aux f4771;

        /* renamed from: ć, reason: contains not printable characters */
        public EnumC0078[] f4772;

        /* renamed from: ċ, reason: contains not printable characters */
        public String f4773;

        /* renamed from: đ, reason: contains not printable characters */
        public int f4774;

        /* renamed from: Ē, reason: contains not printable characters */
        public int f4775;

        /* renamed from: ē, reason: contains not printable characters */
        public EnumC0074 f4776;

        /* renamed from: Ė, reason: contains not printable characters */
        public boolean f4777;

        /* renamed from: ė, reason: contains not printable characters */
        public boolean f4778;

        /* renamed from: Ę, reason: contains not printable characters */
        public boolean f4779;

        /* renamed from: ę, reason: contains not printable characters */
        public boolean f4780;

        /* renamed from: ġ, reason: contains not printable characters */
        public boolean f4781;

        /* renamed from: ģ, reason: contains not printable characters */
        public boolean f4782;

        /* renamed from: Ĥ, reason: contains not printable characters */
        public boolean f4783;

        /* renamed from: ĥ, reason: contains not printable characters */
        public boolean f4784;

        /* renamed from: Ħ, reason: contains not printable characters */
        public boolean f4785;

        /* renamed from: ħ, reason: contains not printable characters */
        public boolean f4786;

        /* renamed from: Ĩ, reason: contains not printable characters */
        public boolean f4787;

        /* renamed from: Ī, reason: contains not printable characters */
        public boolean f4788;

        /* renamed from: ī, reason: contains not printable characters */
        public boolean f4789;

        /* renamed from: Ĭ, reason: contains not printable characters */
        public boolean f4790;

        /* renamed from: Į, reason: contains not printable characters */
        public boolean f4791;

        /* renamed from: į, reason: contains not printable characters */
        public boolean f4792;

        /* renamed from: ĸ, reason: contains not printable characters */
        public boolean f4793;

        /* renamed from: ĺ, reason: contains not printable characters */
        public int f4794;

        /* renamed from: Ļ, reason: contains not printable characters */
        public int f4795;

        /* renamed from: Ľ, reason: contains not printable characters */
        public boolean f4796;

        /* renamed from: Ŀ, reason: contains not printable characters */
        public boolean f4797;

        /* renamed from: ō, reason: contains not printable characters */
        public boolean f4798;

        /* renamed from: Ŏ, reason: contains not printable characters */
        public boolean f4799;

        /* renamed from: ŏ, reason: contains not printable characters */
        public int f4800;

        /* renamed from: Œ, reason: contains not printable characters */
        public int f4802;

        /* renamed from: Ŕ, reason: contains not printable characters */
        public int f4804;

        /* renamed from: Ŗ, reason: contains not printable characters */
        public int f4805;

        /* renamed from: ŗ, reason: contains not printable characters */
        public boolean f4806;

        /* renamed from: ř, reason: contains not printable characters */
        public boolean f4807;

        /* renamed from: ś, reason: contains not printable characters */
        public boolean f4808;

        /* renamed from: ȃ, reason: contains not printable characters */
        public String f4809;

        /* renamed from: Ȋ, reason: contains not printable characters */
        public String f4810;

        /* renamed from: Ƞ, reason: contains not printable characters */
        public boolean f4811;

        /* renamed from: ɕ, reason: contains not printable characters */
        public boolean f4812;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public String f4813;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        public Cif f4814;

        /* renamed from: غ, reason: contains not printable characters */
        public boolean f4815;

        /* renamed from: ف, reason: contains not printable characters */
        public boolean f4816;

        /* renamed from: ܕ, reason: contains not printable characters */
        public String f4817;

        /* renamed from: ܨ, reason: contains not printable characters */
        public boolean f4818;

        /* renamed from: ঽ্, reason: contains not printable characters */
        public boolean f4819;

        /* renamed from: ਓ, reason: contains not printable characters */
        public String f4820;

        /* renamed from: 㥳, reason: contains not printable characters */
        public boolean f4821;

        /* renamed from: 㱽, reason: contains not printable characters */
        public boolean f4822;

        /* renamed from: 㵼, reason: contains not printable characters */
        public boolean f4823;

        /* renamed from: 㺗, reason: contains not printable characters */
        public boolean f4824;

        /* renamed from: 㺳, reason: contains not printable characters */
        public int f4825;

        /* renamed from: 䆬, reason: contains not printable characters */
        public boolean f4826;

        /* renamed from: 䍼, reason: contains not printable characters */
        public String f4827;

        /* renamed from: 䒧, reason: contains not printable characters */
        public int[] f4828;

        /* renamed from: 䕌, reason: contains not printable characters */
        public boolean f4829;

        /* renamed from: 䲑, reason: contains not printable characters */
        public boolean f4830;

        /* renamed from: 䲕, reason: contains not printable characters */
        public boolean f4831;

        /* renamed from: 囃, reason: contains not printable characters */
        public boolean f4832;

        /* renamed from: 坴, reason: contains not printable characters */
        public boolean f4833;

        /* renamed from: 岱, reason: contains not printable characters */
        public String f4834;

        /* renamed from: 崲, reason: contains not printable characters */
        public boolean f4835;

        /* renamed from: 差, reason: contains not printable characters */
        public boolean f4836;

        /* renamed from: 庸, reason: contains not printable characters */
        public int f4837;

        /* renamed from: 廂, reason: contains not printable characters */
        public boolean f4838;

        /* renamed from: 廅, reason: contains not printable characters */
        public boolean f4839;

        /* renamed from: 廑, reason: contains not printable characters */
        public boolean f4840;

        /* renamed from: 廕, reason: contains not printable characters */
        public boolean f4841;

        /* renamed from: 櫯, reason: contains not printable characters */
        public String f4842;

        /* renamed from: 漐, reason: contains not printable characters */
        public boolean f4843;

        /* renamed from: 瞣, reason: contains not printable characters */
        public boolean f4844;

        /* renamed from: 簇, reason: contains not printable characters */
        public boolean f4845;

        /* renamed from: 纫, reason: contains not printable characters */
        public String f4846;

        /* renamed from: 躆, reason: contains not printable characters */
        public byte f4847;

        /* renamed from: 釳, reason: contains not printable characters */
        public boolean f4850;

        /* renamed from: 鷭, reason: contains not printable characters */
        public String f4851;

        /* renamed from: 麹, reason: contains not printable characters */
        public String f4852;

        /* renamed from: 黬, reason: contains not printable characters */
        public boolean f4853;

        /* renamed from: 齴, reason: contains not printable characters */
        public boolean f4854;

        /* renamed from: 냆, reason: contains not printable characters */
        public String f4856;

        /* renamed from: 띥, reason: contains not printable characters */
        public boolean f4858;

        /* renamed from: 윬, reason: contains not printable characters */
        public int f4859;

        /* renamed from: 진, reason: contains not printable characters */
        public String f4861;

        /* renamed from: 釫, reason: contains not printable characters */
        public ArrayList<C0080> f4848 = new ArrayList<>();

        /* renamed from: ꑣ, reason: contains not printable characters */
        public ArrayList<String> f4855 = new ArrayList<>();

        /* renamed from: 졸, reason: contains not printable characters */
        public ArrayList<Integer> f4860 = new ArrayList<>();

        /* renamed from: 釯, reason: contains not printable characters */
        public ArrayList<String> f4849 = new ArrayList<>();

        /* renamed from: ő, reason: contains not printable characters */
        public boolean f4801 = false;

        /* renamed from: œ, reason: contains not printable characters */
        public ArrayList<String> f4803 = new ArrayList<>();

        /* renamed from: o.pj$鷭$鷭, reason: contains not printable characters */
        public class C0080 {

            /* renamed from: Ą, reason: contains not printable characters */
            public String f4862;

            /* renamed from: ȃ, reason: contains not printable characters */
            public String f4864;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            public String f4865;

            /* renamed from: 櫯, reason: contains not printable characters */
            public String f4866;

            /* renamed from: 鷭, reason: contains not printable characters */
            public EnumC0077 f4867;

            C0080(NodeList nodeList) throws DOMException {
                this.f4867 = EnumC0077.official;
                int length = nodeList.getLength();
                for (int i = 0; i < length; i++) {
                    Node nodeItem = nodeList.item(i);
                    String nodeName = nodeItem.getNodeName();
                    String textContent = nodeItem.getTextContent();
                    if (nodeName.equals("type")) {
                        this.f4867 = EnumC0077.m1034(textContent);
                    } else if (nodeName.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                        this.f4866 = textContent;
                    } else if (nodeName.equals("ftp")) {
                        this.f4865 = textContent;
                    } else if (nodeName.equals("grf")) {
                        this.f4864 = textContent;
                    } else if (nodeName.equals("inf")) {
                        this.f4862 = textContent;
                    }
                }
            }
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        private void m1039(NodeList nodeList) throws DOMException {
            int i = 0;
            int length = nodeList.getLength();
            this.f4828 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                Node nodeItem = nodeList.item(i2);
                String nodeName = nodeItem.getNodeName();
                String textContent = nodeItem.getTextContent();
                if (nodeName.equals("admin")) {
                    try {
                        int i3 = i;
                        i++;
                        this.f4828[i3] = Integer.parseInt(textContent);
                    } catch (NumberFormatException unused) {
                        pc.m997("invalid clientinfo <admin> value: " + textContent);
                    }
                }
            }
            this.f4828 = Arrays.copyOf(this.f4828, i);
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        private void m1038() {
            boolean z;
            boolean z2;
            boolean z3;
            this.f4821 = this.f4800 >= 20101116;
            this.f4777 = this.f4800 >= 20110111;
            this.f4778 = (this.f4800 >= 20100720 && this.f4800 <= 20100727) || this.f4800 >= 20100803;
            this.f4779 = this.f4800 >= 20100803;
            this.f4780 = this.f4771 == aux.MyRO || !this.f4779;
            this.f4819 = this.f4771 == aux.iRO_Renewal || this.f4800 >= 20111116;
            this.f4832 = this.f4771 == aux.iRO_Renewal || this.f4800 >= 20111116;
            this.f4838 = this.f4800 >= 2010803;
            if (this.f4771 == aux.iRO_Renewal) {
                z = this.f4800 >= 20140909;
            } else if (this.f4771 == aux.MOTR || this.f4771 == aux.MOTR_home) {
                z = this.f4800 >= 20150301;
            } else {
                z = this.f4800 >= 20120925;
            }
            this.f4823 = z;
            this.f4811 = this.f4800 >= 20091104;
            this.f4818 = this.f4800 >= 20141020 && this.f4771 != aux.iRO_Renewal;
            this.f4783 = this.f4800 >= 20141016 || this.f4771 == aux.iRO_Renewal;
            this.f4784 = this.f4800 >= 20170830 || this.f4802 >= 44;
            this.f4782 = this.f4800 >= 20151001 || this.f4771 == aux.iRO_Renewal;
            this.f4785 = this.f4800 >= 20150225 || this.f4802 >= 39 || this.f4771 == aux.iRO_Renewal;
            this.f4791 = this.f4800 >= 20130911 || this.f4771 == aux.iRO_Renewal;
            boolean z4 = this.f4771 == aux.iRO_Renewal || this.f4800 >= 20130710;
            this.f4792 = z4;
            this.f4844 = this.f4800 <= 20061023;
            this.f4829 = this.f4800 > 20100730;
            this.f4861 = this.f4800 <= 20120410 ? null : "itemInfo.lub";
            this.f4806 = !this.f4833 && this.f4800 >= 20080827;
            this.f4815 = this.f4800 < 20110222;
            this.f4822 = this.f4771 == aux.XileRO || this.f4814 == Cif.Germany;
            this.f4786 = this.f4802 > 0 ? this.f4802 >= 43 : this.f4800 >= 20160921;
            this.f4787 = this.f4800 >= 20180307 || (this.f4833 && this.f4800 >= 20180221);
            this.f4850 = this.f4800 <= 20100713;
            if (this.f4801) {
                z2 = this.f4800 >= 20181114;
            } else if (this.f4833) {
                z2 = this.f4800 >= 20180704;
            } else {
                z2 = this.f4800 >= 20181121;
            }
            this.f4830 = z2;
            if (this.f4833) {
                z3 = this.f4800 >= 20180912;
            } else if (this.f4801) {
                z3 = this.f4800 >= 20180919;
            } else {
                z3 = this.f4800 >= 20181002;
            }
            this.f4845 = z3;
            this.f4854 = this.f4800 < 20131218;
            this.f4836 = this.f4800 < 20130717;
            this.f4831 = this.f4800 >= 20170726;
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        private void m1037(NodeList nodeList) throws DOMException {
            int length = nodeList.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = nodeList.item(i);
                String nodeName = nodeItem.getNodeName();
                String textContent = nodeItem.getTextContent();
                if (nodeName.equals("image")) {
                    this.f4803.add(textContent);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v279, types: [java.lang.Object[]] */
        C0079(NodeList nodeList) throws DOMException {
            this.f4771 = aux.eA;
            this.f4772 = new EnumC0078[0];
            this.f4776 = EnumC0074.HERCULES;
            this.f4824 = true;
            this.f4800 = 20171227;
            this.f4833 = true;
            this.f4802 = 0;
            boolean z = false;
            int length = nodeList.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = nodeList.item(i);
                String nodeName = nodeItem.getNodeName();
                String textContent = nodeItem.getTextContent();
                if (nodeItem.getNodeType() != 8) {
                    if (nodeName.equals("eathena") || nodeName.equals("max_guildpositions")) {
                        pc.m995();
                    } else if (nodeName.equals("display")) {
                        this.f4851 = textContent;
                    } else if (nodeName.equals("desc")) {
                        this.f4842 = textContent;
                    } else if (nodeName.equals("balloon")) {
                        this.f4813 = textContent;
                    } else if (nodeName.equals("address")) {
                        this.f4809 = textContent;
                    } else if (nodeName.equals(ClientCookie.PORT_ATTR)) {
                        this.f4769 = Integer.parseInt(textContent);
                    } else if (nodeName.equals(ClientCookie.VERSION_ATTR)) {
                        this.f4770 = Integer.parseInt(textContent);
                        if (this.f4770 > 20000101) {
                            this.f4800 = this.f4770;
                            m1038();
                            z = true;
                        }
                    } else if (nodeName.equals("langtype")) {
                        this.f4814 = Cif.valuesCustom()[Integer.parseInt(textContent)];
                    } else if (nodeName.equals("registrationweb")) {
                        this.f4810 = textContent;
                    } else if (nodeName.equals("aid") || nodeName.equals("yellow")) {
                        m1039(nodeItem.getChildNodes());
                    } else if (nodeName.equals("loading")) {
                        m1037(nodeItem.getChildNodes());
                    } else if (nodeName.equals("type")) {
                        this.f4771 = aux.m1025(textContent);
                        m1038();
                        z = true;
                    } else if (nodeName.equals("platform")) {
                        this.f4776 = EnumC0074.m1028(textContent);
                    } else if (nodeName.equals("packetver")) {
                        this.f4800 = Integer.parseInt(textContent);
                        m1038();
                        z = true;
                    } else if (nodeName.equals("packetver_re")) {
                        this.f4833 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("nationality")) {
                        EnumC0078[] enumC0078Arr = this.f4772;
                        EnumC0078 enumC0078M1036 = EnumC0078.m1036(textContent);
                        enumC0078Arr = enumC0078Arr == null ? (Object[]) Array.newInstance(enumC0078M1036.getClass(), 0)
                                : enumC0078Arr;
                        Object[] objArrCopyOf = Arrays.copyOf(enumC0078Arr, enumC0078Arr.length + 1);
                        objArrCopyOf[enumC0078Arr.length] = enumC0078M1036;
                        this.f4772 = (EnumC0078[]) objArrCopyOf;
                    } else if (nodeName.equals("website")) {
                        this.f4834 = textContent;
                    } else if (nodeName.equals("clientver2")) {
                        this.f4847 = (byte) Integer.parseInt(textContent);
                    } else if (nodeName.equals("res")) {
                        this.f4855.add(textContent);
                    } else if (nodeName.equals("res-port")) {
                        this.f4860.add(Integer.valueOf(Integer.parseInt(textContent)));
                    } else if (nodeName.equals("res-subdir")) {
                        this.f4827 = textContent;
                    } else if (nodeName.equals("grf")) {
                        this.f4849.add(textContent);
                    } else if (nodeName.equals("dataini")) {
                        this.f4856 = textContent;
                    } else if (nodeName.equals("patchserver") || nodeName.equals("patchserver2")) {
                        this.f4848.add(new C0080(nodeItem.getChildNodes()));
                    } else if (nodeName.equals("iteminfo") || nodeName.equals("iteminfo2")) {
                        this.f4861 = textContent;
                        if (textContent.equals("txt")) {
                            this.f4861 = null;
                        }
                    } else if (nodeName.equals("luafiles514")) {
                        this.f4829 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("hardcoded_weapontable")) {
                        this.f4850 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("hardcoded_unitviewdb_lubs")) {
                        this.f4843 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("support_stop_packet")) {
                        this.f4839 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("ping")) {
                        this.f4817 = textContent;
                    } else if (nodeName.equals("pingport")) {
                        this.f4837 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("support_billing")) {
                        this.f4858 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("suppress_sprite_errors")) {
                        this.f4824 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("read_lua_before_lub")) {
                        this.f4799 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("multiencoded_chatmessages")) {
                        this.f4822 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("use_allinone_palettes")) {
                        this.f4793 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("use_default_packet_encryption")) {
                        this.f4781 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("packetdb_packetver")) {
                        this.f4802 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("increase_max_hairstyles")) {
                        this.f4794 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("increase_max_haircolors")) {
                        this.f4795 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("use_2nd_body_palettes_for_3rd")) {
                        this.f4840 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("use_2nd_body_palettes_for_trans")) {
                        this.f4788 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("enforce_login_address_on_char_and_map")) {
                        this.f4789 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("strict_server2client_hairstyle")) {
                        this.f4790 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("txt_skilldb")) {
                        this.f4798 = Boolean.valueOf(textContent).booleanValue();
                        if (this.f4798) {
                            this.f4829 = true;
                        }
                    } else if (nodeName.equals("xray")) {
                        this.f4841 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("gepard_shield_ver")) {
                        this.f4804 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("gepard_grf_hash")) {
                        this.f4825 = (int) Long.valueOf(textContent).longValue();
                    } else if (nodeName.equals("gepard30_version")) {
                        this.f4805 = (int) Long.valueOf(textContent).longValue();
                    } else if (nodeName.equals("matk_with_tilde")) {
                        this.f4806 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("redundant_updatemes_andro_ver")) {
                        this.f4774 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("min_andro_version")) {
                        this.f4775 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("read_data_directory_first")) {
                        this.f4812 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("hide_quickcashshop_button")) {
                        this.f4815 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("mapserver_sends_tick_in_skillunits")) {
                        this.f4853 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("use_static_gepard_info")) {
                        this.f4835 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("reset_passweb")) {
                        this.f4773 = textContent;
                    } else if (nodeName.equals("cashshop_web")) {
                        this.f4846 = textContent;
                    } else if (nodeName.equals("hide_login_background")) {
                        this.f4796 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("fileserver_url")) {
                        this.f4820 = textContent;
                    } else if (nodeName.equals("fileserver_is_latin1")) {
                        this.f4797 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("fileserver_filelist_url")) {
                        this.f4852 = textContent;
                    } else if (nodeName.equals("use_email_for_chardelete")) {
                        this.f4780 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("shared_body_palettes_type2")) {
                        this.f4807 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("enforce_login_background_id")) {
                        this.f4859 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("disable_doram_creation")) {
                        this.f4816 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("use_sso_login_packet")) {
                        this.f4808 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("disable_rodex")) {
                        this.f4854 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("login_show_approx_online")) {
                        this.f4831 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("disable_bank")) {
                        this.f4836 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("send_andro_detection_chat_packet")) {
                        this.f4826 = Boolean.parseBoolean(textContent);
                    } else if (!nodeName.equals("#text") || textContent.trim().length() > 0) {
                        pc.m997("Unknown clientinfo option " + nodeName + " value=" + textContent);
                    }
                }
            }
            if (!z) {
                m1038();
            }
            if (this.f4800 <= 20120410 && this.f4861 != null) {
                pc.m997("Server " + this.f4851 + " has iteminfo enabled while " + this.f4800
                        + " client still does not support it");
            }

            if (pj.FORCE_SERVER_IP != null && !pj.FORCE_SERVER_IP.isEmpty()) {
                this.f4809 = pj.FORCE_SERVER_IP;
            }
            if (pj.FORCE_SERVER_PORT > 0) {
                this.f4769 = pj.FORCE_SERVER_PORT;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1023(ByteArrayInputStream byteArrayInputStream) throws SAXException, DOMException, IOException {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
            this.f4608 = document.getXmlEncoding();
            NodeList childNodes = document.getDocumentElement().getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = childNodes.item(i);
                String nodeName = nodeItem.getNodeName();
                String textContent = nodeItem.getTextContent();
                if (nodeName.equals("servicetype")) {
                    this.f4610 = EnumC0075.m1030(textContent);
                } else if (nodeName.equals("servertype")) {
                    this.f4609 = EnumC0076.m1032(textContent);
                } else if (nodeName.equals("connection")) {
                    this.f4607.add(new C0079(nodeItem.getChildNodes()));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParserConfigurationException e2) {
            throw new RuntimeException(e2);
        } catch (SAXException e3) {
            throw new RuntimeException(e3);
        }
    }

    public pj(byte[] bArr) throws SAXException, DOMException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            m1023(byteArrayInputStream);
            byteArrayInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
