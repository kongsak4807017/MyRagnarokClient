package org.apache.commons.net;

import java.util.EventListener;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface ProtocolCommandListener extends EventListener {
    void protocolCommandSent(ProtocolCommandEvent protocolCommandEvent);

    void protocolReplyReceived(ProtocolCommandEvent protocolCommandEvent);
}
