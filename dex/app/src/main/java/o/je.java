package o;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import java.io.File;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import o.C1035;
import o.C1035.C1038;
import o.em;
import o.gs;
import o.kv;
import org.apache.http.HttpStatus;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class je {

    /* renamed from: ř, reason: contains not printable characters */
    private static boolean f1731 = false;

    /* renamed from: 䕌, reason: contains not printable characters */
    static Bitmap f1732;

    /* renamed from: 뛒, reason: contains not printable characters */
    private static /* synthetic */ int[] f1733;

    /* renamed from: Ą, reason: contains not printable characters */
    ProgressDialog f1734;

    /* renamed from: ą, reason: contains not printable characters */
    AlertDialog f1735;

    /* renamed from: Ć, reason: contains not printable characters */
    ProgressBar f1736;

    /* renamed from: ć, reason: contains not printable characters */
    public ib f1737;

    /* renamed from: đ, reason: contains not printable characters */
    public gy f1739;

    /* renamed from: Ē, reason: contains not printable characters */
    public ij f1740;

    /* renamed from: ē, reason: contains not printable characters */
    public C0653 f1741;

    /* renamed from: Ė, reason: contains not printable characters */
    public ge f1742;

    /* renamed from: ė, reason: contains not printable characters */
    public C0399 f1743;

    /* renamed from: Ę, reason: contains not printable characters */
    public j f1744;

    /* renamed from: ę, reason: contains not printable characters */
    public C1024 f1745;

    /* renamed from: ġ, reason: contains not printable characters */
    public az f1746;

    /* renamed from: ģ, reason: contains not printable characters */
    public C1046 f1747;

    /* renamed from: Ĥ, reason: contains not printable characters */
    public C0727 f1748;

    /* renamed from: ĥ, reason: contains not printable characters */
    public iz f1749;

    /* renamed from: Ħ, reason: contains not printable characters */
    public ls f1750;

    /* renamed from: Ĩ, reason: contains not printable characters */
    public C0483 f1752;

    /* renamed from: Ī, reason: contains not printable characters */
    public C0876 f1753;

    /* renamed from: ī, reason: contains not printable characters */
    public C0569 f1754;

    /* renamed from: Ĭ, reason: contains not printable characters */
    public C1025 f1755;

    /* renamed from: Į, reason: contains not printable characters */
    public C0490 f1756;

    /* renamed from: į, reason: contains not printable characters */
    public cl f1757;

    /* renamed from: ĸ, reason: contains not printable characters */
    Bitmap[] f1758;

    /* renamed from: ĺ, reason: contains not printable characters */
    Bitmap[] f1759;

    /* renamed from: Ļ, reason: contains not printable characters */
    Bitmap[] f1760;

    /* renamed from: Ľ, reason: contains not printable characters */
    Bitmap[] f1761;

    /* renamed from: Ŀ, reason: contains not printable characters */
    Bitmap[] f1762;

    /* renamed from: ȃ, reason: contains not printable characters */
    ProgressDialog f1773;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public C0056 f1774;

    /* renamed from: Ƞ, reason: contains not printable characters */
    public C0649 f1775;

    /* renamed from: ɕ, reason: contains not printable characters */
    Bitmap[] f1776;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    RelativeLayout f1777;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public en f1778;

    /* renamed from: ܕ, reason: contains not printable characters */
    public ch f1781;

    /* renamed from: ܨ, reason: contains not printable characters */
    public au f1782;

    /* renamed from: ঽ্, reason: contains not printable characters */
    public y f1783;

    /* renamed from: ਓ, reason: contains not printable characters */
    Bitmap[] f1784;

    /* renamed from: 㥳, reason: contains not printable characters */
    public C0744 f1785;

    /* renamed from: 㱽, reason: contains not printable characters */
    public ip f1786;

    /* renamed from: 㵼, reason: contains not printable characters */
    public C0570 f1787;

    /* renamed from: 㺗, reason: contains not printable characters */
    Bitmap[] f1788;

    /* renamed from: 䍼, reason: contains not printable characters */
    public TextView f1791;

    /* renamed from: 䲑, reason: contains not printable characters */
    public eb f1793;

    /* renamed from: 䲕, reason: contains not printable characters */
    ArrayList<kv> f1794;

    /* renamed from: 囃, reason: contains not printable characters */
    public es f1795;

    /* renamed from: 岱, reason: contains not printable characters */
    public n f1797;

    /* renamed from: 崲, reason: contains not printable characters */
    public dx f1798;

    /* renamed from: 庸, reason: contains not printable characters */
    public hj f1800;

    /* renamed from: 廂, reason: contains not printable characters */
    public C0767 f1801;

    /* renamed from: 廅, reason: contains not printable characters */
    public gk f1802;

    /* renamed from: 廑, reason: contains not printable characters */
    public fe f1803;

    /* renamed from: 廕, reason: contains not printable characters */
    public C0502 f1804;

    /* renamed from: 漐, reason: contains not printable characters */
    kv f1806;

    /* renamed from: 瞣, reason: contains not printable characters */
    public C0523 f1807;

    /* renamed from: 簇, reason: contains not printable characters */
    public C0841 f1808;

    /* renamed from: 纫, reason: contains not printable characters */
    public Cif f1809;

    /* renamed from: 躆, reason: contains not printable characters */
    public C0778 f1810;

    /* renamed from: 釯, reason: contains not printable characters */
    public TextView f1812;

    /* renamed from: 釳, reason: contains not printable characters */
    C0057 f1813;

    /* renamed from: 麹, reason: contains not printable characters */
    Bitmap f1815;

    /* renamed from: 黬, reason: contains not printable characters */
    public eh f1816;

    /* renamed from: 齴, reason: contains not printable characters */
    public C0804 f1817;

    /* renamed from: ꑣ, reason: contains not printable characters */
    gq[] f1818;

    /* renamed from: 냆, reason: contains not printable characters */
    TextView f1819;

    /* renamed from: 띥, reason: contains not printable characters */
    public C0398 f1820;

    /* renamed from: 윬, reason: contains not printable characters */
    Bitmap f1821;

    /* renamed from: 졸, reason: contains not printable characters */
    public gt f1822;

    /* renamed from: 진, reason: contains not printable characters */
    TextView f1823;

    /* renamed from: 鷭, reason: contains not printable characters */
    boolean f1814 = false;

    /* renamed from: 櫯, reason: contains not printable characters */
    boolean f1805 = false;

    /* renamed from: ċ, reason: contains not printable characters */
    public C0055 f1738 = new C0055();

    /* renamed from: 䒧, reason: contains not printable characters */
    public C0698 f1792 = new C0698();

    /* renamed from: 差, reason: contains not printable characters */
    public Stack<ku> f1799 = new Stack<>();

    /* renamed from: 䆬, reason: contains not printable characters */
    HashMap<String, Bitmap> f1790 = new HashMap<>();

    /* renamed from: 釫, reason: contains not printable characters */
    HashMap<Integer, ImageView> f1811 = new HashMap<>();

    /* renamed from: ف, reason: contains not printable characters */
    private View.OnClickListener f1780 = new jf(this);

    /* renamed from: ś, reason: contains not printable characters */
    private AdapterView.OnItemSelectedListener f1772 = new js(this);

    /* renamed from: ō, reason: contains not printable characters */
    Runnable f1763 = new ke(this);

    /* renamed from: Ŏ, reason: contains not printable characters */
    View.OnClickListener f1764 = new ki(this);

    /* renamed from: ŏ, reason: contains not printable characters */
    View.OnClickListener f1765 = new kj(this);

    /* renamed from: 坴, reason: contains not printable characters */
    View.OnClickListener f1796 = new kk(this);

    /* renamed from: ő, reason: contains not printable characters */
    View.OnClickListener f1766 = new kl(this);

    /* renamed from: Œ, reason: contains not printable characters */
    View.OnClickListener f1767 = new km(this);

    /* renamed from: œ, reason: contains not printable characters */
    View.OnClickListener f1768 = new kn(this);

    /* renamed from: Ŕ, reason: contains not printable characters */
    View.OnClickListener f1769 = new jg(this);

    /* renamed from: 㺳, reason: contains not printable characters */
    View.OnClickListener f1789 = new jh(this);

    /* renamed from: Ŗ, reason: contains not printable characters */
    View.OnTouchListener f1770 = new ji(this);

    /* renamed from: ŗ, reason: contains not printable characters */
    View.OnClickListener f1771 = new jj(this);

    /* renamed from: غ, reason: contains not printable characters */
    View.OnLongClickListener f1779 = new jk(this);

    /* renamed from: ħ, reason: contains not printable characters */
    public fn f1751 = new fn();

    /* renamed from: ċ, reason: contains not printable characters */
    private static /* synthetic */ int[] m707() {
        int[] iArr = f1733;
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
        f1733 = iArr2;
        return iArr2;
    }

    /* renamed from: o.je$鷭, reason: contains not printable characters */
    class C0057 {

        /* renamed from: Ą, reason: contains not printable characters */
        ProgressBar f1839;

        /* renamed from: ȃ, reason: contains not printable characters */
        ProgressBar f1841;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        TextView f1842;

        /* renamed from: 櫯, reason: contains not printable characters */
        TextView f1843;

        /* renamed from: 鷭, reason: contains not printable characters */
        LinearLayout f1844;

        C0057(c_activity c_activityVar) {
            this.f1844 = (LinearLayout) c_activityVar.getLayoutInflater().inflate(2130903055, (ViewGroup) null);
            this.f1843 = (TextView) this.f1844.findViewById(2131296265);
            this.f1842 = (TextView) this.f1844.findViewById(2131296259);
            this.f1841 = (ProgressBar) this.f1844.findViewById(2131296293);
            this.f1839 = (ProgressBar) this.f1844.findViewById(2131296335);
        }
    }

    public je(c_activity c_activityVar) {
        this.f1737 = new ib(c_activityVar);
        this.f1778 = new en(c_activityVar);
        this.f1813 = new C0057(c_activityVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m727() {
        AbstractC0988 abstractC0988;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        lm lmVar = C0358.f6664.f2005.get(C0358.f6664.f2004.f8632.f8661.f8689);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        if (abstractC0988 == null) {
            return;
        }
        String[] strArr = new String[1];
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1113);
        strArr[0] = strM649 == null ? "MSG1113" : strM649;
        builder.setItems(strArr, new jm(this));
        builder.show();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m725() {
        AbstractC0988 abstractC0988;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        lm lmVar = C0358.f6664.f2005.get(C0358.f6664.f2004.f8618.f8661.f8689);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        if (abstractC0988 == null) {
            return;
        }
        if (C0358.f6664.f2004.f8618.f8661 == null) {
            C0358.f6664.f2004.f8618.f8661 = C0358.f6664.f2004.new C1038();
        }
        C1035.C1038 c1038 = C0358.f6664.f2004.f8618.f8661;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(586);
        StringBuilder sbAppend = new StringBuilder(String.valueOf(strM649 == null ? "MSG586" : strM649)).append(": ").append(m706(c1038.f8681)).append(" ").append((int) c1038.f8681).append("; ");
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(587);
        builder.setTitle(sbAppend.append(strM6492 == null ? "MSG587" : strM6492).append(": ").append(m711(c1038.f8683)).toString());
        String[] strArr = new String[2];
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(1113);
        strArr[0] = strM6493 == null ? "MSG1113" : strM6493;
        cv cvVar4 = C0358.f6685;
        String strM6494 = C0358.f6687.m649(1114);
        strArr[1] = strM6494 == null ? "MSG1114" : strM6494;
        builder.setItems(strArr, new jn(this));
        builder.show();
    }

    /* renamed from: ą, reason: contains not printable characters */
    private static String m706(int i) {
        if (i < 20) {
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(668);
            return strM649 == null ? "MSG668" : strM649;
        }
        if (i < 40) {
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(669);
            return strM6492 == null ? "MSG669" : strM6492;
        }
        if (i < 60) {
            cv cvVar3 = C0358.f6685;
            String strM6493 = C0358.f6687.m649(670);
            return strM6493 == null ? "MSG670" : strM6493;
        }
        cv cvVar4 = C0358.f6685;
        String strM6494 = C0358.f6687.m649(671);
        return strM6494 == null ? "MSG671" : strM6494;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static String m711(int i) {
        if (i < 250) {
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(673);
            return strM649 == null ? "MSG673" : strM649;
        }
        if (i < 500) {
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(674);
            return strM6492 == null ? "MSG674" : strM6492;
        }
        if (i < 750) {
            cv cvVar3 = C0358.f6685;
            String strM6493 = C0358.f6687.m649(675);
            return strM6493 == null ? "MSG675" : strM6493;
        }
        cv cvVar4 = C0358.f6685;
        String strM6494 = C0358.f6687.m649(676);
        return strM6494 == null ? "MSG676" : strM6494;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void m721() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        C1035.C1038 c1038 = C0358.f6664.f2004.f8641.f8675;
        if (c1038 == null) {
            return;
        }
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(586);
        StringBuilder sbAppend = new StringBuilder(String.valueOf(strM649 == null ? "MSG586" : strM649)).append(": ").append(m706(c1038.f8681)).append("(").append((int) c1038.f8681).append(") ; ");
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(587);
        builder.setTitle(sbAppend.append(strM6492 == null ? "MSG587" : strM6492).append(": ").append(m711(c1038.f8683)).toString());
        String[] strArr = new String[3];
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(593);
        strArr[0] = strM6493 == null ? "MSG593" : strM6493;
        cv cvVar4 = C0358.f6685;
        String strM6494 = C0358.f6687.m649(594);
        strArr[1] = strM6494 == null ? "MSG594" : strM6494;
        cv cvVar5 = C0358.f6685;
        String strM6495 = C0358.f6687.m649(595);
        strArr[2] = strM6495 == null ? "MSG595" : strM6495;
        builder.setItems(strArr, new jo(this));
        builder.show();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m731(String str) {
        if (this.f1735 != null) {
            C0358.f6674.mo139(new jt(this));
        }
        C0358.f6674.mo139(new jr(this, str));
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m726(int i) {
        em.C0039 c0039 = C0358.f6685.f1030.f974.f1202.get(Integer.valueOf(i));
        String str = c0039 == null ? null : c0039.f1204;
        if (str == null) {
            return;
        }
        String str2 = "data\\texture\\" + str;
        if (this.f1811.get(Integer.valueOf(i)) != null) {
            return;
        }
        ImageView imageView = (ImageView) C0358.f6674.getLayoutInflater().inflate(2130903120, (ViewGroup) null);
        imageView.setId(i);
        Bitmap bitmap = this.f1790.get(str);
        if (bitmap == null) {
            C0358.f6685.mo139(new ju(this, str2, str, imageView));
        } else {
            imageView.setImageBitmap(bitmap);
        }
        ((RelativeLayout) C0358.f6674.f42.f1777.findViewById(2131296416)).addView(imageView, new RelativeLayout.LayoutParams(-2, -2));
        this.f1811.put(Integer.valueOf(i), imageView);
        m708();
    }

    /* renamed from: Ȋ, reason: contains not printable characters */
    private void m708() {
        int id = -1;
        for (ImageView imageView : this.f1811.values()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (id == -1) {
                layoutParams.addRule(10);
            } else {
                layoutParams.addRule(3, id);
            }
            imageView.setLayoutParams(layoutParams);
            id = imageView.getId();
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void m722(int i) {
        ImageView imageViewRemove;
        em.C0039 c0039 = C0358.f6685.f1030.f974.f1202.get(Integer.valueOf(i));
        if ((c0039 == null ? null : c0039.f1204) != null && (imageViewRemove = this.f1811.remove(Integer.valueOf(i))) != null) {
            ((RelativeLayout) C0358.f6674.f42.f1777.findViewById(2131296416)).removeView(imageViewRemove);
            m708();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m728(int i, int i2) {
        Iterator<kv> it = this.f1794.iterator();
        while (it.hasNext()) {
            kv next = it.next();
            if (next != null && next.f1926 == i && next.f1934 == kv.EnumC0058.ITEM) {
                if (i2 < 0) {
                    i2 = 0;
                }
                next.m761(i2);
            }
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    final void m720(int i) {
        if (this.f1794 == null) {
            return;
        }
        int i2 = 0;
        for (C1008 c1008 : C0358.f6664.f2004.f8622.values()) {
            if (c1008 != null && c1008.f8502 == i && c1008.f8490 == 0 && c1008.f8500 > i2) {
                i2 = c1008.f8500;
            }
        }
        Iterator<kv> it = this.f1794.iterator();
        while (it.hasNext()) {
            kv next = it.next();
            if (next != null && next.f1926 == i && next.f1934 == kv.EnumC0058.ITEM) {
                next.m761(i2);
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m733(gt gtVar) {
        if (this.f1794 == null) {
            return;
        }
        Iterator<kv> it = this.f1794.iterator();
        while (it.hasNext()) {
            kv next = it.next();
            if (next.f1934 == kv.EnumC0058.SKILL && next.f1926 == gtVar.f1409 && (next.f1916 == 0 || next.f1916 > gtVar.f1407)) {
                next.m761(gtVar.f1407);
                return;
            }
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    final void m719() {
        if (C0358.f6664.f2004 == null) {
            return;
        }
        Iterator<gt> it = C0358.f6664.f2004.f8642.f8673.values().iterator();
        while (it.hasNext()) {
            m733(it.next());
        }
        if (C0358.f6664.f2004.f8618 != null) {
            Iterator<gt> it2 = C0358.f6664.f2004.f8618.f8666.f8673.values().iterator();
            while (it2.hasNext()) {
                m733(it2.next());
            }
        }
        if (C0358.f6664.f2004.f8632 != null) {
            Iterator<gt> it3 = C0358.f6664.f2004.f8632.f8666.f8673.values().iterator();
            while (it3.hasNext()) {
                m733(it3.next());
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private kv m712(c_point c_pointVar, c_point c_pointVar2) {
        Rect rect = new Rect(c_pointVar.x, c_pointVar.y, c_pointVar.x + c_pointVar2.x, c_pointVar.y + c_pointVar2.y);
        Iterator<kv> it = this.f1794.iterator();
        while (it.hasNext()) {
            kv next = it.next();
            if (next.f1920.equals(c_pointVar) || rect.intersect(new Rect(next.f1920.x, next.f1920.y, next.f1920.x + next.f1932.getWidth(), next.f1920.y + next.f1932.getHeight()))) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m735(kv.EnumC0058 enumC0058, int i, int i2, int i3, byte b) {
        c_point c_pointVar;
        c_point c_pointVar2;
        kv kvVar;
        if (this.f1806 == null) {
            if (enumC0058 == kv.EnumC0058.HOMUN && C0358.f6664.f2004.f8618 != null) {
                this.f1806 = new kv(i, 1, kv.EnumC0058.HOMUN, kv.f1909, 0, 0, 0, (byte) 0);
            } else if (enumC0058 == kv.EnumC0058.MERC && C0358.f6664.f2004.f8632 != null) {
                this.f1806 = new kv(i, 1, kv.EnumC0058.MERC, kv.f1909, 0, 0, i3, b);
            } else {
                this.f1806 = new kv(1, 1, kv.EnumC0058.SKILL, kv.f1909, 0, 0, 0, (byte) 0);
            }
        }
        c_point c_pointVar3 = new c_point(this.f1806.f1932.getPaddingLeft() + this.f1806.f1932.getPaddingRight(), this.f1806.f1932.getPaddingTop() + this.f1806.f1932.getPaddingBottom());
        int i4 = (int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 80.0f);
        if (enumC0058 == kv.EnumC0058.EMOTION) {
            c_pointVar = new c_point(kv.f1909);
            c_pointVar.offset(((Point) c_pointVar3).x, ((Point) c_pointVar3).y);
            c_pointVar2 = new c_point(0, 0);
        } else {
            c_pointVar = new c_point(kv.f1909);
            c_pointVar.offset(((Point) c_pointVar3).x, ((Point) c_pointVar3).y);
            c_pointVar2 = new c_point(C0358.f6669.f2058.x - c_pointVar.x, (i4 - (kv.f1913.y % i4)) + kv.f1913.y);
        }
        c_point c_pointVar4 = new c_point(c_pointVar2);
        int iMin = Math.min((int) ((ImageView) C0358.f6674.findViewById(2131296419)).getY(), C0358.f6669.f2058.y);
        while (m712(c_pointVar4, c_pointVar) != null) {
            c_pointVar4.y += kv.f1913.y;
            if (c_pointVar4.y + c_pointVar.y >= iMin) {
                if (enumC0058 == kv.EnumC0058.EMOTION) {
                    c_pointVar4.x += c_pointVar.x;
                } else {
                    c_pointVar4.x -= c_pointVar.x;
                }
                c_pointVar4.y = c_pointVar2.y;
            }
        }
        if (m712(c_pointVar4, c_pointVar) != null) {
            Toast.makeText(C0358.f6674, "Couldn't find a place for hotkey", 0).show();
            return;
        }
        if (enumC0058 == kv.EnumC0058.MERC) {
            kvVar = new kv(i, i2, enumC0058, kv.f1909, c_pointVar4.x, c_pointVar4.y, i3, b);
        } else {
            kvVar = new kv(i, i2, enumC0058, kv.f1909, c_pointVar4.x, c_pointVar4.y, 0, (byte) 0);
        }
        kvVar.h_();
        this.f1794.add(kvVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final boolean m738(kv.EnumC0058 enumC0058, int i) {
        Iterator<kv> it = this.f1794.iterator();
        while (it.hasNext()) {
            kv next = it.next();
            if ((next.f1926 == i && next.f1934 == enumC0058) || ((next.f1934 == enumC0058 && enumC0058 == kv.EnumC0058.HOMUN) || (next.f1934 == enumC0058 && enumC0058 == kv.EnumC0058.MERC))) {
                if (next.f1932.getParent() != null) {
                    C0358.f6674.f42.f1777.removeView(next.f1932);
                }
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m715(gt gtVar, int i, nu nuVar) {
        mj mjVar = C0358.f6669.f2061;
        if (!C0358.f6669.f2056) {
            mjVar = null;
        }
        if (nuVar != nu.HOM || C0358.f6664.f2004.f8618 != null) {
            if (nuVar == nu.MER && C0358.f6664.f2004.f8632 == null) {
                return;
            }
            C1035.Cif cifM713 = null;
            if (m713(nuVar) != null) {
                cifM713 = m713(nuVar);
            }
            if (gtVar.f1408 == 0) {
                return;
            }
            if ((gtVar.f1408 & 4) != 0) {
                if (cifM713 != null && C0358.f6664.f2004.f8618 != null) {
                    cifM713.f8654 = nc.SKILL_OBJECT_CMD;
                    cifM713.f8665 = C0358.f6664.f2004.f8618.f8661.f8689;
                    C0358.f6685.f1030.f979.m1631(nuVar);
                    return;
                }
                C0358.f6671.mo454(new C0425(gtVar.f1409, i, C0358.f6664.f2004.f1998));
                return;
            }
            if ((gtVar.f1408 & 2) != 0) {
                C0358.f6674.f42.m734(gtVar, i);
                return;
            }
            if (!((gtVar.f1408 & 16) != 0)) {
                if (!((gtVar.f1408 & 1) != 0)) {
                    return;
                }
            }
            if (mjVar != null && mg.m849(gtVar, mjVar)) {
                if (cifM713 != null) {
                    cifM713.f8654 = nc.SKILL_OBJECT_CMD;
                    cifM713.f8665 = mjVar.f2123.f1998;
                    C0358.f6685.f1030.f979.m1631(nuVar);
                    return;
                }
                C0358.f6671.mo454(new C0425(gtVar.f1409, i, mjVar.f2123.f1998));
                return;
            }
            C0358.f6674.f42.m734(gtVar, i);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static C1035.Cif m713(nu nuVar) {
        if (nuVar == nu.HOM) {
            return C0358.f6664.f2004.f8618;
        }
        if (nuVar == nu.MER) {
            return C0358.f6664.f2004.f8632;
        }
        return null;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static void m709(int i, int i2) {
        if (C0358.f6664.f2004 == null || C0358.f6664.f2004.f8642 == null) {
            return;
        }
        nu nuVar = null;
        C1035.C1036 c1036 = C0358.f6664.f2004.f8642;
        if (c1036.f8673.get(Integer.valueOf(i)) == null && C0358.f6664.f2004.f8618 != null) {
            c1036 = C0358.f6664.f2004.f8618.f8666;
            nuVar = nu.HOM;
        }
        if (c1036.f8673.get(Integer.valueOf(i)) == null && C0358.f6664.f2004.f8632 != null) {
            c1036 = C0358.f6664.f2004.f8632.f8666;
            nuVar = nu.MER;
        }
        gt gtVar = c1036.f8673.get(Integer.valueOf(i));
        if (gtVar == null) {
            nz.m907("Unknown error");
        } else {
            m715(gtVar, i2, nuVar);
        }
    }

    /* renamed from: Ą, reason: contains not printable characters */
    final void m716() {
        if (this.f1794 == null) {
            return;
        }
        for (int i = 0; i < this.f1794.size(); i++) {
            this.f1794.get(i).m762(i);
        }
        C0358.f6687.m658("nhotkeys" + m705(), 0, String.valueOf(this.f1794.size()));
    }

    /* renamed from: ą, reason: contains not printable characters */
    static String m705() {
        return " " + C0358.f6686.f6700 + " " + C0358.f6688.f6696;
    }

    /* renamed from: o.je$ˮ͈, reason: contains not printable characters */
    class C0055 {

        /* renamed from: 櫯, reason: contains not printable characters */
        int f1831;

        /* renamed from: 鷭, reason: contains not printable characters */
        AlertDialog f1832;

        C0055() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static int m739(String str, int i) throws ParseException {
            boolean z;
            String strSubstring = str.substring(i);
            if (strSubstring.length() < 7) {
                throw new ParseException("String is too short", 0);
            }
            if (strSubstring.charAt(0) != '^') {
                throw new ParseException("String doesn't start with ^ symbol", 0);
            }
            for (int i2 = 1; i2 < 7; i2++) {
                char cCharAt = strSubstring.charAt(i2);
                if (!Character.isDigit(cCharAt)) {
                    switch (Character.toLowerCase(cCharAt)) {
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                        case HttpStatus.SC_PROCESSING /* 102 */:
                            z = true;
                            break;
                        default:
                            z = false;
                            break;
                    }
                } else {
                    z = true;
                }
                if (!z) {
                    throw new ParseException("Part of the color code is not a valid hex digit", i2);
                }
            }
            try {
                return Integer.parseInt(strSubstring.substring(1, 7), 16);
            } catch (NumberFormatException e) {
                throw new ParseException(e.getMessage(), 1);
            }
        }
    }

    /* renamed from: o.je$櫯, reason: contains not printable characters */
    class C0056 {

        /* renamed from: ą, reason: contains not printable characters */
        private View.OnClickListener f1834 = new kr(this);

        /* renamed from: ȃ, reason: contains not printable characters */
        int f1835;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        boolean f1836;

        /* renamed from: 櫯, reason: contains not printable characters */
        AlertDialog f1837;

        /* renamed from: 鷭, reason: contains not printable characters */
        RelativeLayout f1838;

        C0056(c_activity c_activityVar) {
            this.f1838 = (RelativeLayout) ((LayoutInflater) c_activityVar.getSystemService("layout_inflater")).inflate(2130903098, (ViewGroup) null);
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final void m740(boolean z, int i) {
            Context context = this.f1838.getContext();
            if (this.f1837 == null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setView(this.f1838);
                builder.setCancelable(false);
                this.f1837 = builder.create();
                this.f1837.show();
                ((Button) this.f1837.findViewById(2131296435)).setOnClickListener(this.f1834);
            } else {
                this.f1837.show();
            }
            Button button = (Button) this.f1837.findViewById(2131296435);
            if (z) {
                button.setInputType(8192);
            } else {
                button.setInputType(0);
            }
            this.f1836 = z;
            this.f1835 = i;
        }
    }

    /* renamed from: o.je$if, reason: invalid class name */
    class Cif {

        /* renamed from: 櫯, reason: contains not printable characters */
        AlertDialog f1828;

        /* renamed from: 鷭, reason: contains not printable characters */
        RelativeLayout f1829;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        View.OnClickListener f1827 = new ko(this);

        /* renamed from: ȃ, reason: contains not printable characters */
        View.OnClickListener f1826 = new kp(this);

        /* renamed from: Ą, reason: contains not printable characters */
        View.OnClickListener f1824 = new kq(this);

        Cif(c_activity c_activityVar) {
            this.f1829 = (RelativeLayout) ((LayoutInflater) c_activityVar.getSystemService("layout_inflater")).inflate(2130903114, (ViewGroup) null);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static SpannableStringBuilder m710(String str, boolean z) throws NumberFormatException {
        int iIndexOf;
        int iIntValue;
        if (str == null) {
            return null;
        }
        int i = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i2 = 0;
        int i3 = 0;
        while (i3 < str.length()) {
            if (str.charAt(i3) == '^' && i3 + 7 <= str.length()) {
                try {
                    iIntValue = Integer.valueOf(str.substring(i3 + 1, i3 + 7), 16).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = 0;
                }
                spannableStringBuilder.delete(i3, i3 + 7);
            } else if (i3 != str.length() - 1) {
                i3++;
            } else {
                i3++;
                iIntValue = 0;
            }
            if (z) {
                if (i == 0) {
                    i = ViewCompat.MEASURED_SIZE_MASK;
                } else if (i == 16777215) {
                    i = 8947848;
                }
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan((-16777216) | i), i2, i3, 17);
            str = spannableStringBuilder.toString();
            i = iIntValue;
            i2 = i3;
            i3++;
        }
        String[] strArr = {"ITEM", "NAVI"};
        int length = 0;
        while (length < str.length()) {
            int length2 = strArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                String str2 = strArr[i4];
                String str3 = "<" + str2 + ">";
                String str4 = "</" + str2 + ">";
                if (!str.regionMatches(length, str3, 0, str3.length()) || (iIndexOf = str.indexOf(str4, length + 1)) == -1) {
                    i4++;
                } else {
                    String strSubstring = str.substring(str3.length() + length, iIndexOf);
                    int iIndexOf2 = strSubstring.indexOf("<INFO>");
                    int iIndexOf3 = strSubstring.indexOf("</INFO>");
                    String strSubstring2 = null;
                    if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                        strSubstring2 = strSubstring.substring(iIndexOf2 + 6, iIndexOf3);
                        strSubstring = String.valueOf(strSubstring.substring(0, iIndexOf2)) + strSubstring.substring(iIndexOf3 + 7, strSubstring.length());
                    }
                    spannableStringBuilder.replace(length, str4.length() + iIndexOf, (CharSequence) strSubstring);
                    str = spannableStringBuilder.toString();
                    Object jwVar = null;
                    if (!str2.equals("ITEM")) {
                        if (str2.equals("NAVI")) {
                            String[] strArrSplit = strSubstring2.split(",");
                            if (strArrSplit.length >= 3) {
                                jwVar = new jx(strArrSplit);
                            }
                        }
                    } else {
                        try {
                            int i5 = Integer.parseInt(strSubstring2.trim());
                            if (C0358.f6685.f1030.f967.m1648(i5) != null) {
                                jwVar = new jw(i5);
                            }
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    if (jwVar != null) {
                        spannableStringBuilder.setSpan(jwVar, length, strSubstring.length() + length, 17);
                    }
                    length += strSubstring.length() - 1;
                }
            }
            length++;
        }
        return spannableStringBuilder;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m737(String[] strArr) {
        C0358.f6674.setContentView(2130903122);
        Spinner spinner = (Spinner) C0358.f6674.findViewById(2131296486);
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(C0358.f6674, 2130903135, strArr));
        spinner.setOnItemSelectedListener(this.f1772);
        int iM648 = C0358.f6687.m648("last_char_server", 0);
        if (iM648 < strArr.length) {
            spinner.setSelection(iM648);
        }
        ((Button) C0358.f6674.findViewById(2131296485)).setOnClickListener(this.f1780);
        m704(2131296484);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m714(RelativeLayout relativeLayout, Point point, Point point2) {
        if (point == null) {
            point = new Point(0, 0);
        }
        Point point3 = new Point(C0358.f6674.f44.getWidth(), C0358.f6674.f44.getHeight());
        Rect rect = new Rect(point.x - (point2.x / 2), point.y - (point2.y / 2), point.x + (point2.x / 2), point.y + (point2.y / 2));
        if (rect.left < 0) {
            rect.offset(-rect.left, 0);
        }
        if (rect.top < 0) {
            rect.offset(0, -rect.top);
        }
        if (rect.right > point3.x) {
            rect.offset(point3.x - rect.right, 0);
        }
        if (rect.bottom > point3.y) {
            rect.offset(0, point3.y - rect.bottom);
        }
        relativeLayout.setX(rect.left);
        relativeLayout.setY(rect.top);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m732(String str, int i) {
        if (str.startsWith("blue")) {
            i = -16711681;
            str = str.substring(4);
        } else if (str.startsWith("ssss")) {
            str = str.substring(4);
        }
        this.f1792.m1432(str, 16777215 & i);
        this.f1819.setVisibility(0);
        this.f1819.setTextColor(i);
        this.f1819.setText(str);
        C0358.f6674.f47.removeCallbacks(this.f1763);
        c_activity c_activityVar = C0358.f6674;
        Runnable runnable = this.f1763;
        if (c_activityVar.f47 != null) {
            c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnable), 5000L);
        }
    }

    /* renamed from: Ć, reason: contains not printable characters */
    public final void m717() {
        new AlertDialog.Builder(C0358.f6674).setTitle((CharSequence) null).setMessage("Are you sure you want to quit?").setPositiveButton("Yes", new jy(this)).setNegativeButton("No", new jz(this)).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object[]] */
    /* renamed from: 鷭, reason: contains not printable characters */
    final void m736(short s, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].endsWith(".gat")) {
                strArr[i] = strArr[i].replace(".gat", "");
            }
        }
        if (strArr == null) {
            strArr = (Object[]) Array.newInstance("Memorize (/memo)".getClass(), 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        objArrCopyOf[strArr.length] = "Memorize (/memo)";
        String[] strArr2 = (String[]) objArrCopyOf;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setItems(strArr2, new kc(this, strArr2, s));
        builder.setOnCancelListener(new kd(this, s));
        builder.show();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m730(ImageView imageView, String str, Bitmap bitmap, gr grVar) {
        if (str == null) {
            imageView.setImageBitmap(null);
            if (grVar != null) {
                grVar.run();
                return;
            }
            return;
        }
        Bitmap bitmap2 = this.f1790.get(str);
        if (bitmap2 != null) {
            imageView.setImageBitmap(bitmap2);
            if (grVar != null) {
                grVar.run();
                return;
            }
            return;
        }
        imageView.setImageBitmap(bitmap);
        C0358.f6685.mo139(new kf(this, str, imageView, imageView.getDrawable(), grVar));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m729(ImageView imageView, int i) {
        m730(imageView, C0358.f6685.f1030.m511(C0358.f6685.f1030.f968.m613(i).f1429), this.f1821, null);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Ą, reason: contains not printable characters */
    public static void m704(int i) {
        Bitmap bitmapDecodeFile;
        String str = String.valueOf(oc.f3245) + File.separator + "last_bg.png";
        if (C0358.f6667 != null && C0358.f6667.f4796) {
            return;
        }
        if (f1732 != null) {
            bitmapDecodeFile = f1732;
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(str);
            if (bitmapDecodeFile == null) {
                bitmapDecodeFile = BitmapFactory.decodeResource(C0358.f6674.getResources(), 2130837504);
            }
        }
        f1732 = bitmapDecodeFile;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C0358.f6674.getResources(), bitmapDecodeFile);
        bitmapDrawable.setColorFilter(Color.rgb(123, 123, 123), PorterDuff.Mode.MULTIPLY);
        int i2 = Build.VERSION.SDK_INT;
        RelativeLayout relativeLayout = (RelativeLayout) C0358.f6674.findViewById(i);
        if (i2 < 16) {
            relativeLayout.setBackgroundDrawable(bitmapDrawable);
        } else {
            relativeLayout.setBackground(bitmapDrawable);
        }
        if (C0358.f6685 != null && !f1731) {
            f1731 = true;
            C0358.f6685.mo139(new kh(str));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m734(gt gtVar, int i) {
        this.f1822 = null;
        this.f1791.setVisibility(8);
        this.f1812.setVisibility(8);
        m723();
        this.f1822 = gtVar.m610();
        this.f1822.f1407 = i;
        gx gxVarM613 = C0358.f6685.f1030.f968.m613(gtVar.f1409);
        this.f1791.setVisibility(0);
        this.f1791.setText(gxVarM613.f1427);
        this.f1812.setVisibility(0);
        m723();
    }

    /* renamed from: ć, reason: contains not printable characters */
    final void m718() {
        this.f1822 = null;
        this.f1791.setVisibility(8);
        this.f1812.setVisibility(8);
        m723();
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public final void m723() {
        c_activity c_activityVar = C0358.f6674;
        ImageView imageView = (ImageView) C0358.f6674.findViewById(2131296420);
        if (imageView == null) {
            return;
        }
        mj mjVar = C0358.f6669.f2061;
        if (mjVar == null) {
            imageView.setImageBitmap(null);
            return;
        }
        lm lmVar = mjVar.f2123;
        if ((AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null) != null) {
            switch (m707()[mjVar.f2123.f1997.ordinal()]) {
                case 9:
                    imageView.setImageBitmap(C0358.f6685.f1017);
                    return;
                default:
                    lm lmVar2 = mjVar.f2123;
                    if (((AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null)).m1567()) {
                        if (this.f1822 != null) {
                            if ((this.f1822.f1408 & 1) != 0) {
                                m729(imageView, this.f1822.f1409);
                                return;
                            }
                        }
                        imageView.setImageBitmap(C0358.f6685.f1016);
                        return;
                    }
                    if (this.f1822 != null) {
                        if ((this.f1822.f1408 & 16) != 0) {
                            je jeVar = C0358.f6674.f42;
                            c_activity c_activityVar2 = C0358.f6674;
                            jeVar.m729((ImageView) C0358.f6674.findViewById(2131296420), C0358.f6674.f42.f1822.f1409);
                            return;
                        }
                    }
                    c_activity c_activityVar3 = C0358.f6674;
                    ((ImageView) C0358.f6674.findViewById(2131296420)).setImageBitmap(C0358.f6685.f1015);
                    return;
            }
        }
        switch (m707()[mjVar.f2123.f1997.ordinal()]) {
            case 7:
                c_activity c_activityVar4 = C0358.f6674;
                ((ImageView) C0358.f6674.findViewById(2131296420)).setImageBitmap(C0358.f6685.f1018);
                return;
            case 8:
            default:
                throw new nv();
            case 9:
                c_activity c_activityVar5 = C0358.f6674;
                ((ImageView) C0358.f6674.findViewById(2131296420)).setImageBitmap(C0358.f6685.f1017);
                return;
        }
    }

    /* renamed from: 岱, reason: contains not printable characters */
    final void m724() {
        int i = 0;
        this.f1818 = new gq[C0358.f6685.f1030.f970.f1380.size()];
        Iterator<gs.Cif> it = C0358.f6685.f1030.f970.f1380.iterator();
        while (it.hasNext()) {
            gs.Cif next = it.next();
            if (C0358.f6669.f2063.f6887.equals(next.f1389)) {
                if (next.f1381 == gs.EnumC0043.NONE || next.f1381 == gs.EnumC0043.SPRITE) {
                    nz.m907("Unsupported signboard ICONID " + next.f1381.ordinal() + " at " + next.f1389 + " " + next.f1388 + "/" + next.f1386);
                } else {
                    int i2 = i;
                    i++;
                    this.f1818[i2] = new gq(next);
                }
            }
        }
        this.f1818 = (gq[]) Arrays.copyOf(this.f1818, i);
    }
}
