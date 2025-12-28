package o;

import android.support.v4.widget.ExploreByTouchHelper;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public enum aat {
    VM_FC(1),
    VM_FZ(2),
    VM_FS(ExploreByTouchHelper.INVALID_ID);


    /* renamed from: ȃ, reason: contains not printable characters */
    int f278;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static aat[] valuesCustom() {
        aat[] aatVarArrValuesCustom = values();
        int length = aatVarArrValuesCustom.length;
        aat[] aatVarArr = new aat[length];
        System.arraycopy(aatVarArrValuesCustom, 0, aatVarArr, 0, length);
        return aatVarArr;
    }

    aat(int i) {
        this.f278 = i;
    }
}
