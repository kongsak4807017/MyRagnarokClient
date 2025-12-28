package o;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class acq {

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final SimpleDateFormat f396 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

    /* renamed from: Ą, reason: contains not printable characters */
    public Date f397;

    /* renamed from: ą, reason: contains not printable characters */
    public String f398;

    /* renamed from: Ć, reason: contains not printable characters */
    public String f399;

    /* renamed from: ć, reason: contains not printable characters */
    public String f400;

    /* renamed from: ċ, reason: contains not printable characters */
    public String f401;

    /* renamed from: ȃ, reason: contains not printable characters */
    public Date f402;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public String f403;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public String f404;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public String f405;

    /* renamed from: 䒧, reason: contains not printable characters */
    public String f406;

    /* renamed from: 岱, reason: contains not printable characters */
    public String f407;

    /* renamed from: 櫯, reason: contains not printable characters */
    public final String f408;

    /* renamed from: 纫, reason: contains not printable characters */
    public String f409;

    private acq(String str) {
        this.f408 = str;
    }

    public acq(String str, Throwable th) {
        this(str);
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        this.f406 = stringWriter.toString();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m317(BufferedWriter bufferedWriter, String str, String str2) throws IOException {
        bufferedWriter.write(str + ": " + str2 + "\n");
    }
}
