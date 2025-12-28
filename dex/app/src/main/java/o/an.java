package o;

import java.nio.ByteBuffer;
import java.util.HashMap;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class an extends tx {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    protected HashMap<Class<? extends vg>, C0022> f675;

    /* renamed from: 櫯, reason: contains not printable characters */
    int[] f676;

    /* renamed from: o.an$鷭, reason: contains not printable characters */
    public class C0022 {

        /* renamed from: ȃ, reason: contains not printable characters */
        int[] f678;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f679;

        /* renamed from: 櫯, reason: contains not printable characters */
        short f680;

        /* renamed from: 鷭, reason: contains not printable characters */
        Class<? extends vg> f681;

        C0022(Class<? extends vg> cls, int i, int i2, int[] iArr) {
            this.f681 = cls;
            this.f680 = (short) i;
            this.f679 = i2;
            this.f678 = iArr;
        }
    }

    /* renamed from: 鷭 */
    public void mo434(vg vgVar, ByteBuffer byteBuffer, int i) {
        Class<?> cls = vgVar.getClass();
        C0022 c0022 = this.f675.get(cls);
        if (c0022 == null) {
            return;
        }
        new StringBuilder("Remapped ").append(cls).append(" -> 0x").append(Integer.toHexString(c0022.f680));
        byteBuffer.putShort(i, c0022.f680);
    }

    @Override // o.tx
    /* renamed from: 鷭 */
    public void mo433(pk pkVar, int i) {
        if (this.f675.get(pkVar.getClass()) == null) {
            return;
        }
        pkVar.f4868.position(r0.f678[i] - 2);
    }

    @Override // o.tx
    /* renamed from: 鷭 */
    public void mo432(pk pkVar) {
        C0022 c0022 = this.f675.get(pkVar.getClass());
        if (c0022 == null) {
            return;
        }
        if (c0022.f679 <= 0) {
            throw new IllegalArgumentException();
        }
        pkVar.f4868.position(c0022.f679 - 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    protected an() {
        Throwable cause;
        vf[] vfVarArr = new vf[428];
        vfVarArr[0] = new C1134();
        vfVarArr[1] = new C0740();
        vfVarArr[2] = new C0797();
        vfVarArr[3] = new C0249();
        vfVarArr[4] = new C0251();
        vfVarArr[5] = new C0482();
        vfVarArr[6] = new C1070();
        vfVarArr[7] = new C0741();
        vfVarArr[8] = new C0395();
        vfVarArr[9] = new C0915();
        vfVarArr[10] = new C1075();
        vfVarArr[11] = new C0883();
        vfVarArr[12] = new C1144();
        vfVarArr[13] = new C1072();
        try {
            vfVarArr[14] = $.m1361("o.㐢").getDeclaredConstructor(null).newInstance(null);
            vfVarArr[15] = new C1103();
            vfVarArr[16] = new C0215();
            vfVarArr[17] = new C0444();
            vfVarArr[18] = new C0518();
            vfVarArr[19] = new C1141();
            vfVarArr[20] = new C1073();
            vfVarArr[21] = new C1071();
            vfVarArr[22] = new C0715();
            vfVarArr[23] = new C0221();
            vfVarArr[24] = new C0921();
            vfVarArr[25] = new C0572();
            try {
                vfVarArr[26] = C1163$.m1626("o.믿").getDeclaredConstructor(null).newInstance(null);
                vfVarArr[27] = new C0255();
                vfVarArr[28] = new C0930();
                vfVarArr[29] = new C0256();
                vfVarArr[30] = new C0907();
                vfVarArr[31] = new C0697();
                vfVarArr[32] = C0358.f6667.f4800 >= 20071106 ? new C1150() : new C0522();
                vfVarArr[33] = new C0855();
                vfVarArr[34] = new C0377();
                vfVarArr[35] = new C1153();
                vfVarArr[36] = new C0718();
                vfVarArr[37] = new C0802();
                vfVarArr[38] = new C0847();
                vfVarArr[39] = new C0493();
                vfVarArr[40] = new C0376();
                vfVarArr[41] = new C1136();
                vfVarArr[42] = new C0714();
                vfVarArr[43] = new C0799();
                vfVarArr[44] = new C0499();
                vfVarArr[45] = C0358.f6667.f4800 >= 20071106 ? new C0492() : new C0545();
                vfVarArr[46] = new C0871();
                vfVarArr[47] = new C1052();
                vfVarArr[48] = new C1114();
                vfVarArr[49] = new C0508();
                vfVarArr[50] = new C0626();
                vfVarArr[51] = new C0887();
                vfVarArr[52] = new C0817();
                vfVarArr[53] = new C1066();
                vfVarArr[54] = new C1133();
                vfVarArr[55] = new C0647();
                vfVarArr[56] = new C0389();
                vfVarArr[57] = new C0867();
                vfVarArr[58] = new C0514();
                vfVarArr[59] = new C1057();
                vfVarArr[60] = new C0712();
                vfVarArr[61] = new C0304();
                vfVarArr[62] = new C0379();
                vfVarArr[63] = new C0873();
                vfVarArr[64] = new C0720();
                vfVarArr[65] = new C0310();
                vfVarArr[66] = new C0311();
                vfVarArr[67] = new C0308();
                vfVarArr[68] = new C0942();
                vfVarArr[69] = new C0305();
                vfVarArr[70] = new C0306();
                vfVarArr[71] = new C0592();
                vfVarArr[72] = new C0307();
                vfVarArr[73] = new C0315();
                vfVarArr[74] = new C0263();
                vfVarArr[75] = new C0312();
                vfVarArr[76] = new C0313();
                vfVarArr[77] = new C0944();
                vfVarArr[78] = new C1111();
                vfVarArr[79] = new C0507();
                vfVarArr[80] = new C0620();
                vfVarArr[81] = new C0336();
                vfVarArr[82] = new C0262();
                vfVarArr[83] = new C0591();
                vfVarArr[84] = new C0300();
                vfVarArr[85] = new C0301();
                vfVarArr[86] = new C0794();
                vfVarArr[87] = new C0497();
                vfVarArr[88] = new C0825();
                vfVarArr[89] = new C0247();
                vfVarArr[90] = new C0329();
                vfVarArr[91] = new C0836();
                vfVarArr[92] = new C0266();
                vfVarArr[93] = new C0235();
                vfVarArr[94] = new C0732();
                vfVarArr[95] = new C0872();
                vfVarArr[96] = new C0704();
                vfVarArr[97] = new C0374();
                vfVarArr[98] = new C1080();
                vfVarArr[99] = new C0573();
                vfVarArr[100] = new C0226();
                vfVarArr[101] = new C0780();
                vfVarArr[102] = new C0238();
                vfVarArr[103] = new C0239();
                vfVarArr[104] = new C1105();
                vfVarArr[105] = new C0259();
                vfVarArr[106] = new C0583();
                vfVarArr[107] = new C0260();
                vfVarArr[108] = new C0261();
                vfVarArr[109] = new C0702();
                vfVarArr[110] = new C0651();
                vfVarArr[111] = new C1028();
                vfVarArr[112] = new C1158();
                vfVarArr[113] = new C1151();
                vfVarArr[114] = new C0920();
                vfVarArr[115] = new C0580();
                vfVarArr[116] = new C0347();
                vfVarArr[117] = new C0911();
                vfVarArr[118] = new C0719();
                vfVarArr[119] = new C0393();
                vfVarArr[120] = new C0630();
                vfVarArr[121] = new C0391();
                vfVarArr[122] = new C0844();
                vfVarArr[123] = new C0445();
                vfVarArr[124] = new C0848();
                vfVarArr[125] = new C0433();
                vfVarArr[126] = new C0857();
                vfVarArr[127] = new C0257();
                vfVarArr[128] = new C0782();
                vfVarArr[129] = new C1064();
                vfVarArr[130] = new C1131();
                vfVarArr[131] = new C0380();
                vfVarArr[132] = new C0219();
                vfVarArr[133] = new C0716();
                vfVarArr[134] = new C0459();
                vfVarArr[135] = new C1119();
                vfVarArr[136] = new C0843();
                vfVarArr[137] = new C0932();
                vfVarArr[138] = new C1116();
                vfVarArr[139] = new C0509();
                vfVarArr[140] = new C0664();
                vfVarArr[141] = new C0901();
                vfVarArr[142] = new C0538();
                vfVarArr[143] = new C0328();
                vfVarArr[144] = new C0500();
                vfVarArr[145] = new C1044();
                vfVarArr[146] = new C0506();
                vfVarArr[147] = C0358.f6667.f4771 == pj.aux.iRO_Renewal ? new C0924() : new C0232();
                vfVarArr[148] = C0358.f6667.f4771 == pj.aux.iRO_Renewal ? new C0231() : new C1055();
                vfVarArr[149] = new C0788();
                vfVarArr[150] = new C0494();
                vfVarArr[151] = new C0694();
                vfVarArr[152] = new C0951();
                vfVarArr[153] = new C0240();
                vfVarArr[154] = new C0969();
                vfVarArr[155] = new C0928();
                vfVarArr[156] = new C1054();
                vfVarArr[157] = new C0667();
                vfVarArr[158] = new C0948();
                vfVarArr[159] = new C0486();
                vfVarArr[160] = new C0332();
                vfVarArr[161] = new C0334();
                vfVarArr[162] = new C0947();
                vfVarArr[163] = new C0707();
                vfVarArr[164] = new C0795();
                vfVarArr[165] = new C0498();
                vfVarArr[166] = new C1120();
                vfVarArr[167] = new C0246();
                vfVarArr[168] = new C1001();
                vfVarArr[169] = new C0534();
                vfVarArr[170] = new C1047();
                vfVarArr[171] = new C0302();
                vfVarArr[172] = new C0971();
                vfVarArr[173] = new C0283();
                vfVarArr[174] = new C0525();
                vfVarArr[175] = new C0382();
                vfVarArr[176] = new C1060();
                vfVarArr[177] = new C0225();
                vfVarArr[178] = new C0241();
                vfVarArr[179] = new C0375();
                vfVarArr[180] = new C0926();
                vfVarArr[181] = new C0703();
                vfVarArr[182] = new C0327();
                vfVarArr[183] = new C0922();
                vfVarArr[184] = new C0443();
                vfVarArr[185] = new C0357();
                vfVarArr[186] = new C0781();
                vfVarArr[187] = new C0737();
                vfVarArr[188] = new C1089();
                vfVarArr[189] = new C0751();
                vfVarArr[190] = new C0354();
                vfVarArr[191] = new C0576();
                vfVarArr[192] = new C1039();
                vfVarArr[193] = new C1088();
                vfVarArr[194] = new C0355();
                vfVarArr[195] = new C1069();
                vfVarArr[196] = new C0929();
                vfVarArr[197] = new C0516();
                vfVarArr[198] = new C0978();
                vfVarArr[199] = new C0595();
                vfVarArr[200] = new C1135();
                vfVarArr[201] = new C0676();
                vfVarArr[202] = new C0392();
                vfVarArr[203] = new C0859();
                vfVarArr[204] = new C0335();
                vfVarArr[205] = new C0535();
                vfVarArr[206] = new C0442();
                vfVarArr[207] = new C0515();
                vfVarArr[208] = new C0905();
                vfVarArr[209] = new C0316();
                vfVarArr[210] = new C0584();
                vfVarArr[211] = new C0264();
                vfVarArr[212] = C0358.f6667.f4787 ? new C0271() : new C0818();
                vfVarArr[213] = C0358.f6667.f4787 ? new C0274() : new C0273();
                vfVarArr[214] = new C0934();
                vfVarArr[215] = new C0267();
                vfVarArr[216] = new C0877();
                vfVarArr[217] = new C0976();
                vfVarArr[218] = new C0708();
                vfVarArr[219] = new C0339();
                vfVarArr[220] = new C0950();
                vfVarArr[221] = new C0348();
                vfVarArr[222] = new C0882();
                vfVarArr[223] = new C0709();
                vfVarArr[224] = new C0346();
                vfVarArr[225] = new C0345();
                vfVarArr[226] = new C0342();
                vfVarArr[227] = new C0949();
                vfVarArr[228] = new C0460();
                vfVarArr[229] = new C0394();
                vfVarArr[230] = new C0353();
                vfVarArr[231] = new C0341();
                vfVarArr[232] = new C0337();
                vfVarArr[233] = new C0351();
                vfVarArr[234] = new C1155();
                vfVarArr[235] = new C1122();
                vfVarArr[236] = new C0511();
                vfVarArr[237] = new C0775();
                vfVarArr[238] = new C0953();
                vfVarArr[239] = new C0600();
                vfVarArr[240] = new C0556();
                vfVarArr[241] = new C0625();
                vfVarArr[242] = new C1058();
                vfVarArr[243] = new C1118();
                vfVarArr[244] = new C0510();
                vfVarArr[245] = new C0728();
                vfVarArr[246] = new C0910();
                vfVarArr[247] = new C0386();
                vfVarArr[248] = new C0384();
                vfVarArr[249] = new C1059();
                vfVarArr[250] = new C0385();
                vfVarArr[251] = new C0655();
                vfVarArr[252] = new C0258();
                vfVarArr[253] = new C0700();
                vfVarArr[254] = new C0721();
                vfVarArr[255] = new C0918();
                vfVarArr[256] = new C0318();
                vfVarArr[257] = new C0252();
                vfVarArr[258] = new C0233();
                vfVarArr[259] = new C0234();
                vfVarArr[260] = new C0874();
                vfVarArr[261] = new C0721();
                vfVarArr[262] = new C1083();
                vfVarArr[263] = new C0774();
                vfVarArr[264] = new C1026();
                vfVarArr[265] = new C1056();
                vfVarArr[266] = new C0865();
                vfVarArr[267] = new C0521();
                vfVarArr[268] = new C0701();
                vfVarArr[269] = new C0284();
                vfVarArr[270] = new C0317();
                vfVarArr[271] = new C0594();
                vfVarArr[272] = new C0322();
                vfVarArr[273] = new C0323();
                vfVarArr[274] = new C0324();
                vfVarArr[275] = new C0837();
                vfVarArr[276] = new C0223();
                vfVarArr[277] = new C0752();
                vfVarArr[278] = new C0349();
                vfVarArr[279] = new C0350();
                vfVarArr[280] = new C0599();
                vfVarArr[281] = new C0473();
                vfVarArr[282] = new C0237();
                vfVarArr[283] = new C0578();
                vfVarArr[284] = new C0931();
                vfVarArr[285] = new C1087();
                vfVarArr[286] = new C0438();
                vfVarArr[287] = new C1040();
                vfVarArr[288] = new C0295();
                vfVarArr[289] = new C0281();
                vfVarArr[290] = new C0282();
                vfVarArr[291] = new C0275();
                vfVarArr[292] = new C0812();
                vfVarArr[293] = new C0660();
                vfVarArr[294] = new C0589();
                vfVarArr[295] = new C0293();
                vfVarArr[296] = new C0292();
                vfVarArr[297] = new C0730();
                vfVarArr[298] = new C0296();
                vfVarArr[299] = new C0285();
                vfVarArr[300] = new C0287();
                vfVarArr[301] = new C0291();
                vfVarArr[302] = new C0289();
                vfVarArr[303] = new C0290();
                vfVarArr[304] = new C0631();
                vfVarArr[305] = new C0938();
                vfVarArr[306] = new C0936();
                vfVarArr[307] = new C0277();
                vfVarArr[308] = new C0785();
                vfVarArr[309] = new C0587();
                vfVarArr[310] = new C0297();
                vfVarArr[311] = new C1063();
                vfVarArr[312] = new C0981();
                vfVarArr[313] = new C0628();
                vfVarArr[314] = new C0816();
                vfVarArr[315] = new C1124();
                vfVarArr[316] = new C0512();
                vfVarArr[317] = new C0746();
                vfVarArr[318] = new C0387();
                vfVarArr[319] = new C0965();
                vfVarArr[320] = new C0611();
                vfVarArr[321] = new C0575();
                vfVarArr[322] = new C0229();
                vfVarArr[323] = new C0230();
                vfVarArr[324] = new C0966();
                vfVarArr[325] = new C0710();
                vfVarArr[326] = new C0468();
                vfVarArr[327] = new C0677();
                vfVarArr[328] = new C0909();
                vfVarArr[329] = new C1081();
                vfVarArr[330] = new C0923();
                vfVarArr[331] = new C0228();
                vfVarArr[332] = new C0244();
                vfVarArr[333] = new C0663();
                vfVarArr[334] = new C0557();
                vfVarArr[335] = new C0696();
                vfVarArr[336] = new C1138();
                vfVarArr[337] = new C0517();
                vfVarArr[338] = new C0607();
                vfVarArr[339] = new C0248();
                vfVarArr[340] = new C0999();
                vfVarArr[341] = new C0912();
                vfVarArr[342] = new C0243();
                vfVarArr[343] = new C0370();
                vfVarArr[344] = new C1079();
                vfVarArr[345] = new C0365();
                vfVarArr[346] = new C0367();
                vfVarArr[347] = new C0419();
                vfVarArr[348] = new C0381();
                vfVarArr[349] = new C0878();
                vfVarArr[350] = new C0371();
                vfVarArr[351] = new C0881();
                vfVarArr[352] = new C0408();
                vfVarArr[353] = new C1068();
                vfVarArr[354] = new C0463();
                vfVarArr[355] = new C0363();
                vfVarArr[356] = new C0364();
                vfVarArr[357] = new C0961();
                vfVarArr[358] = new C0754();
                vfVarArr[359] = new C0574();
                vfVarArr[360] = new C0593();
                vfVarArr[361] = new C0706();
                vfVarArr[362] = new C1012();
                vfVarArr[363] = new C0634();
                vfVarArr[364] = new C0220();
                vfVarArr[365] = new C0835();
                vfVarArr[366] = new C0372();
                vfVarArr[367] = new C1002();
                vfVarArr[368] = new C0330();
                vfVarArr[369] = new C0763();
                vfVarArr[370] = new C0321();
                vfVarArr[371] = new C0705();
                vfVarArr[372] = new C0314();
                vfVarArr[373] = new C0567();
                vfVarArr[374] = new C0558();
                vfVarArr[375] = new C1104();
                vfVarArr[376] = new C0823();
                vfVarArr[377] = new C1011();
                vfVarArr[378] = new C0863();
                vfVarArr[379] = new C0331();
                vfVarArr[380] = new C0554();
                vfVarArr[381] = new C0563();
                vfVarArr[382] = new C0693();
                vfVarArr[383] = new C0571();
                vfVarArr[384] = new C1100();
                vfVarArr[385] = new C0265();
                vfVarArr[386] = new C0388();
                vfVarArr[387] = new C0968();
                vfVarArr[388] = new C0604();
                vfVarArr[389] = new C0662();
                vfVarArr[390] = new C0977();
                vfVarArr[391] = new C0886();
                try {
                    vfVarArr[392] = C1161$CON.m1377("o.䔲").getDeclaredConstructor(null).newInstance(null);
                    vfVarArr[393] = new C0299();
                    vfVarArr[394] = new C0298();
                    vfVarArr[395] = new C0941();
                    vfVarArr[396] = new C0480();
                    vfVarArr[397] = new C0562();
                    vfVarArr[398] = new C0529();
                    vfVarArr[399] = new C0472();
                    vfVarArr[400] = new C0383();
                    vfVarArr[401] = new C0457();
                    vfVarArr[402] = new C0800();
                    vfVarArr[403] = new C1049();
                    vfVarArr[404] = new C0496();
                    vfVarArr[405] = new C0997();
                    vfVarArr[406] = new C0495();
                    vfVarArr[407] = new C1053();
                    vfVarArr[408] = new C0469();
                    vfVarArr[409] = new C0373();
                    vfVarArr[410] = new C0790();
                    vfVarArr[411] = new C0699();
                    vfVarArr[412] = new C0792();
                    vfVarArr[413] = new C0868();
                    vfVarArr[414] = new C0657();
                    vfVarArr[415] = new C0755();
                    vfVarArr[416] = new C0665();
                    vfVarArr[417] = new C1018();
                    vfVarArr[418] = new C0434();
                    vfVarArr[419] = new C0681();
                    vfVarArr[420] = new C0682();
                    vfVarArr[421] = new C0136();
                    vfVarArr[422] = new C0137();
                    vfVarArr[423] = new C0543();
                    vfVarArr[424] = new C0437();
                    vfVarArr[425] = new C1085();
                    vfVarArr[426] = new C1077();
                    vfVarArr[427] = C0358.f6667.f4835 ? new C0984() : new C1017();
                    super(vfVarArr, true);
                    this.f675 = new HashMap<>();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
