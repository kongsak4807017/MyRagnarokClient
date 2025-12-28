package o;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class pp extends tw {

    /* renamed from: 鷭, reason: contains not printable characters */
    protected static HashMap<Integer, Integer> f4879 = new HashMap<>();

    /* renamed from: 鷭, reason: contains not printable characters */
    private int m1057() throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, ArrayIndexOutOfBoundsException, NegativeArraySizeException, InvocationTargetException {
        ByteBuffer byteBuffer = m1096();
        byteBuffer.rewind();
        ul.m1129(byteBuffer, this, 0);
        int iPosition = byteBuffer.position();
        byteBuffer.rewind();
        ul.m1129(byteBuffer, this, 1);
        return byteBuffer.position() - iPosition;
    }

    /* renamed from: ą, reason: contains not printable characters */
    private int m1056() {
        Integer numValueOf = f4879.get(Integer.valueOf(mo1099()));
        if (numValueOf == null || numValueOf.intValue() == 0) {
            numValueOf = Integer.valueOf(m1057());
            f4879.put(Integer.valueOf(mo1099()), numValueOf);
        }
        return numValueOf.intValue();
    }

    @Override // o.tw, o.ve
    /* renamed from: 櫯 */
    public final int mo1040() {
        return -1;
    }

    @Override // o.tw, o.vg
    /* renamed from: 鷭 */
    public final void mo1043(ByteBuffer byteBuffer, boolean z) {
        if (z) {
            byteBuffer.putShort(mo1099());
        }
        int iPosition = byteBuffer.position();
        byteBuffer.position(byteBuffer.position() + 2);
        super.mo1043(byteBuffer, false);
        int iPosition2 = (byteBuffer.position() - iPosition) - 2;
        byteBuffer.position(iPosition);
        byteBuffer.putShort((short) (iPosition2 + 4));
        byteBuffer.position(iPosition + 2 + iPosition2);
    }

    @Override // o.tw
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo1058(ByteBuffer byteBuffer) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, ArrayIndexOutOfBoundsException, NegativeArraySizeException, InvocationTargetException {
        ul.m1129(byteBuffer, this, ((pa.m968(byteBuffer.getShort()) - m1098()) - 2) / m1056());
    }
}
