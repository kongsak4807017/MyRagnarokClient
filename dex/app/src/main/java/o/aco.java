package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import net.hockeyapp.android.views.FeedbackMessageView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aco extends BaseAdapter {

    /* renamed from: 櫯, reason: contains not printable characters */
    private Context f394;

    /* renamed from: 鷭, reason: contains not printable characters */
    public ArrayList<acx> f395;

    public aco(Context context, ArrayList<acx> arrayList) {
        this.f394 = context;
        this.f395 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f395.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        FeedbackMessageView feedbackMessageView;
        acx acxVar = this.f395.get(i);
        if (view == null) {
            feedbackMessageView = new FeedbackMessageView(this.f394, null);
        } else {
            feedbackMessageView = (FeedbackMessageView) view;
        }
        if (acxVar != null) {
            feedbackMessageView.setFeedbackMessage(acxVar);
        }
        feedbackMessageView.setIndex(i);
        return feedbackMessageView;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f395.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }
}
