package com.stephenone.customviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;




public class PathView extends View {
    private static final String TAG = PathView.class.getSimpleName();
    private Paint mPaint;
    private Path mPath;

    private Paint mPaintStorke;
    private Path mPath2;

    private Path mPath3;

    //构造代码块，先于构造方法执行，可将各个构造方法中的共同代码放于此
    {
        Log.e(TAG, "instance initializer: ");
        mPaint = new Paint();

        mPath = new Path();
        mPath.addArc(200, 200, 400, 400, -225, 225);
        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        mPath.lineTo(400, 542);
//        mPath.rLineTo(x,y); 相对最后一个点的位置

        mPaintStorke = new Paint();
        mPaintStorke.setStyle(Paint.Style.STROKE);
        mPath2 = new Path();
        mPath2.lineTo(100,100);
//        mPath2.rLineTo(-100,0);
        mPath2.quadTo(150,50,200,100);
        mPath2.close();

        mPath3 = new Path();
        mPath3.addCircle(300,900,200,Path.Direction.CW);
        mPath3.addCircle(500,900,200,Path.Direction.CW);
        mPath3.setFillType(Path.FillType.EVEN_ODD);
    }

    public PathView(Context context) {
        super(context);
        Log.e(TAG, "PathView: constructor 1111");

    }

    public PathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.e(TAG, "PathView: constructor" );
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(mPath,mPaint);
        canvas.drawPath(mPath2,mPaintStorke);
        canvas.drawPath(mPath3,mPaint);
    }
}
