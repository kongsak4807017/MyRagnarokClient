package o;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: o.䐭, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0569 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView[] f7319;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f7320;

    /* renamed from: Ć, reason: contains not printable characters */
    ImageView f7321;

    /* renamed from: ć, reason: contains not printable characters */
    ImageView[] f7322;

    /* renamed from: ċ, reason: contains not printable characters */
    boolean f7323;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f7324;

    /* renamed from: Ȋ, reason: contains not printable characters */
    int[] f7325;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public oe f7326;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    GridView f7327;

    /* renamed from: 岱, reason: contains not printable characters */
    int f7328;

    /* renamed from: 櫯, reason: contains not printable characters */
    ListView f7329;

    /* renamed from: 纫, reason: contains not printable characters */
    private AdapterView.OnItemClickListener f7330;

    /* renamed from: 鷭, reason: contains not printable characters */
    Button f7331;

    C0569() {
        super(2130903093);
        this.f7323 = false;
        this.f7330 = new C1132(this);
        this.f7319 = new TextView[3];
        this.f7322 = new ImageView[3];
        this.f7324 = (TextView) this.f1994.findViewById(2131296265);
        this.f7321 = (ImageView) this.f1994.findViewById(2131296297);
        this.f7320 = (TextView) this.f1994.findViewById(2131296427);
        this.f7319[0] = (TextView) this.f1994.findViewById(2131296269);
        this.f7322[0] = (ImageView) this.f1994.findViewById(2131296428);
        this.f7319[1] = (TextView) this.f1994.findViewById(2131296431);
        this.f7322[1] = (ImageView) this.f1994.findViewById(2131296429);
        this.f7319[2] = (TextView) this.f1994.findViewById(2131296432);
        this.f7322[2] = (ImageView) this.f1994.findViewById(2131296430);
        this.f7329 = (ListView) this.f1994.findViewById(2131296332);
        this.f7327 = (GridView) this.f1994.findViewById(2131296450);
        this.f7329.setOnItemClickListener(this.f7330);
        this.f7331 = (Button) this.f1994.findViewById(2131296328);
        this.f7331.setOnClickListener(new ViewOnClickListenerC0605(this));
        this.f7329.setOnItemClickListener(this.f7330);
        m1373();
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m1373() {
        this.f7319[0].setText((CharSequence) null);
        this.f7319[1].setText((CharSequence) null);
        this.f7319[2].setText((CharSequence) null);
        this.f7322[0].setVisibility(4);
        this.f7322[1].setVisibility(4);
        this.f7322[2].setVisibility(4);
        this.f7320.setText((CharSequence) null);
        this.f7321.setVisibility(4);
        this.f7324.setText((CharSequence) null);
        this.f7328 = 0;
        this.f7325 = new int[3];
    }

    @Override // o.ll
    /* renamed from: ą */
    final void mo772() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.addRule(13);
        this.f1994.setLayoutParams(layoutParams);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1994.setLayoutParams(layoutParams);
        }
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
