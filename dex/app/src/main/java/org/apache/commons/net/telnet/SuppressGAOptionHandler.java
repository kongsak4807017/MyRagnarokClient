package org.apache.commons.net.telnet;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SuppressGAOptionHandler extends TelnetOptionHandler {
    public SuppressGAOptionHandler(boolean z, boolean z2, boolean z3, boolean z4) {
        super(3, z, z2, z3, z4);
    }

    public SuppressGAOptionHandler() {
        super(3, false, false, false, false);
    }

    @Override // org.apache.commons.net.telnet.TelnetOptionHandler
    public int[] answerSubnegotiation(int[] iArr, int i) {
        return null;
    }

    @Override // org.apache.commons.net.telnet.TelnetOptionHandler
    public int[] startSubnegotiationLocal() {
        return null;
    }

    @Override // org.apache.commons.net.telnet.TelnetOptionHandler
    public int[] startSubnegotiationRemote() {
        return null;
    }
}
