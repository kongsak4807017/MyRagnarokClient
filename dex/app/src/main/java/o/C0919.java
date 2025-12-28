package o;

import android.media.MediaPlayer;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: o.驩, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0919 {

    /* renamed from: ą, reason: contains not printable characters */
    private String f8208;

    /* renamed from: ȃ, reason: contains not printable characters */
    private static boolean f8207 = true;

    /* renamed from: Ą, reason: contains not printable characters */
    private static boolean f8206 = true;

    /* renamed from: 鷭, reason: contains not printable characters */
    public MediaPlayer f8213 = new MediaPlayer();

    /* renamed from: Ć, reason: contains not printable characters */
    private fx[] f8209 = new fx[48];

    /* renamed from: 櫯, reason: contains not printable characters */
    public boolean f8212 = false;

    /* renamed from: ć, reason: contains not printable characters */
    private MediaPlayer.OnPreparedListener f8210 = new C0577(this);

    /* renamed from: ˮ͈, reason: contains not printable characters */
    HashMap<String, fy> f8211 = new HashMap<>();

    public C0919() {
        this.f8213.setAudioStreamType(3);
        this.f8213.setOnPreparedListener(this.f8210);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1534(String str) {
        if (!f8207) {
            return;
        }
        try {
            if (str.equals(this.f8208)) {
                if (!this.f8213.isPlaying()) {
                    this.f8213.start();
                }
            } else {
                if (!new File(str).exists()) {
                    return;
                }
                if (this.f8213.isPlaying()) {
                    this.f8213.stop();
                }
                this.f8213.reset();
                this.f8213.setDataSource(str);
                this.f8213.setLooping(true);
                this.f8213.prepare();
                this.f8213.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1533() {
        for (int i = 0; i < this.f8209.length; i++) {
            if (this.f8209[i] != null) {
                if (this.f8209[i].f1296.getState() == 1) {
                    this.f8209[i].f1296.stop();
                }
                try {
                    this.f8209[i].f1296.release();
                } catch (IllegalStateException unused) {
                }
                this.f8209[i] = null;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1536(String str, byte[] bArr) {
        if (this.f8211.containsKey(str)) {
            return;
        }
        try {
            this.f8211.put(str, new fy(str, bArr));
        } catch (nv unused) {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1535(String str, float f) {
        if (str.endsWith(".wav")) {
            str = str.substring(0, str.length() - 4);
        }
        if (this.f8211.containsKey(str)) {
            m1532(str, f);
        } else {
            C0358.f6685.mo139(new RunnableC0711(this, str, f));
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final synchronized void m1532(String str, float f) {
        int i;
        if (f8206) {
            fy fyVar = this.f8211.get(str);
            if (fyVar == null) {
                return;
            }
            int i2 = -1;
            int i3 = -1;
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i4 = 0;
            while (true) {
                if (i4 >= this.f8209.length) {
                    i = i2 != -1 ? i2 : i3;
                } else {
                    if (this.f8209[i4] != null) {
                        lw lwVar = this.f8209[i4].f1297.f1298;
                        long j = (lwVar.f2038 * 1000) / (((lwVar.f2040 * lwVar.f2041) * lwVar.f2039) / 8);
                        if (this.f8209[i4].f1296.getPlayState() == 1 || this.f8209[i4].f1295 + j < jCurrentTimeMillis) {
                            if (this.f8209[i4].f1297.f1299.equals(str)) {
                                i = i4;
                                break;
                            } else if (i3 == -1) {
                                i3 = i4;
                            }
                        }
                    } else if (i2 == -1) {
                        i2 = i4;
                    }
                    i4++;
                }
            }
            if (i == -1) {
                return;
            }
            boolean z = false;
            if (this.f8209[i] != null && this.f8209[i].f1297.f1299.equals(str) && this.f8209[i].f1296.getState() == 1) {
                try {
                    this.f8209[i].f1296.stop();
                    this.f8209[i].f1296.reloadStaticData();
                    z = true;
                } catch (IllegalStateException unused) {
                }
            }
            if (!z) {
                if (this.f8209[i] != null) {
                    if (this.f8209[i].f1296.getState() == 1) {
                        this.f8209[i].f1296.stop();
                    }
                    this.f8209[i].f1296.release();
                }
                this.f8209[i] = new fx(fyVar);
            }
            this.f8209[i].f1296.setStereoVolume(f, f);
            if (this.f8209[i].f1296.getState() == 1) {
                this.f8209[i].f1296.play();
            }
            this.f8209[i].f1295 = System.currentTimeMillis();
        }
    }
}
