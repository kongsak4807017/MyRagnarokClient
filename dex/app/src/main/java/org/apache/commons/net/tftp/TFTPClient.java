package org.apache.commons.net.tftp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class TFTPClient extends TFTP {
    public static final int DEFAULT_MAX_TIMEOUTS = 5;
    private int __maxTimeouts = 5;

    public void setMaxTimeouts(int i) {
        if (i <= 0) {
            this.__maxTimeouts = 1;
        } else {
            this.__maxTimeouts = i;
        }
    }

    public int getMaxTimeouts() {
        return this.__maxTimeouts;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
    
        bufferedSend(new org.apache.commons.net.tftp.TFTPErrorPacket(r13.getAddress(), r13.getPort(), 5, "Unexpected host or port."));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int receiveFile(java.lang.String r12, int r13, java.io.OutputStream r14, java.net.InetAddress r15, int r16) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.receiveFile(java.lang.String, int, java.io.OutputStream, java.net.InetAddress, int):int");
    }

    public int receiveFile(String str, int i, OutputStream outputStream, String str2, int i2) {
        return receiveFile(str, i, outputStream, InetAddress.getByName(str2), i2);
    }

    public int receiveFile(String str, int i, OutputStream outputStream, InetAddress inetAddress) {
        return receiveFile(str, i, outputStream, inetAddress, 69);
    }

    public int receiveFile(String str, int i, OutputStream outputStream, String str2) {
        return receiveFile(str, i, outputStream, InetAddress.getByName(str2), 69);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        bufferedSend(new org.apache.commons.net.tftp.TFTPErrorPacket(r14.getAddress(), r14.getPort(), 5, "Unexpected host or port."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r9 > 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        if (r12 != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendFile(java.lang.String r14, int r15, java.io.InputStream r16, java.net.InetAddress r17, int r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.sendFile(java.lang.String, int, java.io.InputStream, java.net.InetAddress, int):void");
    }

    public void sendFile(String str, int i, InputStream inputStream, String str2, int i2) throws IOException {
        sendFile(str, i, inputStream, InetAddress.getByName(str2), i2);
    }

    public void sendFile(String str, int i, InputStream inputStream, InetAddress inetAddress) throws IOException {
        sendFile(str, i, inputStream, inetAddress, 69);
    }

    public void sendFile(String str, int i, InputStream inputStream, String str2) throws IOException {
        sendFile(str, i, inputStream, InetAddress.getByName(str2), 69);
    }
}
