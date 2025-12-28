package org.apache.http.impl;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import org.apache.http.config.ConnectionConfig;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ConnSupport {
    public static CharsetDecoder createDecoder(ConnectionConfig connectionConfig) {
        if (connectionConfig == null) {
            return null;
        }
        Charset charset = connectionConfig.getCharset();
        CodingErrorAction malformedInputAction = connectionConfig.getMalformedInputAction();
        CodingErrorAction unmappableInputAction = connectionConfig.getUnmappableInputAction();
        if (charset != null) {
            return charset.newDecoder().onMalformedInput(malformedInputAction != null ? malformedInputAction : CodingErrorAction.REPORT).onUnmappableCharacter(unmappableInputAction != null ? unmappableInputAction : CodingErrorAction.REPORT);
        }
        return null;
    }

    public static CharsetEncoder createEncoder(ConnectionConfig connectionConfig) {
        Charset charset;
        if (connectionConfig != null && (charset = connectionConfig.getCharset()) != null) {
            CodingErrorAction malformedInputAction = connectionConfig.getMalformedInputAction();
            CodingErrorAction unmappableInputAction = connectionConfig.getUnmappableInputAction();
            return charset.newEncoder().onMalformedInput(malformedInputAction != null ? malformedInputAction : CodingErrorAction.REPORT).onUnmappableCharacter(unmappableInputAction != null ? unmappableInputAction : CodingErrorAction.REPORT);
        }
        return null;
    }
}
