package com.wind.simonview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangcong on 2017/9/29.
 */

public class SweepGradientView extends View {
    public SweepGradientView(Context context) {
        super(context);
    }

    public SweepGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SweepGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Shader shader=new SweepGradient(200,200, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"));
        Paint paint=new Paint();
        paint.setShader(shader);
        canvas.drawCircle(200,200,200,paint);
    }
}
