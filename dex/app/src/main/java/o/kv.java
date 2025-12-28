package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Point;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import java.util.Iterator;
import java.util.Map;
import o.C0523;
import org.apache.http.HttpStatus;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kv extends ku {

    /* renamed from: đ, reason: contains not printable characters */
    static final c_point f1909;

    /* renamed from: ę, reason: contains not printable characters */
    private static /* synthetic */ int[] f1910;

    /* renamed from: 廂, reason: contains not printable characters */
    private static /* synthetic */ int[] f1914;

    /* renamed from: Ą, reason: contains not printable characters */
    int f1916;

    /* renamed from: ą, reason: contains not printable characters */
    int f1917;

    /* renamed from: Ć, reason: contains not printable characters */
    ImageView f1918;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f1919;

    /* renamed from: ċ, reason: contains not printable characters */
    Point f1920;

    /* renamed from: Ē, reason: contains not printable characters */
    int f1921;

    /* renamed from: ē, reason: contains not printable characters */
    byte f1922;

    /* renamed from: Ė, reason: contains not printable characters */
    private View.OnClickListener f1923;

    /* renamed from: ė, reason: contains not printable characters */
    private View.OnTouchListener f1924;

    /* renamed from: Ę, reason: contains not printable characters */
    private View.OnLongClickListener f1925;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f1926;

    /* renamed from: Ȋ, reason: contains not printable characters */
    boolean f1927;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    RelativeLayout f1928;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    boolean f1929;

    /* renamed from: 㥳, reason: contains not printable characters */
    private c_point f1930;

    /* renamed from: 岱, reason: contains not printable characters */
    boolean f1931;

    /* renamed from: 櫯, reason: contains not printable characters */
    RelativeLayout f1932;

    /* renamed from: 纫, reason: contains not printable characters */
    Point f1933;

    /* renamed from: 鷭, reason: contains not printable characters */
    EnumC0058 f1934;

    /* renamed from: 띥, reason: contains not printable characters */
    private c_point f1935;

    /* renamed from: 䒧, reason: contains not printable characters */
    static int f1912 = 25;

    /* renamed from: 躆, reason: contains not printable characters */
    static LightingColorFilter f1915 = new LightingColorFilter(-2130706433, 0);

    /* renamed from: ܕ, reason: contains not printable characters */
    static LightingColorFilter f1911 = new LightingColorFilter(-11184811, 0);

    /* renamed from: 庸, reason: contains not printable characters */
    static final c_point f1913 = new c_point((int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 5.0f), (int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 5.0f));

    /* renamed from: o.kv$鷭, reason: contains not printable characters */
    enum EnumC0058 {
        GAMEMENU,
        ITEM,
        SKILL,
        EMOTION,
        HOMUN,
        MERC;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0058[] valuesCustom() {
            EnumC0058[] enumC0058ArrValuesCustom = values();
            int length = enumC0058ArrValuesCustom.length;
            EnumC0058[] enumC0058Arr = new EnumC0058[length];
            System.arraycopy(enumC0058ArrValuesCustom, 0, enumC0058Arr, 0, length);
            return enumC0058Arr;
        }
    }

    /* renamed from: Ć, reason: contains not printable characters */
    private static /* synthetic */ int[] m748() {
        int[] iArr = f1910;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0058.valuesCustom().length];
        try {
            iArr2[EnumC0058.EMOTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0058.GAMEMENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0058.HOMUN.ordinal()] = 5;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0058.ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0058.MERC.ordinal()] = 6;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0058.SKILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f1910 = iArr2;
        return iArr2;
    }

    /* renamed from: ć, reason: contains not printable characters */
    private static /* synthetic */ int[] m750() {
        int[] iArr = f1914;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[ng.valuesCustom().length];
        try {
            iArr2[ng.CART.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ng.EQUIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ng.ETC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ng.USABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f1914 = iArr2;
        return iArr2;
    }

    static {
        c_activity c_activityVar = C0358.f6674;
        c_activity c_activityVar2 = C0358.f6674;
        f1909 = new c_point((int) ((c_activityVar.getResources().getDisplayMetrics().densityDpi / 160.0f) * f1912), (int) ((c_activityVar2.getResources().getDisplayMetrics().densityDpi / 160.0f) * f1912));
    }

    kv(int i, int i2, EnumC0058 enumC0058, c_point c_pointVar, int i3, int i4, int i5, byte b) {
        this.f1917 = 0;
        this.f1929 = false;
        this.f1931 = false;
        this.f1927 = false;
        this.f1920 = new Point();
        this.f1933 = new Point();
        this.f1923 = new kw(this);
        this.f1924 = new kx(this);
        this.f1925 = new ky(this);
        this.f1921 = i5;
        this.f1922 = b;
        m758(i, i2, enumC0058, c_pointVar.x, c_pointVar.y, i3, i4);
    }

    kv(int i) {
        this.f1917 = 0;
        this.f1929 = false;
        this.f1931 = false;
        this.f1927 = false;
        this.f1920 = new Point();
        this.f1933 = new Point();
        this.f1923 = new kw(this);
        this.f1924 = new kx(this);
        this.f1925 = new ky(this);
        String strM655 = C0358.f6687.m655("hotkey" + i + je.m705(), 0);
        String str = strM655 == null ? null : strM655;
        String str2 = str;
        if (str == null) {
            Log.e("AndRO", "Failed to init hotkey.");
            throw new nv("Failed to init hotkey.");
        }
        String[] strArrSplit = str2.split(" ");
        if (strArrSplit.length < 4) {
            String str3 = "Invalid emotion string format: " + str2;
            Log.e("AndRO", str3);
            throw new nv(str3);
        }
        EnumC0058[] enumC0058ArrValuesCustom = EnumC0058.valuesCustom();
        int length = enumC0058ArrValuesCustom.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            EnumC0058 enumC0058 = enumC0058ArrValuesCustom[i2];
            if (!enumC0058.name().equalsIgnoreCase(strArrSplit[0])) {
                i2++;
            } else {
                this.f1934 = enumC0058;
                break;
            }
        }
        if (this.f1934 == null) {
            String str4 = "Invalid emotion type: " + strArrSplit[0];
            Log.e("AndRO", str4);
            throw new nv(str4);
        }
        try {
            this.f1926 = Integer.parseInt(strArrSplit[1]);
            this.f1920.x = Integer.parseInt(strArrSplit[2]);
            this.f1920.y = Integer.parseInt(strArrSplit[3]);
            if (strArrSplit.length >= 5) {
                this.f1916 = Integer.parseInt(strArrSplit[4]);
            }
            if (strArrSplit.length == 6) {
                this.f1933.x = f1912;
                this.f1933.y = f1912;
                this.f1921 = 0;
                this.f1922 = (byte) 0;
                this.f1917 = f1912;
            } else {
                if (strArrSplit.length >= 6) {
                    this.f1933.x = Integer.parseInt(strArrSplit[5]);
                }
                if (strArrSplit.length >= 7) {
                    this.f1933.y = Integer.parseInt(strArrSplit[6]);
                }
                if (strArrSplit.length >= 8) {
                    this.f1921 = Short.parseShort(strArrSplit[7]);
                }
                if (strArrSplit.length >= 9) {
                    this.f1922 = Byte.parseByte(strArrSplit[8]);
                }
                if (strArrSplit.length >= 10) {
                    this.f1917 = Integer.parseInt(strArrSplit[9]);
                }
            }
            switch (m748()[this.f1934.ordinal()]) {
                case 2:
                    this.f1916 = 0;
                    if (C0358.f6664.f2004 != null && C0358.f6664.f2004.f8622 != null) {
                        Iterator<C1008> it = C0358.f6664.f2004.f8622.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else {
                                C1008 next = it.next();
                                if (next.f8502 == this.f1926) {
                                    this.f1916 = next.f8500;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    if (C0358.f6664.f2004 != null && C0358.f6664.f2004.f8642 != null) {
                        gt gtVar = C0358.f6664.f2004.f8642.f8673.get(Integer.valueOf(this.f1926));
                        if (gtVar != null) {
                            if (this.f1916 == 0) {
                                this.f1916 = gtVar.f1407;
                                break;
                            } else {
                                this.f1916 = Math.min(gtVar.f1407, this.f1916);
                                break;
                            }
                        }
                    }
                    break;
                default:
                    this.f1916 = -1;
                    break;
            }
            m758(this.f1926, this.f1916, this.f1934, this.f1933.x, this.f1933.y, this.f1920.x, this.f1920.y);
        } catch (NumberFormatException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m758(int i, int i2, EnumC0058 enumC0058, int i3, int i4, int i5, int i6) {
        this.f1932 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903082, (ViewGroup) null);
        this.f1918 = (ImageView) this.f1932.findViewById(2131296297);
        this.f1919 = (TextView) this.f1932.findViewById(2131296265);
        this.f1926 = i;
        this.f1934 = enumC0058;
        m761(i2);
        this.f1920.set(i5, i6);
        this.f1933.set(i3, i4);
        if (enumC0058 == null) {
            return;
        }
        if (enumC0058 == EnumC0058.SKILL && i != 0) {
            C0358.f6674.f42.m729(this.f1918, i);
        } else if (enumC0058 == EnumC0058.ITEM && i != 0) {
            je jeVar = C0358.f6674.f42;
            ImageView imageView = this.f1918;
            C1008 c1008 = new C1008((short) i);
            jeVar.m730(imageView, C0358.f6685.f1030.m510(c1008.f8502, c1008.f8491, false), jeVar.f1815, null);
        } else if (enumC0058 == EnumC0058.EMOTION && i != 0) {
            ImageView imageView2 = this.f1918;
            cv cvVar = C0358.f6685;
            imageView2.setImageBitmap(cv.m530(C0358.f6669.f2048.f1542, i, new c_point(i3, i4)));
        } else if (enumC0058 == EnumC0058.HOMUN && i != 0) {
            C0358.f6685.mo139(new kz(this));
        } else if (enumC0058 == EnumC0058.MERC && i != 0) {
            C0358.f6685.mo139(new lb(this));
        } else if (enumC0058 == EnumC0058.GAMEMENU) {
            this.f1918.setImageBitmap(null);
            if (i >= C0523.Cif.valuesCustom().length) {
                i = 0;
            }
            this.f1919.setText(C0523.Cif.valuesCustom()[i].name().substring(0, 2));
            this.f1919.setMinimumWidth(this.f1933.x);
            this.f1919.setMinimumHeight(this.f1933.y);
            this.f1919.setMaxWidth(this.f1933.x);
            this.f1919.setMaxHeight(this.f1933.y);
            this.f1919.setGravity(17);
            this.f1919.setTextSize(this.f1933.x / 2);
        } else {
            nz.m907("unknown hotkey type " + enumC0058);
        }
        this.f1932.setOnClickListener(this.f1923);
        this.f1932.setOnLongClickListener(this.f1925);
        this.f1932.setOnTouchListener(this.f1924);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m762(int i) {
        C0358.f6687.m658("hotkey" + i + je.m705(), 0, this.f1934.name() + " " + this.f1926 + " " + this.f1920.x + " " + this.f1920.y + " " + this.f1916 + " " + this.f1933.x + " " + this.f1933.y + " " + this.f1921 + " " + ((int) this.f1922) + " " + this.f1917);
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    private void m751() {
        if (this.f1931) {
            this.f1918.setColorFilter(f1915);
        } else if (this.f1916 == 0) {
            this.f1918.setColorFilter(f1911);
        } else {
            this.f1918.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m761(int i) {
        int i2 = this.f1916;
        if (i != -1) {
            this.f1919.setText(String.valueOf(i));
        } else {
            this.f1919.setText((CharSequence) null);
        }
        this.f1916 = i;
        if (!this.f1931) {
            if ((i2 > 0 && i == 0) || (i2 == 0 && i > 0)) {
                m751();
            }
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    static /* synthetic */ void m752(kv kvVar) {
        if (C0358.f6674.f42.f1814) {
            kvVar.f1918.clearColorFilter();
        } else {
            kvVar.f1918.setColorFilter(2131165195);
        }
        C0358.f6674.f42.f1814 = !C0358.f6674.f42.f1814;
    }

    /* renamed from: Ą, reason: contains not printable characters */
    static /* synthetic */ void m744(kv kvVar) {
        if (C0358.f6674.f42.f1805) {
            kvVar.f1918.clearColorFilter();
        } else {
            kvVar.f1918.setColorFilter(2131165195);
        }
        C0358.f6674.f42.f1805 = !C0358.f6674.f42.f1805;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ boolean m760(kv kvVar, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 5:
                if (kvVar.f1931) {
                    kvVar.f1930 = new c_point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    kvVar.f1935 = new c_point(kvVar.f1920);
                    kvVar.m751();
                    break;
                }
                break;
            case 1:
            case 6:
                if (kvVar.f1931) {
                    kvVar.f1931 = false;
                    kvVar.m751();
                    break;
                }
                break;
            case 2:
                if (kvVar.f1931) {
                    c_point c_pointVar = new c_point(new c_point((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
                    c_point c_pointVar2 = kvVar.f1930;
                    c_pointVar.set(c_pointVar.x - ((Point) c_pointVar2).x, c_pointVar.y - ((Point) c_pointVar2).y);
                    c_point c_pointVar3 = new c_point(kvVar.f1935);
                    c_pointVar3.offset(((Point) c_pointVar).x, ((Point) c_pointVar).y);
                    int[] iArr = new int[2];
                    C0358.f6674.f42.f1777.getLocationOnScreen(iArr);
                    c_pointVar3.x -= c_pointVar3.x % f1913.x;
                    c_pointVar3.y -= c_pointVar3.y % f1913.y;
                    c_pointVar3.x = Math.max(c_pointVar3.x, iArr[0]);
                    c_pointVar3.y = Math.max(c_pointVar3.y, iArr[0]);
                    c_pointVar3.x = Math.min(c_pointVar3.x, (iArr[0] + C0358.f6674.f42.f1777.getWidth()) - kvVar.f1932.getWidth());
                    c_pointVar3.y = Math.min(c_pointVar3.y, (iArr[0] + C0358.f6674.f42.f1777.getHeight()) - kvVar.f1932.getHeight());
                    if (!kvVar.f1920.equals(c_pointVar3)) {
                        kvVar.f1920 = c_pointVar3;
                        kvVar.m745();
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static /* synthetic */ void m757(kv kvVar) {
        int iIntValue = 0;
        C1008 c1008 = null;
        if (C0358.f6664 == null || C0358.f6664.f2004 == null) {
            return;
        }
        Iterator<Map.Entry<Integer, C1008>> it = C0358.f6664.f2004.f8622.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, C1008> next = it.next();
            C1008 value = next.getValue();
            if (value.f8502 == kvVar.f1926 && value.f8490 == 0) {
                iIntValue = next.getKey().intValue();
                c1008 = value;
                break;
            }
        }
        if (c1008 == null || c1008.f8500 <= 0) {
            return;
        }
        switch (m750()[ng.m881(c1008.f8493).ordinal()]) {
            case 1:
                C0358.f6671.mo454(new C0207((short) iIntValue));
                break;
            case 2:
                C0358.f6671.mo454(new C1010((short) iIntValue, (short) c1008.m1590()));
                break;
            default:
                nz.m907("Unexpected hotkeyed item type: " + c1008.f8493);
                break;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ void m759(kv kvVar) {
        c_activity c_activityVar = C0358.f6674;
        je.m709(kvVar.f1926, kvVar.f1916);
    }

    /* renamed from: ą, reason: contains not printable characters */
    static /* synthetic */ boolean m746(kv kvVar) {
        String[] strArr;
        if (kvVar.f1931) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle(kvVar.f1934.toString());
        if (kvVar.f1934 == EnumC0058.HOMUN || kvVar.f1934 == EnumC0058.MERC) {
            strArr = new String[]{"Move", "Zoom"};
        } else {
            builder.setIcon(kvVar.f1918.getDrawable());
            strArr = new String[]{"Move", "Zoom", "Delete"};
        }
        builder.setItems(strArr, new ld(kvVar));
        builder.show();
        return true;
    }

    /* renamed from: Ć, reason: contains not printable characters */
    static /* synthetic */ void m747(kv kvVar) {
        if (kvVar.f1931) {
            return;
        }
        kvVar.f1931 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ą, reason: contains not printable characters */
    public void m743() {
        if (this.f1934 != EnumC0058.EMOTION && this.f1934 != EnumC0058.HOMUN && this.f1934 != EnumC0058.MERC && this.f1934 != EnumC0058.ITEM && this.f1934 != EnumC0058.SKILL) {
            this.f1919.setMinimumWidth(this.f1933.x);
            this.f1919.setMinimumHeight(this.f1933.y);
            this.f1919.setMaxWidth(this.f1933.x);
            this.f1919.setMaxHeight(this.f1933.y);
            this.f1919.setTextSize((f1912 + this.f1917) / 2);
        }
        this.f1918.setMinimumWidth(this.f1933.x);
        this.f1918.setMinimumHeight(this.f1933.y);
        this.f1918.setMaxWidth(this.f1933.x);
        this.f1918.setMaxHeight(this.f1933.y);
        this.f1932.setMinimumWidth(this.f1933.x);
        this.f1932.setMinimumHeight(this.f1933.y);
        m745();
    }

    /* renamed from: ć, reason: contains not printable characters */
    static /* synthetic */ void m749(kv kvVar) {
        kvVar.f1928 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903081, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setView(kvVar.f1928);
        builder.setPositiveButton("Ok", (DialogInterface.OnClickListener) null);
        builder.create();
        builder.show();
        builder.setTitle("Hotkey size");
        SeekBar seekBar = (SeekBar) kvVar.f1928.findViewById(2131296311);
        seekBar.setMax(HttpStatus.SC_MULTIPLE_CHOICES);
        seekBar.setProgress(kvVar.f1917);
        seekBar.setOnSeekBarChangeListener(new lf(kvVar));
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    static /* synthetic */ void m755(kv kvVar) {
        if (C0358.f6669.f2058.x < kvVar.f1920.x + ((kvVar.f1933.x / (C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f)) * 2.0f)) {
            kvVar.f1920.x = (int) (r0.x - ((kvVar.f1920.x + ((kvVar.f1933.x / (C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f)) * 2.0f)) - C0358.f6669.f2058.x));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ą, reason: contains not printable characters */
    public void m745() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1932.getLayoutParams();
        layoutParams.leftMargin = this.f1920.x;
        layoutParams.topMargin = this.f1920.y;
        this.f1932.setLayoutParams(layoutParams);
    }

    @Override // o.ku
    /* renamed from: 櫯 */
    final boolean mo440() {
        return this.f1932.getParent() != null;
    }

    @Override // o.ku
    final void h_() {
        if (this.f1932.getParent() != null) {
            return;
        }
        C0358.f6674.f42.f1777.addView(this.f1932);
        m745();
        m743();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.ku
    /* renamed from: ˮ͈ */
    public final void mo439() {
        if (!(this.f1932.getParent() != null)) {
            return;
        }
        C0358.f6674.f42.f1777.removeView(this.f1932);
    }
}
