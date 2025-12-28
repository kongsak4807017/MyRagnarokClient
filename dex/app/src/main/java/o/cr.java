package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import o.pl;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class cr extends pl {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final String[][] f986 = {new String[]{".bmp", "BM"}, new String[]{".gat", "GRAT"}, new String[]{".gnd", "GRGN"}, new String[]{".rsw", "GRSW"}, new String[]{".act", "AC"}, new String[]{".spr", "SP"}, new String[]{".rsm", "GRSM"}, new String[]{".str", "STRM"}};

    /* renamed from: Ą, reason: contains not printable characters */
    private String f987;

    /* renamed from: ȃ, reason: contains not printable characters */
    private boolean f988;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private AbstractC0456 f989;

    /* renamed from: 鷭, reason: contains not printable characters */
    private static boolean m516(String str, byte[] bArr) {
        if (bArr.length == 0 && !str.endsWith(".txt") && !str.endsWith(".lub") && !str.endsWith(".lua")) {
            return false;
        }
        for (String[] strArr : f986) {
            if (str.endsWith(strArr[0]) && (bArr.length < strArr[1].length() || !pa.m976(bArr, strArr[1].length(), ow.LATIN).equals(strArr[1]))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private byte[] m518(String str, byte[] bArr, ug ugVar) {
        if (!str.startsWith("data") && !str.startsWith("BGM")) {
            throw new ut(String.valueOf(str) + " size=" + bArr.length + " is corrupted. Try deleting client directory " + this.f987, true);
        }
        try {
            byte[] bArrM517 = m517(this.f987, str, true, pl.Cif.OVERWRITE, (po) null);
            if (bArrM517 == null) {
                throw new uw(null, str, "Downloaded file didn't appear on file system");
            }
            if (!m516(str, bArrM517)) {
                throw new uw(null, str, "Failed to repair file: remote file is not valid too. Srclen=" + bArr.length + " grfname=" + (ugVar != null ? ugVar.f5129.getAbsolutePath() : "none"));
            }
            if (ugVar != null) {
                if (ugVar.f5129.getName().equals("ddata.grf")) {
                    nz.m907("Found invalid resource file: " + str + ". Successfully repaired.");
                    this.f989.mo1343(ugVar.f5128);
                } else {
                    throw new uw(null, str, "Local resource is invalid and located inside standard GRF. Can't repair. Try deleting client directory " + this.f987 + "\nsrclen=" + bArr.length + "\nnewlen=" + bArrM517.length + "\ngrfname=" + (ugVar != null ? ugVar.f5129.getAbsolutePath() : "none"));
                }
            }
            return bArrM517;
        } catch (uw e) {
            throw new uw(e, str, "Local resource corrupted, remote resource not found");
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final Object m519(String str, boolean z) {
        Object obj = null;
        if (C0358.f6685 != null && C0358.f6685.f1700 != null && Thread.currentThread().getId() != C0358.f6685.f1700.getId()) {
            nz.m907("Attempt to read " + str + " from non-resource thread! All resources should be read only from resource thread.");
            Thread.dumpStack();
        }
        if (str.startsWith("data\\")) {
            str = str.toLowerCase();
        }
        if (str.startsWith("data\\lua files")) {
            if (C0358.f6667.f4829) {
                str = str.replace("data\\lua files", "data\\luafiles514\\lua files");
            }
            if (C0358.f6667.f4799 && str.endsWith(".lub")) {
                try {
                    return m519(String.valueOf(str.substring(0, str.length() - 4)) + ".lua", z);
                } catch (uw unused) {
                }
            }
        }
        if (this.f988) {
            if (z) {
                pl.C0081 c0081M1049 = pl.m1049(this.f987, str, true);
                obj = c0081M1049 == null ? null : c0081M1049.f4877;
            } else {
                obj = m1044(this.f987, str, true);
            }
        }
        ug ugVarMo1344 = null;
        if (obj == null) {
            ugVarMo1344 = this.f989.mo1344(str);
            if (ugVarMo1344 != null) {
                if (!z) {
                    obj = m1045(ugVarMo1344);
                } else {
                    obj = m1048(ugVarMo1344);
                }
            } else {
                obj = m1047(this.f987, str, z, lp.m786());
            }
        }
        if (!z && !m516(str, (byte[]) obj)) {
            return m518(str, (byte[]) obj, ugVarMo1344);
        }
        return obj;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static final byte[] m517(String str, String str2, boolean z, pl.Cif cif, po poVar) {
        long length;
        File file = new File(str, str2);
        if (cif == pl.Cif.SKIP && file.exists()) {
            if (!z) {
                return null;
            }
            try {
                return pa.m956(file.getAbsolutePath());
            } catch (FileNotFoundException e) {
                throw new nv(e);
            } catch (IOException e2) {
                throw new nv(e2);
            }
        }
        String strReplace = str2.replace("\\", "/");
        if (!C0358.f6676.f1081.mo457() && C0358.f6667.f4820 == null) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 120000;
            while (System.currentTimeMillis() < jCurrentTimeMillis && !C0358.f6676.f1081.mo457()) {
                try {
                    synchronized (Thread.currentThread()) {
                        Thread.currentThread().wait();
                    }
                } catch (InterruptedException unused) {
                }
            }
            throw new ut("Failed to download resource: not connected to resource server", true);
        }
        if (cif == pl.Cif.RESUME) {
            length = new File(str, String.valueOf(strReplace) + ".tmp").length();
        } else {
            length = 0;
        }
        return C0358.f6676.f1081.m566(strReplace, length, z, poVar);
    }

    cr(je jeVar, hw hwVar, String str, ArrayList<String> arrayList, boolean z) {
        this.f987 = str;
        this.f988 = z;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Repacking resources"));
        m1050(this.f987, "ddata", "ddata.grf", lp.m786());
        String[] strArr = new String[arrayList.size() + 1];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = arrayList.get(i);
        }
        strArr[strArr.length - 1] = "ddata.grf";
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Initializing file system"));
        this.f989 = new C0960(hwVar, strArr);
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Starting resource caching"));
        String[] strArrMo1346 = this.f989.mo1346();
        for (int i2 = 0; i2 < strArrMo1346.length; i2++) {
            String str2 = strArrMo1346[i2];
            int i3 = i2;
            int length = strArrMo1346.length;
            cs csVar = new cs(this, true, jeVar, str2, i3, length);
            ct ctVar = new ct(this, true, jeVar, str2, i3, length);
            String str3 = "Reading " + str2;
            if (jeVar.f1734 != null) {
                C0358.f6674.mo139(new jt(jeVar));
            }
            C0358.f6674.mo139(new jp(jeVar, str3, null, 0, -1));
            try {
                this.f989.mo1345(str2, vc.m1152(new File(str, str2), csVar), ctVar);
            } catch (FileNotFoundException unused) {
                this.f989.mo1345(str2, null, ctVar);
            }
        }
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Preparing GRF cache"));
        this.f989.mo1342();
        C0358.f6674.mo139(new jt(jeVar));
    }
}
