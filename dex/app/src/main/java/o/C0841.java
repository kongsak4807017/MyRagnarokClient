package o;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: o.羇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0841 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f7950;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f7951;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f7952;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f7953;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    EditText f7954;

    /* renamed from: 櫯, reason: contains not printable characters */
    Button f7955;

    /* renamed from: 鷭, reason: contains not printable characters */
    Button f7956;

    public C0841() {
        super(2130903042);
        this.f7956 = (Button) this.f1994.findViewById(2131296292);
        this.f7955 = (Button) this.f1994.findViewById(2131296291);
        this.f7954 = (EditText) this.f1994.findViewById(2131296290);
        this.f7953 = (TextView) this.f1994.findViewById(2131296286);
        this.f7951 = (TextView) this.f1994.findViewById(2131296287);
        this.f7950 = (TextView) this.f1994.findViewById(2131296288);
        this.f7952 = (TextView) this.f1994.findViewById(2131296289);
        TextView textView = this.f7953;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(2773);
        textView.setText(strM649 == null ? "MSG2773" : strM649);
        TextView textView2 = this.f7950;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(2774);
        textView2.setText(strM6492 == null ? "MSG2774" : strM6492);
        Button button = this.f7955;
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(2776);
        button.setText(strM6493 == null ? "MSG2776" : strM6493);
        Button button2 = this.f7956;
        cv cvVar4 = C0358.f6685;
        String strM6494 = C0358.f6687.m649(2775);
        button2.setText(strM6494 == null ? "MSG2775" : strM6494);
        this.f7956.setOnClickListener(new ViewOnClickListenerC0400(this));
        this.f7955.setOnClickListener(new ViewOnClickListenerC0742(this));
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        this.f7952.setText(String.valueOf(String.valueOf(C0358.f6664.f2004.f8636)) + " z");
        C0358.f6671.mo454(new C0180());
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        C0358.f6671.mo454(new C0178());
    }
}
