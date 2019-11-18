package com.nightcode.sliderIndicator;

import android.graphics.Color;

/**
 * Created by xuedakun on 2019-11-13 18:34
 * color相关
 *
 * @version : v1.0
 * @project : SliderIndicator
 * @Email : dakun611@Gmail.com
 */
class ColorUtils {
    /**
     * 获取某一个百分比间的颜色,radio取值[0,1]
     *
     * @param radio      百分比
     * @param startColor 开始颜色
     * @param endColor   结束颜色
     * @return
     */
    static int getScaleRadioColor(float radio, int startColor, int endColor) {
        if (radio < 0) {
            radio = 0;
        }
        int alphaStart = Color.alpha(startColor);
        int redStart = Color.red(startColor);
        int blueStart = Color.blue(startColor);
        int greenStart = Color.green(startColor);
        int alphaEnd = Color.alpha(endColor);
        int redEnd = Color.red(endColor);
        int blueEnd = Color.blue(endColor);
        int greenEnd = Color.green(endColor);

        int alpha = (int) (alphaEnd + ((alphaStart - alphaEnd) * radio));
        int red = (int) (redEnd + ((redStart - redEnd) * radio));
        int greed = (int) (greenEnd + ((greenStart - greenEnd) * radio));
        int blue = (int) (blueEnd + ((blueStart - blueEnd) * radio));
        return Color.argb(alpha, red, greed, blue);
    }
}
