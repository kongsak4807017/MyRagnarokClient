package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import o.pj;
import o.pl;
import o.um;
import org.apache.http.HttpStatus;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class uq extends um {
    public uq(String str, lp lpVar) {
        super(str, lpVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1137(String str) throws IOException {
        pc.m995();
        try {
            byte[] bArr = new byte[1];
            File file = new File(String.valueOf(this.f5323) + "/" + str);
            if (!file.exists()) {
                throw new ut(String.valueOf(str) + " not exists, can't extract RGZ");
            }
            os osVar = new os(new GZIPInputStream(new FileInputStream(file)));
            while (true) {
                switch (osVar.m932()) {
                    case 100:
                        osVar.m937(bArr);
                        byte[] bArr2 = new byte[pa.m967(bArr[0])];
                        osVar.m937(bArr2);
                        String strM978 = pa.m978(bArr2, ow.KOREAN);
                        pc.m995();
                        new File(String.valueOf(this.f5323) + "/" + strM978).mkdirs();
                        continue;
                    case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                        osVar.f3371.close();
                        osVar.f3371 = null;
                        return;
                    case HttpStatus.SC_PROCESSING /* 102 */:
                        osVar.m937(bArr);
                        byte[] bArr3 = new byte[pa.m967(bArr[0])];
                        osVar.m937(bArr3);
                        byte[] bArr4 = new byte[4];
                        osVar.m937(bArr4);
                        int i = ByteBuffer.wrap(bArr4).order(ByteOrder.LITTLE_ENDIAN).getInt();
                        if (new File(this.f5323).getFreeSpace() < i) {
                            throw new ut("Can't unpack " + str + ": no device space left.", true);
                        }
                        String strReplace = pa.m978(bArr3, ow.KOREAN).replace("\\", "/");
                        pc.m995();
                        pa.m955(String.valueOf(this.f5323) + "/" + strReplace);
                        FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(this.f5323) + "/" + strReplace);
                        int i2 = 0;
                        byte[] bArr5 = new byte[32000];
                        while (i2 < i) {
                            int iMin = Math.min(bArr5.length, i - i2);
                            osVar.m936(bArr5, iMin);
                            fileOutputStream.write(bArr5, 0, iMin);
                            i2 += iMin;
                        }
                        fileOutputStream.close();
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new ut(e);
        } catch (IOException e2) {
            throw new ut(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Object[]] */
    @Override // o.um
    /* renamed from: 鷭 */
    public final boolean mo1131(pj.C0079.C0080 c0080) throws NumberFormatException, IOException {
        ByteBuffer byteBufferOrder;
        int i;
        String str = c0080.f4866;
        String str2 = c0080.f4865;
        String str3 = c0080.f4864;
        String str4 = c0080.f4862;
        this.f5322.mo789("Checking client updates at " + str);
        pc.m995();
        String[] strArrM988 = pa.m988(pa.m978(va.m1142(str, new File(String.valueOf(this.f5323) + "/" + str.substring(str.lastIndexOf(47) + 1)), true, true, pl.Cif.OVERWRITE, null), ow.LATIN), true, "\n");
        try {
            byteBufferOrder = ByteBuffer.wrap((byte[]) pl.m1047(this.f5323, str4, false, this.f5322)).order(ByteOrder.LITTLE_ENDIAN);
        } catch (uw unused) {
            byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
            i = 0;
            pc.m997(String.valueOf(str4) + " not found, assuming client version = 0");
        }
        if (byteBufferOrder.capacity() < 4) {
            throw new ut("Client version inf file " + str4 + " has size less than 4. Please check your client integrity.\nIf you don't know what this means, just remove all files from " + this.f5323);
        }
        i = byteBufferOrder.getInt();
        pc.m995();
        String[] strArr = new String[0];
        int iMax = i;
        for (String str5 : strArrM988) {
            String strReplace = str5.trim().replace("\r", "").replace("\t", " ");
            String[] strArrSplit = strReplace.split(" ", 2);
            if (strArrSplit.length >= 2) {
                try {
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    String strTrim = strArrSplit[1].trim();
                    if (i2 == 0) {
                        pc.m997("Found patch with id=0. Line=" + strReplace);
                        return false;
                    }
                    if (i2 > i) {
                        pc.m995();
                        for (int length = strArr.length - 1; length >= 0; length--) {
                            if (strArr[length].equals(strTrim)) {
                                strArr = (String[]) ox.m947(strArr, length);
                            }
                        }
                        String[] strArr2 = strArr;
                        String[] strArr3 = strArr2;
                        if (strArr2 == null) {
                            strArr3 = (Object[]) Array.newInstance(strTrim.getClass(), 0);
                        }
                        Object[] objArrCopyOf = Arrays.copyOf(strArr3, strArr3.length + 1);
                        objArrCopyOf[strArr3.length] = strTrim;
                        strArr = (String[]) objArrCopyOf;
                        iMax = Math.max(i2, i);
                    }
                } catch (NumberFormatException e) {
                    throw new ut(e, "Invalid patch list format.", false);
                }
            }
        }
        pc.m995();
        if (str2.toLowerCase().startsWith("ftp")) {
            va.m1141(str2, this.f5323, strArr, true, this.f5322);
        } else {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                String str6 = strArr[i3];
                String str7 = "Processing update files\n[" + (i3 + 1) + "/" + strArr.length + "] " + str6;
                this.f5322.mo789(str7);
                va.m1142(String.valueOf(str2) + "/" + str6, new File(String.valueOf(this.f5323) + "/" + str6), false, false, pl.Cif.SKIP, new um.C0113(str7));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            String str8 = strArr[i4];
            this.f5322.mo789("[1/2]  Applying update files\n[" + (i4 + 1) + "/" + strArr.length + "] " + str8);
            if (str8.endsWith(".rgz")) {
                m1137(str8);
            } else if (str8.endsWith(".gpf")) {
                arrayList.add(str8);
            } else {
                throw new ut("Unexpected format for file " + str8);
            }
        }
        if (arrayList.size() > 0) {
            pc.m995();
            this.f5322.mo789("Merging GPFs to " + str3);
            try {
                String str9 = String.valueOf(this.f5323) + "/" + str3;
                if (!pl.f4871.m1089(str9)) {
                    throw new ut("Failed to open GRF: " + str9);
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    String str10 = (String) arrayList.get(i5);
                    pc.m995();
                    File file = new File(this.f5323, str10);
                    ug[] ugVarArrM1152 = vc.m1152(file, (cs) null);
                    int i6 = 5000000;
                    for (ug ugVar : ugVarArrM1152) {
                        i6 += ugVar.f5133;
                    }
                    if (new File(this.f5323).getFreeSpace() < i6) {
                        throw new ut("Can't merge " + str10 + ": no device space left.", false);
                    }
                    for (int i7 = 0; i7 < ugVarArrM1152.length; i7++) {
                        ug ugVar2 = ugVarArrM1152[i7];
                        String str11 = ugVar2.f5128;
                        pc.m995();
                        this.f5322.mo789("[2/2] Applying update files\n[" + (i5 + 1) + "/" + arrayList.size() + "] " + str10 + "\n[" + (i7 + 1) + "/" + ugVarArrM1152.length + "] " + ugVar2.f5128);
                        ugVar2.f5129 = file;
                        byte[] bArrM1045 = pl.m1045(ugVar2);
                        if (pl.f4871.mo1092(pa.m987(ugVar2.f5128, ow.KOREAN, true), bArrM1045) == 0) {
                            throw new ux("Failed to append entry to GRF\nentry size=" + bArrM1045.length + "entry fn=" + str11 + "gpf_name=" + str10 + "grf_path=" + str9);
                        }
                    }
                }
                pc.m995();
                this.f5322.mo789("Closing GRF " + str3);
                pl.f4871.mo1093();
                for (File file2 : new File(this.f5323).listFiles()) {
                    if (file2.getName().endsWith(".rgz") || file2.getName().endsWith(".gpf")) {
                        file2.delete();
                    }
                }
            } catch (Exception e2) {
                pc.m995();
                this.f5322.mo789("Closing GRF " + str3);
                pl.f4871.mo1093();
                if (e2 instanceof ut) {
                    throw ((ut) e2);
                }
                throw new ut(e2);
            } catch (Throwable th) {
                pc.m995();
                this.f5322.mo789("Closing GRF " + str3);
                pl.f4871.mo1093();
                throw th;
            }
        }
        byteBufferOrder.position(0);
        byteBufferOrder.putInt(iMax);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f5323, str4), false);
            fileOutputStream.write(byteBufferOrder.array());
            fileOutputStream.close();
            pc.m995();
            return false;
        } catch (IOException e3) {
            throw new ut(e3);
        }
    }
}
