package org.apache.http.util;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class NetUtils {
    public static void formatAddress(StringBuilder sb, SocketAddress socketAddress) {
        Args.notNull(sb, "Buffer");
        Args.notNull(socketAddress, "Socket address");
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            InetAddress address = inetSocketAddress.getAddress();
            sb.append((Object) (address != null ? address.getHostAddress() : address)).append(':').append(inetSocketAddress.getPort());
            return;
        }
        sb.append(socketAddress);
    }
}
