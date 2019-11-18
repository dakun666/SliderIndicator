package cn.nightcode.sliderIndicator;

import android.content.Context;

/**
 * Created by xuedakun on 2019-11-13 18:28
 * 屏幕相关
 *
 * @version : v1.0
 * @project : SliderIndicator
 * @Email : dakun611@Gmail.com
 */
class ScreenUtils {

    /**
     * @param context
     * @param dp
     * @return px
     */
    static float dp2px(Context context, float dp) {
        float scale = 2.0f;
        if (context != null) {
            scale = context.getResources().getDisplayMetrics().density;
        }
        return dp * scale + 0.5f;
    }
}
