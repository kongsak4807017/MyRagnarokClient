package o;

import android.R;
import android.graphics.Color;
import android.support.v4.internal.view.SupportMenu;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatConversionException;
import java.util.LinkedList;
import org.apache.http.message.TokenParser;

/* renamed from: o.恶, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0698 extends ku {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static String f7649;

    /* renamed from: 櫯, reason: contains not printable characters */
    static String f7650;

    /* renamed from: Ą, reason: contains not printable characters */
    AutoCompleteTextView f7651;

    /* renamed from: ą, reason: contains not printable characters */
    EditText f7652;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f7653;

    /* renamed from: 鷭, reason: contains not printable characters */
    long f7658;

    /* renamed from: ȃ, reason: contains not printable characters */
    String[] f7655 = new String[0];

    /* renamed from: ć, reason: contains not printable characters */
    LinkedList<String> f7654 = new LinkedList<>();

    /* renamed from: ˮ͍, reason: contains not printable characters */
    int f7656 = -1;

    /* renamed from: 岱, reason: contains not printable characters */
    View.OnKeyListener f7657 = new ViewOnKeyListenerC0544(this);

    C0698() {
    }

    @Override // o.ku
    /* renamed from: 櫯 */
    final boolean mo440() {
        return this.f7652.getVisibility() == 0;
    }

    @Override // o.ku
    final void h_() {
        if (this.f7652.getVisibility() == 0) {
            return;
        }
        C0358.f6674.f42.f1799.push(this);
        if (this.f7653.getVisibility() == 4) {
            this.f7658 = System.currentTimeMillis();
            this.f7653.setVisibility(0);
        }
        this.f7652.setVisibility(0);
        this.f7651.setVisibility(0);
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296408)).setImageBitmap(C0358.f6674.f42.f1758[1]);
        this.f7652.requestFocus();
        C0358.f6674.f42.f1777.bringChildToFront(this.f7652);
        C0358.f6674.f42.f1777.bringChildToFront(this.f7651);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f7653.getLayoutParams();
        layoutParams.addRule(2, 2131296407);
        this.f7653.setLayoutParams(layoutParams);
        m1425();
        c_activity c_activityVar2 = C0358.f6674;
        RunnableC0405 runnableC0405 = new RunnableC0405(this);
        if (c_activityVar2.f47 != null) {
            c_activityVar2.f47.postDelayed(new RunnableC1014(c_activityVar2, runnableC0405), 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.ku
    /* renamed from: ˮ͈ */
    public final void mo439() {
        if (!(this.f7652.getVisibility() == 0)) {
            return;
        }
        C0358.f6674.f42.f1799.remove(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f7653.getLayoutParams();
        layoutParams.addRule(2, 2131296408);
        this.f7653.setLayoutParams(layoutParams);
        this.f7652.setVisibility(4);
        this.f7651.setVisibility(4);
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296408)).setImageBitmap(C0358.f6674.f42.f1758[0]);
        this.f7653.setMaxLines(5);
        this.f7653.setMovementMethod(null);
        this.f7653.setBackgroundColor(0);
    }

    /* renamed from: ą, reason: contains not printable characters */
    private void m1425() {
        this.f7653.setMaxLines(15);
        this.f7653.setMovementMethod(new LinkMovementMethod());
        this.f7653.setBackgroundColor(1342177280);
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    final void m1429() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(C0358.f6674, R.layout.simple_dropdown_item_1line, this.f7655);
        AutoCompleteTextView autoCompleteTextView = this.f7651;
        if (autoCompleteTextView == null) {
            return;
        }
        autoCompleteTextView.setAdapter(arrayAdapter);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ void m1427(C0698 c0698) {
        if (c0698.f7656 < 0) {
            c0698.f7656 = 0;
        } else if (c0698.f7656 >= c0698.f7654.size()) {
            c0698.f7656 = c0698.f7654.size();
        } else {
            c0698.f7652.setText(c0698.f7654.get(c0698.f7656));
            c0698.f7652.selectAll();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1431(String str) {
        String strTrim = str.trim();
        int i = 0;
        while (i < this.f7655.length && !this.f7655[i].equals(strTrim)) {
            i++;
        }
        if (i < this.f7655.length) {
            return;
        }
        String[] strArr = new String[this.f7655.length + 1];
        System.arraycopy(this.f7655, 0, strArr, 0, this.f7655.length);
        this.f7655 = strArr;
        this.f7655[this.f7655.length - 1] = strTrim;
        m1429();
    }

    /* renamed from: Ą, reason: contains not printable characters */
    final void m1428() {
        int i = 0;
        String[] strArr = new String[this.f7655.length];
        for (int i2 = 0; i2 < this.f7655.length; i2++) {
            if (!this.f7655[i2].equals(f7650) && !this.f7655[i2].equals(f7649)) {
                int i3 = i;
                i++;
                strArr[i3] = this.f7655[i2];
            }
        }
        this.f7655 = (String[]) Arrays.copyOf(strArr, i);
        f7650 = "Party (" + oc.f3236 + "text)";
        f7649 = "Guild (" + oc.f3237 + "text)";
        m1431(f7650);
        m1431(f7649);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static SpannableString m1426(String str, int i, boolean z) {
        String strReplace = str.replace('\t', TokenParser.SP).replace(TokenParser.CR, TokenParser.SP).replace('\n', TokenParser.SP);
        if (z) {
            strReplace = String.valueOf(strReplace) + "\n";
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int iIndexOf = strReplace.indexOf("<ITEML>");
            if (iIndexOf == -1) {
                break;
            }
            int iIndexOf2 = strReplace.indexOf("</ITEML>", iIndexOf + 1);
            C1008 c1008M1584 = C1008.m1584(strReplace.substring(iIndexOf + 7, iIndexOf2));
            int i2 = iIndexOf2 + 8;
            if (c1008M1584 != null) {
                String str2 = "<" + c1008M1584.m1588() + ">";
                strReplace = String.valueOf(strReplace.substring(0, iIndexOf)) + str2 + strReplace.substring(i2, strReplace.length());
                C0568 c0568 = new C0568();
                c0568.f7318 = iIndexOf;
                c0568.f7317 = str2.length() + iIndexOf;
                c0568.f7316 = c1008M1584;
                arrayList.add(c0568);
            } else {
                strReplace = String.valueOf(strReplace.substring(0, iIndexOf)) + strReplace.substring(i2, strReplace.length());
            }
        }
        SpannableString spannableString = new SpannableString(strReplace);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0568 c05682 = (C0568) arrayList.get(i4);
            if (i3 + 1 < c05682.f7318 - 1) {
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb((16711680 & i) >> 16, (65280 & i) >> 8, i & 255)), i3, c05682.f7318, 33);
            }
            i3 = c05682.f7317;
            spannableString.setSpan(new C0761(c05682), c05682.f7318, c05682.f7317, 33);
        }
        spannableString.setSpan(new ForegroundColorSpan(Color.rgb((16711680 & i) >> 16, (65280 & i) >> 8, i & 255)), i3, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1432(String str, int i) {
        if (this.f7653 == null) {
            return;
        }
        this.f7653.append(m1426(str, 16777215 & i, true));
        this.f7658 = System.currentTimeMillis();
        if (this.f7653.getVisibility() == 4) {
            this.f7653.setVisibility(0);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1430(int i, int i2) {
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(2579);
        String str = strM649 == null ? "MSG2579" : strM649;
        int iIndexOf = str.indexOf("%s");
        int iIndexOf2 = str.indexOf("%d");
        if (iIndexOf == -1 || iIndexOf2 == -1) {
            return;
        }
        try {
            if (iIndexOf < iIndexOf2) {
                Object[] objArr = new Object[2];
                C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(i);
                objArr[0] = c0432M1648 == null ? null : c0432M1648.m1328(true);
                objArr[1] = Integer.valueOf(i2);
                str = String.format(str, objArr);
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i2);
                C0432 c0432M16482 = C0358.f6685.f1030.f967.m1648(i);
                objArr2[1] = c0432M16482 == null ? null : c0432M16482.m1328(true);
                str = String.format(str, objArr2);
            }
        } catch (IllegalFormatConversionException e) {
            nz.m907("display_petfood_success_msg: " + e.toString());
        }
        m1432(str, SupportMenu.USER_MASK);
    }
}
