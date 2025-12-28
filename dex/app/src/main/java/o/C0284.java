package o;

import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.ʟ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0284 extends ub {
    C0284() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws IOException {
        this.f5008 = (short) 338;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        cv cvVar = C0358.f6685;
        try {
            String strM531 = cv.m531(i3, i4);
            pa.m955(strM531);
            FileOutputStream fileOutputStream = new FileOutputStream(strM531);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            mj mjVar = C0358.f6669.f2061;
            if (mjVar != null && mjVar.f2129 != null) {
                lm lmVar = mjVar.f2123;
                AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
                if (abstractC0988 != null && abstractC0988.f8348 == i3) {
                    abstractC0988.f8349 = i4;
                    mjVar.f2129.m173();
                }
            }
            for (mj mjVar2 : C0358.f6669.f2048.f1545.values()) {
                lm lmVar2 = mjVar2.f2123;
                AbstractC0988 abstractC09882 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null);
                if (abstractC09882 != null && abstractC09882.f2001 == EnumC0431.FLAG_CLASS.f6846 && abstractC09882.f8348 == i3) {
                    mjVar2.m860();
                }
            }
        } catch (FileNotFoundException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        } catch (IOException e2) {
            Log.e("AndRO", e2.toString());
            RuntimeException runtimeException2 = new RuntimeException(e2.toString());
            runtimeException2.setStackTrace(e2.getStackTrace());
            throw runtimeException2;
        }
    }
}
