package o;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class aen extends InputStream {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final /* synthetic */ boolean f603;

    /* renamed from: Ą, reason: contains not printable characters */
    private aew f604;

    /* renamed from: ą, reason: contains not printable characters */
    private aes f605;

    /* renamed from: ȃ, reason: contains not printable characters */
    private aeq f608;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private ael f609;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private long f610;

    /* renamed from: 櫯, reason: contains not printable characters */
    private InputStream f612;

    /* renamed from: Ć, reason: contains not printable characters */
    private boolean f606 = false;

    /* renamed from: ć, reason: contains not printable characters */
    private final byte[] f607 = new byte[1];

    /* renamed from: 岱, reason: contains not printable characters */
    private IOException f611 = null;

    static {
        f603 = !aen.class.desiredAssertionStatus();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m419(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & (-16);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static int m420(ByteArrayInputStream byteArrayInputStream) {
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        int unsignedByte = 0;
        for (int i = 0; i < 4; i++) {
            unsignedByte |= dataInputStream.readUnsignedByte() << (i * 8);
        }
        return unsignedByte;
    }

    public aen(ByteArrayInputStream byteArrayInputStream, long j, byte b, int i) throws aem, aeo {
        ael aelVar = ael.f602;
        if (j < -1) {
            throw new aeo("Uncompressed size is too big");
        }
        int i2 = b & 255;
        if (i2 > 224) {
            throw new aem("Invalid LZMA properties byte");
        }
        int i3 = i2 / 45;
        int i4 = i2 - ((i3 * 9) * 5);
        int i5 = i4 / 9;
        int i6 = i4 - (i5 * 9);
        if (i < 0 || i > 2147483632) {
            throw new aeo("LZMA dictionary is too big for this implementation");
        }
        if (j < -1 || i6 < 0 || i6 > 8 || i5 < 0 || i5 > 4 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException();
        }
        this.f612 = byteArrayInputStream;
        this.f609 = aelVar;
        int iM419 = m419(i);
        if (j >= 0 && iM419 > j) {
            iM419 = m419((int) j);
        }
        this.f608 = new aeq(m419(iM419), null, aelVar);
        this.f604 = new aew(byteArrayInputStream);
        this.f605 = new aes(this.f608, this.f604, i6, i5, i3);
        this.f610 = j;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f607, 0, 1) == -1) {
            return -1;
        }
        return this.f607[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f612 == null) {
            throw new aep("Stream closed");
        }
        if (this.f611 != null) {
            throw this.f611;
        }
        if (this.f606) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            try {
                int i4 = i2;
                if (this.f610 >= 0 && this.f610 < i2) {
                    i4 = (int) this.f610;
                }
                aeq aeqVar = this.f608;
                if (aeqVar.f619 - aeqVar.f617 <= i4) {
                    aeqVar.f614 = aeqVar.f619;
                } else {
                    aeqVar.f614 = aeqVar.f617 + i4;
                }
                try {
                    this.f605.m425();
                } catch (aem e) {
                    if (this.f610 == -1) {
                        if (this.f605.f631[0] == -1) {
                            this.f606 = true;
                            this.f604.mo429();
                        }
                    }
                    throw e;
                }
                aeq aeqVar2 = this.f608;
                int i5 = i;
                int i6 = aeqVar2.f617 - aeqVar2.f618;
                if (aeqVar2.f617 == aeqVar2.f619) {
                    aeqVar2.f617 = 0;
                }
                System.arraycopy(aeqVar2.f620, aeqVar2.f618, bArr, i5, i6);
                aeqVar2.f618 = aeqVar2.f617;
                i += i6;
                i2 -= i6;
                i3 += i6;
                if (this.f610 >= 0) {
                    this.f610 -= i6;
                    if (!f603 && this.f610 < 0) {
                        throw new AssertionError();
                    }
                    if (this.f610 == 0) {
                        this.f606 = true;
                    }
                }
                if (this.f606) {
                    if (this.f604.f653 == 0) {
                        if (!(this.f608.f615 > 0)) {
                            if (this.f608 != null) {
                                this.f608 = null;
                            }
                            if (i3 == 0) {
                                return -1;
                            }
                            return i3;
                        }
                    }
                    throw new aem();
                }
            } catch (IOException e2) {
                this.f611 = e2;
                throw e2;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f612 != null) {
            if (this.f608 != null) {
                this.f608 = null;
            }
            try {
                this.f612.close();
            } finally {
                this.f612 = null;
            }
        }
    }
}
