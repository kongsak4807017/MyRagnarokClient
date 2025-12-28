package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import o.pj;
import o.pl;
import o.um;
import o.yq;
import org.apache.http.message.TokenParser;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class uo extends um {
    public uo(String str, lp lpVar) {
        super(str, lpVar);
    }

    /* renamed from: o.uo$if, reason: invalid class name */
    enum Cif {
        FLD,
        GRF,
        FLD_DELETE,
        GRF_DELETE,
        RAR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static Cif m1133(String str, String str2) {
            boolean zEndsWith = str2.endsWith("*");
            String upperCase = str.toUpperCase();
            if (upperCase.equals("FLD")) {
                if (str2.toLowerCase().endsWith(".rar")) {
                    return RAR;
                }
                return zEndsWith ? FLD_DELETE : FLD;
            }
            if (upperCase.equals("GRF")) {
                return zEndsWith ? GRF_DELETE : GRF;
            }
            return null;
        }
    }

    /* renamed from: o.uo$鷭, reason: contains not printable characters */
    class C0114 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f5333;

        /* renamed from: 櫯, reason: contains not printable characters */
        Cif f5334;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f5335;

        C0114(int i, String str, String str2) {
            this.f5335 = i;
            this.f5334 = Cif.m1133(str, str2);
            if (this.f5334 == null) {
                throw new ut("Unknown operation type: " + str + " " + str2);
            }
            this.f5333 = str2;
            if (this.f5333.endsWith("*")) {
                this.f5333 = this.f5333.substring(0, this.f5333.length() - 1);
            }
            new StringBuilder("Operation: id=").append(this.f5335).append(" type=").append(this.f5334).append(" fn=").append(this.f5333);
            pc.m994();
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final String m1134() {
            return "id=" + this.f5335 + " type=" + this.f5334 + " fn=" + this.f5333;
        }
    }

    @Override // o.um
    /* renamed from: 鷭 */
    public final boolean mo1131(pj.C0079.C0080 c0080) throws yq, NumberFormatException, IOException {
        String str;
        String str2;
        String strM978;
        aao aaoVar;
        this.f5322.mo789("Checking client updates at " + c0080.f4866);
        String[] strArrM988 = pa.m988(pa.m978(va.m1142(c0080.f4866, new File(String.valueOf(this.f5323) + "/" + c0080.f4866.substring(c0080.f4866.lastIndexOf(47) + 1)), true, true, pl.Cif.OVERWRITE, null), ow.KOREAN), true, "\n");
        pc.m994();
        int i = 0;
        try {
            i = Integer.parseInt(pa.m978((byte[]) pl.m1047(this.f5323, c0080.f4862, false, this.f5322), ow.LATIN));
        } catch (uw unused) {
            pc.m994();
        }
        pc.m994();
        ArrayList arrayList = new ArrayList();
        int iMax = i;
        for (String strSubstring : strArrM988) {
            int iIndexOf = strSubstring.indexOf("//");
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            String strReplace = strSubstring.trim().replace("\r", "");
            if (strReplace.length() > 0) {
                try {
                    Scanner scanner = new Scanner(strReplace);
                    int iNextInt = scanner.nextInt();
                    scanner.skip("[ \t]");
                    String next = scanner.next("[A-Z]*");
                    String next2 = scanner.next();
                    scanner.close();
                    String strTrim = next.trim();
                    String strTrim2 = next2.trim();
                    if (i < iNextInt) {
                        arrayList.add(new C0114(iNextInt, strTrim, strTrim2));
                    }
                } catch (Throwable th) {
                    pc.m997(th.getMessage());
                }
            }
        }
        if (arrayList.size() == 0) {
            pc.m994();
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0114 c0114 = (C0114) it.next();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0114 c01142 = (C0114) it2.next();
                if (c0114 != c01142 && c0114.f5335 == c01142.f5335) {
                    pc.m997("Duplicate file operation found: op1=[" + c0114.m1134() + "] op2=[" + c01142.m1134() + "]");
                }
            }
            iMax = Math.max(iMax, c0114.f5335);
        }
        arrayList.size();
        pc.m994();
        String str3 = "neoncube-tmp/" + Cif.GRF.toString();
        String str4 = "neoncube-tmp/" + Cif.FLD.toString();
        String str5 = String.valueOf(str3) + "/unpack";
        String str6 = String.valueOf(str4) + "/unpack";
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C0114 c01143 = (C0114) arrayList.get(i2);
            c01143.m1134();
            pc.m994();
            String str7 = "Processing update files\n[" + (i2 + 1) + "/" + arrayList.size() + "] " + c01143.f5333;
            this.f5322.mo789(str7);
            um.C0113 c0113 = new um.C0113(str7);
            String str8 = String.valueOf(c0080.f4865) + "/" + c01143.f5333;
            String str9 = "neoncube-tmp/" + c01143.f5334.toString();
            String str10 = String.valueOf(str9) + "/unpack";
            String str11 = String.valueOf(str9) + "/" + c01143.f5333;
            up upVar = new up(this, str7);
            if (c01143.f5334 == Cif.RAR) {
                pc.m994();
                File file = new File(String.valueOf(this.f5323) + "/" + str11);
                va.m1142(str8, file, false, false, pl.Cif.OVERWRITE, c0113);
                pc.m994();
                try {
                    yl ylVar = new yl(file, upVar);
                    while (true) {
                        try {
                            zd zdVarM1169 = ylVar.m1169();
                            if (zdVarM1169 != null) {
                                if (zdVarM1169.m1198()) {
                                    strM978 = zdVarM1169.f6038;
                                } else {
                                    strM978 = pa.m978(zdVarM1169.f6026, ow.KOREAN);
                                    if (strM978.length() <= 0) {
                                        strM978 = zdVarM1169.f6043;
                                    }
                                }
                                String strTrim3 = strM978.trim();
                                this.f5322.mo789("Processing update files\n[" + (i2 + 1) + "/" + arrayList.size() + "] " + c01143.f5333 + "\n" + strTrim3);
                                String str12 = String.valueOf(this.f5323) + "/" + strTrim3.replace(TokenParser.ESCAPE, '/');
                                File file2 = new File(str12);
                                file2.getAbsolutePath();
                                pc.m994();
                                pa.m955(str12);
                                if (strTrim3.equals(c0080.f4864)) {
                                    pc.m994();
                                    pb.m990(new File(String.valueOf(this.f5323) + "/" + str3));
                                }
                                if (!zdVarM1169.m1197()) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        if (!ylVar.f5974.contains(zdVarM1169)) {
                                            throw new yq(yq.EnumC0130.headerNotInArchive);
                                        }
                                        try {
                                            zq zqVar = ylVar.f5976;
                                            zqVar.f6115 = fileOutputStream;
                                            zqVar.f6127 = 0L;
                                            zqVar.f6124 = false;
                                            zqVar.f6117 = false;
                                            zqVar.f6108 = false;
                                            zqVar.f6109 = false;
                                            zqVar.f6110 = false;
                                            zqVar.f6113 = 0;
                                            zqVar.f6114 = 0;
                                            zqVar.f6118 = 0L;
                                            zqVar.f6125 = 0L;
                                            zqVar.f6111 = 0L;
                                            zqVar.f6116 = 0L;
                                            zqVar.f6122 = 0L;
                                            zqVar.f6112 = -1L;
                                            zqVar.f6123 = -1L;
                                            zqVar.f6119 = -1L;
                                            zqVar.f6107 = null;
                                            zqVar.f6126 = 0L;
                                            zqVar.f6121 = 0L;
                                            ylVar.f5976.m1212(zdVarM1169);
                                            ylVar.f5976.f6123 = ylVar.f5970.f6061 ? 0 : -1;
                                            if (ylVar.f5972 == null) {
                                                ylVar.f5972 = new zr(ylVar.f5976);
                                            }
                                            if (!zdVarM1169.m1195()) {
                                                ylVar.f5972.m1225();
                                            }
                                            ylVar.f5972.m1227(zdVarM1169.f6036);
                                            try {
                                                ylVar.f5972.m1226(zdVarM1169.f6040, zdVarM1169.m1195());
                                                if ((ylVar.f5976.f6107.m1196() ? ylVar.f5976.f6112 ^ (-1) : ylVar.f5976.f6123 ^ (-1)) != r1.f6035) {
                                                    throw new yq(yq.EnumC0130.crcError);
                                                }
                                                fileOutputStream.close();
                                            } catch (Exception e) {
                                                zr zrVar = ylVar.f5972;
                                                if (zrVar.f6140 != null && (aaoVar = zrVar.f6140.f121) != null) {
                                                    aaoVar.m245();
                                                }
                                                if (e instanceof yq) {
                                                    throw ((yq) e);
                                                }
                                                throw new yq(e);
                                            }
                                        } catch (Exception e2) {
                                            if (e2 instanceof yq) {
                                                throw ((yq) e2);
                                            }
                                            throw new yq(e2);
                                        }
                                    } catch (FileNotFoundException e3) {
                                        ylVar.close();
                                        throw new ut(e3);
                                    } catch (IOException e4) {
                                        ylVar.close();
                                        throw new ut(e4);
                                    } catch (yq e5) {
                                        ylVar.close();
                                        throw new ut(e5, "Failed to extract archive: " + str11 + ": " + e5.getMessage(), true);
                                    }
                                }
                            } else {
                                ylVar.close();
                                pc.m994();
                                break;
                            }
                        } catch (IOException e6) {
                            throw new ut(e6);
                        }
                    }
                } catch (IOException e7) {
                    throw new ut(e7, "Failed to open archive: " + str11, true);
                } catch (yq e8) {
                    throw new ut(e8, "Failed to open archive: " + str11, true);
                }
            } else if (c01143.f5334 == Cif.FLD || c01143.f5334 == Cif.GRF) {
                pc.m994();
                try {
                    va.m1142(str8, new File(String.valueOf(this.f5323) + "/" + str11), false, c01143.f5334 == Cif.GRF, pl.Cif.SKIP, c0113);
                    pc.m994();
                    try {
                        ug[] ugVarArrM1152 = vc.m1152(new File(this.f5323, str11), (cs) null);
                        int i3 = 5000000;
                        for (ug ugVar : ugVarArrM1152) {
                            i3 += ugVar.f5133;
                        }
                        if (new File(this.f5323).getFreeSpace() < i3) {
                            throw new ut("Can't merge " + str11 + ": no device space left.", true);
                        }
                        for (int i4 = 0; i4 < ugVarArrM1152.length; i4++) {
                            ug ugVar2 = ugVarArrM1152[i4];
                            this.f5322.mo789("Processing update files\n[" + (i2 + 1) + "/" + arrayList.size() + "] " + c01143.f5333 + "\n[" + (i4 + 1) + "/" + ugVarArrM1152.length + "] " + ugVar2.f5128);
                            byte[] bArrM1045 = pl.m1045(ugVar2);
                            String str13 = String.valueOf(this.f5323) + "/" + str10 + "/" + ugVar2.f5128.replace(TokenParser.ESCAPE, '/');
                            pa.m955(str13);
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(str13);
                                fileOutputStream2.write(bArrM1045);
                                fileOutputStream2.close();
                            } catch (FileNotFoundException unused2) {
                                pc.m997("Failed to create file: " + str13);
                            } catch (IOException e9) {
                                throw new ut(e9, "Failed to write file: " + str13, true);
                            }
                        }
                    } catch (FileNotFoundException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (uw e11) {
                    throw new ut(e11, "Remote file not found: " + str8, false);
                }
            } else if (c01143.f5334 == Cif.FLD_DELETE || c01143.f5334 == Cif.GRF_DELETE) {
                if (c01143.f5334 == Cif.FLD_DELETE) {
                    str = str6;
                    str2 = "datadir.grf";
                } else if (c01143.f5334 == Cif.GRF_DELETE) {
                    str = str5;
                    str2 = c0080.f4864;
                } else {
                    throw new ux();
                }
                new File(String.valueOf(this.f5323) + "/" + str + "/" + c01143.f5333).delete();
                String str14 = String.valueOf(this.f5323) + "/" + str2;
                if (!pl.f4871.m1089(str2)) {
                    throw new ut("Failed to open GRF: " + str14);
                }
                pl.f4871.mo1091(pa.m987(c01143.f5333, ow.KOREAN, true));
                pl.f4871.mo1093();
            }
        }
        pc.m994();
        pl.m1050(this.f5323, str6, "datadir.grf", this.f5322);
        pl.m1050(this.f5323, str5, c0080.f4864, this.f5322);
        pc.m994();
        pb.m990(new File(String.valueOf(this.f5323) + "/neoncube-tmp"));
        pc.m994();
        try {
            FileOutputStream fileOutputStream3 = new FileOutputStream(new File(this.f5323, c0080.f4862), false);
            fileOutputStream3.write(pa.m987(String.valueOf(iMax), ow.LATIN, false));
            fileOutputStream3.close();
            return true;
        } catch (IOException e12) {
            throw new ut(e12);
        }
    }
}
