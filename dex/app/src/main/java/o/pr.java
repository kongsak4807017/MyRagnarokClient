package o;

import android.support.v4.media.TransportMediator;
import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.http.HttpStatus;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class pr {

    /* renamed from: Ą, reason: contains not printable characters */
    public int f4941;

    /* renamed from: ą, reason: contains not printable characters */
    private Cif f4942;

    /* renamed from: Ć, reason: contains not printable characters */
    private Cif f4943;

    /* renamed from: ć, reason: contains not printable characters */
    private final int[] f4944 = {100, 631, 688, 477, 506, 636, 2085, FTPReply.FILE_STATUS_OK, 50066};

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f4945;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public int f4946;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f4947;

    /* renamed from: 鷭, reason: contains not printable characters */
    public Cif f4948;

    /* renamed from: o.pr$鷭, reason: contains not printable characters */
    public enum EnumC0083 {
        MESSAGE,
        MESSAGE_EXIT,
        INVALID_INIT_ACK,
        BANNED,
        OLD_LICENSE_VERSION;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0083[] valuesCustom() {
            EnumC0083[] enumC0083ArrValuesCustom = values();
            int length = enumC0083ArrValuesCustom.length;
            EnumC0083[] enumC0083Arr = new EnumC0083[length];
            System.arraycopy(enumC0083ArrValuesCustom, 0, enumC0083Arr, 0, length);
            return enumC0083Arr;
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    protected abstract long mo1077();

    /* renamed from: 櫯, reason: contains not printable characters */
    protected abstract long mo1078();

    /* renamed from: 鷭, reason: contains not printable characters */
    public abstract int mo1079();

    /* renamed from: 鷭, reason: contains not printable characters */
    protected abstract long mo1081(Cif cif, long j, long j2);

    /* renamed from: 鷭, reason: contains not printable characters */
    protected abstract void mo1083(byte[] bArr, int i, int i2, Cif cif);

    /* renamed from: o.pr$if, reason: invalid class name */
    public class Cif {

        /* renamed from: ȃ, reason: contains not printable characters */
        protected long[] f4950;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        protected long f4951;

        /* renamed from: 櫯, reason: contains not printable characters */
        protected long f4952;

        /* renamed from: 鷭, reason: contains not printable characters */
        protected long f4953;

        /* synthetic */ Cif(pr prVar, long j, Cif cif) {
            this(j);
        }

        private Cif(long j) {
            this.f4950 = new long[256];
            for (long j2 = 0; j2 < 256; j2++) {
                j = pr.this.mo1081(this, j, j2) & 4294967295L;
            }
            this.f4953 = (j % 20) & 255;
            this.f4952 = (j % 30) & 255;
            this.f4951 = (j % 50) & 255;
        }
    }

    protected pr(qo qoVar) {
        this.f4948 = new Cif(this, pa.m968(qoVar.f4967), null);
        this.f4942 = new Cif(this, pa.m968(qoVar.f4966), null);
        this.f4943 = new Cif(this, pa.m968(qoVar.f4965), null);
        this.f4947 = qoVar.f4964;
        this.f4946 = qoVar.f4961;
        this.f4945 = qoVar.f4962;
        this.f4941 = qoVar.f4963;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1084(byte[] bArr, int i, Cif cif) {
        for (int i2 = 0; i2 < i; i2++) {
            mo1083(bArr, i2 + 0, i, cif);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m1080(byte[] bArr, int i, int i2) {
        long jMo1078 = mo1078();
        for (int i3 = 0; i3 < i2; i3++) {
            jMo1078 = (((mo1077() * jMo1078) & 4294967295L) + (bArr[i3 + i] & 255)) & 4294967295L;
        }
        return (int) jMo1078;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1082(ByteBuffer byteBuffer, ve veVar, int i, boolean z) {
        int iMo1040;
        Cif cif = null;
        if (i == 33413) {
            cif = this.f4943;
        } else if (z) {
            if (i == this.f4946 || i == this.f4947 || i == this.f4945 || i == this.f4941) {
                cif = this.f4942;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f4944.length) {
                        break;
                    }
                    if (i != this.f4944[i2]) {
                        i2++;
                    } else {
                        cif = this.f4942;
                        break;
                    }
                }
            }
        }
        int iPosition = byteBuffer.position();
        if (!z) {
            cif = this.f4948;
            switch (i) {
                case TransportMediator.KEYCODE_MEDIA_PAUSE /* 127 */:
                case HttpStatus.SC_NOT_ACCEPTABLE /* 406 */:
                case 1087:
                case 2435:
                    byteBuffer.position(iPosition + 2);
                    iMo1040 = 4;
                    break;
                case 151:
                case 2039:
                case 2041:
                case 2134:
                case 2135:
                case 2324:
                case 2325:
                case 2523:
                case 2525:
                case 2557:
                case 2559:
                    byteBuffer.position(iPosition + 2);
                    iMo1040 = byteBuffer.getShort() - 4;
                    break;
                case 553:
                    byteBuffer.position(iPosition + 6);
                    iMo1040 = 8;
                    break;
                default:
                    return;
            }
        } else {
            if (cif == null) {
                return;
            }
            iMo1040 = veVar.mo1040();
            switch (i) {
                case 100:
                case 477:
                case 506:
                case 631:
                case 636:
                case 688:
                    if (iMo1040 < 0) {
                        byteBuffer.position(iPosition + 2);
                        iMo1040 = byteBuffer.getShort() - 4;
                        break;
                    } else {
                        byteBuffer.position(iPosition + 4);
                        iMo1040 -= 2;
                        break;
                    }
                default:
                    if (iMo1040 == -1) {
                        byteBuffer.position(iPosition + 2);
                        iMo1040 = byteBuffer.getShort() - 4;
                        break;
                    } else {
                        byteBuffer.position(iPosition + 2);
                        break;
                    }
            }
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition2 = byteBuffer.position();
        Cif cif2 = cif;
        int i3 = iMo1040;
        for (int i4 = 0; i4 < i3; i4++) {
            mo1083(bArrArray, i4 + iPosition2, i3, cif2);
        }
        byteBuffer.position(iPosition);
    }
}
