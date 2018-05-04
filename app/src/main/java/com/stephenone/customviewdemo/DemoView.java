package com.stephenone.customviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * http://hencoder.com/ui-1-1/
 *
 * */

public class DemoView extends View {
    public static final String TAG = DemoView.class.getSimpleName();
    private Paint mPaint;
    private Paint mPaint2;
    private Paint mPaint3;
    private Paint mPaint4;
    private Paint mPaint5;
    public DemoView(Context context) {
        super(context);
        Log.e(TAG, "DemoView: " + "1" );
    }

    public DemoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.e(TAG, "DemoView: " + "2" );
        mPaint = new Paint();
        mPaint.setColor(0xFF666666);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(20);

        mPaint2 = new Paint();
        mPaint2.setColor(0xFF000000);
        mPaint2.setStrokeCap(Paint.Cap.ROUND);
        mPaint2.setStrokeWidth(40);

        mPaint3 = new Paint();
        mPaint3.setColor(0xFF000000);
        mPaint3.setStrokeCap(Paint.Cap.BUTT);
        mPaint3.setStrokeWidth(40);

        mPaint4 = new Paint();
        mPaint4.setColor(0xFF000000);
        mPaint4.setStrokeCap(Paint.Cap.SQUARE);
        mPaint4.setStrokeWidth(40);

        mPaint5 = new Paint();
        mPaint5.setColor(0xFF666666);
        mPaint5.setStyle(Paint.Style.FILL);
        mPaint5.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(200,200,200,mPaint);
        canvas.drawColor(0x88880000);
        canvas.drawRect(10,500,400,700,mPaint);

        canvas.drawPoint(500,500,mPaint2);
        canvas.drawPoint(600,600,mPaint3);
        canvas.drawPoint(500,600,mPaint4);

        RectF rect = new RectF(0,800,400,1200);
        canvas.drawArc(rect,0,190,true,mPaint);//useCenter参数:是否画出圆弧端点到圆心的线。

        RectF rect2 = new RectF(200,700,600,1100);
        canvas.drawArc(rect2,0,190,true,mPaint5);
    }
}
