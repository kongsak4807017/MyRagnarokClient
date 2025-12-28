package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import o.hr;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class cu extends cp {

    /* renamed from: ą, reason: contains not printable characters */
    FloatBuffer f1000;

    /* renamed from: Ć, reason: contains not printable characters */
    FloatBuffer f1001;

    /* renamed from: ć, reason: contains not printable characters */
    float[][] f1002;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    boolean f1003 = true;

    /* renamed from: 櫯, reason: contains not printable characters */
    hr[] f1004;

    /* renamed from: 鷭, reason: contains not printable characters */
    uk f1005;

    cu() {
    }

    @Override // o.cp
    /* renamed from: ą */
    public final void mo495() {
        if (this.f1004 != null) {
            for (hr hrVar : this.f1004) {
                hrVar.m496();
            }
            this.f1004 = null;
        }
    }

    @Override // o.cp
    /* renamed from: 鷭 */
    protected final String mo497(String str) {
        return "data/texture/effect/" + str;
    }

    @Override // o.cp
    /* renamed from: 鷭 */
    public final boolean mo498(byte[] bArr) {
        try {
            this.f1005 = new uk((ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).position(0));
            this.f1004 = new hr[this.f1005.f5278.length];
            for (int i = 0; i < this.f1004.length; i++) {
                this.f1004[i] = (hr) cp.m491("effect/" + this.f1005.f5278[i], hr.class);
            }
            this.f1001 = ByteBuffer.allocateDirect(this.f1005.f5284 * 64).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f1000 = ByteBuffer.allocateDirect(this.f1005.f5284 * 32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f1002 = new float[this.f1005.f5284][];
            for (int i2 = 0; i2 < this.f1005.f5284; i2++) {
                FloatBuffer floatBuffer = this.f1001;
                hr.C0048 c0048 = this.f1004[this.f1005.f5285[i2]].f1500[0];
                float[] fArr = this.f1005.f5280;
                int i3 = i2 << 3;
                int i4 = oc.f3231 ? 1 : 0;
                floatBuffer.put(new float[]{fArr[i3 + 0] * (c0048.f1513 - i4), fArr[i3 + 1] * (c0048.f1514 - i4), 0.0f, 0.0f, fArr[i3 + 2] * (c0048.f1513 - i4), fArr[i3 + 3] * (c0048.f1514 - i4), 0.0f, 0.0f, fArr[i3 + 4] * (c0048.f1513 - i4), fArr[i3 + 5] * (c0048.f1514 - i4), 0.0f, 0.0f, fArr[i3 + 6] * (c0048.f1513 - i4), fArr[i3 + 7] * (c0048.f1514 - i4), 0.0f, 0.0f});
                for (int i5 = 0; i5 < 8; i5 += 2) {
                    this.f1000.put(this.f1005.f5279[(i2 << 3) + i5 + 0] * 0.14285715f);
                    this.f1000.put(this.f1005.f5279[(i2 << 3) + i5 + 1] * (-0.14285715f));
                }
                this.f1002[i2] = new float[]{this.f1005.f5281[(i2 << 2) + 0], this.f1005.f5281[(i2 << 2) + 1], this.f1005.f5281[(i2 << 2) + 2], this.f1005.f5281[(i2 << 2) + 3]};
            }
            this.f1001.position(0);
            this.f1000.position(0);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
