package o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dp implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f1085;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int[] f1086;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dl f1087;

    dp(dl dlVar, int[] iArr, boolean[] zArr) {
        this.f1087 = dlVar;
        this.f1086 = iArr;
        this.f1085 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        boolean zIsConnected;
        for (int i = 0; i < C0358.f6667.f4855.size(); i++) {
            int i2 = i;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = C0358.f6667.f4855.get(i2);
            int iIntValue = C0358.f6667.f4860.get(i2).intValue();
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, iIntValue), 1000);
                zIsConnected = socket.isConnected();
                socket.close();
            } catch (IOException e) {
                e.getMessage();
                zIsConnected = false;
            }
            if (!zIsConnected) {
                this.f1086[i2] = -2;
            } else {
                this.f1086[i2] = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            }
        }
        this.f1085[0] = true;
    }
}
