package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import org.apache.commons.net.SocketClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ady {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static final char[] f541 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: 櫯, reason: contains not printable characters */
    String f544;

    /* renamed from: Ą, reason: contains not printable characters */
    private boolean f542 = false;

    /* renamed from: ȃ, reason: contains not printable characters */
    private boolean f543 = false;

    /* renamed from: 鷭, reason: contains not printable characters */
    ByteArrayOutputStream f545 = new ByteArrayOutputStream();

    public ady() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            stringBuffer.append(f541[random.nextInt(f541.length)]);
        }
        this.f544 = stringBuffer.toString();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m373() {
        if (!this.f542) {
            this.f545.write(("--" + this.f544 + SocketClient.NETASCII_EOL).getBytes());
        }
        this.f542 = true;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m372() {
        if (this.f543) {
            return;
        }
        try {
            this.f545.write(("\r\n--" + this.f544 + "--\r\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f543 = true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m374(String str, String str2, InputStream inputStream, String str3, boolean z) throws IOException {
        m373();
        try {
            String str4 = "Content-Type: " + str3 + SocketClient.NETASCII_EOL;
            this.f545.write(("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + str2 + "\"\r\n").getBytes());
            this.f545.write(str4.getBytes());
            this.f545.write("Content-Transfer-Encoding: binary\r\n\r\n".getBytes());
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    this.f545.write(bArr, 0, i);
                }
            }
            this.f545.flush();
            if (z) {
                m372();
            } else {
                this.f545.write(("\r\n--" + this.f544 + SocketClient.NETASCII_EOL).getBytes());
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final long m371() {
        m372();
        return this.f545.toByteArray().length;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final ByteArrayOutputStream m370() {
        m372();
        return this.f545;
    }
}
