package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface DatagramSocketFactory {
    DatagramSocket createDatagramSocket();

    DatagramSocket createDatagramSocket(int i);

    DatagramSocket createDatagramSocket(int i, InetAddress inetAddress);
}
