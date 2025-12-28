package o;

import java.nio.ByteBuffer;
import org.apache.http.message.TokenParser;

/* renamed from: o.ˮ̜, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0331 extends ub {
    C0331() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2022;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        StringBuilder sb = new StringBuilder("[");
        gx gxVar = C0358.f6685.f1030.f968.f1411.get(Integer.valueOf(s));
        StringBuilder sbAppend = sb.append(gxVar != null ? gxVar.f1427 : "Unknown Skill").append(']').append(TokenParser.SP);
        cv cvVar = C0358.f6685;
        int i4 = i3 + 1;
        String strM649 = C0358.f6687.m649(i4);
        c0698.m1432(sbAppend.append(strM649 == null ? "MSG" + i4 : strM649).toString(), 13487615);
    }
}
