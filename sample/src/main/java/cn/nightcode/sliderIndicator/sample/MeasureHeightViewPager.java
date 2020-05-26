package cn.nightcode.sliderIndicator.sample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.viewpager.widget.ViewPager;

/**
 * @Time : 2020/5/26 21:25
 * @Author : Dakun
 */
public class MeasureHeightViewPager extends ViewPager {

    public MeasureHeightViewPager(Context context) {
        super(context);
    }

    public MeasureHeightViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != GONE) {
                child.measure(widthMeasureSpec, heightMeasureSpec);
                int h = child.getMeasuredHeight();
                if (h > height) {
                    height = h;
                }
            }
        }
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}