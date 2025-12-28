package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import o.kv;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lg {

    /* renamed from: 䒧, reason: contains not printable characters */
    private static /* synthetic */ int[] f1956;

    /* renamed from: Ą, reason: contains not printable characters */
    ImageView f1957;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f1958;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f1959;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f1960;

    /* renamed from: ȃ, reason: contains not printable characters */
    RelativeLayout f1962;

    /* renamed from: Ȋ, reason: contains not printable characters */
    C0906 f1963;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    C1008 f1964;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    EnumC0059[] f1965;

    /* renamed from: 岱, reason: contains not printable characters */
    EnumC0059 f1966;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f1967;

    /* renamed from: 鷭, reason: contains not printable characters */
    Bitmap f1969;

    /* renamed from: ċ, reason: contains not printable characters */
    DialogInterface.OnClickListener f1961 = new lh(this);

    /* renamed from: 纫, reason: contains not printable characters */
    private View.OnClickListener f1968 = new li(this);

    /* renamed from: 櫯, reason: contains not printable characters */
    private static /* synthetic */ int[] m765() {
        int[] iArr = f1956;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0059.valuesCustom().length];
        try {
            iArr2[EnumC0059.ADD_TO_AUTOBUY_LIST.ordinal()] = 15;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0059.ADD_TO_VENDING_LIST.ordinal()] = 14;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0059.DROP.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0059.EQUIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0059.FROM_CART_TO_INVENTORY.ordinal()] = 10;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0059.FROM_CART_TO_STORAGE.ordinal()] = 11;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC0059.FROM_INVENTORY_TO_CART.ordinal()] = 9;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC0059.FROM_INVENTORY_TO_STORAGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EnumC0059.FROM_INVENTORY_TO_TRADE.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[EnumC0059.FROM_STORAGE_TO_CART.ordinal()] = 13;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[EnumC0059.FROM_STORAGE_TO_INVENTORY.ordinal()] = 12;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[EnumC0059.HOTKEY.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[EnumC0059.INSERTCARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[EnumC0059.USE.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[EnumC0059.VIEW.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        f1956 = iArr2;
        return iArr2;
    }

    lg(C1008 c1008, int i) {
        this.f1964 = c1008 != null ? c1008.m1589() : null;
        this.f1967 = i;
        if (this.f1964 != null) {
            String strM510 = C0358.f6685.f1030.m510(c1008.f8502, c1008.f8491, false);
            Bitmap bitmap = C0358.f6674.f42.f1790.get(strM510);
            if (bitmap != null) {
                this.f1969 = bitmap;
            } else {
                this.f1969 = C0358.f6674.f42.f1815;
                C0358.f6685.mo139(new lj(this, strM510));
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final RelativeLayout m768(RelativeLayout relativeLayout) {
        this.f1962 = relativeLayout;
        this.f1958 = (TextView) this.f1962.findViewById(2131296390);
        this.f1959 = (TextView) this.f1962.findViewById(2131296392);
        this.f1960 = (TextView) this.f1962.findViewById(2131296391);
        this.f1960.setVisibility(4);
        this.f1957 = (ImageView) this.f1962.findViewById(2131296389);
        m766();
        return this.f1962;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m766() {
        if (this.f1964 != null) {
            this.f1957.setImageBitmap(this.f1969);
            this.f1958.setText(this.f1964.m1592(C0358.f6685.f1030.f967));
            this.f1958.setTextColor(this.f1964.m1587());
            this.f1959.setText(String.valueOf(this.f1964.f8500));
            return;
        }
        this.f1957.setImageBitmap(null);
        this.f1958.setText((CharSequence) null);
        this.f1959.setText((CharSequence) null);
    }

    /* renamed from: o.lg$鷭, reason: contains not printable characters */
    enum EnumC0059 {
        EQUIP("Equip"),
        USE("Use"),
        INSERTCARD("Insert into..."),
        DROP("Drop"),
        VIEW("View description"),
        HOTKEY("Hotkey"),
        FROM_INVENTORY_TO_STORAGE("Move to storage"),
        FROM_INVENTORY_TO_TRADE("Trade"),
        FROM_INVENTORY_TO_CART("Move to cart"),
        FROM_CART_TO_INVENTORY("Move to inventory"),
        FROM_CART_TO_STORAGE("Move to storage"),
        FROM_STORAGE_TO_INVENTORY("Move to inventory"),
        FROM_STORAGE_TO_CART("Move to cart"),
        ADD_TO_VENDING_LIST("Add to vending list"),
        ADD_TO_AUTOBUY_LIST("Add to buying store list");


        /* renamed from: ܕ, reason: contains not printable characters */
        String f1986;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0059[] valuesCustom() {
            EnumC0059[] enumC0059ArrValuesCustom = values();
            int length = enumC0059ArrValuesCustom.length;
            EnumC0059[] enumC0059Arr = new EnumC0059[length];
            System.arraycopy(enumC0059ArrValuesCustom, 0, enumC0059Arr, 0, length);
            return enumC0059Arr;
        }

        EnumC0059(String str) {
            this.f1986 = str;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m770(EnumC0059[] enumC0059Arr) {
        this.f1965 = enumC0059Arr;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle(this.f1964.m1592(C0358.f6685.f1030.f967));
        builder.setIcon(new BitmapDrawable(C0358.f6674.getResources(), this.f1969));
        String[] strArr = new String[enumC0059Arr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = enumC0059Arr[i].f1986;
        }
        builder.setItems(strArr, this.f1961);
        builder.show();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m769(EnumC0059 enumC0059, int i) {
        this.f1966 = enumC0059;
        switch (m765()[enumC0059.ordinal()]) {
            case 1:
                C0358.f6671.mo454(new C1010((short) this.f1967, this.f1964.m1590()));
                return;
            case 2:
                C0358.f6671.mo454(new C0207((short) this.f1967));
                return;
            case 3:
                C0358.f6664.f2004.f8607 = this.f1967;
                C0358.f6671.mo454(new C0206(this.f1967));
                return;
            case 4:
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6671.mo454(new C0566((short) this.f1967, (short) i));
                    return;
                }
            case 5:
                C0358.f6674.f42.f1745.m1601(this.f1964);
                C0358.f6674.f42.f1745.h_();
                return;
            case 6:
                if (!C0358.f6674.f42.m738(kv.EnumC0058.ITEM, this.f1964.f8502)) {
                    C0358.f6674.f42.m735(kv.EnumC0058.ITEM, this.f1964.f8502, this.f1964.f8500, 0, (byte) 0);
                    return;
                }
                return;
            case 7:
                if (this.f1964.f8500 == 1) {
                    i = this.f1964.f8500;
                }
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6671.mo454(new C0815(this.f1967, i));
                    return;
                }
            case 8:
                if (this.f1964.f8500 == 1) {
                    i = this.f1964.f8500;
                }
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6671.mo454(new C0897(this.f1967, i));
                    return;
                }
            case 9:
                if (this.f1964.f8500 == 1) {
                    i = this.f1964.f8500;
                }
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6671.mo454(new C0245(this.f1967, i));
                    return;
                }
            case 10:
                if (this.f1964.f8500 == 1) {
                    i = this.f1964.f8500;
                }
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6671.mo454(new C0149(this.f1967, i));
                    return;
                }
            case 11:
                if (this.f1964.f8500 == 1) {
                    i = this.f1964.f8500;
                }
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6671.mo454(new C0822(this.f1967, i));
                    return;
                }
            case 12:
                if (this.f1964.f8500 == 1) {
                    i = this.f1964.f8500;
                }
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6671.mo454(new C0645(this.f1967, i));
                    return;
                }
            case 13:
                if (this.f1964.f8500 == 1) {
                    i = this.f1964.f8500;
                }
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6671.mo454(new C0895(this.f1967, i));
                    return;
                }
            case 14:
                if (this.f1964.f8500 == 1) {
                    i = this.f1964.f8500;
                }
                if (i < 0) {
                    m767(enumC0059);
                    return;
                } else {
                    C0358.f6674.f42.f1750.m801(this, i, -1);
                    return;
                }
            case 15:
                C0358.f6674.f42.f1750.m801(this, -1, -1);
                return;
            default:
                throw new UnsupportedOperationException(enumC0059 + " not supported");
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m767(EnumC0059 enumC0059) {
        this.f1966 = enumC0059;
        if (this.f1963 == null) {
            this.f1963 = new C0906(null, true, null, this.f1968);
        }
        this.f1963.f8193.setText(String.valueOf(this.f1964.m1592(C0358.f6685.f1030.f967)) + " : select amount");
        this.f1963.f8190 = String.valueOf(this.f1964.f8500);
        this.f1963.h_();
    }
}
