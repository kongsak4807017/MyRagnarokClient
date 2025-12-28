package com.roworkshop.andro;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import o.AsyncTaskC0671;
import o.C0358;
import o.C0601;
import o.C0612;
import o.C0648;
import o.C0850;
import o.C0875;
import o.C0919;
import o.C1149;
import o.Cif;
import o.RunnableC0415;
import o.RunnableC0766;
import o.RunnableC0900;
import o.RunnableC1121;
import o.abb;
import o.acb;
import o.acm;
import o.b;
import o.cr;
import o.du;
import o.hw;
import o.ib;
import o.ig;
import o.ih;
import o.ii;
import o.it;
import o.iu;
import o.je;
import o.my;
import o.nv;
import o.nz;
import o.oc;
import o.of;
import o.pb;
import o.pc;
import o.pl;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HttpRequestExecutor;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class c_activity extends Activity implements of {

    /* renamed from: ċ, reason: contains not printable characters */
    public static final byte[] f36 = {76, 29, -34, -54, 7, -4, 12, 1, 11, -4, 15, -3, 3, 70, -49, -8, 6, -5, 7, 8, -5, -2, 15, -1, 12, -5, 69, -70, 15, 5};

    /* renamed from: 䒧, reason: contains not printable characters */
    private static int f37 = 220;

    /* renamed from: Ą, reason: contains not printable characters */
    public boolean f38;

    /* renamed from: ą, reason: contains not printable characters */
    public String f39;

    /* renamed from: Ć, reason: contains not printable characters */
    public C0850 f40;

    /* renamed from: ć, reason: contains not printable characters */
    Runnable f41;

    /* renamed from: ȃ, reason: contains not printable characters */
    public je f42;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public Runnable f43;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public C0612 f44;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public du f45;

    /* renamed from: 岱, reason: contains not printable characters */
    public long f46;

    /* renamed from: 櫯, reason: contains not printable characters */
    public Handler f47;

    /* renamed from: 纫, reason: contains not printable characters */
    private it f48;

    /* renamed from: 鷭, reason: contains not printable characters */
    public final C0003 f49;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static String m135(int i, int i2, int i3) {
        byte[] bArr = f36;
        int i4 = -1;
        int i5 = 14 - (i2 * 4);
        int i6 = (i * 15) + 99;
        int i7 = 17 - (i3 * 13);
        byte[] bArr2 = new byte[i5];
        int i8 = i5 - 1;
        if (bArr == null) {
            int i9 = i8 + (-i7);
            i7++;
            i6 = i9 + 4;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i7++;
            i6 = i6 + (-bArr[i7]) + 4;
        }
    }

    public c_activity() {
        C0003 c0003;
        if (oc.f3250 == my.AevaRO) {
            c0003 = new C0003("086ddbfd731b4886b1001aacce13f298");
        } else if (oc.f3250 == my.AmatsuRO) {
            c0003 = new C0003("768e7a3b7af74ee28632dbc38d018c84");
        } else if (oc.f3250 == my.AtlasRO) {
            c0003 = new C0003("a5dc76a5c5a14a3184f94bd0c90a7666");
        } else if (oc.f3250 == my.AustinRO) {
            c0003 = new C0003("b11c7ca2c3a5477d855911e290476320");
        } else if (oc.f3250 == my.BarnabyRO) {
            c0003 = new C0003("d9231e9880184043a347d4fe5a207a47");
        } else if (oc.f3250 == my.BrightRO) {
            c0003 = new C0003("5a1ac344d50c43d0b75921287f01d4dc");
        } else if (oc.f3250 == my.ClassicRONet) {
            c0003 = new C0003("8972654e3fc2427e85d62b36b3e4db97");
        } else if (oc.f3250 == my.Classic2RoInTh) {
            c0003 = new C0003("c52b917944c048c7a53a12d84b76c634");
        } else if (oc.f3250 == my.CrownRO) {
            c0003 = new C0003("7ead675d3a2345a195efdb2b10276822");
        } else if (oc.f3250 == my.Class2RO) {
            c0003 = new C0003("faa7597872ae40789ac57e337a947285");
        } else if (oc.f3250 == my.Daro) {
            c0003 = new C0003("3f2f4a38a876485bb10b25155455db02");
        } else if (oc.f3250 == my.Eden3) {
            c0003 = new C0003("b27ee780d8d24b1384b5ed10039882b2");
        } else if (oc.f3250 == my.EosRagnarokOnline) {
            c0003 = new C0003("fb7bb46604df4281a44eef74443918f8");
        } else if (oc.f3250 == my.FreePlayRoCom) {
            c0003 = new C0003("eae69c998b01458f954a642d0ae53351");
        } else if (oc.f3250 == my.FreeRO) {
            c0003 = new C0003("f06c4220a7e545e2a886a31f81a99ec5");
        } else if (oc.f3250 == my.FreeRoWeb) {
            c0003 = new C0003("3fa61a46822143b2ab788b8c5128f153");
        } else if (oc.f3250 == my.InfamyRO) {
            c0003 = new C0003("2f8af5d9721140eb80e2a474d14d0351");
        } else if (oc.f3250 == my.iPlayRo201804) {
            c0003 = new C0003("eb8c99f255654c39bf403147327d880d");
        } else if (oc.f3250 == my.IfritRagnarokCom) {
            c0003 = new C0003("8635600cbea54797b5fafa52c84fa08f");
        } else if (oc.f3250 == my.Gugusjungs57572) {
            c0003 = new C0003("0b2498444479444590e4252e677c3cdb");
        } else if (oc.f3250 == my.iRO_hockeyapp) {
            c0003 = new C0003("7c86184fec2e17b8d5ec2f3fd6c79ef7");
        } else if (oc.f3250 == my.LeonardRO) {
            c0003 = new C0003("23cc88189ff744528aaf66c04b4bd50e");
        } else if (oc.f3250 == my.LidiaRO) {
            c0003 = new C0003("a8382953dc484a308119c3a234a691f0");
        } else if (oc.f3250 == my.localclient) {
            c0003 = new C0003("0686481d44764e57a8eababb2ec7800a");
        } else if (oc.f3250 == my.MobiRO) {
            c0003 = new C0003("86594e26dd5f43aaa131fea5024c4d06");
        } else if (oc.f3250 == my.MOTR) {
            c0003 = new C0003("416e2a7224001f5688177f6632d4c2eb");
        } else if (oc.f3250 == my.MyRO) {
            c0003 = new C0003("f87a58f1a5ad4766ace4354d44b0f733");
        } else if (oc.f3250 == my.OldchaosROCom) {
            c0003 = new C0003("311edbc04489488da1390d64d4c23e1a");
        } else if (oc.f3250 == my.PlayLokiServerCom) {
            c0003 = new C0003("7ae21607163f49fd824d90e6e3e7182c");
        } else if (oc.f3250 == my.PlayragnarokPh) {
            c0003 = new C0003("15057c05d14f45a4a7af126b9ace9f3c");
        } else if (oc.f3250 == my.PlayvalhallaPh) {
            c0003 = new C0003("c68e0fb6fc1c4fd3b8b280cd223db50b");
        } else if (oc.f3250 == my.Ragnaclan) {
            c0003 = new C0003("8db2e4af8c0245988870636a2f79e744");
        } else if (oc.f3250 == my.RebirthRO_Ancyker) {
            c0003 = new C0003("093e2cda42664b7cb80d295f5beac18c");
        } else if (oc.f3250 == my.RagnarevivalCom) {
            c0003 = new C0003("89eadda6435346ad9a776ae09f68ac21");
        } else if (oc.f3250 == my.RoHeimdallCom) {
            c0003 = new C0003("95c65773a3504968a76c84ca4d66d7f3");
        } else if (oc.f3250 == my.SarahServer) {
            c0003 = new C0003("33b6d94bf33641e9a92249ab3daffcfa");
        } else if (oc.f3250 == my.ShinServer) {
            c0003 = new C0003("6e1e88b46ee44b2f9758f854d93b498e");
        } else if (oc.f3250 == my.SuccessRoNet) {
            c0003 = new C0003("6ae913495f5d4aa2b324103071801b89");
        } else if (oc.f3250 == my.Thai_id9169) {
            c0003 = new C0003("dbdae225dc084d18958bc30491a114b5");
        } else if (oc.f3250 == my.ThaiRoInTh) {
            c0003 = new C0003("6ad316a304a0415889c46da4561e5eca");
        } else if (oc.f3250 == my.TheClassicROCom) {
            c0003 = new C0003("7227e702edc9452bb7679e1265a9d4b7");
        } else if (oc.f3250 == my.TitanRO) {
            c0003 = new C0003("f5a61910feb84e0e89ab2187629df256");
        } else if (oc.f3250 == my.TyrServer) {
            c0003 = new C0003("c3c98959da5d4fc4a39c8017730687dc");
        } else if (oc.f3250 == my.WeDevGames) {
            c0003 = new C0003("4ba8b268498f4747bcc760186d1c7b25");
        } else if (oc.f3250 == my.ROProviderValkyrie) {
            c0003 = new C0003("151ea453f7a74a7c98cb04b372868e76");
        } else if (oc.f3250 == my.XileRO) {
            c0003 = new C0003("e7eeef336e0645a29a8b3f2c0f496564");
        } else if (oc.f3250 == my.RoFaction) {
            c0003 = new C0003("e3fad41cc18e4c6a9fedbff673990878");
        } else if (oc.f3250 == my.WeloveRo) {
            c0003 = new C0003("754896997465481a8d4baab53eefebc2");
        } else if (oc.f3250 == my.KafraRO) {
            c0003 = new C0003("b6ae5b90537a4f708751a80c95dda9ec");
        } else if (oc.f3250 == my.ChaosReborn) {
            c0003 = new C0003("cac2c09af58c4262a9a05623b8d41666");
        } else if (oc.f3250 == my.RagnarokReturnPh) {
            c0003 = new C0003("8c03216befe24b4ea3da671e32e86409");
        } else if (oc.f3250 == my.GachoRO) {
            c0003 = new C0003("ae57f139101345cd9b7b72e1c56cf076");
        } else if (oc.f3250 == my.RoRetro) {
            c0003 = new C0003("6012a25fda2e46e68ddbb976cddd67ec");
        } else if (oc.f3250 == my.LibRO) {
            c0003 = new C0003("44d8232462654e8cb5fc965e6664eeda");
        } else if (oc.f3250 == my.SecretRO) {
            c0003 = new C0003("cb4d31024eae4110ab46c856719c2b6e");
        } else if (oc.f3250 == my.NorseRO) {
            c0003 = new C0003("62a6d336016d4784a56105a8b97f8721");
        } else if (oc.f3250 == my.Trinity_Reborn_Full) {
            c0003 = new C0003("6a79c4d5f3bf45e99afdb9fe1b79e2b0");
        } else if (oc.f3250 == my.AlbertaServer) {
            c0003 = new C0003("d880f525ff234381b14ac1c40b9767b2");
        } else if (oc.f3250 == my.hiclassro) {
            c0003 = new C0003("cb3404db34354f2c9ff3cfbf41108164");
        } else if (oc.f3250 == my.OldschoolragnarokCom) {
            c0003 = new C0003("4ae5dfcf3b364cf9a98b231aa9a38f46");
        } else if (oc.f3250 == my.Ragnarevo) {
            c0003 = new C0003("f373186bfe3b4aadbb77f465b280915a");
        } else if (oc.f3250 == my.CrazyPoring) {
            c0003 = new C0003("1f9fee6196f145a1bb364ee3a69e4728");
        } else if (oc.f3250 == my.LucianoRO) {
            c0003 = new C0003("5294568b53aa41d2bcdfd303f1031a01");
        } else if (oc.f3250 == my.GarciaRO) {
            c0003 = new C0003("728a33218a874cd9865bd4b7223d9748");
        } else if (oc.f3250 == my.Blytanias) {
            c0003 = new C0003("a21adb52e02849c4a99f12065c5aec28");
        } else if (oc.f3250 == my.PinoyRO) {
            c0003 = new C0003("aac10214718840e58096e5436ca66427");
        } else if (oc.f3250 == my.OMGRO) {
            c0003 = new C0003("d73cecfc91174662b592d160e2f0de8c");
        } else if (oc.f3250 == my.RagnarokPuzzle) {
            c0003 = new C0003("5eebefcac4784033bf4bc2627bd81aec");
        } else if (oc.f3250 == my.Modify_Full) {
            c0003 = new C0003("7de17e0451544a0bb5e73ebfbcd93db7");
        } else if (oc.f3250 == my.Newyear) {
            c0003 = new C0003("4e40bfbfce804584b2ea676688ec7ced");
        } else if (oc.f3250 == my.GRANDRO) {
            c0003 = new C0003("951affd80f8a464e9275f5d6a1aa0d29");
        } else if (oc.f3250 == my.SakrayPh) {
            c0003 = new C0003("c2a7b255cfc9460eae0ad51ea8099870");
        } else if (oc.f3250 == my.MyRebornRO) {
            c0003 = new C0003("98d272e2d73f478ab931b2bde7770114");
        } else if (oc.f3250 == my.XileRO2019) {
            c0003 = new C0003("e7eeef336e0645a29a8b3f2c0f496564");
        } else if (oc.f3250 == my.eSport2019) {
            c0003 = new C0003("0b2498444479444590e4252e677c3cdb");
        } else if (oc.f3250 == my.PhoenixRO2) {
            c0003 = new C0003("e8b8976ce5fd40d2964b54338f6d62f0");
        } else if (oc.f3250 == my.OcrClassicCom) {
            c0003 = new C0003("9c141e319eff406188a3e6f82d71abc4");
        } else if (oc.f3250 == my.RoFreedom) {
            c0003 = new C0003("9d67d271e95f4695950b067431da8969");
        } else if (oc.f3250 == my.C2RO) {
            c0003 = new C0003("63cb047d4c8f4d17850b13b8b2a84c52");
        } else if (oc.f3250 == my.RelaxRO) {
            c0003 = new C0003("7aae87a88cf047588d78b3b69ba695d2");
        } else if (oc.f3250 == my.BgRO) {
            c0003 = new C0003("b06fc165c17f4310bc12bfb86c2c242e");
        } else if (oc.f3250 == my.ROClashed) {
            c0003 = new C0003("c5b0c8e45a4a4d569a0999412ae52aeb");
        } else if (oc.f3250 == my.ForceRO) {
            c0003 = new C0003("3c0095fb817741d9ac75d29ac621a420");
        } else if (oc.f3250 == my.KryptGamingClassic) {
            c0003 = new C0003("7e3fec9a46aa4577aa140e6d1ac4d20c");
        } else if (oc.f3250 == my.OSRO2019) {
            c0003 = new C0003("94274207124c40ff8980bb1869d369e1");
        } else if (oc.f3250 == my.NewFenrirRoGameNet) {
            c0003 = new C0003("e770753aa3894bfc9d2dc9fc7a9b35b6");
        } else if (oc.f3250 == my.RagnarokIsLife) {
            c0003 = new C0003("288d8fcbe0aa4e99bcc4e7f7ded05ed9");
        } else if (oc.f3250 == my.LevelRO) {
            c0003 = new C0003("1f3d0c7badf74b70b3c0753b985a8fa0");
        } else if (oc.f3250 == my.OfficialragnarokCom) {
            c0003 = new C0003("73ffd527296b4036946cbb4b3d3a8233");
        } else if (oc.f3250 == my.PayonRO) {
            c0003 = new C0003("e983460ef3364f34ae0be61052d8b6f1");
        } else if (oc.f3250 == my.OsirisRO) {
            c0003 = new C0003("1ef312e1ee9b4a14b6223a55154e4841");
        } else {
            my myVar = oc.f3250;
            my myVar2 = my.ROComfy;
            c0003 = null;
        }
        this.f49 = c0003;
        this.f47 = new Handler();
        this.f38 = false;
        this.f39 = null;
        this.f40 = new C0850();
        this.f41 = new RunnableC0415(this);
        this.f46 = 0L;
        this.f43 = new RunnableC0900(this);
    }

    /* renamed from: com.roworkshop.andro.c_activity$鷭, reason: contains not printable characters */
    public class C0003 {

        /* renamed from: 鷭, reason: contains not printable characters */
        public String f51;

        C0003(String str) {
            this.f51 = str;
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (!C0358.f6676.f1080.m1406(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // o.of
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo139(Runnable runnable) {
        if (this.f47 == null) {
            return;
        }
        try {
            this.f47.post(runnable);
        } catch (Throwable th) {
            this.f40.m1487(Thread.currentThread(), th);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final byte[] m141(String str) throws IOException {
        InputStream inputStreamOpen = null;
        InputStreamReader inputStreamReader = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                inputStreamOpen = getAssets().open(str);
                inputStreamReader = new InputStreamReader(inputStreamOpen);
                byteArrayOutputStream = new ByteArrayOutputStream(inputStreamOpen.available());
                byte[] bArr = new byte[32000];
                while (true) {
                    int i = inputStreamOpen.read(bArr, 0, bArr.length);
                    if (i <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    inputStreamReader.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    return byteArray;
                } catch (IOException e) {
                    throw new nv(e);
                }
            } catch (Throwable th) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        throw new nv(e2);
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new nv(e3);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final byte[] m140(int i) throws Resources.NotFoundException, IOException {
        Resources resources = getResources();
        if (resources == null) {
            Log.e("AndRO", "Failed to get resources");
            throw new nv("Failed to get resources");
        }
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        if (inputStreamOpenRawResource == null) {
            Log.e("AndRO", "Failed to open resource");
            throw new nv("Failed to open resource");
        }
        try {
            byte[] bArr = new byte[inputStreamOpenRawResource.available()];
            int i2 = 0;
            while (true) {
                int i3 = inputStreamOpenRawResource.read(bArr, i2, bArr.length - i2);
                if (i3 > 0) {
                    i2 += i3;
                } else {
                    return bArr;
                }
            }
        } catch (IOException e) {
            String string = e.toString();
            Log.e("AndRO", string);
            throw new nv(string);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        Thread.setDefaultUncaughtExceptionHandler(this.f40);
        Thread.currentThread().setUncaughtExceptionHandler(this.f40);
        setTheme(R.style.Theme.Holo);
        C0358.f6674 = this;
        if (oc.f3250 != my.all) {
            Cif cifM669 = Cif.m669(this);
            cifM669.f1601 = true;
            new Thread(new RunnableC0766(cifM669, new C1149(this))).start();
        }
        try {
            this.f42 = new je(this);
            cr.f4871 = new C0648();
            oc.f3245 = String.valueOf(getFilesDir().getAbsolutePath()) + "/ragnarok";
            setContentView(2130903136);
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
            getWindow().setSoftInputMode(32);
            pc.f3405 = new C0875(this);
            C0358.f6688 = new C0358();
            C0358.f6671 = new b("c_network", 0, 0, 0, 500);
            C0358.f6687 = new hw(C0358.f6674);
            if (oc.f3250 == my.XileRO) {
                getWindow().setFlags(1024, 1024);
            }
            iu.f1665 = C0358.f6687.m648("GL_MAX_TEXTURE_SIZE", 0);
            this.f42.f1737.h_();
            ib ibVar = this.f42.f1737;
            if (oc.f3247 == null || oc.f3247.f799 == null || oc.f3247.f799.isEmpty()) {
                String strM655 = C0358.f6687.m655("last_login", 0);
                str = strM655 == null ? null : strM655;
            } else {
                str = oc.f3247.f799;
            }
            if (oc.f3247 == null || oc.f3247.f798 == null || oc.f3247.f798.isEmpty()) {
                String strM6552 = C0358.f6687.m655("last_password", 0);
                str2 = strM6552 == null ? null : strM6552;
            } else {
                str2 = oc.f3247.f798;
            }
            String strM6553 = C0358.f6687.m655("server_name", 0);
            String str3 = strM6553 == null ? null : strM6553;
            String strM6554 = C0358.f6687.m655("save_login", 0);
            String str4 = strM6554 == null ? null : strM6554;
            boolean z = str4 == null ? false : Boolean.parseBoolean(str4);
            String strM6555 = C0358.f6687.m655("save_password", 0);
            String str5 = strM6555 == null ? null : strM6555;
            boolean z2 = str5 == null ? false : Boolean.parseBoolean(str5);
            boolean z3 = true;
            if (oc.f3250 == my.localclient && !pl.m1051(new File(oc.f3245))) {
                z3 = false;
            }
            if (str == null || str2 == null || str3 == null || !z || !z2 || !z3) {
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(ibVar.f1582);
            long j = oc.f3247 == null ? HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE : HttpStatus.SC_MULTIPLE_CHOICES;
            progressDialog.setProgressStyle(1);
            progressDialog.setMax((int) j);
            progressDialog.setMessage("Initializing: [" + str + "] at [" + str3 + "]");
            progressDialog.setButton(-1, "OK", new ig(ibVar, str, str2));
            progressDialog.setButton(-2, "Change", new ih(ibVar, progressDialog));
            progressDialog.setCancelable(true);
            progressDialog.setProgressNumberFormat(null);
            progressDialog.setProgressPercentFormat(null);
            progressDialog.show();
            new ii(ibVar, progressDialog, System.currentTimeMillis(), j, str, str2).run();
        } catch (Throwable th) {
            this.f40.m1487(Thread.currentThread(), th);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m137() {
        setContentView(2130903051);
        je.m704(2131296320);
        if (iu.f1665 == 0) {
            m134(this.f41);
        } else {
            this.f41.run();
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private synchronized void m134(Runnable runnable) {
        this.f48 = new it(new RunnableC1121(this, System.currentTimeMillis(), runnable));
        ((ViewGroup) getWindow().getDecorView()).addView(this.f48);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m138(File file) {
        StringBuilder sbAppend = new StringBuilder().append(file).append(File.separator).append("data").append(File.separator);
        int i = f36[7] - 1;
        File file2 = new File(sbAppend.append(m135(i, i, i)).toString());
        if (file2.exists()) {
            try {
                C0358.f6688.f6694 = pb.m992(file2.getAbsolutePath());
                C0358.f6688.m1313(true);
                return;
            } catch (IOException e) {
                throw new nv(e, "Failed to read " + file.getAbsolutePath());
            }
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading client");
        progressDialog.setProgressStyle(1);
        progressDialog.setMax(100);
        progressDialog.setCancelable(false);
        progressDialog.show();
        new AsyncTaskC0671(this, file, progressDialog).execute(null);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable th) {
            this.f40.m1487(Thread.currentThread(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: Throwable -> 0x0292, TryCatch #0 {Throwable -> 0x0292, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0009, B:8:0x000d, B:10:0x0023, B:15:0x002c, B:17:0x0043, B:22:0x004c, B:24:0x0061, B:29:0x006a, B:30:0x0072, B:32:0x0078, B:34:0x007c, B:36:0x0082, B:38:0x0099, B:51:0x00d3, B:41:0x00a3, B:43:0x00b0, B:47:0x00ba, B:49:0x00c2, B:45:0x00b6, B:55:0x00df, B:57:0x00e3, B:84:0x015b, B:58:0x00ef, B:60:0x00f3, B:62:0x00f9, B:63:0x0102, B:65:0x0106, B:67:0x010c, B:68:0x0115, B:70:0x0119, B:72:0x0121, B:74:0x0128, B:75:0x0135, B:77:0x0139, B:79:0x013d, B:81:0x014a, B:83:0x014e, B:85:0x0161, B:87:0x0165, B:89:0x016b, B:91:0x0173, B:92:0x018e, B:94:0x0192, B:96:0x0198, B:98:0x019e, B:100:0x01a4, B:101:0x01ab, B:103:0x01b1, B:106:0x01bb, B:108:0x01bf, B:110:0x01c5, B:112:0x01cf, B:114:0x01d3, B:116:0x01d9, B:119:0x01f1, B:121:0x01f5, B:123:0x01fb, B:125:0x0205, B:127:0x0209, B:129:0x020f, B:132:0x0227, B:134:0x022b, B:136:0x0231, B:138:0x023b, B:140:0x023f, B:142:0x0245, B:145:0x025c, B:147:0x0260, B:149:0x0266, B:151:0x0270, B:153:0x0274, B:155:0x027a), top: B:165:0x0000 }] */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r9, android.view.KeyEvent r10) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roworkshop.andro.c_activity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            acb.m304(this);
            super.onPause();
            C0919 c0919 = C0358.f6663;
            if (c0919.f8213.isPlaying()) {
                c0919.f8213.pause();
                c0919.f8212 = true;
            }
            if (this.f44 != null) {
                this.f44.onPause();
            }
        } catch (Throwable th) {
            this.f40.m1487(Thread.currentThread(), th);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
            if (this.f49 != null) {
                abb.m290(this, this.f49.f51);
            }
            if (this.f49 != null) {
                acm.m313(this, this.f49.f51, new C0601(this));
            }
            acb.m305(this);
            C0919 c0919 = C0358.f6663;
            if (c0919.f8212) {
                c0919.f8213.start();
            }
            if (this.f44 != null) {
                this.f44.onResume();
            }
        } catch (Throwable th) {
            this.f40.m1487(Thread.currentThread(), th);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        nz.m907("[ANDRO_ONLOWMEMORY]");
    }
}
