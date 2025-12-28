package o;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Button;
import java.nio.ByteBuffer;
import java.util.Iterator;
import o.je;

/* renamed from: o.風, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0907 extends ub {

    /* renamed from: o.風$鷭, reason: contains not printable characters */
    enum EnumC0908 {
        DISAPPEAR,
        DIE,
        LOGOFF,
        TELEPORT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0908[] valuesCustom() {
            EnumC0908[] enumC0908ArrValuesCustom = values();
            int length = enumC0908ArrValuesCustom.length;
            EnumC0908[] enumC0908Arr = new EnumC0908[length];
            System.arraycopy(enumC0908ArrValuesCustom, 0, enumC0908Arr, 0, length);
            return enumC0908Arr;
        }
    }

    C0907() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        AbstractC0988 abstractC0988;
        this.f5008 = (short) 128;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        lm lmVar = C0358.f6664.f2005.get(i3);
        lm lmVar2 = C0358.f6664.f2005.get(i3);
        if (lmVar2 == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null);
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        if ((b != EnumC0908.DIE.ordinal() || abstractC09882 == null || abstractC09882.f1997 == nu.NPC) ? false : true) {
            abstractC09882.m1566(true);
            if (abstractC09882 == C0358.f6664.f2004) {
                je.Cif cif = C0358.f6674.f42.f1809;
                Context context = cif.f1829.getContext();
                if (cif.f1828 == null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setView(cif.f1829);
                    cif.f1828 = builder.create();
                    cif.f1828.show();
                    ((Button) cif.f1828.findViewById(2131296458)).setOnClickListener(cif.f1827);
                    ((Button) cif.f1828.findViewById(2131296459)).setOnClickListener(cif.f1826);
                    ((Button) cif.f1828.findViewById(2131296460)).setOnClickListener(cif.f1824);
                } else {
                    cif.f1828.show();
                }
                boolean z2 = false;
                Iterator<C1008> it = C0358.f6664.f2004.f8622.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1008 next = it.next();
                    if (next != null && next.f8502 == 7621) {
                        z2 = true;
                        break;
                    }
                }
                ((Button) cif.f1828.findViewById(2131296460)).setVisibility(z2 ? 0 : 8);
            }
            mj mjVar = C0358.f6669.f2061;
            if (mjVar != null && mjVar.f2123 == lmVar) {
                C0358.f6669.m816(mjVar, true);
                return;
            }
            return;
        }
        C0358 c0358 = C0358.f6688;
        C0358.m1306(i3);
    }
}
