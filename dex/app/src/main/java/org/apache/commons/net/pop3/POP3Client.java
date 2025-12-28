package org.apache.commons.net.pop3;

import java.io.Reader;
import java.security.MessageDigest;
import java.util.ListIterator;
import java.util.StringTokenizer;
import org.apache.commons.net.io.DotTerminatedMessageReader;
import org.apache.http.message.TokenParser;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class POP3Client extends POP3 {
    private static POP3MessageInfo __parseStatus(String str) throws NumberFormatException {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        if (!stringTokenizer.hasMoreElements()) {
            return null;
        }
        try {
            int i = Integer.parseInt(stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreElements()) {
                return null;
            }
            return new POP3MessageInfo(i, Integer.parseInt(stringTokenizer.nextToken()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static POP3MessageInfo __parseUID(String str) throws NumberFormatException {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        if (!stringTokenizer.hasMoreElements()) {
            return null;
        }
        try {
            int i = Integer.parseInt(stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreElements()) {
                return null;
            }
            return new POP3MessageInfo(i, stringTokenizer.nextToken());
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public boolean capa() {
        if (sendCommand(12) == 0) {
            getAdditionalReply();
            return true;
        }
        return false;
    }

    public boolean login(String str, String str2) {
        if (getState() != 0 || sendCommand(0, str) != 0 || sendCommand(1, str2) != 0) {
            return false;
        }
        setState(1);
        return true;
    }

    public boolean login(String str, String str2, String str3) {
        if (getState() != 0) {
            return false;
        }
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest((str2 + str3).getBytes());
        StringBuilder sb = new StringBuilder(128);
        for (byte b : bArrDigest) {
            int i = b & 255;
            if (i <= 15) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(str);
        sb2.append(TokenParser.SP);
        sb2.append(sb.toString());
        if (sendCommand(9, sb2.toString()) != 0) {
            return false;
        }
        setState(1);
        return true;
    }

    public boolean logout() {
        if (getState() == 1) {
            setState(2);
        }
        sendCommand(2);
        return this._replyCode == 0;
    }

    public boolean noop() {
        return getState() == 1 && sendCommand(7) == 0;
    }

    public boolean deleteMessage(int i) {
        return getState() == 1 && sendCommand(6, Integer.toString(i)) == 0;
    }

    public boolean reset() {
        return getState() == 1 && sendCommand(8) == 0;
    }

    public POP3MessageInfo status() {
        if (getState() != 1 || sendCommand(3) != 0) {
            return null;
        }
        return __parseStatus(this._lastReplyLine.substring(3));
    }

    public POP3MessageInfo listMessage(int i) {
        if (getState() != 1 || sendCommand(4, Integer.toString(i)) != 0) {
            return null;
        }
        return __parseStatus(this._lastReplyLine.substring(3));
    }

    public POP3MessageInfo[] listMessages() {
        if (getState() != 1 || sendCommand(4) != 0) {
            return null;
        }
        getAdditionalReply();
        POP3MessageInfo[] pOP3MessageInfoArr = new POP3MessageInfo[this._replyLines.size() - 2];
        ListIterator<String> listIterator = this._replyLines.listIterator(1);
        for (int i = 0; i < pOP3MessageInfoArr.length; i++) {
            pOP3MessageInfoArr[i] = __parseStatus(listIterator.next());
        }
        return pOP3MessageInfoArr;
    }

    public POP3MessageInfo listUniqueIdentifier(int i) {
        if (getState() != 1 || sendCommand(11, Integer.toString(i)) != 0) {
            return null;
        }
        return __parseUID(this._lastReplyLine.substring(3));
    }

    public POP3MessageInfo[] listUniqueIdentifiers() {
        if (getState() != 1 || sendCommand(11) != 0) {
            return null;
        }
        getAdditionalReply();
        POP3MessageInfo[] pOP3MessageInfoArr = new POP3MessageInfo[this._replyLines.size() - 2];
        ListIterator<String> listIterator = this._replyLines.listIterator(1);
        for (int i = 0; i < pOP3MessageInfoArr.length; i++) {
            pOP3MessageInfoArr[i] = __parseUID(listIterator.next());
        }
        return pOP3MessageInfoArr;
    }

    public Reader retrieveMessage(int i) {
        if (getState() != 1 || sendCommand(5, Integer.toString(i)) != 0) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader);
    }

    public Reader retrieveMessageTop(int i, int i2) {
        if (i2 < 0 || getState() != 1 || sendCommand(10, Integer.toString(i) + " " + Integer.toString(i2)) != 0) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader);
    }
}
