package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fg extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    ArrayList<fd> f1262;

    fg() {
        fj fjVar = new fj();
        fh fhVar = new fh("NoShift enemies", "noshift_enemy", new String[]{"Disable support skills on enemies", "Enable support skills on enemies"});
        fh fhVar2 = new fh("NoShift friends", "noshift_friend", new String[]{"Disable offensive skills on friends", "Enable offensive skills on friends"});
        fl flVar = new fl("Party chat message prefix", "party_wis_prefix", oc.f3236);
        fl flVar2 = new fl("Guild chat message prefix", "guild_wis_prefix", oc.f3237);
        fh fhVar3 = new fh("Display land effects", "enable_land_effects", new String[]{"On", "Off"});
        this.f1262 = new ArrayList<>();
        this.f1262.add(fjVar);
        this.f1262.add(fhVar);
        this.f1262.add(fhVar2);
        this.f1262.add(flVar);
        this.f1262.add(flVar2);
        this.f1262.add(fhVar3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1262.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f1262.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        fd fdVar = this.f1262.get(i);
        fdVar.f1256 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903128, (ViewGroup) null);
        fdVar.f1255 = (TextView) fdVar.f1256.findViewById(2131296265);
        fdVar.f1254 = (TextView) fdVar.f1256.findViewById(2131296259);
        fdVar.f1255.setText(fdVar.f1258);
        fdVar.f1254.setText(fdVar.f1257);
        return fdVar.f1256;
    }
}
