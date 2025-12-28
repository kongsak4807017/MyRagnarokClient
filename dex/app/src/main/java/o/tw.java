package o;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class tw implements vg {

    /* renamed from: 櫯, reason: contains not printable characters */
    protected static HashMap<Integer, Integer> f4986 = new HashMap<>();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    protected static ByteBuffer f4985 = ByteBuffer.allocate(2048).order(ByteOrder.LITTLE_ENDIAN);

    @Override // o.vg, o.ve
    /* renamed from: ȃ, reason: contains not printable characters */
    public abstract short mo1099();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static ByteBuffer m1096() {
        f4985.rewind();
        f4985.limit(f4985.capacity());
        Arrays.fill(f4985.array(), (byte) 0);
        return f4985;
    }

    @Override // o.ve
    /* renamed from: 櫯 */
    public int mo1040() {
        return m1098();
    }

    /* renamed from: Ą, reason: contains not printable characters */
    final int m1098() {
        Integer numValueOf = f4986.get(Integer.valueOf(mo1099()));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(m1095());
            f4986.put(Integer.valueOf(mo1099()), numValueOf);
        }
        return numValueOf.intValue();
    }

    @Deprecated
    /* renamed from: 鷭, reason: contains not printable characters */
    private static short m1097() {
        return (short) 0;
    }

    @Override // o.vg
    /* renamed from: 鷭 */
    public synchronized void mo1043(ByteBuffer byteBuffer, boolean z) {
        if (z) {
            byteBuffer.putShort(mo1099());
            ul.m1128(this, byteBuffer);
        } else {
            ul.m1128(this, byteBuffer);
        }
    }

    /* renamed from: ą, reason: contains not printable characters */
    private synchronized int m1095() {
        ByteBuffer byteBufferM1096;
        byteBufferM1096 = m1096();
        byteBufferM1096.rewind();
        mo1043(byteBufferM1096, false);
        return byteBufferM1096.position();
    }

    /* renamed from: 鷭 */
    public void mo1058(ByteBuffer byteBuffer) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, ArrayIndexOutOfBoundsException, NegativeArraySizeException, InvocationTargetException {
        ul.m1129(byteBuffer, this, -1);
    }
}
