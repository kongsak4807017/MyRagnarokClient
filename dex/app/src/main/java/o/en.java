package o;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roworkshop.andro.c_activity;
import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class en extends ku {

    /* renamed from: Ą, reason: contains not printable characters */
    private TextView f1206;

    /* renamed from: ą, reason: contains not printable characters */
    private Button f1207;

    /* renamed from: Ć, reason: contains not printable characters */
    private Button f1208;

    /* renamed from: ć, reason: contains not printable characters */
    private ListView f1209;

    /* renamed from: ȃ, reason: contains not printable characters */
    private RelativeLayout f1210;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    String[] f1211;

    /* renamed from: 櫯, reason: contains not printable characters */
    File f1212;

    /* renamed from: 鷭, reason: contains not printable characters */
    c_activity f1213;

    en(c_activity c_activityVar) {
        this.f1213 = c_activityVar;
    }

    @Override // o.ku
    /* renamed from: 櫯 */
    final boolean mo440() {
        View viewFindViewById = ((ViewGroup) this.f1213.findViewById(R.id.content)).findViewById(2131296320);
        return viewFindViewById != null && viewFindViewById == this.f1210;
    }

    @Override // o.ku
    final void h_() {
        this.f1213.setContentView(2130903123);
        this.f1210 = (RelativeLayout) this.f1213.findViewById(2131296320);
        this.f1206 = (TextView) this.f1213.findViewById(2131296259);
        this.f1209 = (ListView) this.f1213.findViewById(2131296332);
        this.f1207 = (Button) this.f1213.findViewById(2131296279);
        this.f1208 = (Button) this.f1213.findViewById(2131296300);
        je.m704(2131296320);
        this.f1209.setOnItemClickListener(new eo(this));
        this.f1207.setOnClickListener(new ep(this));
        this.f1208.setOnClickListener(new eq(this));
        m586(new File(oc.f3245), true);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m586(File file, boolean z) {
        if (!file.exists()) {
            if (!z) {
                Toast.makeText(this.f1213, "Directory not exists", 0).show();
            }
            file = File.listRoots()[0];
        }
        if (!file.canRead()) {
            if (!z) {
                Toast.makeText(this.f1213, "Access denied", 0).show();
                return;
            }
            file = File.listRoots()[0];
        }
        this.f1212 = file;
        this.f1206.setText(file.getAbsolutePath());
        this.f1211 = m585(file);
        this.f1209.setAdapter((ListAdapter) new ArrayAdapter(this.f1213, 2130903135, this.f1211));
        if (!pl.m1051(file)) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f1213);
        builder.setMessage("Game client found. Use \"" + file + "\"?");
        builder.setPositiveButton("Yes", new er(this, file));
        builder.setNegativeButton("No", (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.ku
    /* renamed from: ˮ͈ */
    public final void mo439() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object[]] */
    /* renamed from: 鷭, reason: contains not printable characters */
    private static String[] m585(File file) {
        String[] strArr = new String[0];
        if (!file.isDirectory()) {
            throw new nv(String.valueOf(file.getAbsolutePath()) + " is not a directory");
        }
        if (!file.getAbsolutePath().equals("/")) {
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
            objArrCopyOf[strArr.length] = "..";
            strArr = (String[]) objArrCopyOf;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return strArr;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                String[] strArr2 = strArr;
                String name = file2.getName();
                String[] strArr3 = strArr2;
                if (strArr2 == null) {
                    strArr3 = (Object[]) Array.newInstance(name.getClass(), 0);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(strArr3, strArr3.length + 1);
                objArrCopyOf2[strArr3.length] = name;
                strArr = (String[]) objArrCopyOf2;
            }
        }
        return strArr;
    }
}
