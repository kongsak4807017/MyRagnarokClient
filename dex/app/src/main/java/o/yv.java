package o;

import java.io.File;
import java.io.RandomAccessFile;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class yv extends RandomAccessFile implements yt {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final /* synthetic */ boolean f5997;

    static {
        f5997 = !yv.class.desiredAssertionStatus();
    }

    public yv(File file) {
        super(file, "r");
    }

    @Override // o.yt
    /* renamed from: 鷭 */
    public final int mo1177(byte[] bArr, int i) {
        if (!f5997 && i <= 0) {
            throw new AssertionError(i);
        }
        readFully(bArr, 0, i);
        return i;
    }

    @Override // o.yt
    /* renamed from: 鷭 */
    public final long mo1178() {
        return getFilePointer();
    }

    @Override // o.yt
    /* renamed from: 鷭 */
    public final void mo1179(long j) {
        seek(j);
    }
}
