package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicLineParser implements LineParser {

    @Deprecated
    public static final BasicLineParser DEFAULT = new BasicLineParser();
    public static final BasicLineParser INSTANCE = new BasicLineParser();
    protected final ProtocolVersion protocol;

    public BasicLineParser(ProtocolVersion protocolVersion) {
        this.protocol = protocolVersion != null ? protocolVersion : HttpVersion.HTTP_1_1;
    }

    public BasicLineParser() {
        this(null);
    }

    public static ProtocolVersion parseProtocolVersion(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return (lineParser != null ? lineParser : INSTANCE).parseProtocolVersion(charArrayBuffer, new ParserCursor(0, str.length()));
    }

    @Override // org.apache.http.message.LineParser
    public ProtocolVersion parseProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws NumberFormatException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        String protocol = this.protocol.getProtocol();
        int length = protocol.length();
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        skipWhitespace(charArrayBuffer, parserCursor);
        int pos2 = parserCursor.getPos();
        if (pos2 + length + 4 > upperBound) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(pos, upperBound));
        }
        boolean z = true;
        for (int i = 0; z && i < length; i++) {
            z = charArrayBuffer.charAt(pos2 + i) == protocol.charAt(i);
        }
        if (z) {
            z = charArrayBuffer.charAt(pos2 + length) == '/';
        }
        if (!z) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(pos, upperBound));
        }
        int i2 = pos2 + length + 1;
        int iIndexOf = charArrayBuffer.indexOf(46, i2, upperBound);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid protocol version number: " + charArrayBuffer.substring(pos, upperBound));
        }
        try {
            int i3 = Integer.parseInt(charArrayBuffer.substringTrimmed(i2, iIndexOf));
            int i4 = iIndexOf + 1;
            int iIndexOf2 = charArrayBuffer.indexOf(32, i4, upperBound);
            if (iIndexOf2 == -1) {
                iIndexOf2 = upperBound;
            }
            try {
                int i5 = Integer.parseInt(charArrayBuffer.substringTrimmed(i4, iIndexOf2));
                parserCursor.updatePos(iIndexOf2);
                return createProtocolVersion(i3, i5);
            } catch (NumberFormatException unused) {
                throw new ParseException("Invalid protocol minor version number: " + charArrayBuffer.substring(pos, upperBound));
            }
        } catch (NumberFormatException unused2) {
            throw new ParseException("Invalid protocol major version number: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    protected ProtocolVersion createProtocolVersion(int i, int i2) {
        return this.protocol.forVersion(i, i2);
    }

    @Override // org.apache.http.message.LineParser
    public boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        String protocol = this.protocol.getProtocol();
        int length = protocol.length();
        if (charArrayBuffer.length() < length + 4) {
            return false;
        }
        if (pos < 0) {
            pos = (charArrayBuffer.length() - 4) - length;
        } else if (pos == 0) {
            while (pos < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
                pos++;
            }
        }
        if (pos + length + 4 > charArrayBuffer.length()) {
            return false;
        }
        boolean z = true;
        for (int i = 0; z && i < length; i++) {
            z = charArrayBuffer.charAt(pos + i) == protocol.charAt(i);
        }
        if (z) {
            return charArrayBuffer.charAt(pos + length) == '/';
        }
        return z;
    }

    public static RequestLine parseRequestLine(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return (lineParser != null ? lineParser : INSTANCE).parseRequestLine(charArrayBuffer, new ParserCursor(0, str.length()));
    }

    @Override // org.apache.http.message.LineParser
    public RequestLine parseRequestLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws NumberFormatException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        try {
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos2 = parserCursor.getPos();
            int iIndexOf = charArrayBuffer.indexOf(32, pos2, upperBound);
            if (iIndexOf < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            String strSubstringTrimmed = charArrayBuffer.substringTrimmed(pos2, iIndexOf);
            parserCursor.updatePos(iIndexOf);
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos3 = parserCursor.getPos();
            int iIndexOf2 = charArrayBuffer.indexOf(32, pos3, upperBound);
            if (iIndexOf2 < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            String strSubstringTrimmed2 = charArrayBuffer.substringTrimmed(pos3, iIndexOf2);
            parserCursor.updatePos(iIndexOf2);
            ProtocolVersion protocolVersion = parseProtocolVersion(charArrayBuffer, parserCursor);
            skipWhitespace(charArrayBuffer, parserCursor);
            if (!parserCursor.atEnd()) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            return createRequestLine(strSubstringTrimmed, strSubstringTrimmed2, protocolVersion);
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    protected RequestLine createRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        return new BasicRequestLine(str, str2, protocolVersion);
    }

    public static StatusLine parseStatusLine(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return (lineParser != null ? lineParser : INSTANCE).parseStatusLine(charArrayBuffer, new ParserCursor(0, str.length()));
    }

    @Override // org.apache.http.message.LineParser
    public StatusLine parseStatusLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws NumberFormatException {
        String strSubstringTrimmed;
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        try {
            ProtocolVersion protocolVersion = parseProtocolVersion(charArrayBuffer, parserCursor);
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos2 = parserCursor.getPos();
            int iIndexOf = charArrayBuffer.indexOf(32, pos2, upperBound);
            if (iIndexOf < 0) {
                iIndexOf = upperBound;
            }
            String strSubstringTrimmed2 = charArrayBuffer.substringTrimmed(pos2, iIndexOf);
            for (int i = 0; i < strSubstringTrimmed2.length(); i++) {
                if (!Character.isDigit(strSubstringTrimmed2.charAt(i))) {
                    throw new ParseException("Status line contains invalid status code: " + charArrayBuffer.substring(pos, upperBound));
                }
            }
            try {
                int i2 = Integer.parseInt(strSubstringTrimmed2);
                int i3 = iIndexOf;
                if (iIndexOf < upperBound) {
                    strSubstringTrimmed = charArrayBuffer.substringTrimmed(i3, upperBound);
                } else {
                    strSubstringTrimmed = "";
                }
                return createStatusLine(protocolVersion, i2, strSubstringTrimmed);
            } catch (NumberFormatException unused) {
                throw new ParseException("Status line contains invalid status code: " + charArrayBuffer.substring(pos, upperBound));
            }
        } catch (IndexOutOfBoundsException unused2) {
            throw new ParseException("Invalid status line: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    protected StatusLine createStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        return new BasicStatusLine(protocolVersion, i, str);
    }

    public static Header parseHeader(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return (lineParser != null ? lineParser : INSTANCE).parseHeader(charArrayBuffer);
    }

    @Override // org.apache.http.message.LineParser
    public Header parseHeader(CharArrayBuffer charArrayBuffer) {
        return new BufferedHeader(charArrayBuffer);
    }

    protected void skipWhitespace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }
}
