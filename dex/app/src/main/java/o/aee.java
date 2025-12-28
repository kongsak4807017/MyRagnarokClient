package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import net.hockeyapp.android.FeedbackActivity;
import net.hockeyapp.android.views.AttachmentListView;
import o.aca;

@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aee extends FrameLayout {

    /* renamed from: Ą, reason: contains not printable characters */
    public int f576;

    /* renamed from: ą, reason: contains not printable characters */
    public int f577;

    /* renamed from: Ć, reason: contains not printable characters */
    public int f578;

    /* renamed from: ć, reason: contains not printable characters */
    public int f579;

    /* renamed from: ċ, reason: contains not printable characters */
    private final String f580;

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f581;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private final acv f582;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public TextView f583;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public int f584;

    /* renamed from: 岱, reason: contains not printable characters */
    private final Context f585;

    /* renamed from: 櫯, reason: contains not printable characters */
    public final Uri f586;

    /* renamed from: 纫, reason: contains not printable characters */
    private ImageView f587;

    /* renamed from: 鷭, reason: contains not printable characters */
    final ViewGroup f588;

    public aee(FeedbackActivity feedbackActivity, ViewGroup viewGroup, Uri uri, boolean z) {
        super(feedbackActivity);
        this.f585 = feedbackActivity;
        this.f588 = viewGroup;
        this.f582 = null;
        this.f586 = uri;
        this.f580 = uri.getLastPathSegment();
        m408(20);
        m409((Context) feedbackActivity, true);
        this.f583.setText(this.f580);
        new aef(this).execute(new Void[0]);
    }

    public aee(Context context, AttachmentListView attachmentListView, acv acvVar, boolean z) {
        super(context);
        this.f585 = context;
        this.f588 = attachmentListView;
        this.f582 = acvVar;
        this.f586 = Uri.fromFile(new File(aba.m280(), new StringBuilder().append(acvVar.f428).append(acvVar.f429).toString()));
        this.f580 = acvVar.f427;
        m408(30);
        m409(context, false);
        this.f584 = 0;
        this.f583.setText(aca.C0005.hockeyapp_feedback_attachment_loading);
        m412(false);
    }

    public final void setImage(Bitmap bitmap, int i) {
        this.f583.setText(this.f580);
        this.f584 = i;
        if (bitmap == null) {
            m412(true);
        } else {
            m410(bitmap, true);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m408(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f579 = Math.round(TypedValue.applyDimension(1, 10.0f, displayMetrics));
        int iRound = Math.round(TypedValue.applyDimension(1, i, displayMetrics));
        int i2 = displayMetrics.widthPixels;
        int i3 = (i2 - (iRound * 2)) - (this.f579 * 2);
        int i4 = (i2 - (iRound * 2)) - this.f579;
        this.f581 = i3 / 3;
        this.f577 = i4 / 2;
        this.f576 = this.f581 * 2;
        this.f578 = this.f577;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m409(Context context, boolean z) {
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        setPadding(0, this.f579, 0, 0);
        this.f587 = new ImageView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        linearLayout.setGravity(GravityCompat.START);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#80262626"));
        this.f583 = new TextView(context);
        this.f583.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        this.f583.setGravity(17);
        this.f583.setTextColor(context.getResources().getColor(aca.C0007.hockeyapp_text_white));
        this.f583.setSingleLine();
        this.f583.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        if (z) {
            ImageButton imageButton = new ImageButton(context);
            imageButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
            imageButton.setAdjustViewBounds(true);
            imageButton.setImageDrawable(m407("ic_menu_delete"));
            imageButton.setBackgroundResource(0);
            imageButton.setOnClickListener(new aeg(this));
            linearLayout.addView(imageButton);
        }
        linearLayout.addView(this.f583);
        addView(this.f587);
        addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: 鷭, reason: contains not printable characters */
    public void m410(Bitmap bitmap, boolean z) {
        int i = this.f584 == 1 ? this.f577 : this.f581;
        int i2 = this.f584 == 1 ? this.f578 : this.f576;
        this.f583.setMaxWidth(i);
        this.f583.setMinWidth(i);
        this.f587.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f587.setAdjustViewBounds(true);
        this.f587.setMinimumWidth(i);
        this.f587.setMaxWidth(i);
        this.f587.setMaxHeight(i2);
        this.f587.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f587.setImageBitmap(bitmap);
        this.f587.setOnClickListener(new aeh(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: 鷭, reason: contains not printable characters */
    public void m412(boolean z) {
        this.f583.setMaxWidth(this.f581);
        this.f583.setMinWidth(this.f581);
        this.f587.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f587.setAdjustViewBounds(false);
        this.f587.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f587.setMinimumHeight((int) (this.f581 * 1.2f));
        this.f587.setMinimumWidth(this.f581);
        this.f587.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f587.setImageDrawable(m407("ic_menu_attachment"));
        this.f587.setOnClickListener(new aei(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: 鷭, reason: contains not printable characters */
    public Bitmap m405() {
        try {
            this.f584 = adv.m360(this.f585, this.f586);
            int i = this.f584 == 1 ? this.f577 : this.f581;
            int i2 = this.f584 == 1 ? this.f578 : this.f576;
            Context context = this.f585;
            Uri uri = this.f586;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
            options.inSampleSize = adv.m361(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private Drawable m407(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return getResources().getDrawable(getResources().getIdentifier(str, "drawable", "android"), this.f585.getTheme());
        }
        return getResources().getDrawable(getResources().getIdentifier(str, "drawable", "android"));
    }
}
