package com.lixiao.listviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/4/1.
 */
public class DrawView extends View{
    private Paint paint;
    public DrawView(Context context) {
        this(context, null);
    }

    public DrawView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint.setColor(Color.rgb(200, 200, 200));
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(20);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();


        canvas.restore();
    }
}
