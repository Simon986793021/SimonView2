package com.wind.simonview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangcong on 2017/9/29.
 */

public class LinearGradientView extends View {
    public LinearGradientView(Context context) {
        super(context);
    }

    public LinearGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Shader shader=new LinearGradient(0,0,400,400, Color.parseColor("#11cd6e"),Color.parseColor("#E91E63"), Shader.TileMode.CLAMP);
        Paint paint=new Paint();
        paint.setShader(shader);
        canvas.drawCircle(200,200,200,paint);

        Shader shader1=new LinearGradient(200,600,250,650,Color.parseColor("#E91E63"),Color.parseColor("#2196F3"), Shader.TileMode.MIRROR);
        Paint paint1=new Paint();
        paint1.setShader(shader1);
        canvas.drawCircle(200,600,200,paint1);

    }
}
