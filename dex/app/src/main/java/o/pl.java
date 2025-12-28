package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeMap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class pl {

    /* renamed from: 櫯, reason: contains not printable characters */
    public static tv f4871;

    /* renamed from: o.pl$if, reason: invalid class name */
    public enum Cif {
        OVERWRITE,
        SKIP,
        RESUME,
        RETURN_NULL_IF_SAME_LASTMODIFIED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }
    }

    /* renamed from: o.pl$鷭, reason: contains not printable characters */
    public static class C0081 {

        /* renamed from: 櫯, reason: contains not printable characters */
        public os f4877;

        /* renamed from: 鷭, reason: contains not printable characters */
        long f4878;

        C0081() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static C0081 m1049(String str, String str2, boolean z) {
        C0081 c0081 = new C0081();
        String strReplace = str2.replace("\\", "/");
        File file = new File(str, strReplace);
        if (!file.exists() && strReplace.toLowerCase().startsWith("data/") && z) {
            file = new File(String.valueOf(str) + "/ddata", strReplace);
        }
        if (!file.exists()) {
            return null;
        }
        c0081.f4878 = file.length();
        try {
            c0081.f4877 = new os(new FileInputStream(file));
            return c0081;
        } catch (IOException e) {
            throw new ut(e, "Caught" + e.toString() + " while reading " + strReplace + " from data folder to stream", false);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static byte[] m1044(String str, String str2, boolean z) throws IOException {
        try {
            C0081 c0081M1049 = m1049(str, str2, z);
            if (c0081M1049 == null) {
                return null;
            }
            int i = 0;
            int i2 = (int) c0081M1049.f4878;
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int i3 = c0081M1049.f4877.f3371.read(bArr, i, bArr.length - i);
                if (i3 <= 0) {
                    break;
                }
                i += i3;
            }
            os osVar = c0081M1049.f4877;
            osVar.f3371.close();
            osVar.f3371 = null;
            return bArr;
        } catch (IOException e) {
            throw new ut(e, "Caught" + e.toString() + " while reading " + str2 + " from data folder", false);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static byte[] m1052(String str, String str2, boolean z, Cif cif, un unVar) {
        long length;
        File file = new File(str, str2);
        if (cif == Cif.SKIP && file.exists()) {
            if (!z) {
                return null;
            }
            try {
                return pa.m956(file.getAbsolutePath());
            } catch (FileNotFoundException e) {
                throw new uy(e);
            } catch (IOException e2) {
                throw new uy(e2);
            }
        }
        pc.m995();
        String strReplace = str2.replace("\\", "/");
        if (unVar != null && !unVar.mo788()) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 120000;
            while (System.currentTimeMillis() < jCurrentTimeMillis && !unVar.mo788()) {
                try {
                    synchronized (Thread.currentThread()) {
                        Thread.currentThread().wait();
                    }
                } catch (InterruptedException unused) {
                }
            }
            throw new ut("Failed to download resource: not connected to resource server", true);
        }
        if (cif == Cif.RESUME) {
            length = new File(str, String.valueOf(strReplace) + ".tmp").length();
        } else {
            length = 0;
        }
        if (unVar != null) {
            return unVar.mo790(strReplace, length, z);
        }
        throw new ux("Trying to download resource while resource-server connection not provided");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static Object m1047(String str, String str2, boolean z, un unVar) throws IOException {
        Object objM1044;
        if (!z) {
            objM1044 = m1044(str, str2, true);
            if (objM1044 == null) {
                objM1044 = m1052(str, str2, true, Cif.OVERWRITE, unVar);
            }
        } else {
            C0081 c0081M1049 = m1049(str, str2, true);
            objM1044 = c0081M1049 == null ? null : c0081M1049.f4877;
            if (objM1044 == null) {
                m1052(str, str2, false, Cif.OVERWRITE, unVar);
                C0081 c0081M10492 = m1049(str, str2, true);
                objM1044 = c0081M10492 == null ? null : c0081M10492.f4877;
            }
        }
        if (objM1044 == null) {
            throw new uw(null, str2, "Failed to load resource from file system");
        }
        return objM1044;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected static os m1048(ug ugVar) {
        try {
            return vc.m1146(ugVar);
        } catch (IOException e) {
            throw new ux(e);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    protected static byte[] m1045(ug ugVar) throws IOException {
        try {
            os osVarM1117 = ugVar.m1117();
            byte[] bArr = new byte[ugVar.f5131];
            osVarM1117.m938(bArr, bArr.length);
            osVarM1117.f3371.close();
            osVarM1117.f3371 = null;
            return bArr;
        } catch (IOException e) {
            throw new ux("Error while reading resource: " + ugVar.f5128 + " from GRF " + ugVar.f5129.getName(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
    
        o.pl.f4871.mo1093();
        o.pc.m995();
        o.pb.m990(new java.io.File(r9));
        o.pc.m995();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        return;
     */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1050(java.lang.String r8, java.lang.String r9, java.lang.String r10, o.un r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pl.m1050(java.lang.String, java.lang.String, java.lang.String, o.un):void");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean m1051(File file) {
        if (!file.exists() || !file.isDirectory() || !file.canRead()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        for (File file2 : fileArrListFiles) {
            if (file2.getName().toLowerCase().endsWith(".grf")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static String[] m1053(File file, String str) {
        if (str == null) {
            str = "DATA.INI";
        }
        File file2 = new File(String.valueOf(file.getAbsolutePath()) + File.separator + str);
        if (!file2.exists()) {
            String[] list = file.list(new pm());
            Arrays.sort(list, new pn());
            return list;
        }
        return m1046(file2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object[]] */
    /* renamed from: 櫯, reason: contains not printable characters */
    private static String[] m1046(File file) throws NumberFormatException {
        try {
            TreeMap treeMap = new TreeMap();
            for (String str : new String(pb.m992(file.getAbsolutePath())).split("\n")) {
                String strTrim = str.split(";")[0].trim();
                if (strTrim.length() > 0 && !strTrim.equalsIgnoreCase("[Data]")) {
                    String[] strArrSplit = strTrim.split("=");
                    if (strArrSplit.length < 2) {
                        throw new ut("Invalid DATA.INI format near: " + strTrim);
                    }
                    treeMap.put(Integer.valueOf(Integer.parseInt(strArrSplit[0])), strArrSplit[1].trim());
                }
            }
            String[] strArr = new String[0];
            for (String str2 : treeMap.values()) {
                String[] strArr2 = strArr;
                if (strArr2 == null) {
                    strArr2 = (Object[]) Array.newInstance(str2.getClass(), 0);
                }
                Object[] objArrCopyOf = Arrays.copyOf(strArr2, strArr2.length + 1);
                objArrCopyOf[strArr2.length] = str2;
                strArr = (String[]) objArrCopyOf;
            }
            return strArr;
        } catch (IOException e) {
            throw new ut(e, "Failed to read " + file.getAbsolutePath(), true);
        }
    }
}
