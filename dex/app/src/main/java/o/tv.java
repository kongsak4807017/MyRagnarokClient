package o;

import java.io.File;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class tv {
    /* renamed from: 鷭, reason: contains not printable characters */
    protected abstract int mo1090(String str);

    /* renamed from: 鷭, reason: contains not printable characters */
    public abstract int mo1091(byte[] bArr);

    /* renamed from: 鷭, reason: contains not printable characters */
    public abstract int mo1092(byte[] bArr, byte[] bArr2);

    /* renamed from: 鷭, reason: contains not printable characters */
    public abstract void mo1093();

    /* renamed from: 櫯, reason: contains not printable characters */
    public final boolean m1089(String str) {
        File file = new File(str);
        pa.m955(file.getAbsolutePath());
        if (mo1090(str) == 0) {
            pc.m997("Failed to open GRF " + str + ". Checking possible reasons...");
            if (file.exists() && file.canWrite()) {
                pc.m997("Probably incorrect format. Deleting old file and creating a new one...");
                if (!file.delete()) {
                    pc.m997("Couldn't delete file. We've fucked up....");
                    return false;
                }
                if (mo1090(str) == 0) {
                    pc.m997("Failed to open a newly created GRF. Reason is unknown. Aborting data folder packing.");
                    return false;
                }
                return true;
            }
            pc.m997("Probably no access to GRF. Aborting data folder packing.");
            return false;
        }
        return true;
    }
}
