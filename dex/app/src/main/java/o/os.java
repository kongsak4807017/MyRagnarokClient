package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class os {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public long f3369;

    /* renamed from: 櫯, reason: contains not printable characters */
    byte[] f3370 = new byte[2048];

    /* renamed from: 鷭, reason: contains not printable characters */
    public InputStream f3371;

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m938(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = this.f3371.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new IOException("Unexpected end of stream");
            }
            i2 += i3;
        }
        this.f3369 += i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final byte[] m939() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = this.f3371.read(this.f3370);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(this.f3370, 0, i);
        }
    }

    public os(InputStream inputStream) {
        this.f3371 = inputStream;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m934() throws IOException {
        m938(this.f3370, 4);
        return (this.f3370[3] << 24) | ((this.f3370[2] & 255) << 16) | ((this.f3370[1] & 255) << 8) | (this.f3370[0] & 255);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final short m933() throws IOException {
        m938(this.f3370, 2);
        return (short) (((this.f3370[1] & 255) << 8) | (this.f3370[0] & 255));
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final byte m932() throws IOException {
        int i = this.f3371.read();
        if (i == -1) {
            throw new IOException("Unexpected end of stream");
        }
        this.f3369++;
        return (byte) i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m937(byte[] bArr) throws IOException {
        m938(bArr, bArr.length);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final byte[] m940(int i) throws IOException {
        byte[] bArr = new byte[i];
        m938(bArr, bArr.length);
        return bArr;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m936(byte[] bArr, int i) throws IOException {
        m938(bArr, i);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m935(int i) {
        long jSkip = 0;
        while (jSkip < i) {
            jSkip += this.f3371.skip(i - jSkip);
        }
        this.f3369 += i;
    }
}
