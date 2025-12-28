package o;

import android.graphics.Bitmap;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.HttpStatus;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cg implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f889;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bo f890;

    cg(bo boVar, boolean[] zArr) {
        this.f890 = boVar;
        this.f889 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        je.f1732 = null;
        je jeVar = C0358.f6674.f42;
        Bitmap[] bitmapArr = C0358.f6685.f1027;
        Bitmap[] bitmapArr2 = C0358.f6685.f1020;
        Bitmap[] bitmapArr3 = C0358.f6685.f1022;
        Bitmap bitmap = C0358.f6685.f1011;
        Bitmap bitmap2 = C0358.f6685.f1031;
        Bitmap[] bitmapArr4 = C0358.f6685.f1028;
        Bitmap[] bitmapArr5 = C0358.f6685.f1012;
        Bitmap[] bitmapArr6 = C0358.f6685.f1013;
        Bitmap[] bitmapArr7 = C0358.f6685.f1014;
        Bitmap[] bitmapArr8 = C0358.f6685.f1034;
        Bitmap bitmap3 = C0358.f6685.f1024;
        jeVar.f1758 = bitmapArr;
        jeVar.f1788 = bitmapArr2;
        jeVar.f1759 = bitmapArr3;
        jeVar.f1760 = bitmapArr4;
        jeVar.f1776 = bitmapArr5;
        jeVar.f1761 = bitmapArr6;
        jeVar.f1784 = bitmapArr7;
        jeVar.f1762 = bitmapArr8;
        jeVar.f1815 = bitmap;
        jeVar.f1821 = bitmap2;
        C0358.f6674.setContentView(2130903092);
        jeVar.f1777 = (RelativeLayout) C0358.f6674.findViewById(2131296405);
        RelativeLayout relativeLayout = (RelativeLayout) C0358.f6674.f44.getParent();
        if (relativeLayout != null) {
            relativeLayout.removeView(C0358.f6674.f44);
        }
        jeVar.f1777.addView(C0358.f6674.f44, 0);
        ImageView imageView = (ImageView) C0358.f6674.findViewById(2131296408);
        imageView.setOnClickListener(jeVar.f1764);
        imageView.setImageBitmap(jeVar.f1758[0]);
        ImageView imageView2 = (ImageView) C0358.f6674.findViewById(2131296409);
        imageView2.setOnClickListener(jeVar.f1765);
        imageView2.setImageBitmap(jeVar.f1788[0]);
        ImageView imageView3 = (ImageView) C0358.f6674.findViewById(2131296410);
        imageView3.setOnClickListener(jeVar.f1796);
        imageView3.setImageBitmap(jeVar.f1759[0]);
        ImageView imageView4 = (ImageView) C0358.f6674.findViewById(2131296411);
        imageView4.setOnClickListener(jeVar.f1766);
        imageView4.setImageBitmap(jeVar.f1760[0]);
        ImageView imageView5 = (ImageView) C0358.f6674.findViewById(2131296412);
        imageView5.setOnClickListener(jeVar.f1767);
        imageView5.setImageBitmap(jeVar.f1776[0]);
        ImageView imageView6 = (ImageView) C0358.f6674.findViewById(2131296413);
        imageView6.setOnClickListener(jeVar.f1768);
        imageView6.setImageBitmap(jeVar.f1761[0]);
        ImageView imageView7 = (ImageView) C0358.f6674.findViewById(2131296414);
        imageView7.setOnClickListener(jeVar.f1769);
        imageView7.setImageBitmap(jeVar.f1784[0]);
        ImageView imageView8 = (ImageView) C0358.f6674.findViewById(2131296415);
        imageView8.setOnClickListener(jeVar.f1789);
        imageView8.setImageBitmap(jeVar.f1762[0]);
        ImageView imageView9 = (ImageView) C0358.f6674.findViewById(2131296426);
        if (bitmap3 == null || (C0358.f6667.f4846 == null && C0358.f6667.f4815)) {
            imageView9.setVisibility(8);
        } else {
            imageView9.setVisibility(0);
            imageView9.setImageBitmap(bitmap3);
            imageView9.setOnClickListener(new ka(jeVar));
        }
        ((ImageView) C0358.f6674.findViewById(2131296419)).setOnTouchListener(jeVar.f1770);
        ((ImageView) C0358.f6674.findViewById(2131296419)).setOnClickListener(jeVar.f1771);
        ((ImageView) C0358.f6674.findViewById(2131296419)).setOnLongClickListener(jeVar.f1779);
        jeVar.f1791 = (TextView) C0358.f6674.findViewById(2131296424);
        jeVar.f1812 = (TextView) C0358.f6674.findViewById(2131296425);
        jeVar.f1819 = (TextView) C0358.f6674.findViewById(2131296423);
        jeVar.f1823 = (Button) C0358.f6674.findViewById(2131296279);
        jeVar.f1823.setOnClickListener(new kb(jeVar));
        C0698 c0698 = jeVar.f1792;
        c0698.f7651 = (AutoCompleteTextView) C0358.f6674.findViewById(2131296407);
        c0698.f7652 = (EditText) C0358.f6674.findViewById(2131296406);
        c0698.f7653 = (TextView) C0358.f6674.findViewById(2131296417);
        c0698.f7651.setThreshold(0);
        c0698.f7651.setDropDownWidth(HttpStatus.SC_MULTIPLE_CHOICES);
        c0698.f7651.setSingleLine(true);
        c0698.f7652.setOnKeyListener(c0698.f7657);
        c0698.f7652.setSingleLine(true);
        c0698.m1429();
        c0698.f7652.setVisibility(4);
        c0698.f7651.setVisibility(4);
        c0698.f7653.setMaxLines(5);
        c0698.f7653.setMovementMethod(null);
        c0698.f7653.setBackgroundColor(0);
        c0698.f7653.setText((CharSequence) null);
        c0698.f7653.setLinkTextColor(-1575036);
        c0698.m1428();
        C0358.f6674.getWindow().addFlags(128);
        if (jeVar.f1794 == null) {
            jeVar.f1794 = new ArrayList<>();
            int iM648 = C0358.f6687.m648("nhotkeys" + je.m705(), 0);
            for (int i = 0; i < iM648; i++) {
                jeVar.f1794.add(new kv(i));
            }
        }
        Iterator<kv> it = jeVar.f1794.iterator();
        while (it.hasNext()) {
            it.next().h_();
        }
        ch chVar = jeVar.f1781;
        chVar.mo439();
        chVar.f902.h_();
        jeVar.f1797.f2324 = new lq();
        jeVar.m724();
        C0358.f6669.f2066.f7970 = nh.NONE;
        C0358.f6671.f758 = true;
        this.f889[0] = true;
    }
}
