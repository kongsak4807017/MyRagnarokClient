package o;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class abg implements FilenameFilter {
    abg() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.endsWith(".stacktrace");
    }
}
