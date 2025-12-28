package com.roworkshop.andro;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import o.InterfaceC0135;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class JoystickView extends View {

    /* renamed from: Ą, reason: contains not printable characters */
    private Paint f0;

    /* renamed from: ą, reason: contains not printable characters */
    private int f1;

    /* renamed from: Ć, reason: contains not printable characters */
    private int f2;

    /* renamed from: ć, reason: contains not printable characters */
    private InterfaceC0135 f3;

    /* renamed from: ȃ, reason: contains not printable characters */
    private Paint f4;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public int f5;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private int f6;

    /* renamed from: 櫯, reason: contains not printable characters */
    public double f7;

    /* renamed from: 鷭, reason: contains not printable characters */
    public double f8;

    public JoystickView(Context context) {
        super(context);
        m126();
    }

    public JoystickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m126();
    }

    public JoystickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m126();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m126() {
        setFocusable(true);
        this.f4 = new Paint(1);
        this.f4.setColor(-7829368);
        this.f4.setStrokeWidth(1.0f);
        this.f4.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f0 = new Paint(1);
        this.f0.setColor(-12303292);
        this.f0.setStrokeWidth(1.0f);
        this.f0.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f1 = 10;
        this.f6 = 10;
    }

    public void setOnJostickMovedListener(InterfaceC0135 interfaceC0135) {
        this.f3 = interfaceC0135;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            size = 200;
        }
        int i3 = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 0) {
            size2 = 200;
        }
        int iMin = Math.min(i3, size2);
        this.f2 = (int) (iMin * 0.25d);
        this.f5 = this.f2;
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(((int) this.f8) + (getMeasuredWidth() / 2), ((int) this.f7) + (getMeasuredHeight() / 2), this.f2, this.f0);
        canvas.save();
    }
}
