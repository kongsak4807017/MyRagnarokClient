package o;

import java.io.File;
import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class us extends RuntimeException {

    /* renamed from: 鷭, reason: contains not printable characters */
    public File f5345;

    public us(IOException iOException, String str, File file) {
        super(String.valueOf(str != null ? String.valueOf(str) + " " : "Corrupted patch file: ") + file.getAbsolutePath(), iOException);
        this.f5345 = file;
    }
}
