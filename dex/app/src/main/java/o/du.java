package o;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.InflaterOutputStream;
import java.util.zip.ZipException;
import o.pl;
import org.apache.commons.net.tftp.TFTP;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class du extends b {

    /* renamed from: Ē, reason: contains not printable characters */
    EnumC0030 f1097;

    /* renamed from: ē, reason: contains not printable characters */
    byte[] f1098;

    /* renamed from: Ė, reason: contains not printable characters */
    String f1099;

    /* renamed from: ė, reason: contains not printable characters */
    boolean f1100;

    /* renamed from: Ę, reason: contains not printable characters */
    Thread f1101;

    /* renamed from: ę, reason: contains not printable characters */
    FileOutputStream f1102;

    /* renamed from: ġ, reason: contains not printable characters */
    long f1103;

    /* renamed from: Ƞ, reason: contains not printable characters */
    long f1104;

    /* renamed from: ܨ, reason: contains not printable characters */
    C0141 f1105;

    /* renamed from: ঽ্, reason: contains not printable characters */
    OutputStream f1106;

    /* renamed from: 㥳, reason: contains not printable characters */
    boolean f1107;

    /* renamed from: 㱽, reason: contains not printable characters */
    po f1108;

    /* renamed from: 㵼, reason: contains not printable characters */
    long f1109;

    /* renamed from: 囃, reason: contains not printable characters */
    OutputStream f1110;

    /* renamed from: 廂, reason: contains not printable characters */
    ByteArrayOutputStream f1111;

    /* renamed from: 廅, reason: contains not printable characters */
    long f1112;

    /* renamed from: 띥, reason: contains not printable characters */
    boolean f1113;

    /* renamed from: Ħ, reason: contains not printable characters */
    private static final byte[] f1095 = {114, -120, 93, 106, 5, -7, -8, 5, 2, -15, 1, -12, 5, -69, 70, -15, -5};

    /* renamed from: ħ, reason: contains not printable characters */
    private static int f1096 = 63;

    /* renamed from: ģ, reason: contains not printable characters */
    static HashSet<String> f1094 = new HashSet<>();

    /* renamed from: o.du$鷭, reason: contains not printable characters */
    enum EnumC0030 {
        FREE,
        REQUESTED,
        DOWNLOADING,
        NOTFOUND,
        CORRUPTED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0030[] valuesCustom() {
            EnumC0030[] enumC0030ArrValuesCustom = values();
            int length = enumC0030ArrValuesCustom.length;
            EnumC0030[] enumC0030Arr = new EnumC0030[length];
            System.arraycopy(enumC0030ArrValuesCustom, 0, enumC0030Arr, 0, length);
            return enumC0030Arr;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m560(int i, int i2, int i3) {
        int i4 = -1;
        int i5 = 3 - (i2 * 4);
        int i6 = (i3 * 4) + 99;
        byte[] bArr = f1095;
        int i7 = 14 - (i * 4);
        byte[] bArr2 = new byte[i7];
        int i8 = i7 - 1;
        if (bArr == null) {
            i6 = i8 + i5 + 4;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i6;
            if (i4 == i8) {
                return new String(bArr2, 0);
            }
            i5++;
            i6 = i6 + bArr[i5] + 4;
        }
    }

    @Override // o.b
    /* renamed from: ȃ */
    public final /* bridge */ /* synthetic */ void mo450() throws IOException {
        super.mo450();
    }

    @Override // o.iw, o.of
    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo139(Runnable runnable) {
        super.mo139(runnable);
    }

    @Override // o.b
    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo454(vg vgVar) {
        super.mo454(vgVar);
    }

    @Override // o.b
    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ boolean mo457() {
        return super.mo457();
    }

    du(String str) {
        super(str, 400000, 0, 400000, TFTP.DEFAULT_TIMEOUT);
        this.f1097 = EnumC0030.FREE;
        this.f1104 = 0L;
        this.f1103 = 0L;
        ak akVar = new ak();
        this.f765 = akVar;
        this.f768.f4994 = akVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final byte[] m566(String str, long j, boolean z, po poVar) {
        byte[] bArrM1142;
        if (f1094.contains(str)) {
            throw new uw(null, str, null);
        }
        if (Thread.currentThread() == this.f1700) {
            throw new UnsupportedOperationException("Cannot download resource from the resource-server download thread. Use another thread.");
        }
        this.f1101 = Thread.currentThread();
        synchronized (this.f1101) {
            if (C0358.f6667.f4820 != null) {
                String strM978 = str;
                if (C0358.f6667.f4852 != null) {
                    Cursor cursorQuery = C0358.f6687.f1566.query("remote_filelist", new String[]{"filename"}, "filename=?", new String[]{strM978.replace("\\", "/")}, null, null, null, null);
                    String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                    cursorQuery.close();
                    strM978 = string;
                    if (string == null) {
                        throw new uw(null, str, "Resource not exists on file server");
                    }
                }
                if (C0358.f6667.f4797) {
                    strM978 = pa.m978(pa.m987(str, ow.UTF8, true), ow.LATIN);
                }
                String lowerCase = str.toLowerCase();
                if (lowerCase.replace("\\", "/").startsWith("data/")) {
                    str = "ddata/" + str;
                }
                String str2 = String.valueOf(C0358.f6667.f4820) + "/" + strM978;
                try {
                    bArrM1142 = va.m1142(str2, new File(String.valueOf(oc.f3240) + "/" + str), z, (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".mp3") || lowerCase.endsWith(".grf")) ? false : true, pl.Cif.OVERWRITE, poVar);
                } catch (uw e) {
                    if (oc.f3250 == my.localclient) {
                        throw new uw(e, str, "Failed to download resource from file server, URL=" + str2);
                    }
                }
            } else {
                if (oc.f3250 == my.localclient) {
                    throw new uw(null, str, "Resource not found locally. Remote download is not supported.");
                }
                this.f1108 = poVar;
                m564(str, j, true, z);
                do {
                    try {
                        this.f1101.wait(1000L);
                        throw new InterruptedException();
                    } catch (InterruptedException unused) {
                        if (!super.mo457()) {
                            throw new ut("Disconnected while downloading " + str);
                        }
                        if (this.f1112 + 60000 < System.currentTimeMillis() && this.f1109 + 60000 < System.currentTimeMillis()) {
                            throw new ut("Timeout while downloading " + str, false);
                        }
                        if (this.f1097 == EnumC0030.NOTFOUND || this.f1097 == EnumC0030.CORRUPTED) {
                            EnumC0030 enumC0030 = this.f1097;
                            this.f1097 = EnumC0030.FREE;
                            f1094.add(str);
                            throw new uw(null, str, enumC0030 == EnumC0030.NOTFOUND ? null : "Resource data is corrupted");
                        }
                    }
                } while (this.f1097 != EnumC0030.FREE);
                if (z) {
                    return this.f1098;
                }
                return null;
            }
        }
        return bArrM1142;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m564(String str, long j, boolean z, boolean z2) {
        this.f1109 = System.currentTimeMillis();
        this.f1097 = EnumC0030.REQUESTED;
        this.f1107 = z2;
        this.f1113 = z;
        if (!z2 && !z) {
            throw new IllegalArgumentException("Downloading resource destination unspecified");
        }
        super.mo454(new we(str, j));
    }

    /* renamed from: ć, reason: contains not printable characters */
    private void m559() throws IOException {
        nz.m907("Async during resource downloading :( Discarding previous resource: " + this.f1099);
        if (this.f1110 != null) {
            try {
                this.f1110.flush();
            } catch (IOException unused) {
            }
            this.f1110.close();
        }
        if (this.f1102 != null) {
            this.f1102.close();
        }
        if (this.f1106 != null) {
            try {
                this.f1106.flush();
            } catch (IOException unused2) {
            }
            this.f1106.close();
        }
        if (this.f1111 != null) {
            this.f1111.close();
        }
    }

    /* renamed from: Ą, reason: contains not printable characters */
    final void m561() {
        try {
            if (this.f1097 != EnumC0030.REQUESTED) {
                m559();
            }
            this.f1097 = EnumC0030.NOTFOUND;
            this.f1099 = null;
            if (this.f1101 != null) {
                Thread thread = this.f1101;
                synchronized (thread) {
                    this.f1101 = null;
                    thread.notify();
                }
            }
        } catch (IOException e) {
            throw new nv(e);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m563(String str, long j, long j2, boolean z) {
        String str2;
        try {
            if (this.f1097 != EnumC0030.REQUESTED) {
                m559();
            }
            this.f1099 = str;
            this.f1103 = j;
            this.f1104 = j2;
            this.f1100 = false;
            String str3 = this.f1099;
            int i = f1095[10] - 1;
            if (str3.equals(m560(i, i, i))) {
                this.f1113 = false;
                this.f1107 = true;
            }
            if (this.f1107) {
                if (j2 != 0) {
                    throw new nv("Resume is not supported for in-memory transfers.");
                }
                this.f1111 = new ByteArrayOutputStream((int) j);
            }
            if (this.f1113) {
                if (this.f1099.toLowerCase().replace("\\", "/").startsWith("data/")) {
                    str2 = String.valueOf(oc.f3240) + "/ddata/" + this.f1099 + ".tmp";
                } else {
                    str2 = String.valueOf(oc.f3240) + "/" + this.f1099 + ".tmp";
                }
                pa.m955(str2);
                if (new File(oc.f3240).getFreeSpace() < j - j2) {
                    throw new ut("Can't download " + str + ": no device space left, file system is full.", false);
                }
                File file = new File(str2);
                if (this.f1104 != 0 && file.length() != j2) {
                    throw new nv("Unexpected file length. Filename=" + str + " size=" + j + " resume_point=" + j2);
                }
                this.f1102 = new FileOutputStream(file, j2 != 0);
            }
            if (z) {
                if (this.f1113) {
                    this.f1110 = new InflaterOutputStream(this.f1102);
                }
                if (this.f1107) {
                    this.f1106 = new InflaterOutputStream(this.f1111);
                }
            } else {
                if (this.f1113) {
                    this.f1110 = this.f1102;
                }
                if (this.f1107) {
                    this.f1106 = this.f1111;
                }
            }
            this.f1112 = System.currentTimeMillis();
            this.f1097 = EnumC0030.DOWNLOADING;
            if (this.f1108 != null) {
                this.f1108.mo548(0L, j);
            }
        } catch (FileNotFoundException e) {
            throw new nv(e);
        } catch (IOException e2) {
            throw new nv(e2);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m565(byte[] bArr) throws IOException {
        try {
            if (this.f1097 != EnumC0030.DOWNLOADING) {
                m559();
            }
            if (this.f1113) {
                this.f1110.write(bArr);
            }
            if (this.f1107) {
                this.f1106.write(bArr);
            }
        } catch (IOException unused) {
            this.f1100 = true;
        }
        this.f1112 = System.currentTimeMillis();
        this.f1104 += bArr.length;
        if (this.f1108 != null) {
            this.f1108.mo548(this.f1104, this.f1103);
        }
    }

    /* renamed from: ą, reason: contains not printable characters */
    final void m562() throws IOException {
        String str;
        try {
            if (this.f1097 != EnumC0030.DOWNLOADING) {
                m559();
            }
            if (this.f1100) {
                try {
                    if (this.f1113) {
                        this.f1110.close();
                    }
                    if (this.f1107) {
                        this.f1106.close();
                    }
                } catch (ZipException unused) {
                }
                if (this.f1113) {
                    this.f1102.close();
                }
                if (this.f1107) {
                    this.f1111.close();
                }
                this.f1097 = EnumC0030.CORRUPTED;
                return;
            }
            if (this.f1107) {
                this.f1098 = this.f1111.toByteArray();
            }
            if (this.f1113) {
                this.f1110.close();
                this.f1102.close();
            }
            if (this.f1107) {
                this.f1106.close();
                this.f1111.close();
            }
            if (this.f1113) {
                if (this.f1099.toLowerCase().replace("\\", "/").startsWith("data/")) {
                    str = String.valueOf(oc.f3240) + "/ddata/" + this.f1099;
                } else {
                    str = String.valueOf(oc.f3240) + "/" + this.f1099;
                }
                File file = new File(String.valueOf(str) + ".tmp");
                File file2 = new File(str);
                file2.delete();
                if (!file.renameTo(file2)) {
                    throw new nv("Failed to rename/move temp file after download: " + this.f1099);
                }
            }
            this.f1097 = EnumC0030.FREE;
            this.f1099 = null;
            if (this.f1101 != null) {
                Thread thread = this.f1101;
                synchronized (thread) {
                    this.f1101 = null;
                    thread.notify();
                }
            }
            if (this.f1108 != null) {
                this.f1108.mo548(this.f1103, this.f1103);
            }
        } catch (IOException e) {
            throw new nv(e);
        }
    }
}
