package org.apache.http.entity;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ContentType implements Serializable {
    private static final Map<String, ContentType> CONTENT_TYPE_MAP;
    public static final ContentType DEFAULT_BINARY;
    public static final ContentType DEFAULT_TEXT;
    private static final long serialVersionUID = -7768694718232371896L;
    private final Charset charset;
    private final String mimeType;
    private final NameValuePair[] params;
    public static final ContentType APPLICATION_ATOM_XML = create("application/atom+xml", Consts.ISO_8859_1);
    public static final ContentType APPLICATION_FORM_URLENCODED = create(URLEncodedUtils.CONTENT_TYPE, Consts.ISO_8859_1);
    public static final ContentType APPLICATION_JSON = create("application/json", Consts.UTF_8);
    public static final ContentType APPLICATION_OCTET_STREAM = create("application/octet-stream", (Charset) null);
    public static final ContentType APPLICATION_SVG_XML = create("application/svg+xml", Consts.ISO_8859_1);
    public static final ContentType APPLICATION_XHTML_XML = create("application/xhtml+xml", Consts.ISO_8859_1);
    public static final ContentType APPLICATION_XML = create("application/xml", Consts.ISO_8859_1);
    public static final ContentType IMAGE_BMP = create("image/bmp");
    public static final ContentType IMAGE_GIF = create("image/gif");
    public static final ContentType IMAGE_JPEG = create("image/jpeg");
    public static final ContentType IMAGE_PNG = create("image/png");
    public static final ContentType IMAGE_SVG = create("image/svg+xml");
    public static final ContentType IMAGE_TIFF = create("image/tiff");
    public static final ContentType IMAGE_WEBP = create("image/webp");
    public static final ContentType MULTIPART_FORM_DATA = create("multipart/form-data", Consts.ISO_8859_1);
    public static final ContentType TEXT_HTML = create("text/html", Consts.ISO_8859_1);
    public static final ContentType TEXT_PLAIN = create(HTTP.PLAIN_TEXT_TYPE, Consts.ISO_8859_1);
    public static final ContentType TEXT_XML = create("text/xml", Consts.ISO_8859_1);
    public static final ContentType WILDCARD = create("*/*", (Charset) null);

    static {
        ContentType[] contentTypeArr = {APPLICATION_ATOM_XML, APPLICATION_FORM_URLENCODED, APPLICATION_JSON, APPLICATION_SVG_XML, APPLICATION_XHTML_XML, APPLICATION_XML, IMAGE_BMP, IMAGE_GIF, IMAGE_JPEG, IMAGE_PNG, IMAGE_SVG, IMAGE_TIFF, IMAGE_WEBP, MULTIPART_FORM_DATA, TEXT_HTML, TEXT_PLAIN, TEXT_XML};
        HashMap map = new HashMap();
        for (ContentType contentType : contentTypeArr) {
            map.put(contentType.getMimeType(), contentType);
        }
        CONTENT_TYPE_MAP = Collections.unmodifiableMap(map);
        DEFAULT_TEXT = TEXT_PLAIN;
        DEFAULT_BINARY = APPLICATION_OCTET_STREAM;
    }

    ContentType(String str, Charset charset) {
        this.mimeType = str;
        this.charset = charset;
        this.params = null;
    }

    ContentType(String str, Charset charset, NameValuePair[] nameValuePairArr) {
        this.mimeType = str;
        this.charset = charset;
        this.params = nameValuePairArr;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Charset getCharset() {
        return this.charset;
    }

    public final String getParameter(String str) {
        Args.notEmpty(str, "Parameter name");
        if (this.params == null) {
            return null;
        }
        for (NameValuePair nameValuePair : this.params) {
            if (nameValuePair.getName().equalsIgnoreCase(str)) {
                return nameValuePair.getValue();
            }
        }
        return null;
    }

    public final String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.append(this.mimeType);
        if (this.params != null) {
            charArrayBuffer.append("; ");
            BasicHeaderValueFormatter.INSTANCE.formatParameters(charArrayBuffer, this.params, false);
        } else if (this.charset != null) {
            charArrayBuffer.append(HTTP.CHARSET_PARAM);
            charArrayBuffer.append(this.charset.name());
        }
        return charArrayBuffer.toString();
    }

    private static boolean valid(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == ',' || cCharAt == ';') {
                return false;
            }
        }
        return true;
    }

    public static ContentType create(String str, Charset charset) {
        String lowerCase = ((String) Args.notBlank(str, "MIME type")).toLowerCase(Locale.ROOT);
        Args.check(valid(lowerCase), "MIME type may not contain reserved characters");
        return new ContentType(lowerCase, charset);
    }

    public static ContentType create(String str) {
        return create(str, (Charset) null);
    }

    public static ContentType create(String str, String str2) {
        return create(str, !TextUtils.isBlank(str2) ? Charset.forName(str2) : null);
    }

    private static ContentType create(HeaderElement headerElement, boolean z) {
        return create(headerElement.getName(), headerElement.getParameters(), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r8 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r8.length <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        return new org.apache.http.entity.ContentType(r7, r2, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.apache.http.entity.ContentType create(java.lang.String r7, org.apache.http.NameValuePair[] r8, boolean r9) {
        /*
            r2 = 0
            r3 = r8
            int r4 = r8.length
            r5 = 0
        L4:
            if (r5 >= r4) goto L2c
            r6 = r3[r5]
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = "charset"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L29
            java.lang.String r3 = r6.getValue()
            boolean r0 = org.apache.http.util.TextUtils.isBlank(r3)
            if (r0 != 0) goto L2c
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r3)     // Catch: java.nio.charset.UnsupportedCharsetException -> L24
            r2 = r0
            goto L2c
        L24:
            r3 = move-exception
            if (r9 == 0) goto L28
            throw r3
        L28:
            goto L2c
        L29:
            int r5 = r5 + 1
            goto L4
        L2c:
            org.apache.http.entity.ContentType r0 = new org.apache.http.entity.ContentType
            if (r8 == 0) goto L35
            int r1 = r8.length
            if (r1 <= 0) goto L35
            r1 = r8
            goto L36
        L35:
            r1 = 0
        L36:
            r0.<init>(r7, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.entity.ContentType.create(java.lang.String, org.apache.http.NameValuePair[], boolean):org.apache.http.entity.ContentType");
    }

    public static ContentType create(String str, NameValuePair... nameValuePairArr) {
        Args.check(valid(((String) Args.notBlank(str, "MIME type")).toLowerCase(Locale.ROOT)), "MIME type may not contain reserved characters");
        return create(str, nameValuePairArr, true);
    }

    public static ContentType parse(String str) {
        Args.notNull(str, "Content type");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        HeaderElement[] elements = BasicHeaderValueParser.INSTANCE.parseElements(charArrayBuffer, new ParserCursor(0, str.length()));
        if (elements.length > 0) {
            return create(elements[0], true);
        }
        throw new ParseException("Invalid content type: " + str);
    }

    public static ContentType get(HttpEntity httpEntity) {
        Header contentType;
        if (httpEntity != null && (contentType = httpEntity.getContentType()) != null) {
            HeaderElement[] elements = contentType.getElements();
            if (elements.length > 0) {
                return create(elements[0], true);
            }
            return null;
        }
        return null;
    }

    public static ContentType getLenient(HttpEntity httpEntity) {
        Header contentType;
        if (httpEntity != null && (contentType = httpEntity.getContentType()) != null) {
            try {
                HeaderElement[] elements = contentType.getElements();
                if (elements.length > 0) {
                    return create(elements[0], false);
                }
                return null;
            } catch (ParseException unused) {
                return null;
            }
        }
        return null;
    }

    public static ContentType getOrDefault(HttpEntity httpEntity) {
        ContentType contentType = get(httpEntity);
        return contentType != null ? contentType : DEFAULT_TEXT;
    }

    public static ContentType getLenientOrDefault(HttpEntity httpEntity) {
        ContentType contentType = get(httpEntity);
        return contentType != null ? contentType : DEFAULT_TEXT;
    }

    public static ContentType getByMimeType(String str) {
        if (str == null) {
            return null;
        }
        return CONTENT_TYPE_MAP.get(str);
    }

    public final ContentType withCharset(Charset charset) {
        return create(getMimeType(), charset);
    }

    public final ContentType withCharset(String str) {
        return create(getMimeType(), str);
    }

    public final ContentType withParameters(NameValuePair... nameValuePairArr) {
        if (nameValuePairArr.length == 0) {
            return this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.params != null) {
            for (NameValuePair nameValuePair : this.params) {
                linkedHashMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        }
        for (NameValuePair nameValuePair2 : nameValuePairArr) {
            linkedHashMap.put(nameValuePair2.getName(), nameValuePair2.getValue());
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size() + 1);
        if (this.charset != null && !linkedHashMap.containsKey("charset")) {
            arrayList.add(new BasicNameValuePair("charset", this.charset.name()));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        return create(getMimeType(), (NameValuePair[]) arrayList.toArray(new NameValuePair[arrayList.size()]), true);
    }
}
