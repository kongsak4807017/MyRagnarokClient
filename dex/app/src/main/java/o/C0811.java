package o;

import java.util.Arrays;

/* renamed from: o.瞣, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0811 extends wc {
    C0811(String str) {
        if (C0358.f6681 != null) {
            C0358.f6681.getChars(0, Math.min(C0358.f6681.length(), this.f5466.length), this.f5466, 0);
        }
        if (C0358.f6664 != null && C0358.f6664.f2004 != null) {
            C1035 c1035 = C0358.f6664.f2004;
            if (c1035.f8368 != null) {
                c1035.f8368.getChars(0, Math.min(c1035.f8368.length(), this.f5462.length), this.f5462, 0);
            }
            this.f5463 = (short) c1035.f2001;
            this.f5468 = (short) c1035.f2002;
            this.f5470 = (short) c1035.f1999;
        }
        if (C0358.f6668 != null && C0358.f6668.f6712 != null) {
            C0358.f6668.f6712.getChars(0, Math.min(this.f5464.length, C0358.f6668.f6712.length()), this.f5464, 0);
        }
        if (C0358.f6668 != null && C0358.f6668.f6711 != null) {
            C0358.f6668.f6711.getChars(0, Math.min(this.f5467.length, C0358.f6668.f6711.length()), this.f5467, 0);
        }
        this.f5465 = (short) C0358.f6671.f768.f4989;
        if (C0358.f6668 != null && C0358.f6668.f6709 != null) {
            C0358.f6668.f6709.getChars(0, Math.min(this.f5471.length, C0358.f6668.f6709.length()), this.f5471, 0);
        }
        if (C0358.f6667 != null && C0358.f6667.f4851 != null) {
            C0358.f6667.f4851.getChars(0, Math.min(this.f5469.length, C0358.f6667.f4851.length()), this.f5469, 0);
        }
        this.f5472 = str != null ? str.toCharArray() : "null".toCharArray();
        if (this.f5472.length > 1000) {
            this.f5472 = Arrays.copyOf(this.f5472, 1000);
        }
    }
}
