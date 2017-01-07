package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by pallavi on 1/6/2017.
 */

public class CompatibleImageView extends ImageView {

    public CompatibleImageView(Context context) {
        super(context);
    }

    public CompatibleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CompatibleImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int compatibleHeight = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3;
        int compatibleSpecHeight = MeasureSpec.makeMeasureSpec(compatibleHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, compatibleSpecHeight);
    }
}
