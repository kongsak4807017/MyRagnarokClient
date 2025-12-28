package org.apache.commons.net.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.discard.DiscardUDPClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class EchoUDPClient extends DiscardUDPClient {
    public static final int DEFAULT_PORT = 7;
    private final DatagramPacket __receivePacket = new DatagramPacket(new byte[0], 0);

    @Override // org.apache.commons.net.discard.DiscardUDPClient
    public final void send(byte[] bArr, int i, InetAddress inetAddress) {
        send(bArr, i, inetAddress, 7);
    }

    @Override // org.apache.commons.net.discard.DiscardUDPClient
    public final void send(byte[] bArr, InetAddress inetAddress) {
        send(bArr, bArr.length, inetAddress, 7);
    }

    public final int receive(byte[] bArr, int i) throws IOException {
        this.__receivePacket.setData(bArr);
        this.__receivePacket.setLength(i);
        this._socket_.receive(this.__receivePacket);
        return this.__receivePacket.getLength();
    }

    public final int receive(byte[] bArr) {
        return receive(bArr, bArr.length);
    }
}
