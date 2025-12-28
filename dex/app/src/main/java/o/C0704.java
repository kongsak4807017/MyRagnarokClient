package o;

import android.app.AlertDialog;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.util.Arrays;
import o.je;

/* renamed from: o.惾, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0704 extends ub {
    C0704() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        int iIndexOf;
        this.f5008 = (short) 183;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        je.C0055 c0055 = C0358.f6674.f42.f1738;
        String strM978 = pa.m978(bArr, ow.LOCAL);
        c_activity c_activityVar = C0358.f6674;
        String[] strArrSplit = strM978.split(":");
        String[] strArr = new String[strArrSplit.length];
        int i4 = 0;
        for (String str : strArrSplit) {
            if (!str.isEmpty()) {
                int i5 = i4;
                i4++;
                strArr[i5] = str;
            }
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, i4);
        for (int i6 = 0; i6 < strArr2.length; i6++) {
            int i7 = 0;
            while (i7 < strArr2[i6].length() && (iIndexOf = strArr2[i6].indexOf("^", i7)) != -1) {
                try {
                    try {
                        je.C0055.m739(strArr2[i6], iIndexOf);
                        strArr2[i6] = String.valueOf(strArr2[i6].substring(0, iIndexOf)) + strArr2[i6].substring(iIndexOf + 7, strArr2[i6].length());
                    } catch (ParseException e) {
                        nz.m907("Faulty menu item color: " + strArr2[i6] + ". At " + (i7 + iIndexOf + e.getErrorOffset()) + ": " + e.getMessage());
                    }
                    i7 = iIndexOf + 1;
                } catch (StringIndexOutOfBoundsException e2) {
                    throw new nv("Faulty NPC script menu text=" + strM978 + "\n\n" + e2.toString());
                }
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(c_activityVar);
        builder.setTitle("");
        builder.setItems(strArr2, new ks(c0055));
        builder.setCancelable(true).setOnCancelListener(new kt(c0055));
        c0055.f1831 = i3;
        c0055.f1832 = builder.create();
        c0055.f1832.show();
    }
}
