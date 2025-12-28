package o;

import android.support.v4.internal.view.SupportMenu;
import android.widget.ListAdapter;
import com.roworkshop.ro.natives;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import o.eh;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class b extends iw {

    /* renamed from: 㥳, reason: contains not printable characters */
    private static /* synthetic */ int[] f748;

    /* renamed from: Ą, reason: contains not printable characters */
    C0024 f749;

    /* renamed from: ą, reason: contains not printable characters */
    pq f750;

    /* renamed from: Ć, reason: contains not printable characters */
    pr f751;

    /* renamed from: ć, reason: contains not printable characters */
    long f752;

    /* renamed from: ċ, reason: contains not printable characters */
    C0644 f753;

    /* renamed from: đ, reason: contains not printable characters */
    boolean[] f754;

    /* renamed from: Ē, reason: contains not printable characters */
    private long f755;

    /* renamed from: ē, reason: contains not printable characters */
    private String f756;

    /* renamed from: ȃ, reason: contains not printable characters */
    public C0024 f757;

    /* renamed from: Ȋ, reason: contains not printable characters */
    boolean f758;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    C0024 f759;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public long f760;

    /* renamed from: ܕ, reason: contains not printable characters */
    final int f761;

    /* renamed from: 䒧, reason: contains not printable characters */
    ByteBuffer f762;

    /* renamed from: 岱, reason: contains not printable characters */
    public long f763;

    /* renamed from: 庸, reason: contains not printable characters */
    final int f764;

    /* renamed from: 櫯, reason: contains not printable characters */
    public tx f765;

    /* renamed from: 纫, reason: contains not printable characters */
    oq f766;

    /* renamed from: 躆, reason: contains not printable characters */
    final int f767;

    /* renamed from: 鷭, reason: contains not printable characters */
    public ty f768;

    /* renamed from: 띥, reason: contains not printable characters */
    private Runnable f769;

    /* renamed from: ć, reason: contains not printable characters */
    private static /* synthetic */ int[] m448() {
        int[] iArr = f748;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[ns.valuesCustom().length];
        try {
            iArr2[ns.CHAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ns.LOCKER.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ns.LOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ns.MAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ns.MASTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ns.NULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ns.RESOURCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        f748 = iArr2;
        return iArr2;
    }

    /* renamed from: o.b$鷭, reason: contains not printable characters */
    public class C0024 {

        /* renamed from: Ą, reason: contains not printable characters */
        Runnable f770;

        /* renamed from: ą, reason: contains not printable characters */
        Runnable f771;

        /* renamed from: Ć, reason: contains not printable characters */
        Runnable f772;

        /* renamed from: ć, reason: contains not printable characters */
        long f773;

        /* renamed from: ċ, reason: contains not printable characters */
        boolean f774;

        /* renamed from: ȃ, reason: contains not printable characters */
        of f775;

        /* renamed from: Ȋ, reason: contains not printable characters */
        BufferedInputStream f776;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public ns f777;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        uc f778;

        /* renamed from: 岱, reason: contains not printable characters */
        Socket f780;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f781;

        /* renamed from: 纫, reason: contains not printable characters */
        ByteBuffer f782;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f783;

        C0024() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public boolean mo457() {
        return (this.f757 == null || this.f757.f780 == null || !this.f757.f780.isConnected()) ? false : true;
    }

    public b(String str, int i, int i2, int i3, int i4) {
        super(str);
        this.f758 = true;
        this.f753 = new C0644();
        this.f754 = new boolean[0];
        this.f769 = new c(this);
        this.f756 = str;
        this.f761 = i != 0 ? i : SupportMenu.USER_MASK;
        this.f764 = SupportMenu.USER_MASK;
        this.f767 = i4;
        if (this.f764 < 65535) {
            throw new IllegalArgumentException();
        }
        if (this.f761 < 100) {
            throw new IllegalArgumentException();
        }
        this.f768 = new ty(i3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public void mo454(vg vgVar) {
        C0358.f6674.mo139(new d(this, vgVar));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m455(vg vgVar, ByteBuffer byteBuffer, int i) {
        if (C0358.f6667 != null && this.f757.f777 == ns.MAP) {
            ((an) this.f765).mo434(vgVar, byteBuffer, i);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m453(vg vgVar, ByteBuffer byteBuffer, int i) {
        if (C0358.f6667 != null && this.f766 != null && this.f766.f3367 && vgVar.getClass() != C0540.class) {
            boolean z = vgVar.getClass() != C1162$.m1519("o.釫");
            short s = byteBuffer.getShort(i);
            oq oqVar = this.f766;
            byteBuffer.putShort(i, z ? (short) (((oqVar.f3366 >>> 16) & 32767) ^ s) : (short) (((((oqVar.f3368[0] * oqVar.f3368[1]) + oqVar.f3368[2]) >>> 16) & 32767) ^ s));
            if (z) {
                oq oqVar2 = this.f766;
                oqVar2.f3366 = ((oqVar2.f3366 * oqVar2.f3368[1]) + oqVar2.f3368[2]) & (-1);
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m452() {
        if (this.f757 == null) {
            return;
        }
        synchronized (this.f757) {
            if (!this.f757.f780.isClosed()) {
                try {
                    this.f757.f780.close();
                } catch (IOException e) {
                    throw new nv(e);
                }
            }
            if (this.f757.f776 != null) {
                try {
                    this.f757.f776.close();
                } catch (IOException unused) {
                }
            }
            this.f766 = null;
            this.f749 = this.f757;
            this.f757 = null;
            ty tyVar = this.f768;
            tyVar.f4992.f5014 = 0;
            tyVar.f4992.f5013 = 0;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m449(boolean z) {
        int[] iArr;
        if (!(this.f757.f777 == ns.RESOURCE)) {
            C0358.f6674.mo139(new h(this));
        }
        Runnable runnable = z ? this.f757.f770 : this.f757.f771;
        if (runnable != null) {
            this.f757.f775.mo139(runnable);
        }
        if (!z) {
            m452();
            return;
        }
        this.f755 = System.currentTimeMillis();
        this.f758 = this.f757.f777 == ns.RESOURCE;
        if (this.f757.f777 == ns.CHAR) {
            this.f768.f4993 = C0358.f6688.f6689;
        }
        if (this.f757.f777 == ns.MAP) {
            if (C0358.f6667.f4844) {
                this.f768.f4993 = C0358.f6688.f6689;
            }
            C0358.f6679 = new C0428();
            Iterator<ap> it = ((ao) C0358.f6674.f42.f1816.f1174.getAdapter()).f682.iterator();
            while (it.hasNext()) {
                eh.C0033 c0033 = (eh.C0033) it.next();
                c0033.f1180 = false;
                c0033.f1178.setAdapter((ListAdapter) null);
            }
        }
        if (this.f757.f777 == ns.MAP && C0358.f6667.f4781) {
            if ((oc.f3250 == my.all || oc.f3250 == my.MOTR) && C0358.f6667.f4771 == pj.aux.MOTR) {
                iArr = new int[]{2068070841, 1539072943, 1171918449};
            } else {
                iArr = ((an) this.f765).f676;
            }
            if (this.f757.f777 == ns.MAP && iArr != null) {
                this.f766 = new oq(iArr);
                this.f766.f3367 = true;
            } else {
                this.f766 = null;
            }
        }
        try {
            this.f757.f776 = new BufferedInputStream(this.f757.f780.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            if (this.f757 != null) {
                this.f757.f774 = true;
            }
        }
    }

    @Override // o.iw
    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void mo451() throws IOException {
        while (true) {
            if (this.f1701.size() == 0 && this.f757 == null) {
                synchronized (this.f1700) {
                    this.f1700.wait();
                }
            }
            while (true) {
                Runnable runnable = m696();
                if (runnable == null) {
                    break;
                } else {
                    runnable.run();
                }
            }
            mo450();
        }
    }

    /* renamed from: Ą, reason: contains not printable characters */
    private boolean m446() {
        int iMin = 0;
        synchronized (this.f768.f4992) {
            if (this.f753.f3365) {
                if (this.f757.f778.f5013 >= 16 && (iMin = Math.min((this.f757.f778.f5013 / 16) * 16, ((this.f768.f4992.f5015.length - this.f768.f4992.f5013) / 16) * 16)) >= 16) {
                    natives.procpacketrecv(this.f757.f778.f5015, iMin, this.f753.f3363, this.f768.f4992.f5015, this.f768.f4992.f5013);
                }
            } else {
                iMin = Math.min(this.f757.f778.f5013, this.f768.f4992.f5015.length - this.f768.f4992.f5013);
                System.arraycopy(this.f757.f778.f5015, 0, this.f768.f4992.f5015, this.f768.f4992.f5013, iMin);
            }
            this.f768.f4992.f5013 += iMin;
            this.f757.f778.f5014 = iMin;
            this.f757.f778.m1106();
        }
        return iMin > 0;
    }

    /* renamed from: ą, reason: contains not printable characters */
    private void m447() {
        if (this.f768.f4991) {
            return;
        }
        while (true) {
            if ((!this.f753.f3365 && this.f757.f778.f5013 > 0) || (this.f753.f3365 && this.f757.f778.f5013 >= 16)) {
                m446();
                synchronized (this.f754) {
                    if (this.f768.f4992.f5013 > 0) {
                        C0358.f6674.mo139(this.f769);
                        if (this.f757.f778.f5013 > 0) {
                            try {
                                this.f754.wait();
                            } catch (InterruptedException e) {
                                throw new nv(e);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public void mo450() throws IOException {
        int i;
        if (this.f757 != null) {
            if (this.f757.f780 == null) {
                throw new nv("Unexpected connection state.");
            }
            if ((!this.f757.f780.isConnected() || this.f759 != null) && this.f757 != null) {
                this.f757.f774 = true;
            }
            if (this.f757.f774 && this.f768.f4992.f5013 == 0 && this.f757.f782.position() == 0 && this.f757.f782.limit() == this.f757.f782.capacity()) {
                if (this.f757.f772 != null) {
                    this.f757.f775.mo139(this.f757.f772);
                }
                m452();
            }
        }
        if (this.f757 == null && this.f759 != null) {
            try {
                this.f757 = this.f759;
                this.f759 = null;
                C0644 c0644 = this.f753;
                c0644.f3365 = false;
                if (c0644.f3365) {
                    c0644.f3361 = ByteBuffer.allocate(16);
                } else {
                    c0644.f3361 = null;
                }
                m456(false);
                new StringBuilder("Connecting to ").append(this.f757.f783).append(":").append(this.f757.f781).append(" purpose=").append(this.f757.f777);
                this.f757.f780 = new Socket();
                this.f757.f780.setReceiveBufferSize(this.f761);
                this.f757.f780.setTcpNoDelay(false);
                this.f757.f780.setTrafficClass(8);
                this.f757.f780.setSoTimeout(this.f767);
                this.f757.f780.connect(new InetSocketAddress(this.f757.f783, this.f757.f781), 10000);
                m449(true);
            } catch (Exception unused) {
                m449(false);
            }
        }
        if (this.f757 == null) {
            return;
        }
        m447();
        int i2 = C0358.f6688 != null ? C0358.f6688.f6689 : 0;
        if (this.f758) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f757 != null) {
                switch (m448()[this.f757.f777.ordinal()]) {
                    case 2:
                        if (C0358.f6667.f4776 != pj.EnumC0074.AEGIS && jCurrentTimeMillis - this.f755 > 5000) {
                            mo454(new C0675(C0358.f6681));
                            this.f755 = jCurrentTimeMillis;
                            break;
                        }
                        break;
                    case 3:
                        if (jCurrentTimeMillis - this.f755 > 12000) {
                            mo454(new C0213(i2));
                            this.f755 = jCurrentTimeMillis;
                            break;
                        }
                        break;
                    case 4:
                        if (jCurrentTimeMillis - this.f755 > 5000) {
                            mo454(new C0834(jCurrentTimeMillis));
                            if (this.f750 != null) {
                                mo454(new C0503());
                            } else if (this.f751 != null) {
                                mo454(new C0429());
                            }
                            this.f755 = jCurrentTimeMillis;
                            break;
                        }
                        break;
                    case 5:
                    case 7:
                        break;
                    case 6:
                        if (jCurrentTimeMillis - this.f755 > 5000) {
                            mo454(new wb());
                            this.f755 = jCurrentTimeMillis;
                            break;
                        }
                        break;
                    default:
                        throw new nv("unknown connecton purpose " + this.f757.f777);
                }
            }
        }
        try {
            i = this.f757.f776.read(this.f757.f778.f5015, this.f757.f778.f5013, this.f757.f778.f5015.length - this.f757.f778.f5013);
            if (i > 0) {
                this.f757.f778.f5013 += i;
            }
        } catch (SocketTimeoutException unused2) {
            i = 0;
        } catch (IOException e) {
            e.printStackTrace();
            if (this.f757 != null) {
                this.f757.f774 = true;
                return;
            }
            return;
        }
        m447();
        if (i == -1 && !this.f757.f774 && this.f757 != null) {
            this.f757.f774 = true;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m456(boolean z) {
        if (this.f768.f4991 && !z) {
            C0358.f6674.mo139(this.f769);
        }
        this.f768.f4991 = z;
    }
}
