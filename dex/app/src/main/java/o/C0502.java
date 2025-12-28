package o;

import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

/* renamed from: o.ゥ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0502 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    Button f6981;

    /* renamed from: ȃ, reason: contains not printable characters */
    SeekBar f6982;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    EditText f6983;

    /* renamed from: 櫯, reason: contains not printable characters */
    EditText f6984;

    /* renamed from: 鷭, reason: contains not printable characters */
    EditText f6985;

    C0502() {
        super(2130903050);
        this.f6985 = (EditText) this.f1994.findViewById(2131296299);
        this.f6984 = (EditText) this.f1994.findViewById(2131296333);
        this.f6983 = (EditText) this.f1994.findViewById(2131296334);
        this.f6982 = (SeekBar) this.f1994.findViewById(2131296311);
        this.f6981 = (Button) this.f1994.findViewById(2131296279);
        this.f6981.setOnClickListener(new ViewOnClickListenerC0861(this));
        this.f6982.setMax(18);
        this.f6982.setOnSeekBarChangeListener(new C0749(this));
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
