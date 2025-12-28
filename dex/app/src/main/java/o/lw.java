package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lw {

    /* renamed from: Ą, reason: contains not printable characters */
    byte[] f2036;

    /* renamed from: ą, reason: contains not printable characters */
    int f2037;

    /* renamed from: Ć, reason: contains not printable characters */
    int f2038;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f2039;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f2040;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f2041;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f2042;

    public lw(byte[] bArr) throws DataFormatException {
        byte[] bArr2;
        int i;
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        ow owVar = ow.LATIN;
        byte[] bArr3 = new byte[4];
        byteBufferOrder.get(bArr3);
        if (!pa.m978(bArr3, owVar).equals("RIFF")) {
            throw new DataFormatException("Invalid magic");
        }
        int i2 = byteBufferOrder.getInt();
        if (i2 < 0 || i2 > bArr.length) {
            throw new DataFormatException("Unexpected ChunkSize=" + i2);
        }
        ow owVar2 = ow.LATIN;
        byte[] bArr4 = new byte[4];
        byteBufferOrder.get(bArr4);
        String strM978 = pa.m978(bArr4, owVar2);
        if (!strM978.equals("WAVE")) {
            throw new DataFormatException("Unexpected Format=" + strM978);
        }
        ow owVar3 = ow.LATIN;
        byte[] bArr5 = new byte[4];
        byteBufferOrder.get(bArr5);
        String strM9782 = pa.m978(bArr5, owVar3);
        if (!strM9782.equals("fmt ")) {
            throw new DataFormatException("Unexpected Subchunk1ID=" + strM9782);
        }
        int i3 = byteBufferOrder.getInt();
        if (i3 < 0 || i3 > i2) {
            throw new DataFormatException("Unexpected Subchunk1Size=" + i3);
        }
        this.f2042 = byteBufferOrder.getShort();
        switch (this.f2042) {
            case 1:
                this.f2041 = byteBufferOrder.getShort();
                if (this.f2041 != 1 && this.f2041 != 2) {
                    throw new DataFormatException("Unsupported channels: " + this.f2041);
                }
                this.f2040 = byteBufferOrder.getInt();
                byteBufferOrder.getInt();
                byteBufferOrder.getShort();
                this.f2039 = byteBufferOrder.getShort();
                if (this.f2042 != 1) {
                    byteBufferOrder.get(new byte[byteBufferOrder.getShort()]);
                }
                while (true) {
                    bArr2 = new byte[4];
                    byteBufferOrder.get(bArr2);
                    if (!pa.m978(bArr2, ow.LATIN).equals("data")) {
                        i = byteBufferOrder.getInt();
                        if (i >= 0 && i <= byteBufferOrder.remaining()) {
                            byteBufferOrder.get(new byte[i]);
                        }
                    } else {
                        int i4 = byteBufferOrder.getInt();
                        if (i4 < 0 || i4 > byteBufferOrder.remaining()) {
                            throw new DataFormatException("Unexpected Subchunk2Size=" + i4 + " (remaining=" + byteBufferOrder.remaining() + ")");
                        }
                        this.f2038 = i4;
                        this.f2037 = byteBufferOrder.position();
                        this.f2036 = bArr;
                        return;
                    }
                }
                throw new nv("Failed to skip subchunk " + ((int) bArr2[0]) + ((int) bArr2[1]) + ((int) bArr2[2]) + ((int) bArr2[3]) + ": invalid size (" + i + ")\n");
            default:
                throw new DataFormatException("Unsupported encoding: " + this.f2042);
        }
    }
}
