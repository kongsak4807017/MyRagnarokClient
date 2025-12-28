package o;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class a {

    /* renamed from: 岱, reason: contains not printable characters */
    private static /* synthetic */ int[] f100;

    /* renamed from: Ą, reason: contains not printable characters */
    ImageView f101;

    /* renamed from: ą, reason: contains not printable characters */
    boolean f102;

    /* renamed from: Ć, reason: contains not printable characters */
    c_point f103;

    /* renamed from: ć, reason: contains not printable characters */
    String f104;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f105;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f106;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    String f107;

    /* renamed from: 櫯, reason: contains not printable characters */
    RelativeLayout f108;

    /* renamed from: 鷭, reason: contains not printable characters */
    mj f109;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m172() {
        int[] iArr = f100;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[nu.valuesCustom().length];
        try {
            iArr2[nu.ALL.ordinal()] = 12;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[nu.CHAT.ordinal()] = 10;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[nu.ELEM.ordinal()] = 11;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nu.HOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nu.ITEM.ordinal()] = 7;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nu.MER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[nu.MOB.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[nu.NPC.ordinal()] = 9;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[nu.NUL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[nu.PC.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[nu.PET.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[nu.SKILL.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        f100 = iArr2;
        return iArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m175(mj mjVar) throws IOException {
        this.f109 = mjVar;
        lm lmVar = mjVar.f2123;
        AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        boolean z = (abstractC0988 == null || abstractC0988.f8369 == null || abstractC0988.f8369.length() <= 0) ? false : true;
        boolean z2 = this.f108 == null || z != this.f102;
        this.f102 = z;
        if (z2) {
            if (this.f108 != null) {
                C0358.f6674.f42.f1777.removeView(this.f108);
            }
            if (this.f102) {
                this.f108 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903095, (ViewGroup) null);
            } else {
                this.f108 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903094, (ViewGroup) null);
            }
            this.f106 = (TextView) this.f108.findViewById(2131296265);
            if (this.f102) {
                this.f105 = (TextView) this.f108.findViewById(2131296259);
                this.f101 = (ImageView) this.f108.findViewById(2131296297);
                m173();
            }
            C0358.f6674.f42.f1777.addView(this.f108);
            C0358.f6674.f42.f1777.bringChildToFront(this.f108);
        }
        if (abstractC0988 != null) {
            if (abstractC0988.f8368 != null) {
                this.f104 = abstractC0988.f8368.split("#")[0];
            } else {
                this.f104 = "";
            }
            if (abstractC0988.f8362 != null && abstractC0988.f8362.length() > 0) {
                this.f104 = String.valueOf(this.f104) + " (" + abstractC0988.f8362 + ")";
            }
            this.f106.setText(this.f104);
            if (this.f102) {
                this.f107 = String.valueOf(abstractC0988.f8369) + " [" + abstractC0988.f8359 + "]";
                this.f105.setText(this.f107);
            }
            int[] iArrM172 = m172();
            cv cvVar = C0358.f6685;
            switch (iArrM172[lo.m781(mjVar.f2123.f2001).ordinal()]) {
                case 3:
                    this.f106.setTextColor(-14650);
                    break;
                case 9:
                    this.f106.setTextColor(-7029257);
                    break;
                default:
                    this.f106.setTextColor(-1);
                    break;
            }
        } else if (mjVar.f2123.f1997 == nu.ITEM) {
            lm lmVar2 = mjVar.f2123;
            C0489 c0489 = (C0489) (C0489.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null);
            C1139 c1139 = C0358.f6685.f1030.f967;
            int i = c0489.f2001;
            boolean z3 = c0489.f6956;
            C0432 c0432M1648 = c1139.m1648(i);
            this.f104 = c0432M1648 == null ? null : c0432M1648.m1328(z3);
            this.f106.setText(this.f104);
            this.f106.setTextColor(-4204);
        } else {
            return;
        }
        m174();
    }

    a(mj mjVar) throws IOException {
        m175(mjVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m174() {
        lq lqVarM814 = C0358.f6669.m814(this.f109.f2076);
        if (lqVarM814 == null) {
            return;
        }
        if (this.f103 == null) {
            this.f108.measure(0, 0);
            this.f103 = new c_point(this.f108.getMeasuredWidth(), this.f108.getMeasuredHeight());
        }
        c_activity c_activityVar = C0358.f6674;
        je.m714(this.f108, new Point((int) lqVarM814.f2017, C0358.f6669.f2058.y - (((int) lqVarM814.f2016) - 40)), this.f103);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m173() throws IOException {
        if (this.f101 == null) {
            return;
        }
        lm lmVar = this.f109.f2123;
        AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        if (abstractC0988.f8348 == 0) {
            return;
        }
        cv cvVar = C0358.f6685;
        Bitmap bitmapM525 = cv.m525(abstractC0988.f8348, abstractC0988.f8349);
        if (bitmapM525 == null) {
            C0358.f6671.mo454(new C0548(abstractC0988.f8348));
        } else {
            this.f101.setImageBitmap(bitmapM525);
        }
    }
}
