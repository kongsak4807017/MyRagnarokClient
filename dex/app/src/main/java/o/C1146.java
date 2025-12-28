package o;

import android.widget.Button;
import android.widget.TextView;
import o.C0972;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.퓖, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1146 extends AbstractC0769 {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f8986;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f8987;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f8988;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f8989;

    /* renamed from: ċ, reason: contains not printable characters */
    Button f8990;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f8991;

    /* renamed from: Ȋ, reason: contains not printable characters */
    TextView[] f8992;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f8993;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    TextView f8994;

    /* renamed from: 岱, reason: contains not printable characters */
    TextView[] f8995;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f8996;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f8997;

    C1146() {
        super(2130903065, nf.BASIC);
        this.f8995 = new TextView[3];
        this.f8992 = new TextView[3];
        this.f8997 = (TextView) this.f7796.findViewById(2131296259);
        this.f8996 = (TextView) this.f7796.findViewById(2131296282);
        this.f8993 = (TextView) this.f7796.findViewById(2131296265);
        this.f8991 = (TextView) this.f7796.findViewById(2131296277);
        this.f8986 = (TextView) this.f7796.findViewById(2131296284);
        this.f8987 = (TextView) this.f7796.findViewById(2131296302);
        this.f8988 = (TextView) this.f7796.findViewById(2131296276);
        this.f8990 = (Button) this.f7796.findViewById(2131296279);
        this.f8989 = (TextView) this.f7796.findViewById(2131296351);
        this.f8995[0] = (TextView) this.f7796.findViewById(2131296352);
        this.f8995[1] = (TextView) this.f7796.findViewById(2131296353);
        this.f8995[2] = (TextView) this.f7796.findViewById(2131296354);
        this.f8994 = (TextView) this.f7796.findViewById(2131296355);
        this.f8992[0] = (TextView) this.f7796.findViewById(2131296356);
        this.f8992[1] = (TextView) this.f7796.findViewById(2131296357);
        this.f8992[2] = (TextView) this.f7796.findViewById(2131296358);
        TextView textView = this.f8989;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(339);
        textView.setText(strM649 == null ? "MSG339" : strM649);
        TextView textView2 = this.f8994;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(NNTPReply.SEND_ARTICLE_TO_POST);
        textView2.setText(strM6492 == null ? "MSG340" : strM6492);
        Button button = this.f8990;
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(509);
        button.setText(strM6493 == null ? "MSG509" : strM6493);
        this.f8990.setOnClickListener(new ViewOnClickListenerC0967(this));
    }

    @Override // o.AbstractC0769
    /* renamed from: 鷭 */
    final void mo1382() {
        if (C0358.f6664.f2004.f8635 == null) {
            return;
        }
        C0972 c0972 = C0358.f6664.f2004.f8635;
        TextView textView = this.f8997;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(519);
        textView.setText(String.valueOf(strM649 == null ? "MSG519" : strM649) + " : " + c0972.f8297);
        TextView textView2 = this.f8996;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(FTPReply.NEED_PASSWORD);
        textView2.setText(String.valueOf(strM6492 == null ? "MSG331" : strM6492) + " : " + c0972.f8306);
        TextView textView3 = this.f8993;
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(FTPReply.NEED_ACCOUNT);
        textView3.setText(String.valueOf(strM6493 == null ? "MSG332" : strM6493) + " : " + c0972.f8288);
        this.f8991.setText(String.valueOf(c0972.f8295));
        TextView textView4 = this.f8986;
        cv cvVar4 = C0358.f6685;
        String strM6494 = C0358.f6687.m649(333);
        textView4.setText(String.valueOf(strM6494 == null ? "MSG333" : strM6494) + " : " + c0972.f8289);
        TextView textView5 = this.f8987;
        cv cvVar5 = C0358.f6685;
        String strM6495 = C0358.f6687.m649(FTPReply.SECURITY_MECHANISM_IS_OK);
        textView5.setText(String.valueOf(strM6495 == null ? "MSG334" : strM6495) + " : " + c0972.f8303);
        if (c0972.f8291 != 0 && c0972.f8291 != c0972.f8290) {
            TextView textView6 = this.f8988;
            cv cvVar6 = C0358.f6685;
            String strM6496 = C0358.f6687.m649(336);
            textView6.setText(String.valueOf(strM6496 == null ? "MSG336" : strM6496) + " : " + pa.m973(c0972.f8290) + " / " + pa.m973(c0972.f8291));
        } else {
            TextView textView7 = this.f8988;
            cv cvVar7 = C0358.f6685;
            String strM6497 = C0358.f6687.m649(336);
            textView7.setText(String.valueOf(strM6497 == null ? "MSG336" : strM6497) + " : " + c0972.f8290);
        }
        for (int i = 0; i < this.f8995.length; i++) {
            C0972.C0975 c0975 = null;
            if (i < c0972.f8292.size()) {
                c0975 = c0972.f8292.get(i);
            }
            if (c0975 != null) {
                this.f8995[i].setText(c0975.f8329);
            } else {
                this.f8995[i].setText((CharSequence) null);
            }
        }
        for (int i2 = 0; i2 < this.f8992.length; i2++) {
            C0972.C0975 c09752 = null;
            if (i2 < c0972.f8304.size()) {
                c09752 = c0972.f8304.get(i2);
            }
            if (c09752 != null) {
                this.f8992[i2].setText(c09752.f8329);
            } else {
                this.f8992[i2].setText((CharSequence) null);
            }
        }
    }
}
