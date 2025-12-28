package o;

import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: o.揇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0727 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    C1159 f7697;

    /* renamed from: ą, reason: contains not printable characters */
    C1115 f7698;

    /* renamed from: Ć, reason: contains not printable characters */
    C1152 f7699;

    /* renamed from: ć, reason: contains not printable characters */
    C0609 f7700;

    /* renamed from: ȃ, reason: contains not printable characters */
    C1146 f7701;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f7702;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    nf f7703;

    /* renamed from: 櫯, reason: contains not printable characters */
    ImageView f7704;

    /* renamed from: 鷭, reason: contains not printable characters */
    ViewPager f7705;

    C0727() {
        super(2130903070);
        this.f7701 = new C1146();
        this.f7697 = new C1159();
        this.f7698 = new C1115();
        this.f7699 = new C1152();
        this.f7700 = new C0609();
        this.f7703 = nf.BASIC;
        this.f7705 = (ViewPager) this.f1994.findViewById(2131296321);
        this.f7704 = (ImageView) this.f1994.findViewById(2131296297);
        this.f7702 = (TextView) this.f1994.findViewById(2131296265);
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m1438() {
        if (!(this.f1994.getParent() != null)) {
            return;
        }
        this.f7702.setText(C0358.f6664.f2004.f8369);
        ImageView imageView = this.f7704;
        cv cvVar = C0358.f6685;
        imageView.setImageBitmap(cv.m525(C0358.f6664.f2004.f8348, C0358.f6664.f2004.f8349));
        if (C0358.f6664.f2004.f8635 == null) {
            return;
        }
        AbstractC0769[] abstractC0769Arr = {this.f7701, this.f7697, this.f7698, this.f7700, this.f7699};
        for (AbstractC0769 abstractC0769 : abstractC0769Arr) {
            abstractC0769.mo1382();
        }
        this.f7705.setAdapter(new C0401(abstractC0769Arr));
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        C0358.f6671.mo454(new C0157(nf.BASIC));
        C0358.f6671.mo454(new C0157(nf.EXPULSIONS));
        C0358.f6671.mo454(new C0157(nf.POSITIONS));
        C0358.f6671.mo454(new C0157(nf.SKILLS));
        C0358.f6671.mo454(new C0157(nf.MEMBERS));
        m1438();
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
