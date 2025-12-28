package org.apache.commons.net.smtp;

import java.util.Enumeration;
import java.util.Vector;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class RelayPath {
    String _emailAddress;
    Vector<String> _path = new Vector<>();

    public RelayPath(String str) {
        this._emailAddress = str;
    }

    public final void addRelay(String str) {
        this._path.addElement(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        Enumeration<String> enumerationElements = this._path.elements();
        if (enumerationElements.hasMoreElements()) {
            sb.append('@');
            sb.append(enumerationElements.nextElement());
            while (enumerationElements.hasMoreElements()) {
                sb.append(",@");
                sb.append(enumerationElements.nextElement());
            }
            sb.append(':');
        }
        sb.append(this._emailAddress);
        sb.append('>');
        return sb.toString();
    }
}
