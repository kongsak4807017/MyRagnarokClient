package o;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.support.v4.internal.view.SupportMenu;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;
import net.hockeyapp.android.PaintActivity;

@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aej extends ImageView {

    /* renamed from: Ą, reason: contains not printable characters */
    private float f595;

    /* renamed from: ȃ, reason: contains not printable characters */
    private float f596;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private Paint f597;

    /* renamed from: 櫯, reason: contains not printable characters */
    private Path f598;

    /* renamed from: 鷭, reason: contains not printable characters */
    public Stack<Path> f599;

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ Bitmap m415(ContentResolver contentResolver, Uri uri, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        options.inSampleSize = m414(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static int m413(ContentResolver contentResolver, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
            return ((float) options.outWidth) / ((float) options.outHeight) > 1.0f ? 0 : 1;
        } catch (IOException e) {
            if (adt.f529 <= 6) {
                Log.e("HockeyApp", "Unable to determine necessary screen orientation.", e);
                return 1;
            }
            return 1;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m414(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public aej(PaintActivity paintActivity, Uri uri, int i, int i2) {
        super(paintActivity);
        this.f598 = new Path();
        this.f599 = new Stack<>();
        this.f597 = new Paint();
        this.f597.setAntiAlias(true);
        this.f597.setDither(true);
        this.f597.setColor(SupportMenu.CATEGORY_MASK);
        this.f597.setStyle(Paint.Style.STROKE);
        this.f597.setStrokeJoin(Paint.Join.ROUND);
        this.f597.setStrokeCap(Paint.Cap.ROUND);
        this.f597.setStrokeWidth(12.0f);
        new aek(this).execute(paintActivity, uri, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator<Path> it = this.f599.iterator();
        while (it.hasNext()) {
            canvas.drawPath(it.next(), this.f597);
        }
        canvas.drawPath(this.f598, this.f597);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                this.f598.reset();
                this.f598.moveTo(x, y);
                this.f596 = x;
                this.f595 = y;
                invalidate();
                break;
            case 1:
                this.f598.lineTo(this.f596, this.f595);
                this.f599.push(this.f598);
                this.f598 = new Path();
                invalidate();
                break;
            case 2:
                float fAbs = Math.abs(x - this.f596);
                float fAbs2 = Math.abs(y - this.f595);
                if (fAbs >= 4.0f || fAbs2 >= 4.0f) {
                    this.f598.quadTo(this.f596, this.f595, (this.f596 + x) / 2.0f, (this.f595 + y) / 2.0f);
                    this.f596 = x;
                    this.f595 = y;
                }
                invalidate();
                break;
        }
        return true;
    }
}
