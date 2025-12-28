package o;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class pm implements FilenameFilter {
    pm() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return (!str.endsWith(".grf") || str.equals("ddata.grf") || str.equals("datadir.grf")) ? false : true;
    }
}
