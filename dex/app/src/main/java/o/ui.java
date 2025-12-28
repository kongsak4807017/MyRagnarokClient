package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ui {

    /* renamed from: Ć, reason: contains not printable characters */
    private static /* synthetic */ int[] f5189;

    /* renamed from: Ą, reason: contains not printable characters */
    public AbstractC0103[] f5190;

    /* renamed from: ą, reason: contains not printable characters */
    public double f5191;

    /* renamed from: ȃ, reason: contains not printable characters */
    public Cif f5192;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public C0104 f5193;

    /* renamed from: 櫯, reason: contains not printable characters */
    public C0107 f5194;

    /* renamed from: 鷭, reason: contains not printable characters */
    public C0109 f5195;

    /* renamed from: o.ui$岱, reason: contains not printable characters */
    public enum EnumC0108 {
        NONE,
        MODEL,
        LIGHT,
        SOUND,
        EFFECT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0108[] valuesCustom() {
            EnumC0108[] enumC0108ArrValuesCustom = values();
            int length = enumC0108ArrValuesCustom.length;
            EnumC0108[] enumC0108Arr = new EnumC0108[length];
            System.arraycopy(enumC0108ArrValuesCustom, 0, enumC0108Arr, 0, length);
            return enumC0108Arr;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static /* synthetic */ int[] m1121() {
        int[] iArr = f5189;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0108.valuesCustom().length];
        try {
            iArr2[EnumC0108.EFFECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0108.LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0108.MODEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0108.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0108.SOUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        f5189 = iArr2;
        return iArr2;
    }

    /* renamed from: o.ui$櫯, reason: contains not printable characters */
    public class C0109 {

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5252 = new byte[4];

        /* renamed from: 櫯, reason: contains not printable characters */
        public byte[] f5251 = new byte[2];

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public byte[] f5250 = new byte[40];

        /* renamed from: ȃ, reason: contains not printable characters */
        public byte[] f5249 = new byte[40];

        /* renamed from: Ą, reason: contains not printable characters */
        public byte[] f5246 = new byte[40];

        /* renamed from: ą, reason: contains not printable characters */
        public byte[] f5247 = new byte[40];

        public C0109() {
        }
    }

    /* renamed from: o.ui$ˮ͍, reason: contains not printable characters */
    public class C0107 {

        /* renamed from: Ą, reason: contains not printable characters */
        public float f5233;

        /* renamed from: ą, reason: contains not printable characters */
        public int f5234;

        /* renamed from: ȃ, reason: contains not printable characters */
        public float f5236;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float f5237;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f5238;

        /* renamed from: 鷭, reason: contains not printable characters */
        public float f5239;

        public C0107() {
        }
    }

    /* renamed from: o.ui$Ć, reason: contains not printable characters */
    public class C0104 {

        /* renamed from: Ą, reason: contains not printable characters */
        public float f5212;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f5216;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f5217;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float[] f5215 = new float[3];

        /* renamed from: ȃ, reason: contains not printable characters */
        public float[] f5214 = new float[3];

        public C0104() {
        }
    }

    /* renamed from: o.ui$if, reason: invalid class name */
    public class Cif {

        /* renamed from: ȃ, reason: contains not printable characters */
        public int f5206;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public int f5207;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f5208;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f5209;

        public Cif() {
        }
    }

    /* renamed from: o.ui$Ą, reason: contains not printable characters */
    public abstract class AbstractC0103 {

        /* renamed from: Ȋ, reason: contains not printable characters */
        public EnumC0108 f5211;

        /* renamed from: 鷭 */
        public abstract boolean mo1122(ByteBuffer byteBuffer);

        public AbstractC0103() {
        }
    }

    /* renamed from: o.ui$ȃ, reason: contains not printable characters */
    public class C0105 extends AbstractC0103 {

        /* renamed from: Ą, reason: contains not printable characters */
        public byte[] f5218;

        /* renamed from: ą, reason: contains not printable characters */
        public byte[] f5219;

        /* renamed from: Ć, reason: contains not printable characters */
        public float[] f5220;

        /* renamed from: ć, reason: contains not printable characters */
        public float[] f5221;

        /* renamed from: ȃ, reason: contains not printable characters */
        public int f5222;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float f5223;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        public float[] f5224;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f5226;

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5227;

        public C0105() {
            super();
            this.f5227 = new byte[40];
            this.f5218 = new byte[80];
            this.f5219 = new byte[80];
            this.f5220 = new float[3];
            this.f5221 = new float[3];
            this.f5224 = new float[3];
        }

        @Override // o.ui.AbstractC0103
        /* renamed from: 鷭 */
        public final boolean mo1122(ByteBuffer byteBuffer) {
            if (ui.this.f5191 >= 1.3d) {
                byteBuffer.get(this.f5227);
                this.f5226 = byteBuffer.getInt();
                this.f5223 = byteBuffer.getFloat();
                this.f5222 = byteBuffer.getInt();
            }
            byteBuffer.get(this.f5218);
            byteBuffer.get(this.f5219);
            float[] fArr = this.f5220;
            fArr[0] = byteBuffer.getFloat();
            fArr[1] = byteBuffer.getFloat();
            fArr[2] = byteBuffer.getFloat();
            float[] fArr2 = this.f5221;
            fArr2[0] = byteBuffer.getFloat();
            fArr2[1] = byteBuffer.getFloat();
            fArr2[2] = byteBuffer.getFloat();
            float[] fArr3 = this.f5224;
            fArr3[0] = byteBuffer.getFloat();
            fArr3[1] = byteBuffer.getFloat();
            fArr3[2] = byteBuffer.getFloat();
            return true;
        }
    }

    public class aux extends AbstractC0103 {

        /* renamed from: Ą, reason: contains not printable characters */
        public int f5196;

        /* renamed from: ą, reason: contains not printable characters */
        public int f5197;

        /* renamed from: Ć, reason: contains not printable characters */
        public float f5198;

        /* renamed from: ć, reason: contains not printable characters */
        public float f5199;

        /* renamed from: ȃ, reason: contains not printable characters */
        public float f5200;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float[] f5201;

        /* renamed from: 櫯, reason: contains not printable characters */
        public byte[] f5203;

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5204;

        public aux() {
            super();
            this.f5204 = new byte[80];
            this.f5203 = new byte[80];
            this.f5201 = new float[3];
        }

        @Override // o.ui.AbstractC0103
        /* renamed from: 鷭, reason: contains not printable characters */
        public final boolean mo1122(ByteBuffer byteBuffer) {
            byteBuffer.get(this.f5204);
            byteBuffer.get(this.f5203);
            float[] fArr = this.f5201;
            fArr[0] = byteBuffer.getFloat();
            fArr[1] = byteBuffer.getFloat();
            fArr[2] = byteBuffer.getFloat();
            this.f5200 = byteBuffer.getFloat();
            this.f5196 = byteBuffer.getInt();
            this.f5197 = byteBuffer.getInt();
            this.f5198 = byteBuffer.getFloat();
            this.f5199 = ui.this.f5191 >= 2.0d ? byteBuffer.getFloat() : 0.0f;
            return true;
        }
    }

    /* renamed from: o.ui$鷭, reason: contains not printable characters */
    public class C0110 extends AbstractC0103 {

        /* renamed from: Ą, reason: contains not printable characters */
        public float f5253;

        /* renamed from: ą, reason: contains not printable characters */
        public float f5254;

        /* renamed from: Ć, reason: contains not printable characters */
        public int f5255;

        /* renamed from: ć, reason: contains not printable characters */
        public int f5256;

        /* renamed from: ȃ, reason: contains not printable characters */
        public float f5257;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public int f5258;

        /* renamed from: 櫯, reason: contains not printable characters */
        public float[] f5260;

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5261;

        public C0110() {
            super();
            this.f5261 = new byte[80];
            this.f5260 = new float[3];
        }

        @Override // o.ui.AbstractC0103
        /* renamed from: 鷭 */
        public final boolean mo1122(ByteBuffer byteBuffer) {
            byteBuffer.get(this.f5261);
            float[] fArr = this.f5260;
            fArr[0] = byteBuffer.getFloat();
            fArr[1] = byteBuffer.getFloat();
            fArr[2] = byteBuffer.getFloat();
            this.f5258 = byteBuffer.getInt();
            this.f5257 = byteBuffer.getFloat();
            this.f5253 = byteBuffer.getFloat();
            this.f5254 = byteBuffer.getFloat();
            this.f5255 = byteBuffer.getInt();
            this.f5256 = byteBuffer.getInt();
            return true;
        }
    }

    /* renamed from: o.ui$ˮ͈, reason: contains not printable characters */
    public class C0106 extends AbstractC0103 {

        /* renamed from: ȃ, reason: contains not printable characters */
        public float f5229;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float[] f5230;

        /* renamed from: 櫯, reason: contains not printable characters */
        public float[] f5231;

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5232;

        public C0106() {
            super();
            this.f5232 = new byte[80];
            this.f5231 = new float[3];
            this.f5230 = new float[3];
        }

        @Override // o.ui.AbstractC0103
        /* renamed from: 鷭 */
        public final boolean mo1122(ByteBuffer byteBuffer) {
            byteBuffer.get(this.f5232);
            float[] fArr = this.f5231;
            for (int i = 0; i < fArr.length; i++) {
                fArr[i] = byteBuffer.getFloat();
            }
            float[] fArr2 = this.f5230;
            for (int i2 = 0; i2 < fArr2.length; i2++) {
                fArr2[i2] = byteBuffer.getFloat();
            }
            this.f5229 = byteBuffer.getFloat();
            return true;
        }
    }
}
