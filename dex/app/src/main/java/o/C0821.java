package o;

import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;
import java.util.Arrays;
import o.lg;

/* renamed from: o.祛, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0821 extends ap {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f7933;

    /* renamed from: Ą, reason: contains not printable characters */
    AdapterView.OnItemLongClickListener f7934;

    /* renamed from: ȃ, reason: contains not printable characters */
    AdapterView.OnItemClickListener f7935;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    GridView f7936;

    /* renamed from: 櫯, reason: contains not printable characters */
    ng f7937;

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] m1484() {
        int[] iArr = f7933;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[ng.valuesCustom().length];
        try {
            iArr2[ng.CART.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ng.EQUIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ng.ETC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ng.USABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f7933 = iArr2;
        return iArr2;
    }

    @Deprecated
    C0821(int i, ng ngVar) {
        super(i);
        this.f7935 = new C0546(this);
        this.f7934 = new C0814(this);
        this.f7937 = ngVar;
        this.f7936 = (GridView) this.f683.findViewById(2131296294);
        this.f7936.setAdapter((ListAdapter) new C0979(this.f7937));
        this.f7936.setOnItemClickListener(this.f7935);
        this.f7936.setOnItemLongClickListener(this.f7934);
    }

    C0821(ng ngVar) {
        this(2130903087, ngVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    void mo1486(int i) {
        lg lgVar = (lg) this.f7936.getAdapter().getItem(i);
        if (C0358.f6674.f42.f1786.f1994.getParent() != null) {
            lgVar.m769(lg.EnumC0059.FROM_INVENTORY_TO_STORAGE, -1);
        }
        if (C0358.f6674.f42.f1750.f1994.getParent() != null) {
            if (C0358.f6674.f42.f1750.f2023) {
                Toast.makeText(C0358.f6674, "Can add to vending list only from Cart", 1).show();
                return;
            } else {
                C0358.f6674.f42.f1750.m801(lgVar, -1, -1);
                return;
            }
        }
        switch (m1484()[this.f7937.ordinal()]) {
            case 1:
                if (lgVar.f1964.f8493 == EnumC0680.CARD) {
                    lgVar.m769(lg.EnumC0059.INSERTCARD, -1);
                    break;
                } else {
                    lgVar.m769(lg.EnumC0059.USE, -1);
                    break;
                }
            case 2:
                lgVar.m769(lg.EnumC0059.EQUIP, -1);
                break;
            default:
                mo1485(i);
                break;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    void mo1485(int i) {
        lg lgVar = (lg) this.f7936.getAdapter().getItem(i);
        lg.EnumC0059[] enumC0059Arr = new lg.EnumC0059[lg.EnumC0059.valuesCustom().length];
        int i2 = 0;
        switch (m1484()[this.f7937.ordinal()]) {
            case 1:
                if (lgVar.f1964.f8493 == EnumC0680.CARD) {
                    i2 = 0 + 1;
                    enumC0059Arr[0] = lg.EnumC0059.INSERTCARD;
                    break;
                } else {
                    i2 = 0 + 1;
                    enumC0059Arr[0] = lg.EnumC0059.USE;
                    break;
                }
            case 2:
                i2 = 0 + 1;
                enumC0059Arr[0] = lg.EnumC0059.EQUIP;
                break;
        }
        if (this.f7937 == ng.USABLE || this.f7937 == ng.EQUIP) {
            int i3 = i2;
            i2++;
            enumC0059Arr[i3] = lg.EnumC0059.HOTKEY;
        }
        if ((C0358.f6674.f42.f1750.f1994.getParent() != null) && this.f7937 == ng.CART) {
            int i4 = i2;
            i2++;
            enumC0059Arr[i4] = lg.EnumC0059.ADD_TO_VENDING_LIST;
        }
        if ((C0358.f6674.f42.f1750.f1994.getParent() != null) && this.f7937 != ng.CART && !C0358.f6674.f42.f1750.f2023) {
            int i5 = i2;
            i2++;
            enumC0059Arr[i5] = lg.EnumC0059.ADD_TO_AUTOBUY_LIST;
        }
        C1035 c1035 = C0358.f6664.f2004;
        if (c1035.f8351.containsKey(nt.ON_PUSH_CART) || (c1035.f8357 & 1928) > 0) {
            if (this.f7937 == ng.CART) {
                int i6 = i2;
                i2++;
                enumC0059Arr[i6] = lg.EnumC0059.FROM_CART_TO_INVENTORY;
            } else {
                int i7 = i2;
                i2++;
                enumC0059Arr[i7] = lg.EnumC0059.FROM_INVENTORY_TO_CART;
            }
        }
        if (C0358.f6674.f42.f1786.f1994.getParent() != null) {
            int i8 = i2;
            i2++;
            enumC0059Arr[i8] = lg.EnumC0059.FROM_INVENTORY_TO_STORAGE;
        }
        if (C0358.f6674.f42.f1749.f1994.getParent() != null) {
            int i9 = i2;
            i2++;
            enumC0059Arr[i9] = lg.EnumC0059.FROM_INVENTORY_TO_TRADE;
        }
        int i10 = i2;
        int i11 = i2 + 1;
        enumC0059Arr[i10] = lg.EnumC0059.DROP;
        enumC0059Arr[i11] = lg.EnumC0059.VIEW;
        lgVar.m770((lg.EnumC0059[]) Arrays.copyOf(enumC0059Arr, i11 + 1));
    }
}
