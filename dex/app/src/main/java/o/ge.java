package o;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.util.Arrays;
import o.C0924;
import org.apache.commons.net.ftp.FTPReply;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ge extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f1322;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f1323;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f1324;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f1325;

    /* renamed from: ċ, reason: contains not printable characters */
    int f1326;

    /* renamed from: đ, reason: contains not printable characters */
    AdapterView.OnItemClickListener f1327;

    /* renamed from: Ē, reason: contains not printable characters */
    View.OnClickListener f1328;

    /* renamed from: ē, reason: contains not printable characters */
    AdapterView.OnItemLongClickListener f1329;

    /* renamed from: ȃ, reason: contains not printable characters */
    Button f1330;

    /* renamed from: Ȋ, reason: contains not printable characters */
    int f1331;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    ListView f1332;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    CheckBox f1333;

    /* renamed from: ܕ, reason: contains not printable characters */
    View.OnClickListener f1334;

    /* renamed from: 䒧, reason: contains not printable characters */
    int f1335;

    /* renamed from: 岱, reason: contains not printable characters */
    int f1336;

    /* renamed from: 庸, reason: contains not printable characters */
    AdapterView.OnItemClickListener f1337;

    /* renamed from: 櫯, reason: contains not printable characters */
    ListView f1338;

    /* renamed from: 纫, reason: contains not printable characters */
    int f1339;

    /* renamed from: 躆, reason: contains not printable characters */
    public EnumC0041 f1340;

    /* renamed from: 鷭, reason: contains not printable characters */
    C0906 f1341;

    /* renamed from: o.ge$鷭, reason: contains not printable characters */
    public enum EnumC0041 {
        NPCSHOP_BUYFROMNPC,
        NPCSHOP_SELLTONPC,
        VENDING,
        CASHSHOP,
        CHANGE_MATERIAL,
        AUTOBUY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0041[] valuesCustom() {
            EnumC0041[] enumC0041ArrValuesCustom = values();
            int length = enumC0041ArrValuesCustom.length;
            EnumC0041[] enumC0041Arr = new EnumC0041[length];
            System.arraycopy(enumC0041ArrValuesCustom, 0, enumC0041Arr, 0, length);
            return enumC0041Arr;
        }
    }

    ge(LayoutInflater layoutInflater) {
        super(2130903099);
        this.f1335 = 0;
        this.f1334 = new gf(this);
        this.f1337 = new gg(this);
        this.f1327 = new gh(this);
        this.f1328 = new gi(this);
        this.f1329 = new gj(this);
        this.f1338 = (ListView) this.f1994.findViewById(2131296285);
        this.f1332 = (ListView) this.f1994.findViewById(2131296437);
        this.f1330 = (Button) this.f1994.findViewById(2131296279);
        this.f1322 = (TextView) this.f1994.findViewById(2131296265);
        this.f1323 = (TextView) this.f1994.findViewById(2131296282);
        this.f1324 = (TextView) this.f1994.findViewById(2131296259);
        this.f1325 = (TextView) this.f1994.findViewById(2131296277);
        this.f1333 = (CheckBox) this.f1994.findViewById(2131296278);
        this.f1338.setOnItemClickListener(this.f1337);
        this.f1338.setOnItemLongClickListener(this.f1329);
        this.f1332.setOnItemClickListener(this.f1327);
        this.f1332.setOnItemLongClickListener(this.f1329);
        this.f1330.setOnClickListener(this.f1328);
        this.f1341 = new C0906(null, true, "1", this.f1334);
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m598() {
        ga gaVar;
        if (!(this.f1994.getParent() != null) || (gaVar = (ga) this.f1338.getAdapter()) == null) {
            return;
        }
        for (gb gbVar : gaVar.f1303) {
            if (gbVar.f1305 != null) {
                gbVar.m597(gbVar.f1305);
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m603(C0924.C0925[] c0925Arr) {
        gb[] gbVarArr = new gb[c0925Arr.length];
        this.f1340 = EnumC0041.CASHSHOP;
        for (int i = 0; i < c0925Arr.length; i++) {
            C0924.C0925 c0925 = c0925Arr[i];
            C1008 c1008 = new C1008(c0925.f8214, -1, true);
            c1008.f8493 = EnumC0680.valuesCustom()[c0925.f8215];
            gbVarArr[i] = new gb(C0358.f6674, c1008, 0, c0925.f8217, c0925.f8216, this.f1340);
        }
        TextView textView = this.f1324;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(187);
        textView.setText(strM649 == null ? "MSG187" : strM649);
        TextView textView2 = this.f1325;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(FTPReply.ENTERING_EPSV_MODE);
        textView2.setText(strM6492 == null ? "MSG229" : strM6492);
        m602(C0358.f6674, gbVarArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m601(int i, int i2, C1031[] c1031Arr) {
        this.f1326 = i;
        this.f1339 = i2;
        c_activity c_activityVar = (c_activity) this.f1994.getContext();
        gb[] gbVarArr = new gb[c1031Arr.length];
        this.f1340 = EnumC0041.VENDING;
        for (int i3 = 0; i3 < c1031Arr.length; i3++) {
            C1031 c1031 = c1031Arr[i3];
            gbVarArr[i3] = new gb(c_activityVar, new C1008(c1031.f8561, c1031.f8571, c1031.f8564, EnumC0680.valuesCustom()[c1031.f8566], c1031.f8563 != 0, c1031.f8562 != 0, false, 0, 0, c1031.f8565 == -1 ? (short) 0 : c1031.f8565, c1031.f8569, 0, 0, c1031.f8570), c1031.f8568, c1031.f8572, c1031.f8572, this.f1340);
        }
        TextView textView = this.f1324;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(228);
        textView.setText(strM649 == null ? "MSG228" : strM649);
        TextView textView2 = this.f1325;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(FTPReply.ENTERING_EPSV_MODE);
        textView2.setText(strM6492 == null ? "MSG229" : strM6492);
        m602(c_activityVar, gbVarArr);
    }

    /* renamed from: ć, reason: contains not printable characters */
    final void m599() {
        if (this.f1340 == EnumC0041.CASHSHOP) {
            this.f1322.setText(String.valueOf(pa.m973(this.f1335)) + " CP");
            String str = String.valueOf(pa.m973(C0358.f6679.f6831.f8575)) + " CP";
            if (C0358.f6679.f6831.f8574 > 0) {
                str = String.valueOf(str) + " + " + pa.m973(C0358.f6679.f6831.f8574) + " KP";
            }
            this.f1323.setText(str);
            return;
        }
        if (this.f1340 == EnumC0041.CHANGE_MATERIAL) {
            this.f1322.setVisibility(4);
            this.f1330.setText("Ok");
        } else {
            this.f1322.setText(String.valueOf(pa.m973(this.f1335)) + " Z");
            this.f1323.setText(String.valueOf(pa.m973(C0358.f6664.f2004.f8636 - this.f1335)) + " Z");
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m602(c_activity c_activityVar, gb[] gbVarArr) {
        this.f1335 = 0;
        this.f1338.setAdapter((ListAdapter) new ga(c_activityVar, gbVarArr));
        this.f1332.setAdapter((ListAdapter) null);
        m599();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m600(int i, int i2) {
        gb[] gbVarArr;
        c_activity c_activityVar = (c_activity) this.f1994.getContext();
        ga gaVar = (ga) this.f1338.getAdapter();
        ga gaVar2 = (ga) this.f1332.getAdapter();
        gb gbVar = gaVar.f1303[i];
        if (gbVar.f1308.f8500 == 0) {
            return;
        }
        if (gbVar.f1308.f8500 > 0 && i2 > gbVar.f1308.f8500) {
            i2 = gbVar.f1308.f8500;
        }
        if (this.f1340 == EnumC0041.NPCSHOP_BUYFROMNPC || this.f1340 == EnumC0041.VENDING) {
            if (i2 <= 0) {
                i2 = 1;
            }
            if ((C0358.f6664.f2004.f8636 - this.f1335) - (gbVar.f1310 * i2) < 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(c_activityVar);
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(56);
                builder.setMessage(strM649 == null ? "MSG56" : strM649).show();
                return;
            }
        } else if (this.f1340 == EnumC0041.NPCSHOP_SELLTONPC || this.f1340 == EnumC0041.CHANGE_MATERIAL) {
            if (i2 <= 0) {
                i2 = gbVar.f1308.f8500;
            }
        } else if (this.f1340 == EnumC0041.CASHSHOP) {
            if (i2 <= 0) {
                i2 = 1;
            }
            if ((C0358.f6679.f6831.f8575 - this.f1335) - (gbVar.f1310 * i2) < 0) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(c_activityVar);
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(1255);
                builder2.setMessage(strM6492 == null ? "MSG1255" : strM6492).show();
                return;
            }
        } else {
            throw new nv();
        }
        if (gbVar.f1308.f8500 > 0) {
            gbVar.f1308.f8500 -= i2;
            gbVar.m597(gbVar.f1305);
        }
        this.f1335 += gbVar.f1310 * i2;
        m599();
        if (gaVar2 == null || gaVar2.f1303 == null) {
            gbVarArr = new gb[0];
        } else {
            gbVarArr = gaVar2.f1303;
        }
        boolean z = false;
        if (gbVar.f1308.m1585()) {
            gb[] gbVarArr2 = gbVarArr;
            int length = gbVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                gb gbVar2 = gbVarArr2[i3];
                if (!gbVar2.f1308.m1593(gbVar.f1308)) {
                    i3++;
                } else {
                    gbVar2.f1308.f8500 += i2;
                    gbVar2.m597(gbVar2.f1305);
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            gb[] gbVarArr3 = (gb[]) Arrays.copyOf(gbVarArr, gbVarArr.length + 1);
            C1008 c1008M1589 = gbVar.f1308.m1589();
            c1008M1589.f8500 = i2;
            gbVarArr3[gbVarArr3.length - 1] = new gb(c_activityVar, c1008M1589, gbVar.f1314, gbVar.f1313, gbVar.f1310, this.f1340);
            this.f1332.setAdapter((ListAdapter) new ga(c_activityVar, gbVarArr3));
        }
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.addRule(10);
        layoutParams.addRule(8, 2131296408);
        this.f1994.setLayoutParams(layoutParams);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        C0358.f6674.f42.f1797.mo439();
    }
}
