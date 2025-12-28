package o;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class acw implements FilenameFilter {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ acv f430;

    public acw(acv acvVar) {
        this.f430 = acvVar;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        acv acvVar = this.f430;
        return str.equals(new StringBuilder().append(acvVar.f428).append(acvVar.f429).toString());
    }
}
