package o;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hc {

    /* renamed from: ċ, reason: contains not printable characters */
    private static /* synthetic */ int[] f1451;

    /* renamed from: Ą, reason: contains not printable characters */
    ImageView f1452;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f1453;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f1454;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f1455;

    /* renamed from: ȃ, reason: contains not printable characters */
    RelativeLayout f1456;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Bitmap f1458;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    Button f1459;

    /* renamed from: 櫯, reason: contains not printable characters */
    gt f1461;

    /* renamed from: 鷭, reason: contains not printable characters */
    EnumC0046 f1462 = EnumC0046.CHARACTER;

    /* renamed from: 岱, reason: contains not printable characters */
    View.OnClickListener f1460 = new hd(this);

    /* renamed from: Ȋ, reason: contains not printable characters */
    View.OnClickListener f1457 = new hg(this);

    /* renamed from: o.hc$鷭, reason: contains not printable characters */
    enum EnumC0046 {
        CHARACTER,
        GUILD;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0046[] valuesCustom() {
            EnumC0046[] enumC0046ArrValuesCustom = values();
            int length = enumC0046ArrValuesCustom.length;
            EnumC0046[] enumC0046Arr = new EnumC0046[length];
            System.arraycopy(enumC0046ArrValuesCustom, 0, enumC0046Arr, 0, length);
            return enumC0046Arr;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ int[] m615() {
        int[] iArr = f1451;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0046.valuesCustom().length];
        try {
            iArr2[EnumC0046.CHARACTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0046.GUILD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f1451 = iArr2;
        return iArr2;
    }

    hc(gt gtVar, EnumC0046 enumC0046) {
        this.f1461 = gtVar;
    }
}
