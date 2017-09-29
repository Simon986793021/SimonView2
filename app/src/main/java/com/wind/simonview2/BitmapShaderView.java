package com.wind.simonview2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangcong on 2017/9/29.
 */

public class BitmapShaderView extends View {
    public BitmapShaderView(Context context) {
        super(context);
    }

    public BitmapShaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BitmapShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.circle);
        Shader shader=new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        Paint paint=new Paint();
        paint.setShader(shader);
        canvas.drawCircle(100,100,300,paint);
    }
}
