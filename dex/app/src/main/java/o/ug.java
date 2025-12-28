package o;

import com.roworkshop.ro.natives;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.zip.InflaterInputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ug {

    /* renamed from: Ą, reason: contains not printable characters */
    public int f5126;

    /* renamed from: ą, reason: contains not printable characters */
    public byte f5127;

    /* renamed from: Ć, reason: contains not printable characters */
    public String f5128;

    /* renamed from: ć, reason: contains not printable characters */
    public File f5129;

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f5130;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public int f5131;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f5132;

    /* renamed from: 鷭, reason: contains not printable characters */
    public int f5133;

    /* renamed from: 鷭, reason: contains not printable characters */
    public final os m1117() {
        if (!this.f5129.exists()) {
            throw new RuntimeException("GRF " + this.f5129 + " requested by " + this.f5128 + " not exists");
        }
        byte[] bArr = new byte[this.f5132];
        on onVar = new on(new FileInputStream(this.f5129));
        long jM972 = pa.m972(this.f5130);
        for (long jSkip = 0; jSkip < jM972; jSkip += onVar.skip(jM972 - jSkip)) {
        }
        onVar.read(bArr, 0, this.f5132);
        if (this.f5127 == 1 || this.f5127 == 3 || this.f5127 == 5) {
            if (this.f5126 >= 0) {
                int i = this.f5132;
                int i2 = this.f5126 == 0 ? 1 : 0;
                int i3 = this.f5126;
                if (vc.f5368) {
                    natives.decodedes(bArr, i, i2, i3);
                } else {
                    vc.m1147(bArr, i, i2, i3);
                }
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, this.f5133);
            onVar.close();
            if (bArrCopyOf[0] == 0) {
                byte b = bArrCopyOf[1];
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrCopyOf, 2, bArrCopyOf.length - 2);
                return new os(new aen(byteArrayInputStream, this.f5131, b, aen.m420(byteArrayInputStream)));
            }
            return new os(new InflaterInputStream(new ByteArrayInputStream(bArrCopyOf)));
        }
        onVar.close();
        return new os(new ByteArrayInputStream(bArr));
    }
}
