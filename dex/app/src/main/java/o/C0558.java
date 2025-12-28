package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.䃢, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0558 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0559[] f7293;

    /* renamed from: 櫯, reason: contains not printable characters */
    ArrayList<C1008> f7291 = new ArrayList<>();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int[] f7287 = new int[3];

    /* renamed from: ȃ, reason: contains not printable characters */
    int f7285 = 3;

    /* renamed from: Ą, reason: contains not printable characters */
    int f7280 = 0;

    /* renamed from: ą, reason: contains not printable characters */
    int f7281 = 0;

    /* renamed from: Ć, reason: contains not printable characters */
    int f7282 = 994;

    /* renamed from: ć, reason: contains not printable characters */
    int f7283 = 996;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    int f7288 = 995;

    /* renamed from: 岱, reason: contains not printable characters */
    int f7290 = 997;

    /* renamed from: Ȋ, reason: contains not printable characters */
    int f7286 = 1000;

    /* renamed from: ċ, reason: contains not printable characters */
    int f7284 = 998;

    /* renamed from: 纫, reason: contains not printable characters */
    int f7292 = 999;

    /* renamed from: 䒧, reason: contains not printable characters */
    boolean f7289 = false;

    C0558() {
    }

    /* renamed from: o.䃢$鷭, reason: contains not printable characters */
    class C0559 {

        /* renamed from: 櫯, reason: contains not printable characters */
        int[] f7295;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f7296;

        C0559(ByteBuffer byteBuffer) {
            this.f7295 = new int[C0558.this.f7285];
            this.f7296 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            for (int i = 0; i < this.f7295.length; i++) {
                this.f7295[i] = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1371(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, C1008>> it = C0358.f6664.f2004.f8622.entrySet().iterator();
        while (it.hasNext()) {
            C1008 value = it.next().getValue();
            if (value != null && this.f7280 < this.f7285 && (value.f8502 == this.f7286 || (!this.f7289 && (value.f8502 == this.f7282 || value.f8502 == this.f7283 || value.f8502 == this.f7288 || value.f8502 == this.f7290)))) {
                if (!z && value != null) {
                    arrayList.add(value);
                }
            }
        }
        int i2 = 0;
        while (i2 < this.f7293.length && this.f7293[i2].f7296 != i) {
            i2++;
        }
        if (i2 == this.f7293.length) {
            return;
        }
        C0559 c0559 = this.f7293[i2];
        C0569 c0569 = C0358.f6674.f42.f1754;
        c0569.f7326 = new C0946(this, c0559, z);
        c0569.f7329.setAdapter((ListAdapter) new C0471((int[]) null, (ArrayList<C1008>) arrayList));
        c0569.h_();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1370(int[] iArr, ArrayList<C1008> arrayList) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != 0) {
                C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(iArr[i]));
                if (c1008 == null) {
                    c1008 = arrayList.get(i);
                    c1008.f8500++;
                    C0358.f6664.f2004.f8622.put(Integer.valueOf(iArr[i]), arrayList.get(i));
                } else {
                    c1008.f8500++;
                }
                C0778 c0778 = C0358.f6674.f42.f1810;
                EnumC0680 enumC0680 = c1008.f8493;
                if (c0778.f1994.getParent() != null) {
                    c0778.m1465(ng.m881(enumC0680));
                }
            }
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 397;
        this.f7293 = new C0559[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f7293[i3] = new C0559(byteBuffer);
        }
        if (z) {
            return;
        }
        if (i == 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(FTPReply.CANNOT_OPEN_DATA_CONNECTION);
            c0698.m1432(strM649 == null ? "MSG425" : strM649, 16711680);
            return;
        }
        C1008[] c1008Arr = new C1008[i];
        for (int i4 = 0; i4 < i; i4++) {
            c1008Arr[i4] = new C1008(this.f7293[i4].f7296);
        }
        this.f7280 = 0;
        C0876 c0876 = C0358.f6674.f42.f1753;
        c0876.f8045 = new C0320(this);
        c0876.f8046.setAdapter((ListAdapter) new C0471((int[]) null, c1008Arr));
        c0876.h_();
    }
}
