package o;

import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.FloatMath;
import android.util.Log;
import com.roworkshop.andro.c_activity;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o.C0450;
import o.C0995;
import o.C0995.C0996;
import o.hr;
import o.hs;
import o.iu;
import o.mc;
import o.ud;

/* renamed from: o.蜣, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0851 implements GLSurfaceView.Renderer {

    /* renamed from: Ą, reason: contains not printable characters */
    String f7965;

    /* renamed from: ą, reason: contains not printable characters */
    String f7966;

    /* renamed from: ȃ, reason: contains not printable characters */
    public long f7968;

    /* renamed from: ܕ, reason: contains not printable characters */
    private long f7972;

    /* renamed from: 岱, reason: contains not printable characters */
    C0542 f7974;

    /* renamed from: 庸, reason: contains not printable characters */
    private int f7975;

    /* renamed from: 櫯, reason: contains not printable characters */
    IntBuffer f7976;

    /* renamed from: 纫, reason: contains not printable characters */
    private int f7977;

    /* renamed from: đ, reason: contains not printable characters */
    private static final String[] f7963 = {"GL_INVALID_ENUM", "GL_INVALID_VALUE", "GL_INVALID_OPERATION", "GL_STACK_OVERFLOW", "GL_STACK_UNDERFLOW", "GL_OUT_OF_MEMORY"};

    /* renamed from: Ć, reason: contains not printable characters */
    static ou f7961 = new ou(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: ć, reason: contains not printable characters */
    static ou f7962 = new ou(1.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: Ē, reason: contains not printable characters */
    private static int[] f7964 = {0, 0, 1, 768, 769, 770, 771, 772, 773, 774, 775, 776, 0, 0, 32769, 32772};

    /* renamed from: 鷭, reason: contains not printable characters */
    Queue<Runnable> f7979 = new ConcurrentLinkedQueue();

    /* renamed from: Ȋ, reason: contains not printable characters */
    private Point[] f7969 = new Point[Cif.valuesCustom().length];

    /* renamed from: ċ, reason: contains not printable characters */
    private C0852[] f7967 = new C0852[EnumC0853.MAX.f8027];

    /* renamed from: ˮ͈, reason: contains not printable characters */
    nh f7970 = nh.NONE;

    /* renamed from: 䒧, reason: contains not printable characters */
    private boolean f7973 = false;

    /* renamed from: 躆, reason: contains not printable characters */
    private int f7978 = 0;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    Runnable f7971 = new RunnableC0565(this);

    /* renamed from: o.蜣$if, reason: invalid class name */
    enum Cif {
        TERRAIN_COLORS,
        TERRAIN_PALETTES,
        OBJECT_COLORS,
        OBJECT_PALETTES,
        SPRITE_COLORS,
        SPRITE_PALETTES,
        COLORMAP;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }
    }

    /* renamed from: o.蜣$櫯, reason: contains not printable characters */
    class C0852 {

        /* renamed from: Ą, reason: contains not printable characters */
        int f7988;

        /* renamed from: ą, reason: contains not printable characters */
        int f7989;

        /* renamed from: Ć, reason: contains not printable characters */
        int f7990;

        /* renamed from: ć, reason: contains not printable characters */
        int f7991;

        /* renamed from: ċ, reason: contains not printable characters */
        int f7992;

        /* renamed from: đ, reason: contains not printable characters */
        int f7993;

        /* renamed from: Ē, reason: contains not printable characters */
        int f7994;

        /* renamed from: ē, reason: contains not printable characters */
        int f7995;

        /* renamed from: Ė, reason: contains not printable characters */
        int f7996;

        /* renamed from: ė, reason: contains not printable characters */
        int f7997;

        /* renamed from: Ę, reason: contains not printable characters */
        int f7998;

        /* renamed from: ę, reason: contains not printable characters */
        int f7999;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f8000;

        /* renamed from: Ȋ, reason: contains not printable characters */
        int f8001;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f8002;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        int f8003;

        /* renamed from: ܕ, reason: contains not printable characters */
        int f8004;

        /* renamed from: 㥳, reason: contains not printable characters */
        int f8005;

        /* renamed from: 䒧, reason: contains not printable characters */
        int f8006;

        /* renamed from: 岱, reason: contains not printable characters */
        int f8008;

        /* renamed from: 庸, reason: contains not printable characters */
        int f8009;

        /* renamed from: 廂, reason: contains not printable characters */
        int f8010;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8011;

        /* renamed from: 纫, reason: contains not printable characters */
        int f8012;

        /* renamed from: 躆, reason: contains not printable characters */
        int f8013;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8014;

        /* renamed from: 띥, reason: contains not printable characters */
        int f8015;

        private C0852() {
        }

        /* synthetic */ C0852(C0851 c0851, C0852 c0852) {
            this();
        }
    }

    /* renamed from: o.蜣$鷭, reason: contains not printable characters */
    enum EnumC0853 {
        TERRAIN,
        OBJECT,
        SPRITE,
        WATER,
        DEBUG3D,
        SPRITE2D,
        SIMPLE3DOBJECT,
        STR_EFFECT,
        EFFECT_PRIM,
        MAX;


        /* renamed from: Ȋ, reason: contains not printable characters */
        int f8027;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0853[] valuesCustom() {
            EnumC0853[] enumC0853ArrValuesCustom = values();
            int length = enumC0853ArrValuesCustom.length;
            EnumC0853[] enumC0853Arr = new EnumC0853[length];
            System.arraycopy(enumC0853ArrValuesCustom, 0, enumC0853Arr, 0, length);
            return enumC0853Arr;
        }

        static {
            EnumC0853[] enumC0853ArrValuesCustom = valuesCustom();
            for (int i = 0; i < enumC0853ArrValuesCustom.length; i++) {
                enumC0853ArrValuesCustom[i].f8027 = i;
            }
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static String m1515(int i) {
            EnumC0853[] enumC0853ArrValuesCustom = valuesCustom();
            for (int i2 = 0; i2 < enumC0853ArrValuesCustom.length; i2++) {
                if (enumC0853ArrValuesCustom[i2].f8027 == i) {
                    return enumC0853ArrValuesCustom[i2].name();
                }
            }
            return null;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1512(C0450 c0450, iu iuVar) throws InterruptedException {
        if (this.f7976 != null) {
            GLES20.glDeleteTextures(Cif.valuesCustom().length, this.f7976);
            this.f7976 = null;
        }
        this.f7976 = ByteBuffer.allocateDirect(Cif.valuesCustom().length * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
        GLES20.glGenTextures(Cif.valuesCustom().length, this.f7976);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        Cif[] cifArrValuesCustom = Cif.valuesCustom();
        int length = cifArrValuesCustom.length;
        for (int i = 0; i < length; i++) {
            Cif cif = cifArrValuesCustom[i];
            GLES20.glBindTexture(3553, this.f7976.get(cif.ordinal()));
            int iGlGetError2 = GLES20.glGetError();
            this.f7977 = iGlGetError2;
            if (iGlGetError2 != 0) {
                m1498(this.f7977);
            }
            int i2 = cif == Cif.COLORMAP ? 9729 : 9728;
            GLES20.glTexParameteri(3553, 10241, i2);
            int iGlGetError3 = GLES20.glGetError();
            this.f7977 = iGlGetError3;
            if (iGlGetError3 != 0) {
                m1498(this.f7977);
            }
            GLES20.glTexParameteri(3553, 10240, i2);
            int iGlGetError4 = GLES20.glGetError();
            this.f7977 = iGlGetError4;
            if (iGlGetError4 != 0) {
                m1498(this.f7977);
            }
        }
        m1511(c0450.f6872.f1659, Cif.TERRAIN_COLORS, Cif.TERRAIN_PALETTES, true);
        m1511(c0450.f6880, Cif.OBJECT_COLORS, Cif.OBJECT_PALETTES, true);
        c0450.f6872.f1659 = null;
        c0450.f6880 = null;
        if (oc.f3241) {
            try {
                GLES20.glActiveTexture(33986);
                int iGlGetError5 = GLES20.glGetError();
                this.f7977 = iGlGetError5;
                if (iGlGetError5 != 0) {
                    m1498(this.f7977);
                }
                GLES20.glBindTexture(3553, this.f7976.get(Cif.COLORMAP.ordinal()));
                int iGlGetError6 = GLES20.glGetError();
                this.f7977 = iGlGetError6;
                if (iGlGetError6 != 0) {
                    m1498(this.f7977);
                }
                ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(c0450.f6885.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
                shortBufferAsShortBuffer.put(c0450.f6885);
                shortBufferAsShortBuffer.position(0);
                GLES20.glTexImage2D(3553, 0, 6408, c0450.f6882, c0450.f6886, 0, 6408, 32820, shortBufferAsShortBuffer);
                int iGlGetError7 = GLES20.glGetError();
                this.f7977 = iGlGetError7;
                if (iGlGetError7 != 0) {
                    m1498(this.f7977);
                }
                c0450.f6885 = null;
            } catch (OutOfMemoryError unused) {
                throw new ut("Not enough memory for lightmap. Disable lightmap and reduce texture quality in options.");
            }
        }
        m1511(iuVar, Cif.SPRITE_COLORS, Cif.SPRITE_PALETTES, true);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final int m1496(int i, String str, String str2) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        GLES20.glCompileShader(iGlCreateShader);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        int[] iArr = new int[10];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        int iGlGetError4 = GLES20.glGetError();
        this.f7977 = iGlGetError4;
        if (iGlGetError4 != 0) {
            m1498(this.f7977);
        }
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            int iGlGetError5 = GLES20.glGetError();
            this.f7977 = iGlGetError5;
            if (iGlGetError5 != 0) {
                m1498(this.f7977);
            }
            nz.m907(String.valueOf(str2) + " couldn't be compiled: ");
            nz.m907(strGlGetShaderInfoLog);
            return -1;
        }
        return iGlCreateShader;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        IntBuffer intBufferWrap = IntBuffer.wrap(new int[2]);
        GLES20.glGetIntegerv(3379, intBufferWrap);
        iu.f1665 = intBufferWrap.get(0);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        intBufferWrap.position(0);
        GLES20.glGetString(35724);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        for (int i = 0; i < this.f7967.length; i++) {
            this.f7967[i] = new C0852(this, null);
            this.f7967[i].f8014 = GLES20.glCreateProgram();
            int iGlGetError3 = GLES20.glGetError();
            this.f7977 = iGlGetError3;
            if (iGlGetError3 != 0) {
                m1498(this.f7977);
            }
        }
        String str = String.valueOf(oc.f3241 ? "#define USE_COLORMAP\n" : "") + (oc.f3231 ? "#define INTERPOLATE\n" : "");
        int[] iArr = new int[this.f7967.length];
        int[] iArr2 = new int[this.f7967.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            String strM1515 = EnumC0853.m1515(i2);
            iArr2[i2] = -1;
            iArr[i2] = -1;
            int i3 = 0;
            while (i3 < 3) {
                if (iArr[i2] < 0) {
                    iArr[i2] = m1496(35633, String.valueOf(str) + "#define " + strM1515 + (i3 > 0 ? "\n#define TRY" + i3 : "") + "\n" + this.f7965, "Vertex Shader " + strM1515 + (oc.f3231 ? " [INTERPOLATE]" : "") + (i3 > 0 ? "[TRY" + i3 + "]" : ""));
                }
                if (iArr2[i2] < 0) {
                    iArr2[i2] = m1496(35632, String.valueOf(str) + "#define " + strM1515 + (i3 > 0 ? "\n#define TRY" + i3 : "") + "\n" + this.f7966, "Fragment Shader " + strM1515 + (oc.f3231 ? " [INTERPOLATE]" : "") + (i3 > 0 ? "[TRY" + i3 + "]" : ""));
                }
                i3++;
            }
        }
        for (int i4 = 0; i4 < this.f7967.length; i4++) {
            if (iArr[i4] < 0 || iArr2[i4] < 0) {
                this.f7967[i4] = null;
            } else {
                C0852 c0852 = this.f7967[i4];
                int i5 = this.f7967[i4].f8014;
                GLES20.glAttachShader(i5, iArr[i4]);
                int iGlGetError4 = GLES20.glGetError();
                this.f7977 = iGlGetError4;
                if (iGlGetError4 != 0) {
                    m1498(this.f7977);
                }
                GLES20.glAttachShader(i5, iArr2[i4]);
                int iGlGetError5 = GLES20.glGetError();
                this.f7977 = iGlGetError5;
                if (iGlGetError5 != 0) {
                    m1498(this.f7977);
                }
                GLES20.glLinkProgram(i5);
                int iGlGetError6 = GLES20.glGetError();
                this.f7977 = iGlGetError6;
                if (iGlGetError6 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8000 = GLES20.glGetAttribLocation(i5, "in_vpos");
                int iGlGetError7 = GLES20.glGetError();
                this.f7977 = iGlGetError7;
                if (iGlGetError7 != 0) {
                    m1498(this.f7977);
                }
                c0852.f7988 = GLES20.glGetAttribLocation(i5, "in_texcoord");
                int iGlGetError8 = GLES20.glGetError();
                this.f7977 = iGlGetError8;
                if (iGlGetError8 != 0) {
                    m1498(this.f7977);
                }
                c0852.f7989 = GLES20.glGetAttribLocation(i5, "in_vmeshid");
                int iGlGetError9 = GLES20.glGetError();
                this.f7977 = iGlGetError9;
                if (iGlGetError9 != 0) {
                    m1498(this.f7977);
                }
                c0852.f7990 = GLES20.glGetAttribLocation(i5, "in_vcolor");
                int iGlGetError10 = GLES20.glGetError();
                this.f7977 = iGlGetError10;
                if (iGlGetError10 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8011 = GLES20.glGetUniformLocation(i5, "in_wvp_mat");
                int iGlGetError11 = GLES20.glGetError();
                this.f7977 = iGlGetError11;
                if (iGlGetError11 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8002 = GLES20.glGetUniformLocation(i5, "in_obj_mesh_mats");
                int iGlGetError12 = GLES20.glGetError();
                this.f7977 = iGlGetError12;
                if (iGlGetError12 != 0) {
                    m1498(this.f7977);
                }
                c0852.f7991 = GLES20.glGetUniformLocation(i5, "in_texture");
                int iGlGetError13 = GLES20.glGetError();
                this.f7977 = iGlGetError13;
                if (iGlGetError13 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8003 = GLES20.glGetUniformLocation(i5, "in_texture2");
                int iGlGetError14 = GLES20.glGetError();
                this.f7977 = iGlGetError14;
                if (iGlGetError14 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8008 = GLES20.glGetUniformLocation(i5, "in_texture_colormap");
                int iGlGetError15 = GLES20.glGetError();
                this.f7977 = iGlGetError15;
                if (iGlGetError15 != 0) {
                    m1498(this.f7977);
                }
                c0852.f7992 = GLES20.glGetUniformLocation(i5, "in_pixel_atlas_size");
                int iGlGetError16 = GLES20.glGetError();
                this.f7977 = iGlGetError16;
                if (iGlGetError16 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8001 = GLES20.glGetUniformLocation(i5, "in_palette_atlas_size");
                int iGlGetError17 = GLES20.glGetError();
                this.f7977 = iGlGetError17;
                if (iGlGetError17 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8012 = GLES20.glGetUniformLocation(i5, "in_frame_idx");
                int iGlGetError18 = GLES20.glGetError();
                this.f7977 = iGlGetError18;
                if (iGlGetError18 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8006 = GLES20.glGetUniformLocation(i5, "in_frame_texcoords");
                int iGlGetError19 = GLES20.glGetError();
                this.f7977 = iGlGetError19;
                if (iGlGetError19 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8013 = GLES20.glGetUniformLocation(i5, "in_map_size");
                int iGlGetError20 = GLES20.glGetError();
                this.f7977 = iGlGetError20;
                if (iGlGetError20 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8004 = GLES20.glGetUniformLocation(i5, "in_transformation_mat");
                int iGlGetError21 = GLES20.glGetError();
                this.f7977 = iGlGetError21;
                if (iGlGetError21 != 0) {
                    m1498(this.f7977);
                }
                c0852.f8009 = GLES20.glGetUniformLocation(i5, "in_camera_dist");
                int iGlGetError22 = GLES20.glGetError();
                this.f7977 = iGlGetError22;
                if (iGlGetError22 != 0) {
                    m1498(this.f7977);
                }
                c0852.f7993 = GLES20.glGetUniformLocation(i5, "in_color");
                int iGlGetError23 = GLES20.glGetError();
                this.f7977 = iGlGetError23;
                if (iGlGetError23 != 0) {
                    m1498(this.f7977);
                }
                c0852.f7994 = GLES20.glGetUniformLocation(i5, "debugcolor");
                int iGlGetError24 = GLES20.glGetError();
                this.f7977 = iGlGetError24;
                if (iGlGetError24 != 0) {
                    m1498(this.f7977);
                }
                c0852.f7995 = GLES20.glGetUniformLocation(i5, "uViewModelMat");
                m1497();
                c0852.f8015 = GLES20.glGetUniformLocation(i5, "uSpriteAngle");
                m1497();
                c0852.f8005 = GLES20.glGetUniformLocation(i5, "uSpriteSize");
                m1497();
                c0852.f7996 = GLES20.glGetUniformLocation(i5, "uSpriteOffset");
                m1497();
                c0852.f7997 = GLES20.glGetUniformLocation(i5, "u3dPosition");
                m1497();
                c0852.f7998 = GLES20.glGetUniformLocation(i5, "uSpriteDepth");
                m1497();
                c0852.f7999 = GLES20.glGetUniformLocation(i5, "uSpriteZindex");
                m1497();
                c0852.f8010 = GLES20.glGetUniformLocation(i5, "uParam");
                m1497();
                GLES20.glUseProgram(i5);
                int iGlGetError25 = GLES20.glGetError();
                this.f7977 = iGlGetError25;
                if (iGlGetError25 != 0) {
                    m1498(this.f7977);
                }
                GLES20.glUniform1i(c0852.f7991, 0);
                int iGlGetError26 = GLES20.glGetError();
                this.f7977 = iGlGetError26;
                if (iGlGetError26 != 0) {
                    m1498(this.f7977);
                }
                GLES20.glUniform1i(c0852.f8003, 1);
                int iGlGetError27 = GLES20.glGetError();
                this.f7977 = iGlGetError27;
                if (iGlGetError27 != 0) {
                    m1498(this.f7977);
                }
                if (oc.f3241) {
                    GLES20.glUniform1i(c0852.f8008, 2);
                }
                int iGlGetError28 = GLES20.glGetError();
                this.f7977 = iGlGetError28;
                if (iGlGetError28 != 0) {
                    m1498(this.f7977);
                }
            }
        }
        GLES20.glEnable(2929);
        int iGlGetError29 = GLES20.glGetError();
        this.f7977 = iGlGetError29;
        if (iGlGetError29 != 0) {
            m1498(this.f7977);
        }
        GLES20.glDepthFunc(515);
        int iGlGetError30 = GLES20.glGetError();
        this.f7977 = iGlGetError30;
        if (iGlGetError30 != 0) {
            m1498(this.f7977);
        }
        GLES20.glEnable(3042);
        int iGlGetError31 = GLES20.glGetError();
        this.f7977 = iGlGetError31;
        if (iGlGetError31 != 0) {
            m1498(this.f7977);
        }
        GLES20.glBlendFunc(770, 771);
        int iGlGetError32 = GLES20.glGetError();
        this.f7977 = iGlGetError32;
        if (iGlGetError32 != 0) {
            m1498(this.f7977);
        }
        GLES20.glLineWidth(4.0f);
        int iGlGetError33 = GLES20.glGetError();
        this.f7977 = iGlGetError33;
        if (iGlGetError33 != 0) {
            m1498(this.f7977);
        }
        GLES20.glPixelStorei(3317, 1);
        int iGlGetError34 = GLES20.glGetError();
        this.f7977 = iGlGetError34;
        if (iGlGetError34 != 0) {
            m1498(this.f7977);
        }
        GLES20.glPixelStorei(3333, 1);
        int iGlGetError35 = GLES20.glGetError();
        this.f7977 = iGlGetError35;
        if (iGlGetError35 != 0) {
            m1498(this.f7977);
        }
        if (this.f7970 == nh.READY) {
            C0358.f6675.mo139(new RunnableC0484(this));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1498(int i) {
        int i2 = i - 1280;
        if (i2 < 0 || i2 >= f7963.length) {
            String str = "OpenGL error: Unknown error " + (i2 + 1280);
            Log.e("AndRO", str);
            throw new nv(str);
        }
        String str2 = "OpenGL error: " + f7963[i2];
        Log.e("AndRO", str2);
        throw new nv(str2);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1497() {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        int i = iGlGetError - 1280;
        if (i < 0 || i >= f7963.length) {
            String str = "OpenGL error: Unknown error " + (i + 1280);
            Log.e("AndRO", str);
            throw new nv(str);
        }
        String str2 = "OpenGL error: " + f7963[i];
        Log.e("AndRO", str2);
        throw new nv(str2);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1509(C0424[] c0424Arr, int i) {
        if (c0424Arr == null || i <= 0) {
            return;
        }
        C0852 c0852 = this.f7967[EnumC0853.OBJECT.f8027];
        GLES20.glUseProgram(c0852.f8014);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        m1493(c0852);
        C0424 c0424 = null;
        GLES20.glEnableVertexAttribArray(c0852.f8000);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        GLES20.glEnableVertexAttribArray(c0852.f7988);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        GLES20.glEnableVertexAttribArray(c0852.f7989);
        int iGlGetError4 = GLES20.glGetError();
        this.f7977 = iGlGetError4;
        if (iGlGetError4 != 0) {
            m1498(this.f7977);
        }
        for (int i2 = 0; i2 < i; i2++) {
            C0424 c04242 = c0424Arr[i2];
            try {
                GLES20.glUniformMatrix4fv(c0852.f8002, c04242.f6827.length / 16, false, c04242.f6827, 0);
                int iGlGetError5 = GLES20.glGetError();
                this.f7977 = iGlGetError5;
                if (iGlGetError5 != 0) {
                    m1498(this.f7977);
                }
                if (c0424 == null || c04242.f6828 != c0424.f6828) {
                    GLES20.glDisableVertexAttribArray(c0852.f8000);
                    int iGlGetError6 = GLES20.glGetError();
                    this.f7977 = iGlGetError6;
                    if (iGlGetError6 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f7988);
                    int iGlGetError7 = GLES20.glGetError();
                    this.f7977 = iGlGetError7;
                    if (iGlGetError7 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f7989);
                    int iGlGetError8 = GLES20.glGetError();
                    this.f7977 = iGlGetError8;
                    if (iGlGetError8 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glVertexAttribPointer(c0852.f8000, 4, 5126, false, 0, (Buffer) c04242.f6828.f7739);
                    int iGlGetError9 = GLES20.glGetError();
                    this.f7977 = iGlGetError9;
                    if (iGlGetError9 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) c04242.f6828.f7737);
                    int iGlGetError10 = GLES20.glGetError();
                    this.f7977 = iGlGetError10;
                    if (iGlGetError10 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glVertexAttribPointer(c0852.f7989, 1, 5126, false, 0, (Buffer) c04242.f6828.f7738);
                    int iGlGetError11 = GLES20.glGetError();
                    this.f7977 = iGlGetError11;
                    if (iGlGetError11 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glEnableVertexAttribArray(c0852.f8000);
                    int iGlGetError12 = GLES20.glGetError();
                    this.f7977 = iGlGetError12;
                    if (iGlGetError12 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glEnableVertexAttribArray(c0852.f7988);
                    int iGlGetError13 = GLES20.glGetError();
                    this.f7977 = iGlGetError13;
                    if (iGlGetError13 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glEnableVertexAttribArray(c0852.f7989);
                    int iGlGetError14 = GLES20.glGetError();
                    this.f7977 = iGlGetError14;
                    if (iGlGetError14 != 0) {
                        m1498(this.f7977);
                    }
                }
                GLES20.glDrawArrays(4, 0, c04242.f6828.f7739.capacity() / 4);
                int iGlGetError15 = GLES20.glGetError();
                this.f7977 = iGlGetError15;
                if (iGlGetError15 != 0) {
                    m1498(this.f7977);
                }
                c0424 = c04242;
            } catch (IllegalArgumentException e) {
                throw new nv(e, "(6)" + C0358.m1300());
            }
        }
        GLES20.glDisableVertexAttribArray(c0852.f8000);
        int iGlGetError16 = GLES20.glGetError();
        this.f7977 = iGlGetError16;
        if (iGlGetError16 != 0) {
            m1498(this.f7977);
        }
        GLES20.glDisableVertexAttribArray(c0852.f7988);
        int iGlGetError17 = GLES20.glGetError();
        this.f7977 = iGlGetError17;
        if (iGlGetError17 != 0) {
            m1498(this.f7977);
        }
        GLES20.glDisableVertexAttribArray(c0852.f7989);
        int iGlGetError18 = GLES20.glGetError();
        this.f7977 = iGlGetError18;
        if (iGlGetError18 != 0) {
            m1498(this.f7977);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1507(ok[] okVarArr, int i, Point point) {
        if (okVarArr == null || i <= 0) {
            return;
        }
        GLES20.glEnable(2884);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glCullFace(1028);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        C0852 c0852 = this.f7967[EnumC0853.TERRAIN.f8027];
        GLES20.glUseProgram(c0852.f8014);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        m1501(c0852);
        GLES20.glUniform2f(c0852.f8013, point.x, point.y);
        int iGlGetError4 = GLES20.glGetError();
        this.f7977 = iGlGetError4;
        if (iGlGetError4 != 0) {
            m1498(this.f7977);
        }
        for (int i2 = 0; i2 < i; i2++) {
            ok okVar = okVarArr[i2];
            if (okVar.f3338.capacity() != 0) {
                GLES20.glVertexAttribPointer(c0852.f8000, 4, 5126, false, 0, (Buffer) okVar.f3340);
                int iGlGetError5 = GLES20.glGetError();
                this.f7977 = iGlGetError5;
                if (iGlGetError5 != 0) {
                    m1498(this.f7977);
                }
                GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) okVar.f3339);
                int iGlGetError6 = GLES20.glGetError();
                this.f7977 = iGlGetError6;
                if (iGlGetError6 != 0) {
                    m1498(this.f7977);
                }
                GLES20.glEnableVertexAttribArray(c0852.f8000);
                int iGlGetError7 = GLES20.glGetError();
                this.f7977 = iGlGetError7;
                if (iGlGetError7 != 0) {
                    m1498(this.f7977);
                }
                GLES20.glEnableVertexAttribArray(c0852.f7988);
                int iGlGetError8 = GLES20.glGetError();
                this.f7977 = iGlGetError8;
                if (iGlGetError8 != 0) {
                    m1498(this.f7977);
                }
                try {
                    GLES20.glDrawElements(4, okVar.f3338.capacity(), 5123, okVar.f3338);
                    int iGlGetError9 = GLES20.glGetError();
                    this.f7977 = iGlGetError9;
                    if (iGlGetError9 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f8000);
                    int iGlGetError10 = GLES20.glGetError();
                    this.f7977 = iGlGetError10;
                    if (iGlGetError10 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f7988);
                    int iGlGetError11 = GLES20.glGetError();
                    this.f7977 = iGlGetError11;
                    if (iGlGetError11 != 0) {
                        m1498(this.f7977);
                    }
                } catch (RuntimeException e) {
                    throw new RuntimeException(String.valueOf(e.getMessage()) + " s.ib.capacity()=" + okVar.f3338.capacity() + "s.vb.capacity()=" + okVar.f3340.capacity() + "s.tb.capacity=" + okVar.f3339.capacity() + " map=" + C0358.f6669.f2063.f6887 + " hires_textures=" + oc.f3239 + " use_colormap=" + oc.f3241);
                }
            }
        }
        GLES20.glDisable(2884);
        int iGlGetError12 = GLES20.glGetError();
        this.f7977 = iGlGetError12;
        if (iGlGetError12 != 0) {
            m1498(this.f7977);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1506(C0852 c0852, Cif cif, Cif cif2) {
        GLES20.glUniform3f(c0852.f7992, 1.0f / this.f7969[cif.ordinal()].x, 1.0f / this.f7969[cif.ordinal()].y, 0.0f);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glUniform3f(c0852.f8001, 1.0f / this.f7969[cif2.ordinal()].x, 1.0f / this.f7969[cif2.ordinal()].y, this.f7969[cif2.ordinal()].x / 16);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        GLES20.glUniform1i(c0852.f7994, C0358.f6666);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1508(ok[] okVarArr, int i, lv lvVar) {
        if (lvVar == null || okVarArr == null || i <= 0) {
            return;
        }
        GLES20.glEnable(2884);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glCullFace(1028);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        C0852 c0852 = this.f7967[EnumC0853.WATER.f8027];
        GLES20.glUseProgram(c0852.f8014);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        m1501(c0852);
        GLES20.glUniform1f(c0852.f8012, (int) ((System.currentTimeMillis() / 50) % lvVar.f2035.length));
        int iGlGetError4 = GLES20.glGetError();
        this.f7977 = iGlGetError4;
        if (iGlGetError4 != 0) {
            m1498(this.f7977);
        }
        GLES20.glUniform3fv(c0852.f8006, lvVar.f2034.length / 3, lvVar.f2034, 0);
        int iGlGetError5 = GLES20.glGetError();
        this.f7977 = iGlGetError5;
        if (iGlGetError5 != 0) {
            m1498(this.f7977);
        }
        for (int i2 = 0; i2 < i; i2++) {
            ok okVar = okVarArr[i2];
            GLES20.glVertexAttribPointer(c0852.f8000, 4, 5126, false, 0, (Buffer) okVar.f3340);
            int iGlGetError6 = GLES20.glGetError();
            this.f7977 = iGlGetError6;
            if (iGlGetError6 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) okVar.f3339);
            int iGlGetError7 = GLES20.glGetError();
            this.f7977 = iGlGetError7;
            if (iGlGetError7 != 0) {
                m1498(this.f7977);
            }
            GLES20.glEnableVertexAttribArray(c0852.f8000);
            int iGlGetError8 = GLES20.glGetError();
            this.f7977 = iGlGetError8;
            if (iGlGetError8 != 0) {
                m1498(this.f7977);
            }
            GLES20.glEnableVertexAttribArray(c0852.f7988);
            int iGlGetError9 = GLES20.glGetError();
            this.f7977 = iGlGetError9;
            if (iGlGetError9 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDrawElements(4, okVar.f3338.capacity(), 5123, okVar.f3338);
            int iGlGetError10 = GLES20.glGetError();
            this.f7977 = iGlGetError10;
            if (iGlGetError10 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDisableVertexAttribArray(c0852.f8000);
            int iGlGetError11 = GLES20.glGetError();
            this.f7977 = iGlGetError11;
            if (iGlGetError11 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDisableVertexAttribArray(c0852.f7988);
            int iGlGetError12 = GLES20.glGetError();
            this.f7977 = iGlGetError12;
            if (iGlGetError12 != 0) {
                m1498(this.f7977);
            }
        }
        GLES20.glDisable(2884);
        int iGlGetError13 = GLES20.glGetError();
        this.f7977 = iGlGetError13;
        if (iGlGetError13 != 0) {
            m1498(this.f7977);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1511(iu iuVar, Cif cif, Cif cif2, boolean z) throws InterruptedException {
        if (this.f7976 == null) {
            return;
        }
        GLES20.glActiveTexture(33984);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glBindTexture(3553, this.f7976.get(cif.ordinal()));
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        if (z || iuVar.f1674.x < iuVar.f1672 || iuVar.f1674.y < iuVar.f1666) {
            try {
                GLES20.glTexImage2D(3553, 0, 6406, iuVar.f1672, iuVar.f1666, 0, 6406, 5121, null);
                int iGlGetError3 = GLES20.glGetError();
                this.f7977 = iGlGetError3;
                if (iGlGetError3 != 0) {
                    m1498(this.f7977);
                }
                for (iu.Cif cif3 : iuVar.f1673) {
                    cif3.f1687 = false;
                }
                iuVar.f1674.x = iuVar.f1672;
                iuVar.f1674.y = iuVar.f1666;
            } catch (RuntimeException e) {
                if ((iuVar.f1672 == 4096 || iuVar.f1666 == 4096) && (oc.f3239 || oc.f3241)) {
                    c_activity c_activityVar = C0358.f6674;
                    c_activityVar.mo139(new RunnableC0452(c_activityVar, "Your device doesn't support HiRes textures / Color map.\nDisable them in game settings."));
                    try {
                        Thread.sleep(5000L);
                    } catch (InterruptedException unused) {
                    }
                }
                RuntimeException runtimeException = new RuntimeException("atlas.width=" + iuVar.f1672 + "atlas.height=" + iuVar.f1666 + " map=" + C0358.f6669.f2063.f6887 + " hires_textures=" + oc.f3239);
                runtimeException.initCause(e);
                throw runtimeException;
            }
        }
        for (iu.Cif cif4 : iuVar.f1673) {
            if (z || !cif4.f1687) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(cif4.f1684 * cif4.f1685);
                byteBufferAllocate.put(cif4.f1693, 0, cif4.f1684 * cif4.f1685);
                if (cif4.f1690) {
                    byteBufferAllocate.position(0);
                    GLES20.glTexSubImage2D(3553, 0, cif4.f1689, cif4.f1688, cif4.f1684, cif4.f1685, 6406, 5121, byteBufferAllocate);
                    int iGlGetError4 = GLES20.glGetError();
                    this.f7977 = iGlGetError4;
                    if (iGlGetError4 != 0) {
                        m1498(this.f7977);
                    }
                } else {
                    byte[] bArr = new byte[cif4.f1684 * cif4.f1685];
                    int i = 0;
                    for (int i2 = 1; i2 <= cif4.f1685; i2 <<= 1) {
                        if ((i2 & cif4.f1685) != 0) {
                            int i3 = 0;
                            for (int i4 = 1; i4 <= cif4.f1684; i4 <<= 1) {
                                if ((i4 & cif4.f1684) != 0) {
                                    for (int i5 = 0; i5 < i2; i5++) {
                                        byteBufferAllocate.position(((i5 + i) * cif4.f1684) + i3);
                                        byteBufferAllocate.get(bArr, i5 * i4, i4);
                                    }
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                                    try {
                                        GLES20.glTexSubImage2D(3553, 0, cif4.f1689 + i3, cif4.f1688 + i, i4, i2, 6406, 5121, byteBufferWrap);
                                        m1497();
                                        i3 += i4;
                                    } catch (RuntimeException e2) {
                                        throw new nv(e2, "texdata fn=" + cif4.f1692 + " x=" + ((int) cif4.f1689) + " y=" + ((int) cif4.f1688) + "w=" + ((int) cif4.f1684) + "h=" + ((int) cif4.f1685) + "; block = " + i4 + "x" + i2 + " at " + i3 + "," + i + " rem=" + byteBufferWrap.remaining() + C0358.m1300());
                                    }
                                }
                            }
                            i += i2;
                        }
                    }
                }
                cif4.f1687 = true;
            }
        }
        GLES20.glActiveTexture(33985);
        int iGlGetError5 = GLES20.glGetError();
        this.f7977 = iGlGetError5;
        if (iGlGetError5 != 0) {
            m1498(this.f7977);
        }
        GLES20.glBindTexture(3553, this.f7976.get(cif2.ordinal()));
        int iGlGetError6 = GLES20.glGetError();
        this.f7977 = iGlGetError6;
        if (iGlGetError6 != 0) {
            m1498(this.f7977);
        }
        GLES20.glTexImage2D(3553, 0, 6408, iuVar.f1683 * 16, iuVar.f1680 * 16, 0, 6408, 5121, IntBuffer.wrap(iuVar.m693()));
        int iGlGetError7 = GLES20.glGetError();
        this.f7977 = iGlGetError7;
        if (iGlGetError7 != 0) {
            m1498(this.f7977);
        }
        this.f7969[cif.ordinal()] = new Point(iuVar.f1672, iuVar.f1666);
        this.f7969[cif2.ordinal()] = new Point(iuVar.f1683 * 16, iuVar.f1680 * 16);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1501(C0852 c0852) {
        GLES20.glActiveTexture(33984);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glBindTexture(3553, this.f7976.get(Cif.TERRAIN_COLORS.ordinal()));
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        GLES20.glActiveTexture(33985);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        GLES20.glBindTexture(3553, this.f7976.get(Cif.TERRAIN_PALETTES.ordinal()));
        int iGlGetError4 = GLES20.glGetError();
        this.f7977 = iGlGetError4;
        if (iGlGetError4 != 0) {
            m1498(this.f7977);
        }
        if (oc.f3241) {
            GLES20.glActiveTexture(33986);
            int iGlGetError5 = GLES20.glGetError();
            this.f7977 = iGlGetError5;
            if (iGlGetError5 != 0) {
                m1498(this.f7977);
            }
            GLES20.glBindTexture(3553, this.f7976.get(Cif.COLORMAP.ordinal()));
            int iGlGetError6 = GLES20.glGetError();
            this.f7977 = iGlGetError6;
            if (iGlGetError6 != 0) {
                m1498(this.f7977);
            }
        }
        m1506(c0852, Cif.TERRAIN_COLORS, Cif.TERRAIN_PALETTES);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private final void m1493(C0852 c0852) {
        GLES20.glActiveTexture(33984);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glBindTexture(3553, this.f7976.get(Cif.OBJECT_COLORS.ordinal()));
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        GLES20.glActiveTexture(33985);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        GLES20.glBindTexture(3553, this.f7976.get(Cif.OBJECT_PALETTES.ordinal()));
        int iGlGetError4 = GLES20.glGetError();
        this.f7977 = iGlGetError4;
        if (iGlGetError4 != 0) {
            m1498(this.f7977);
        }
        if (oc.f3241) {
            GLES20.glActiveTexture(33986);
            int iGlGetError5 = GLES20.glGetError();
            this.f7977 = iGlGetError5;
            if (iGlGetError5 != 0) {
                m1498(this.f7977);
            }
            GLES20.glBindTexture(3553, this.f7976.get(Cif.COLORMAP.ordinal()));
            int iGlGetError6 = GLES20.glGetError();
            this.f7977 = iGlGetError6;
            if (iGlGetError6 != 0) {
                m1498(this.f7977);
            }
        }
        m1506(c0852, Cif.OBJECT_COLORS, Cif.OBJECT_PALETTES);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final void m1491(C0852 c0852) {
        GLES20.glActiveTexture(33984);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glBindTexture(3553, this.f7976.get(Cif.SPRITE_COLORS.ordinal()));
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        GLES20.glActiveTexture(33985);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        GLES20.glBindTexture(3553, this.f7976.get(Cif.SPRITE_PALETTES.ordinal()));
        int iGlGetError4 = GLES20.glGetError();
        this.f7977 = iGlGetError4;
        if (iGlGetError4 != 0) {
            m1498(this.f7977);
        }
        m1506(c0852, Cif.SPRITE_COLORS, Cif.SPRITE_PALETTES);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static int m1495(int i, int i2, Point point, byte[] bArr, int[] iArr) {
        Buffer bufferWrap;
        int i3;
        if (point == null) {
            point = new Point();
        }
        point.x = pa.m963(i);
        point.y = pa.m963(i2);
        if (bArr != null) {
            if (i != point.x || i2 != point.y) {
                byte[] bArr2 = new byte[point.x * point.y];
                for (int i4 = 0; i4 < point.y; i4++) {
                    for (int i5 = 0; i5 < point.x; i5++) {
                        if (i5 < i && i4 < i2) {
                            bArr2[(point.x * i4) + i5] = bArr[(i4 * i) + i5];
                        }
                    }
                }
                bArr = bArr2;
            }
            bufferWrap = ByteBuffer.wrap(bArr);
            i3 = 6406;
        } else if (iArr != null) {
            bufferWrap = IntBuffer.wrap(iArr);
            i3 = 6408;
        } else {
            nz.m907("Attempt to create texture for already released frame.");
            return 0;
        }
        IntBuffer intBufferAllocate = IntBuffer.allocate(1);
        GLES20.glGenTextures(1, intBufferAllocate);
        m1497();
        int i6 = intBufferAllocate.get(0);
        GLES20.glBindTexture(3553, i6);
        m1497();
        GLES20.glTexParameteri(3553, 10241, 9728);
        m1497();
        GLES20.glTexParameteri(3553, 10240, 9728);
        m1497();
        GLES20.glTexImage2D(3553, 0, i3, point.x, point.y, 0, i3, 5121, bufferWrap);
        m1497();
        return i6;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1504(C0852 c0852, hs.C0049.C0050 c0050, ou ouVar, C0753 c0753, float f) {
        GLES20.glUniform4f(c0852.f7993, ouVar.f3378, ouVar.f3377, ouVar.f3376, ouVar.f3379);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glUniform1f(c0852.f8009, f);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        try {
            GLES20.glUniformMatrix4fv(c0852.f8004, 1, false, c0753.f7745, 0);
            int iGlGetError3 = GLES20.glGetError();
            this.f7977 = iGlGetError3;
            if (iGlGetError3 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f8000, 4, 5126, false, 0, (Buffer) c0050.f1532);
            int iGlGetError4 = GLES20.glGetError();
            this.f7977 = iGlGetError4;
            if (iGlGetError4 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) c0050.f1531);
            int iGlGetError5 = GLES20.glGetError();
            this.f7977 = iGlGetError5;
            if (iGlGetError5 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f7990, 4, 5121, false, 0, (Buffer) c0050.f1534);
            int iGlGetError6 = GLES20.glGetError();
            this.f7977 = iGlGetError6;
            if (iGlGetError6 != 0) {
                m1498(this.f7977);
            }
            for (int i = 0; i < c0050.f1528.size(); i++) {
                oh ohVar = c0050.f1528.get(i);
                if (ohVar != null && ohVar.f3297 != null) {
                    GLES20.glActiveTexture(33984);
                    int iGlGetError7 = GLES20.glGetError();
                    this.f7977 = iGlGetError7;
                    if (iGlGetError7 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glBindTexture(3553, ohVar.f3297.m629());
                    int iGlGetError8 = GLES20.glGetError();
                    this.f7977 = iGlGetError8;
                    if (iGlGetError8 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glActiveTexture(33985);
                    int iGlGetError9 = GLES20.glGetError();
                    this.f7977 = iGlGetError9;
                    if (iGlGetError9 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glBindTexture(3553, ohVar.f3296 == null ? ohVar.f3297.m628() : ohVar.f3296.m546());
                    int iGlGetError10 = GLES20.glGetError();
                    this.f7977 = iGlGetError10;
                    if (iGlGetError10 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glUniform3f(c0852.f7992, 1.0f / ohVar.f3297.f1515.x, 1.0f / ohVar.f3297.f1515.y, 0.0f);
                    int iGlGetError11 = GLES20.glGetError();
                    this.f7977 = iGlGetError11;
                    if (iGlGetError11 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glUniform3f(c0852.f8001, 0.0625f, 0.0625f, 1.0f);
                    int iGlGetError12 = GLES20.glGetError();
                    this.f7977 = iGlGetError12;
                    if (iGlGetError12 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glEnableVertexAttribArray(c0852.f8000);
                    int iGlGetError13 = GLES20.glGetError();
                    this.f7977 = iGlGetError13;
                    if (iGlGetError13 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glEnableVertexAttribArray(c0852.f7988);
                    int iGlGetError14 = GLES20.glGetError();
                    this.f7977 = iGlGetError14;
                    if (iGlGetError14 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glEnableVertexAttribArray(c0852.f7990);
                    int iGlGetError15 = GLES20.glGetError();
                    this.f7977 = iGlGetError15;
                    if (iGlGetError15 != 0) {
                        m1498(this.f7977);
                    }
                    c0050.f1533.position(i * 6);
                    GLES20.glDrawElements(4, 6, 5123, c0050.f1533);
                    int iGlGetError16 = GLES20.glGetError();
                    this.f7977 = iGlGetError16;
                    if (iGlGetError16 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f8000);
                    int iGlGetError17 = GLES20.glGetError();
                    this.f7977 = iGlGetError17;
                    if (iGlGetError17 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f7988);
                    int iGlGetError18 = GLES20.glGetError();
                    this.f7977 = iGlGetError18;
                    if (iGlGetError18 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f7990);
                    int iGlGetError19 = GLES20.glGetError();
                    this.f7977 = iGlGetError19;
                    if (iGlGetError19 != 0) {
                        m1498(this.f7977);
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw new nv(e, "(8)" + C0358.m1300());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1505(C0852 c0852, C0787 c0787) {
        m1504(c0852, c0787.f7832, c0787.f7840 ? f7961 : c0787.f7834, c0787.f7824, c0787.f7825);
        if (c0787.f7828 != null) {
            m1504(c0852, c0787.f7828, c0787.f7834, c0787.f7841, c0787.f7825);
        }
        if (c0787.f7837 != null) {
            m1504(c0852, c0787.f7837, f7962, c0787.f7842, c0787.f7825);
        }
        if (c0787.f7836 != null) {
            m1504(c0852, c0787.f7836, c0787.f7840 ? f7961 : c0787.f7834, c0787.f7839, c0787.f7829);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1510(C0787[] c0787Arr) {
        if (c0787Arr == null) {
            return;
        }
        C0852 c0852 = this.f7967[EnumC0853.SPRITE.f8027];
        GLES20.glUseProgram(c0852.f8014);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        for (C0787 c0787 : c0787Arr) {
            if (c0787.f7843.f2075 != mc.EnumC0062.SCREEN && c0787.f7834.f3379 == 1.0f) {
                m1505(c0852, c0787);
            }
        }
        for (C0787 c07872 : c0787Arr) {
            if (c07872.f7843.f2075 != mc.EnumC0062.SCREEN && c07872.f7834.f3379 != 1.0f) {
                m1505(c0852, c07872);
            }
        }
        GLES20.glDepthFunc(519);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        for (C0787 c07873 : c0787Arr) {
            if (c07873.f7831 != null) {
                m1504(c0852, c07873.f7831, c07873.f7830, c07873.f7844, c07873.f7825);
            }
        }
        C0852 c08522 = this.f7967[EnumC0853.SPRITE2D.f8027];
        GLES20.glUseProgram(c08522.f8014);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        for (C0787 c07874 : c0787Arr) {
            if (c07874.f7843.f2075 == mc.EnumC0062.SCREEN) {
                hs.C0049.C0050 c0050 = c07874.f7832;
                ou ouVar = c07874.f7834;
                C0753 c0753 = c07874.f7824;
                GLES20.glUniform4f(c08522.f7993, ouVar.f3378, ouVar.f3377, ouVar.f3376, ouVar.f3379);
                int iGlGetError4 = GLES20.glGetError();
                this.f7977 = iGlGetError4;
                if (iGlGetError4 != 0) {
                    m1498(this.f7977);
                }
                try {
                    GLES20.glUniformMatrix4fv(c08522.f8004, 1, false, c0753.f7745, 0);
                    int iGlGetError5 = GLES20.glGetError();
                    this.f7977 = iGlGetError5;
                    if (iGlGetError5 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glVertexAttribPointer(c08522.f8000, 4, 5126, false, 0, (Buffer) c0050.f1532);
                    int iGlGetError6 = GLES20.glGetError();
                    this.f7977 = iGlGetError6;
                    if (iGlGetError6 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glVertexAttribPointer(c08522.f7988, 4, 5126, false, 0, (Buffer) c0050.f1531);
                    int iGlGetError7 = GLES20.glGetError();
                    this.f7977 = iGlGetError7;
                    if (iGlGetError7 != 0) {
                        m1498(this.f7977);
                    }
                    for (int i = 0; i < c0050.f1528.size(); i++) {
                        oh ohVar = c0050.f1528.get(i);
                        if (ohVar != null && ohVar.f3297 != null) {
                            GLES20.glActiveTexture(33984);
                            int iGlGetError8 = GLES20.glGetError();
                            this.f7977 = iGlGetError8;
                            if (iGlGetError8 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glBindTexture(3553, ohVar.f3297.m629());
                            int iGlGetError9 = GLES20.glGetError();
                            this.f7977 = iGlGetError9;
                            if (iGlGetError9 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glActiveTexture(33985);
                            int iGlGetError10 = GLES20.glGetError();
                            this.f7977 = iGlGetError10;
                            if (iGlGetError10 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glBindTexture(3553, ohVar.f3296 == null ? ohVar.f3297.m628() : ohVar.f3296.m546());
                            int iGlGetError11 = GLES20.glGetError();
                            this.f7977 = iGlGetError11;
                            if (iGlGetError11 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glUniform3f(c08522.f7992, 1.0f / ohVar.f3297.f1515.x, 1.0f / ohVar.f3297.f1515.y, 0.0f);
                            int iGlGetError12 = GLES20.glGetError();
                            this.f7977 = iGlGetError12;
                            if (iGlGetError12 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glUniform3f(c08522.f8001, 0.0625f, 0.0625f, 1.0f);
                            int iGlGetError13 = GLES20.glGetError();
                            this.f7977 = iGlGetError13;
                            if (iGlGetError13 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glEnableVertexAttribArray(c08522.f8000);
                            int iGlGetError14 = GLES20.glGetError();
                            this.f7977 = iGlGetError14;
                            if (iGlGetError14 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glEnableVertexAttribArray(c08522.f7988);
                            int iGlGetError15 = GLES20.glGetError();
                            this.f7977 = iGlGetError15;
                            if (iGlGetError15 != 0) {
                                m1498(this.f7977);
                            }
                            c0050.f1533.position(i * 6);
                            GLES20.glDrawElements(4, 6, 5123, c0050.f1533);
                            int iGlGetError16 = GLES20.glGetError();
                            this.f7977 = iGlGetError16;
                            if (iGlGetError16 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glDisableVertexAttribArray(c08522.f8000);
                            int iGlGetError17 = GLES20.glGetError();
                            this.f7977 = iGlGetError17;
                            if (iGlGetError17 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glDisableVertexAttribArray(c08522.f7988);
                            int iGlGetError18 = GLES20.glGetError();
                            this.f7977 = iGlGetError18;
                            if (iGlGetError18 != 0) {
                                m1498(this.f7977);
                            }
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw new nv(e, "(9)" + C0358.m1300());
                }
            }
        }
        GLES20.glDepthFunc(515);
        int iGlGetError19 = GLES20.glGetError();
        this.f7977 = iGlGetError19;
        if (iGlGetError19 != 0) {
            m1498(this.f7977);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1502(C0852 c0852, ci ciVar) {
        float[] fArr;
        if (ciVar.f949 == null || (fArr = ciVar.f949.f7745) == null) {
            return;
        }
        try {
            GLES20.glUniformMatrix4fv(c0852.f8004, 1, false, fArr, 0);
            int iGlGetError = GLES20.glGetError();
            this.f7977 = iGlGetError;
            if (iGlGetError != 0) {
                m1498(this.f7977);
            }
            GLES20.glUniform4f(c0852.f7993, ciVar.f944.f3378, ciVar.f944.f3377, ciVar.f944.f3376, ciVar.f944.f3379);
            int iGlGetError2 = GLES20.glGetError();
            this.f7977 = iGlGetError2;
            if (iGlGetError2 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f8000, 3, 5126, false, 0, (Buffer) ciVar.f948);
            int iGlGetError3 = GLES20.glGetError();
            this.f7977 = iGlGetError3;
            if (iGlGetError3 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) ciVar.f950);
            int iGlGetError4 = GLES20.glGetError();
            this.f7977 = iGlGetError4;
            if (iGlGetError4 != 0) {
                m1498(this.f7977);
            }
            GLES20.glEnableVertexAttribArray(c0852.f8000);
            int iGlGetError5 = GLES20.glGetError();
            this.f7977 = iGlGetError5;
            if (iGlGetError5 != 0) {
                m1498(this.f7977);
            }
            GLES20.glEnableVertexAttribArray(c0852.f7988);
            int iGlGetError6 = GLES20.glGetError();
            this.f7977 = iGlGetError6;
            if (iGlGetError6 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDrawElements(4, ciVar.f947.capacity(), 5123, ciVar.f947);
            int iGlGetError7 = GLES20.glGetError();
            this.f7977 = iGlGetError7;
            if (iGlGetError7 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDisableVertexAttribArray(c0852.f8000);
            int iGlGetError8 = GLES20.glGetError();
            this.f7977 = iGlGetError8;
            if (iGlGetError8 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDisableVertexAttribArray(c0852.f7988);
            int iGlGetError9 = GLES20.glGetError();
            this.f7977 = iGlGetError9;
            if (iGlGetError9 != 0) {
                m1498(this.f7977);
            }
        } catch (IllegalArgumentException e) {
            throw new nv(e, "(1)" + C0358.m1300());
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m1494(C0787[] c0787Arr) {
        if (c0787Arr == null) {
            return;
        }
        GLES20.glDepthFunc(519);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        C0852 c0852 = this.f7967[EnumC0853.SPRITE2D.f8027];
        GLES20.glUseProgram(c0852.f8014);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        m1491(c0852);
        for (C0787 c0787 : c0787Arr) {
            if (c0787.f7826 != null) {
                m1502(c0852, c0787.f7826);
            }
            if (c0787.f7827 != null) {
                m1502(c0852, c0787.f7827);
            }
            if (c0787.f7835 != null) {
                m1502(c0852, c0787.f7835);
            }
            if (c0787.f7838 != null) {
                m1502(c0852, c0787.f7838);
            }
            if (c0787.f7833 != null) {
                m1502(c0852, c0787.f7833);
            }
        }
        GLES20.glDepthFunc(515);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1503(C0852 c0852, co coVar) {
        try {
            GLES20.glUniformMatrix4fv(c0852.f8004, 1, false, coVar.f949.f7745, 0);
            int iGlGetError = GLES20.glGetError();
            this.f7977 = iGlGetError;
            if (iGlGetError != 0) {
                m1498(this.f7977);
            }
            GLES20.glUniform4f(c0852.f7993, coVar.f944.f3378, coVar.f944.f3377, coVar.f944.f3376, coVar.f944.f3379);
            int iGlGetError2 = GLES20.glGetError();
            this.f7977 = iGlGetError2;
            if (iGlGetError2 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f8000, 3, 5126, false, 0, (Buffer) coVar.f948);
            int iGlGetError3 = GLES20.glGetError();
            this.f7977 = iGlGetError3;
            if (iGlGetError3 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) coVar.f950);
            int iGlGetError4 = GLES20.glGetError();
            this.f7977 = iGlGetError4;
            if (iGlGetError4 != 0) {
                m1498(this.f7977);
            }
            GLES20.glEnableVertexAttribArray(c0852.f8000);
            int iGlGetError5 = GLES20.glGetError();
            this.f7977 = iGlGetError5;
            if (iGlGetError5 != 0) {
                m1498(this.f7977);
            }
            GLES20.glEnableVertexAttribArray(c0852.f7988);
            int iGlGetError6 = GLES20.glGetError();
            this.f7977 = iGlGetError6;
            if (iGlGetError6 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDrawElements(4, coVar.f947.capacity(), 5123, coVar.f947);
            int iGlGetError7 = GLES20.glGetError();
            this.f7977 = iGlGetError7;
            if (iGlGetError7 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDisableVertexAttribArray(c0852.f8000);
            int iGlGetError8 = GLES20.glGetError();
            this.f7977 = iGlGetError8;
            if (iGlGetError8 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDisableVertexAttribArray(c0852.f7988);
            int iGlGetError9 = GLES20.glGetError();
            this.f7977 = iGlGetError9;
            if (iGlGetError9 != 0) {
                m1498(this.f7977);
            }
        } catch (IllegalArgumentException e) {
            throw new nv(e, "(2)" + C0358.m1300());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1500(C0539 c0539) {
        GLES20.glDepthFunc(519);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        C0852 c0852 = this.f7967[EnumC0853.SPRITE2D.f8027];
        GLES20.glUseProgram(c0852.f8014);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        m1493(c0852);
        try {
            GLES20.glUniformMatrix4fv(c0852.f8004, 1, false, c0539.f949.f7745, 0);
            int iGlGetError3 = GLES20.glGetError();
            this.f7977 = iGlGetError3;
            if (iGlGetError3 != 0) {
                m1498(this.f7977);
            }
            GLES20.glUniform4f(c0852.f7993, c0539.f944.f3378, c0539.f944.f3377, c0539.f944.f3376, c0539.f944.f3379);
            int iGlGetError4 = GLES20.glGetError();
            this.f7977 = iGlGetError4;
            if (iGlGetError4 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f8000, 3, 5126, false, 0, (Buffer) c0539.f948);
            int iGlGetError5 = GLES20.glGetError();
            this.f7977 = iGlGetError5;
            if (iGlGetError5 != 0) {
                m1498(this.f7977);
            }
            GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) c0539.f950);
            int iGlGetError6 = GLES20.glGetError();
            this.f7977 = iGlGetError6;
            if (iGlGetError6 != 0) {
                m1498(this.f7977);
            }
            GLES20.glEnableVertexAttribArray(c0852.f8000);
            int iGlGetError7 = GLES20.glGetError();
            this.f7977 = iGlGetError7;
            if (iGlGetError7 != 0) {
                m1498(this.f7977);
            }
            GLES20.glEnableVertexAttribArray(c0852.f7988);
            int iGlGetError8 = GLES20.glGetError();
            this.f7977 = iGlGetError8;
            if (iGlGetError8 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDrawElements(4, c0539.f947.capacity(), 5123, c0539.f947);
            int iGlGetError9 = GLES20.glGetError();
            this.f7977 = iGlGetError9;
            if (iGlGetError9 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDisableVertexAttribArray(c0852.f8000);
            int iGlGetError10 = GLES20.glGetError();
            this.f7977 = iGlGetError10;
            if (iGlGetError10 != 0) {
                m1498(this.f7977);
            }
            GLES20.glDisableVertexAttribArray(c0852.f7988);
            int iGlGetError11 = GLES20.glGetError();
            this.f7977 = iGlGetError11;
            if (iGlGetError11 != 0) {
                m1498(this.f7977);
            }
            m1503(c0852, c0539.f7257);
            m1491(c0852);
            for (Map.Entry<Integer, C0413> entry : c0539.f7256.entrySet()) {
                if (c0539.f7255.get(entry.getKey()) == null) {
                    m1503(c0852, entry.getValue());
                }
            }
            Iterator<ar> it = c0539.f7255.values().iterator();
            while (it.hasNext()) {
                m1503(c0852, it.next());
            }
            GLES20.glDepthFunc(515);
            int iGlGetError12 = GLES20.glGetError();
            this.f7977 = iGlGetError12;
            if (iGlGetError12 != 0) {
                m1498(this.f7977);
            }
        } catch (IllegalArgumentException e) {
            throw new nv(e, "(3)" + C0358.m1300());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1499(LinkedList<C1106> linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            return;
        }
        GLES20.glDepthFunc(519);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        C0852 c0852 = this.f7967[EnumC0853.SPRITE2D.f8027];
        GLES20.glUseProgram(c0852.f8014);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        m1491(c0852);
        Iterator<C1106> it = linkedList.iterator();
        while (it.hasNext()) {
            C1106 next = it.next();
            if ((next.f949 != null ? next.f949.f7745 : null) != null) {
                try {
                    GLES20.glUniformMatrix4fv(c0852.f8004, 1, false, next.f949.f7745, 0);
                    int iGlGetError3 = GLES20.glGetError();
                    this.f7977 = iGlGetError3;
                    if (iGlGetError3 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glUniform4f(c0852.f7993, next.f944.f3378, next.f944.f3377, next.f944.f3376, next.f944.f3379);
                    int iGlGetError4 = GLES20.glGetError();
                    this.f7977 = iGlGetError4;
                    if (iGlGetError4 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glVertexAttribPointer(c0852.f8000, 3, 5126, false, 0, (Buffer) next.f948);
                    int iGlGetError5 = GLES20.glGetError();
                    this.f7977 = iGlGetError5;
                    if (iGlGetError5 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) next.f950);
                    int iGlGetError6 = GLES20.glGetError();
                    this.f7977 = iGlGetError6;
                    if (iGlGetError6 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glEnableVertexAttribArray(c0852.f8000);
                    int iGlGetError7 = GLES20.glGetError();
                    this.f7977 = iGlGetError7;
                    if (iGlGetError7 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glEnableVertexAttribArray(c0852.f7988);
                    int iGlGetError8 = GLES20.glGetError();
                    this.f7977 = iGlGetError8;
                    if (iGlGetError8 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDrawElements(4, next.f947.capacity(), 5123, next.f947);
                    int iGlGetError9 = GLES20.glGetError();
                    this.f7977 = iGlGetError9;
                    if (iGlGetError9 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f8000);
                    int iGlGetError10 = GLES20.glGetError();
                    this.f7977 = iGlGetError10;
                    if (iGlGetError10 != 0) {
                        m1498(this.f7977);
                    }
                    GLES20.glDisableVertexAttribArray(c0852.f7988);
                    int iGlGetError11 = GLES20.glGetError();
                    this.f7977 = iGlGetError11;
                    if (iGlGetError11 != 0) {
                        m1498(this.f7977);
                    }
                } catch (IllegalArgumentException e) {
                    throw new nv(e, "(4)" + C0358.m1300());
                }
            }
        }
        GLES20.glDepthFunc(515);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private void m1492(C0787[] c0787Arr) {
        C0852 c0852;
        C0852 c08522;
        float fSin;
        boolean z;
        float fTan;
        float f;
        float f2;
        if (c0787Arr == null || c0787Arr.length <= 0) {
            return;
        }
        GLES20.glDepthFunc(515);
        int iGlGetError = GLES20.glGetError();
        this.f7977 = iGlGetError;
        if (iGlGetError != 0) {
            m1498(this.f7977);
        }
        GLES20.glEnable(2929);
        int iGlGetError2 = GLES20.glGetError();
        this.f7977 = iGlGetError2;
        if (iGlGetError2 != 0) {
            m1498(this.f7977);
        }
        GLES20.glEnable(3042);
        int iGlGetError3 = GLES20.glGetError();
        this.f7977 = iGlGetError3;
        if (iGlGetError3 != 0) {
            m1498(this.f7977);
        }
        for (C0787 c0787 : c0787Arr) {
            if (mj.class.isAssignableFrom(c0787.f7843.getClass())) {
                mj mjVar = (mj) c0787.f7843;
                synchronized (mjVar.f2127) {
                    boolean z2 = false;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Iterator<C0933> it = mjVar.f2127.iterator();
                    while (it.hasNext()) {
                        C0933 next = it.next();
                        if (jCurrentTimeMillis - next.f8229 >= 0) {
                            boolean z3 = false;
                            if (next.f8230 != null && (c08522 = this.f7967[EnumC0853.EFFECT_PRIM.f8027]) != null) {
                                GLES20.glUseProgram(c08522.f8014);
                                m1497();
                                m1491(c08522);
                                Iterator<C0995> it2 = next.f8230.iterator();
                                while (it2.hasNext()) {
                                    C0995 next2 = it2.next();
                                    long j = jCurrentTimeMillis - next2.f8439;
                                    float f3 = j / next2.f8438;
                                    float f4 = 0.0f;
                                    float f5 = 0.0f;
                                    if (f3 > 1.0f) {
                                        z = false;
                                    } else {
                                        lr lrVarM1544 = next2.f8437 != null ? next2.f8437 : next2.f8452 != null ? next2.f8452.m1544() : new lr(0.0f, 0.0f, 0.0f);
                                        next2.f8448.f8459[0] = lrVarM1544.f2020 + next2.f8446.f2020;
                                        next2.f8448.f8459[1] = lrVarM1544.f2019 + next2.f8446.f2019;
                                        next2.f8448.f8459[2] = lrVarM1544.f2018 + next2.f8446.f2018;
                                        C0995.C0996 c0996 = next2.f8448;
                                        C0753 c0753 = new C0753();
                                        Matrix.setIdentityM(c0753.f7745, 0);
                                        c0996.f8461 = c0753;
                                        if (next2.f8442[0] != null) {
                                            C0753 c07532 = next2.f8448.f8461;
                                            C0995.Cif cif = next2.f8442[0];
                                            f5 = (cif.f8457[0] + (cif.f8457[1] * f3) + (cif.f8457[2] * f3 * f3)) * 0.017453292f;
                                            c07532.m1453(f5);
                                        }
                                        C0995.C0996 c09962 = next2.f8448;
                                        C0753 c07533 = new C0753();
                                        Matrix.setIdentityM(c07533.f7745, 0);
                                        c09962.f8464 = c07533;
                                        if (next2.f8442[1] != null) {
                                            C0753 c07534 = next2.f8448.f8464;
                                            C0995.Cif cif2 = next2.f8442[1];
                                            c07534.m1454((cif2.f8457[0] + (cif2.f8457[1] * f3) + (cif2.f8457[2] * f3 * f3)) * 0.017453292f);
                                        }
                                        if (next2.f8442[2] != null) {
                                            C0753 c07535 = next2.f8448.f8464;
                                            C0995.Cif cif3 = next2.f8442[2];
                                            c07535.m1455((cif3.f8457[0] + (cif3.f8457[1] * f3) + (cif3.f8457[2] * f3 * f3)) * 0.017453292f);
                                        }
                                        if (next2.f8442[3] != null) {
                                            C0753 c07536 = next2.f8448.f8464;
                                            C0995.Cif cif4 = next2.f8442[3];
                                            c07536.m1453((cif4.f8457[0] + (cif4.f8457[1] * f3) + (cif4.f8457[2] * f3 * f3)) * 0.017453292f);
                                        }
                                        if (next2.f8447 == 0.0f || next2.f8453[3] == null) {
                                            fSin = 0.0f;
                                        } else {
                                            C0995.Cif cif5 = next2.f8453[3];
                                            fSin = FloatMath.sin((cif5.f8457[0] + (cif5.f8457[1] * f3) + (cif5.f8457[2] * f3 * f3)) * 0.017453292f) * next2.f8447;
                                        }
                                        for (int i = 0; i < 3; i++) {
                                            float[] fArr = next2.f8448.f8458;
                                            if (next2.f8433[i] == null) {
                                                f = 0.0f;
                                            } else {
                                                C0995.Cif cif6 = next2.f8433[i];
                                                f = (cif6.f8457[0] + (cif6.f8457[1] * f3) + (cif6.f8457[2] * f3 * f3)) * next2.f8435;
                                            }
                                            fArr[i] = f;
                                            float[] fArr2 = next2.f8448.f8460;
                                            if (next2.f8453[i] == null) {
                                                f2 = 0.0f;
                                            } else {
                                                C0995.Cif cif7 = next2.f8453[i];
                                                f2 = cif7.f8457[0] + (cif7.f8457[1] * f3) + (cif7.f8457[2] * f3 * f3);
                                            }
                                            fArr2[i] = (fSin + f2) * next2.f8435;
                                        }
                                        if (next2.f8433[3] != null) {
                                            C0995.Cif cif8 = next2.f8433[3];
                                            f4 = cif8.f8457[0] + (cif8.f8457[1] * f3) + (cif8.f8457[2] * f3 * f3);
                                        }
                                        if (next2.f8434 != null) {
                                            for (int i2 = 0; i2 < next2.f8434.length; i2++) {
                                                next2.f8448.f8462[i2] = next2.f8434[i2];
                                            }
                                        }
                                        next2.f8448.f8462[3] = next2.f8454;
                                        if (f3 < next2.f8444) {
                                            next2.f8448.f8462[3] = (next2.f8454 * f3) / next2.f8444;
                                        } else if (1.0f - f3 < next2.f8450) {
                                            next2.f8448.f8462[3] = (next2.f8454 * (1.0f - f3)) / next2.f8450;
                                        }
                                        if (next2.f8455 != null) {
                                            if (next2.f8455.f1503 == hr.Cif.EXT_SPR) {
                                                float f6 = f4;
                                                ud.C0086 c0086 = next2.f8455.f1504.f5018[0];
                                                int length = (int) (j / c0086.f5027);
                                                if (length >= c0086.f5028.length) {
                                                    length = c0086.f5028.length - 1;
                                                }
                                                int length2 = c0086.f5028[length].f5033.length;
                                                if (next2.f8445 != null) {
                                                    for (C0995.C0996 c09963 : next2.f8445) {
                                                        if (c09963 != null && j - c09963.f8467 < next2.f8451) {
                                                            length2++;
                                                        }
                                                    }
                                                }
                                                C0995.C0996[] c0996Arr = new C0995.C0996[length2];
                                                int i3 = 0;
                                                for (ud.C0086.C0087.Cif cif9 : c0086.f5028[length].f5033) {
                                                    C0995.C0996 c09964 = next2.new C0996(next2.f8448);
                                                    c09964.f8467 = j;
                                                    c09964.f8463 = cif9.f5045 > 0 ? next2.f8455.f1501[cif9.f5044] : next2.f8455.f1500[cif9.f5044];
                                                    float[] fArr3 = c09964.f8460;
                                                    fArr3[0] = fArr3[0] * cif9.f5038 * c09964.f8463.f1513 * (cif9.f5042 != 0 ? -1 : 1);
                                                    float[] fArr4 = c09964.f8460;
                                                    fArr4[1] = fArr4[1] * cif9.f5039 * c09964.f8463.f1514;
                                                    if (cif9.f5040 > 0) {
                                                        c09964.f8461.m1453(cif9.f5040 * 0.017453292f);
                                                    }
                                                    float[] fArr5 = c09964.f8459;
                                                    fArr5[0] = fArr5[0] + c09964.f8458[0] + (c09964.f8464.f7745[4] * f6);
                                                    float[] fArr6 = c09964.f8459;
                                                    fArr6[1] = fArr6[1] + c09964.f8458[1] + (c09964.f8464.f7745[5] * f6);
                                                    float[] fArr7 = c09964.f8459;
                                                    fArr7[2] = fArr7[2] + c09964.f8458[2] + (c09964.f8464.f7745[6] * f6);
                                                    c09964.f8458[0] = cif9.f5049;
                                                    c09964.f8458[1] = cif9.f5047;
                                                    c09964.f8458[2] = 0.0f;
                                                    for (int i4 = 0; i4 < 4; i4++) {
                                                        float[] fArr8 = c09964.f8462;
                                                        fArr8[i4] = fArr8[i4] * (((cif9.f5037 >> (i4 << 3)) & 255) / 255.0f);
                                                    }
                                                    int i5 = i3;
                                                    i3++;
                                                    c0996Arr[i5] = c09964;
                                                }
                                                if (next2.f8445 != null) {
                                                    for (C0995.C0996 c09965 : next2.f8445) {
                                                        if (c09965 != null && j - c09965.f8467 < next2.f8451) {
                                                            float f7 = (j - c09965.f8467) / next2.f8451;
                                                            float f8 = (2.0f - f7) / (2.0f - c09965.f8466);
                                                            for (int i6 = 0; i6 < 4; i6++) {
                                                                float[] fArr9 = c09965.f8460;
                                                                fArr9[i6] = fArr9[i6] * f8;
                                                            }
                                                            float[] fArr10 = c09965.f8462;
                                                            fArr10[3] = fArr10[3] * ((1.0f - f7) / (1.0f - c09965.f8466));
                                                            c09965.f8466 = f7;
                                                            int i7 = i3;
                                                            i3++;
                                                            c0996Arr[i7] = c09965;
                                                        }
                                                    }
                                                }
                                                next2.f8445 = c0996Arr;
                                            } else {
                                                next2.f8448.f8463 = next2.f8455.f1500[0];
                                            }
                                        }
                                        float f9 = f4 * next2.f8435;
                                        switch (C0995.m1573()[next2.f8436.ordinal()]) {
                                            case 1:
                                            case 2:
                                                next2.f8448.f8458[0] = (float) (r0[0] - (f9 * Math.sin(f5)));
                                                next2.f8448.f8458[1] = (float) (r0[1] + (f9 * Math.cos(f5)));
                                                break;
                                            case 4:
                                                float[] fArr11 = next2.f8448.f8460;
                                                float[] fArr12 = next2.f8448.f8460;
                                                float f10 = f9 > next2.f8448.f8460[0] ? f9 - next2.f8448.f8460[0] : 0.0f;
                                                fArr12[1] = f10;
                                                fArr11[0] = f10;
                                                float[] fArr13 = next2.f8448.f8460;
                                                next2.f8448.f8460[3] = f9;
                                                fArr13[2] = f9;
                                                break;
                                            case 5:
                                                float[] fArr14 = next2.f8448.f8460;
                                                if (next2.f8453[3] == null) {
                                                    fTan = 0.0f;
                                                } else {
                                                    C0995.Cif cif10 = next2.f8453[3];
                                                    fTan = ((float) Math.tan((cif10.f8457[0] + (cif10.f8457[1] * f3) + (cif10.f8457[2] * f3 * f3)) * 0.017453292f)) * 2.0f * next2.f8448.f8460[1];
                                                }
                                                fArr14[0] = fTan;
                                                break;
                                            case 7:
                                                float[] fArr15 = next2.f8448.f8460;
                                                float[] fArr16 = next2.f8448.f8460;
                                                float f11 = f9 > next2.f8448.f8460[0] ? f9 - next2.f8448.f8460[0] : 0.0f;
                                                fArr16[3] = f11;
                                                fArr15[2] = f11;
                                                float[] fArr17 = next2.f8448.f8460;
                                                next2.f8448.f8460[1] = f9;
                                                fArr17[0] = f9;
                                                break;
                                        }
                                        z = true;
                                    }
                                    if (!z) {
                                        next2.m1576();
                                    } else {
                                        z3 = true;
                                        if (next2.f8455 != null) {
                                            GLES20.glDepthFunc(515);
                                            m1497();
                                            GLES20.glEnable(2929);
                                            m1497();
                                            GLES20.glUniform1f(c08522.f7998, next2.f8443);
                                            m1497();
                                            GLES20.glUniform1f(c08522.f8010, next2.f8432 ? 1 : 0);
                                            m1497();
                                            GLES20.glUniform1f(c08522.f7999, next2.f8449);
                                            m1497();
                                            GLES20.glBlendFunc(770, next2.f8430 ? 1 : 771);
                                            m1497();
                                            GLES20.glVertexAttribPointer(c08522.f8000, 3, 5126, false, 0, (Buffer) C0995.f8428);
                                            m1497();
                                            GLES20.glVertexAttribPointer(c08522.f7988, 3, 5126, false, 0, (Buffer) C0995.f8427);
                                            m1497();
                                            GLES20.glEnableVertexAttribArray(c08522.f8000);
                                            m1497();
                                            GLES20.glEnableVertexAttribArray(c08522.f7988);
                                            m1497();
                                            if (next2.f8431) {
                                                GLES20.glDisable(2929);
                                                m1497();
                                            }
                                            for (C0995.C0996 c09966 : next2.f8445) {
                                                if (c09966 != null && c09966.f8462 != null) {
                                                    GLES20.glUniform4fv(c08522.f7993, 1, c09966.f8462, 0);
                                                    m1497();
                                                    GLES20.glActiveTexture(33984);
                                                    m1497();
                                                    GLES20.glBindTexture(3553, c09966.f8463.m629());
                                                    m1497();
                                                    GLES20.glUniform3f(c08522.f7992, 1.0f / c09966.f8463.f1515.x, 1.0f / c09966.f8463.f1515.y, 0.0f);
                                                    m1497();
                                                    GLES20.glUniform4f(c08522.f8006, c09966.f8463.f1513, c09966.f8463.f1514, 0.0f, 0.0f);
                                                    m1497();
                                                    GLES20.glActiveTexture(33985);
                                                    m1497();
                                                    GLES20.glBindTexture(3553, c09966.f8463.m628());
                                                    m1497();
                                                    GLES20.glUniform3f(c08522.f8001, 0.0625f, 0.0625f, 1.0f);
                                                    m1497();
                                                    GLES20.glUniform4fv(c08522.f8005, 1, c09966.f8460, 0);
                                                    m1497();
                                                    GLES20.glUniform3fv(c08522.f7996, 1, c09966.f8458, 0);
                                                    m1497();
                                                    GLES20.glUniform4fv(c08522.f7997, 1, c09966.f8459, 0);
                                                    m1497();
                                                    GLES20.glUniformMatrix4fv(c08522.f8015, 1, false, c09966.f8461.f7745, 0);
                                                    m1497();
                                                    GLES20.glUniformMatrix4fv(c08522.f8004, 1, false, c09966.f8464.f7745, 0);
                                                    m1497();
                                                    C0995.f8425.position(next2.f8441 * 3);
                                                    GLES20.glDrawElements(4, next2.f8429 * 3, 5123, C0995.f8425);
                                                    m1497();
                                                }
                                            }
                                            if (next2.f8431) {
                                                GLES20.glEnable(2929);
                                                m1497();
                                            }
                                            GLES20.glDisableVertexAttribArray(c08522.f8000);
                                            m1497();
                                            GLES20.glDisableVertexAttribArray(c08522.f7988);
                                            m1497();
                                        }
                                    }
                                }
                                if (!z3) {
                                    next.f8230 = null;
                                }
                            } else if (next.f8231 != null && next.f8231.f1005 != null && (c0852 = this.f7967[EnumC0853.STR_EFFECT.f8027]) != null) {
                                uk ukVar = next.f8231.f1005;
                                int i8 = (int) ((ukVar.f5282 * (jCurrentTimeMillis - next.f8229)) / 1000);
                                if (next.f8231.f1003 && i8 > ukVar.f5287) {
                                    next.f8231.m496();
                                    next.f8231 = null;
                                } else {
                                    int i9 = i8 % (ukVar.f5287 + 1);
                                    GLES20.glUseProgram(c0852.f8014);
                                    GLES20.glVertexAttribPointer(c0852.f8000, 2, 5126, false, 0, (Buffer) next.f8231.f1000);
                                    m1497();
                                    GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) next.f8231.f1001);
                                    m1497();
                                    GLES20.glEnableVertexAttribArray(c0852.f8000);
                                    m1497();
                                    GLES20.glEnableVertexAttribArray(c0852.f7988);
                                    m1497();
                                    lr lrVarM15442 = next.m1544();
                                    GLES20.glUniform4f(c0852.f7997, lrVarM15442.f2020, lrVarM15442.f2019, lrVarM15442.f2018, 0.0f);
                                    m1497();
                                    for (int i10 = ukVar.f5283[i9]; i10 < ukVar.f5283[i9 + 1]; i10++) {
                                        hr.C0048 c0048 = next.f8231.f1004[ukVar.f5285[i10]].f1500[0];
                                        GLES20.glActiveTexture(33984);
                                        m1497();
                                        GLES20.glBindTexture(3553, c0048.m629());
                                        m1497();
                                        GLES20.glUniform3f(c0852.f7992, 1.0f / c0048.f1515.x, 1.0f / c0048.f1515.y, 0.0f);
                                        m1497();
                                        GLES20.glActiveTexture(33985);
                                        m1497();
                                        GLES20.glBindTexture(3553, c0048.m628());
                                        m1497();
                                        GLES20.glUniform3f(c0852.f8001, 0.0625f, 0.0625f, 1.0f);
                                        m1497();
                                        GLES20.glUniform4fv(c0852.f7993, 1, next.f8231.f1002[i10], 0);
                                        m1497();
                                        GLES20.glBlendFunc(f7964[ukVar.f5286[i10] & 15], f7964[ukVar.f5286[i10] >>> 4]);
                                        m1497();
                                        GLES20.glDrawArrays(5, i10 << 2, 4);
                                        m1497();
                                    }
                                    GLES20.glDisableVertexAttribArray(c0852.f8000);
                                    m1497();
                                    GLES20.glDisableVertexAttribArray(c0852.f7988);
                                    m1497();
                                }
                            } else {
                                next.f8223 = true;
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        mjVar.m859();
                    }
                }
            }
        }
        GLES20.glDepthFunc(515);
        m1497();
        GLES20.glBlendFunc(770, 771);
        m1497();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) throws InterruptedException {
        Runnable runnablePoll;
        if (!C0358.f6674.f38 && this.f7970 != nh.UNLOADED) {
            C0358.f6674.mo139(this.f7971);
        }
        while (true) {
            synchronized (this) {
                runnablePoll = this.f7979.poll();
            }
            if (runnablePoll == null) {
                break;
            } else {
                runnablePoll.run();
            }
        }
        if (this.f7970 != nh.UNLOADED) {
            C0542 c0542 = this.f7974;
            if (c0542 != null) {
                GLES20.glClear(16640);
                GLES20.glClearDepthf(1.0f);
                if (this.f7970 == nh.NONE && c0542.f7267 != null) {
                    this.f7970 = nh.PREPARING;
                    m1512(c0542.f7267, c0542.f7266);
                    this.f7970 = nh.READY;
                } else if (c0542.f7265 != null) {
                    if (c0542.f7262 != null) {
                        C0753 c0753 = c0542.f7262;
                        C0753 c07532 = c0542.f7263;
                        for (int i = 0; i < this.f7967.length; i++) {
                            if (this.f7967[i] != null) {
                                GLES20.glUseProgram(this.f7967[i].f8014);
                                int iGlGetError = GLES20.glGetError();
                                this.f7977 = iGlGetError;
                                if (iGlGetError != 0) {
                                    m1498(this.f7977);
                                }
                                try {
                                    GLES20.glUniformMatrix4fv(this.f7967[i].f8011, 1, false, c0753.f7745, 0);
                                    int iGlGetError2 = GLES20.glGetError();
                                    this.f7977 = iGlGetError2;
                                    if (iGlGetError2 != 0) {
                                        m1498(this.f7977);
                                    }
                                    GLES20.glUniformMatrix4fv(this.f7967[i].f7995, 1, false, c07532.f7745, 0);
                                    m1497();
                                } catch (IllegalArgumentException e) {
                                    throw new nv(e, "(5)" + C0358.m1300());
                                }
                            }
                        }
                    }
                    m1507(c0542.f7265.f7475.f7478, c0542.f7265.f7475.f7477, new Point(c0542.f7267.f6872.f1655, c0542.f7267.f6872.f1656));
                    m1509(c0542.f7265.f7473.f7481, c0542.f7265.f7473.f7480);
                    C0450.Cif cif = c0542.f7267.f6883;
                    if (cif.f6893) {
                        C0852 c0852 = this.f7967[EnumC0853.SIMPLE3DOBJECT.f8027];
                        GLES20.glUseProgram(c0852.f8014);
                        int iGlGetError3 = GLES20.glGetError();
                        this.f7977 = iGlGetError3;
                        if (iGlGetError3 != 0) {
                            m1498(this.f7977);
                        }
                        m1493(c0852);
                        try {
                            GLES20.glUniformMatrix4fv(c0852.f8004, 1, false, cif.f6889.f7745, 0);
                            int iGlGetError4 = GLES20.glGetError();
                            this.f7977 = iGlGetError4;
                            if (iGlGetError4 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glDisableVertexAttribArray(c0852.f8000);
                            int iGlGetError5 = GLES20.glGetError();
                            this.f7977 = iGlGetError5;
                            if (iGlGetError5 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glDisableVertexAttribArray(c0852.f7988);
                            int iGlGetError6 = GLES20.glGetError();
                            this.f7977 = iGlGetError6;
                            if (iGlGetError6 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glVertexAttribPointer(c0852.f8000, 4, 5126, false, 0, (Buffer) cif.f6892);
                            int iGlGetError7 = GLES20.glGetError();
                            this.f7977 = iGlGetError7;
                            if (iGlGetError7 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glVertexAttribPointer(c0852.f7988, 4, 5126, false, 0, (Buffer) cif.f6888);
                            int iGlGetError8 = GLES20.glGetError();
                            this.f7977 = iGlGetError8;
                            if (iGlGetError8 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glEnableVertexAttribArray(c0852.f8000);
                            int iGlGetError9 = GLES20.glGetError();
                            this.f7977 = iGlGetError9;
                            if (iGlGetError9 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glEnableVertexAttribArray(c0852.f7988);
                            int iGlGetError10 = GLES20.glGetError();
                            this.f7977 = iGlGetError10;
                            if (iGlGetError10 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glDrawArrays(5, 0, cif.f6892.capacity() / 4);
                            int iGlGetError11 = GLES20.glGetError();
                            this.f7977 = iGlGetError11;
                            if (iGlGetError11 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glDisableVertexAttribArray(c0852.f8000);
                            int iGlGetError12 = GLES20.glGetError();
                            this.f7977 = iGlGetError12;
                            if (iGlGetError12 != 0) {
                                m1498(this.f7977);
                            }
                            GLES20.glDisableVertexAttribArray(c0852.f7988);
                            int iGlGetError13 = GLES20.glGetError();
                            this.f7977 = iGlGetError13;
                            if (iGlGetError13 != 0) {
                                m1498(this.f7977);
                            }
                        } catch (IllegalArgumentException e2) {
                            throw new nv(e2, "(7)" + C0358.m1300());
                        }
                    }
                    m1510(c0542.f7264);
                    m1499(c0542.f7261);
                    m1508(c0542.f7265.f7474.f7478, c0542.f7265.f7474.f7477, c0542.f7267.f6873);
                    m1492(c0542.f7264);
                    if (c0542.f7267.f6881 != null) {
                        m1500(c0542.f7267.f6881);
                    }
                    m1494(c0542.f7264);
                    IntBuffer intBufferM490 = cp.m490();
                    if (intBufferM490 != null) {
                        GLES20.glDeleteTextures(intBufferM490.remaining(), intBufferM490);
                        m1497();
                    }
                    if (this.f7973 && this.f7973) {
                        if (System.currentTimeMillis() / 1000 > this.f7972) {
                            b bVar = C0358.f6671;
                            b bVar2 = C0358.f6671;
                            b bVar3 = C0358.f6671;
                            this.f7975 = this.f7978;
                            this.f7972 = System.currentTimeMillis() / 1000;
                        }
                        this.f7978++;
                    }
                }
            }
            this.f7968 = System.currentTimeMillis();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        C0358.f6674.mo139(new RunnableC0956(this, i, i2));
    }

    public C0851(c_activity c_activityVar) {
        this.f7965 = pa.m978(c_activityVar.m140(2130968591), ow.UTF8);
        this.f7966 = pa.m978(c_activityVar.m140(2130968578), ow.UTF8);
    }
}
