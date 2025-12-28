package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class c implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ b f872;

    c(b bVar) {
        this.f872 = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b bVar = this.f872;
            synchronized (bVar.f768.f4992) {
                ty tyVar = bVar.f768;
                C0644 c0644 = bVar.f753;
                pq pqVar = bVar.f750;
                pr prVar = bVar.f751;
                if (tyVar.f4991) {
                    if (tyVar.f4992 != null && tyVar.f4992.f5013 != 0) {
                        pc.m994();
                    }
                } else if (tyVar.f4992.f5013 != 0) {
                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(tyVar.f4992.f5015, tyVar.f4992.f5014, tyVar.f4992.f5013).order(ByteOrder.LITTLE_ENDIAN);
                    do {
                        boolean z = c0644 != null && c0644.f3365;
                        if (!tyVar.m1100(byteBufferOrder, pqVar, prVar)) {
                            break;
                        } else if (z && byteBufferOrder.position() % 16 > 0) {
                            byteBufferOrder.position(((byteBufferOrder.position() / 16) * 16) + 16);
                        }
                    } while (!tyVar.f4991);
                    tyVar.f4992.f5014 = Math.min(byteBufferOrder.position(), tyVar.f4992.f5013);
                    tyVar.f4992.m1106();
                }
                if (bVar.f757 != null && bVar.f757.f774 && !bVar.f768.f4991) {
                    ty tyVar2 = bVar.f768;
                    tyVar2.f4992.f5014 = 0;
                    tyVar2.f4992.f5013 = 0;
                }
            }
            synchronized (bVar.f754) {
                bVar.f754.notify();
            }
        } catch (uu e) {
            nz.m907(e.getMessage());
            ty tyVar3 = this.f872.f768;
            tyVar3.f4992.f5014 = 0;
            tyVar3.f4992.f5013 = 0;
        }
    }
}
