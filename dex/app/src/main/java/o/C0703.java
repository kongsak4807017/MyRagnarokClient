package o;

import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.惼, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0703 extends ub {
    C0703() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 367;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[60];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[FTPReply.SERVICE_NOT_READY];
        byteBuffer.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar2);
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        C0358.f6664.f2004.f8635.f8293 = strM978;
        C0358.f6664.f2004.f8635.f8294 = strM9782;
        C0358.f6674.f42.f1792.m1432(strM978, 16776960);
        C0358.f6674.f42.f1792.m1432(strM9782, 16776960);
        throw new uz(this);
    }
}
