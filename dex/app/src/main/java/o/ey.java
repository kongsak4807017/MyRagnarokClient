package o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ey implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ es f1235;

    ey(es esVar) {
        this.f1235 = esVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        boolean zIsConnected;
        es esVar = this.f1235;
        for (int i = 0; i < esVar.f1225.length; i++) {
            pj.C0079 c0079 = esVar.f1225[i];
            int i2 = i;
            if (c0079.f4809 == null) {
                C0358.f6674.mo139(new ew(esVar, i2));
            } else {
                String str = c0079.f4817 != null ? c0079.f4817 : c0079.f4809;
                int i3 = c0079.f4837 != 0 ? c0079.f4837 : c0079.f4769;
                Socket socket = new Socket();
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    socket.connect(new InetSocketAddress(str, i3), 1000);
                    zIsConnected = socket.isConnected();
                    socket.close();
                    if (Thread.currentThread().isInterrupted()) {
                        return;
                    }
                } catch (IOException e) {
                    e.getMessage();
                    zIsConnected = false;
                }
                C0358.f6674.mo139(new ex(esVar, i2, !zIsConnected ? -2 : (int) (System.currentTimeMillis() - jCurrentTimeMillis)));
            }
        }
    }
}
