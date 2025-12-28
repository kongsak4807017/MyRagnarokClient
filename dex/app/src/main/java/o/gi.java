package o;

import android.view.View;
import com.roworkshop.andro.c_activity;
import o.ge;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gi implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ge f1352;

    gi(ge geVar) {
        this.f1352 = geVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ge geVar = this.f1352;
        c_activity c_activityVar = (c_activity) geVar.f1994.getContext();
        ga gaVar = (ga) geVar.f1332.getAdapter();
        if (gaVar == null || gaVar.f1303 == null || gaVar.f1303.length == 0) {
            return;
        }
        if (geVar.f1340 == ge.EnumC0041.NPCSHOP_BUYFROMNPC) {
            int[] iArr = new int[gaVar.f1303.length];
            int[] iArr2 = new int[gaVar.f1303.length];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = gaVar.f1303[i].f1308.f8502;
                iArr2[i] = gaVar.f1303[i].f1308.f8500;
            }
            C0358.f6671.mo454(new C0164(iArr, iArr2));
            if (C0358.f6667.f4791) {
                C0358.f6671.mo454(new C0168());
            }
        } else if (geVar.f1340 == ge.EnumC0041.NPCSHOP_SELLTONPC) {
            int[] iArr3 = new int[gaVar.f1303.length];
            int[] iArr4 = new int[gaVar.f1303.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr3[i2] = gaVar.f1303[i2].f1314;
                iArr4[i2] = gaVar.f1303[i2].f1308.f8500;
            }
            C0358.f6671.mo454(new C0167(iArr3, iArr4));
            if (C0358.f6667.f4791) {
                C0358.f6671.mo454(new C0168());
            }
        } else if (geVar.f1340 == ge.EnumC0041.VENDING) {
            int[] iArr5 = new int[gaVar.f1303.length];
            int[] iArr6 = new int[gaVar.f1303.length];
            for (int i3 = 0; i3 < iArr5.length; i3++) {
                iArr5[i3] = gaVar.f1303[i3].f1314;
                iArr6[i3] = gaVar.f1303[i3].f1308.f8500;
            }
            C0358.f6671.mo454(new C0536(geVar.f1326, geVar.f1339, iArr5, iArr6));
        } else if (geVar.f1340 == ge.EnumC0041.CASHSHOP) {
            if (C0358.f6667.f4821) {
                int[] iArr7 = new int[gaVar.f1303.length];
                int[] iArr8 = new int[gaVar.f1303.length];
                for (int i4 = 0; i4 < iArr7.length; i4++) {
                    iArr7[i4] = gaVar.f1303[i4].f1308.f8502;
                    iArr8[i4] = gaVar.f1303[i4].f1308.f8500;
                }
                C0358.f6671.mo454(new C0435(iArr7, iArr8));
            } else {
                C0358.f6671.mo454(new C0150(gaVar.f1303[0].f1308.f8502, (short) gaVar.f1303[0].f1308.f8500, 0));
            }
        } else if (geVar.f1340 == ge.EnumC0041.CHANGE_MATERIAL) {
            int[] iArr9 = new int[gaVar.f1303.length];
            int[] iArr10 = new int[gaVar.f1303.length];
            for (int i5 = 0; i5 < gaVar.f1303.length; i5++) {
                iArr10[i5] = gaVar.f1303[i5].f1314 + 2;
                iArr9[i5] = gaVar.f1303[i5].f1308.f8500;
            }
            C0358.f6671.mo454(new C0687(iArr9, geVar.f1331, 1, iArr10));
        }
        c_activityVar.f42.f1777.removeView(geVar.f1994);
    }
}
