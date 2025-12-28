package o;

import android.net.wifi.WifiManager;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Iterator;
import org.apache.http.conn.util.InetAddressUtils;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ob {
    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m916(String str) throws SocketException {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (str == null || networkInterface.getName().equalsIgnoreCase(str)) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static String m915() throws SocketException {
        String strM916 = m916("wlan0");
        if (strM916 == null || strM916.length() <= 0) {
            strM916 = m916("eth0");
        }
        if (strM916 == null || strM916.length() <= 0) {
            strM916 = ((WifiManager) C0358.f6674.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        if (strM916 == null) {
            return "";
        }
        return strM916;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static String m914() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String upperCase = inetAddress.getHostAddress().toUpperCase();
                        if (InetAddressUtils.isIPv4Address(upperCase)) {
                            return upperCase;
                        }
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }
}
