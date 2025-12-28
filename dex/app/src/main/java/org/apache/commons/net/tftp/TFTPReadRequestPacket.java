package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class TFTPReadRequestPacket extends TFTPRequestPacket {
    public TFTPReadRequestPacket(InetAddress inetAddress, int i, String str, int i2) {
        super(inetAddress, i, 1, str, i2);
    }

    TFTPReadRequestPacket(DatagramPacket datagramPacket) {
        super(1, datagramPacket);
    }
}
