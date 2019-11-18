package cn.nightcode.sliderIndicator.sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.Random;

/**
 * Created by xuedakun on 2019-11-16 10:08
 *
 * @version : v1.0
 * @project : SliderIndicator
 * @Email : dakun611@Gmail.com
 */
public class SamplePagerAdapter extends PagerAdapter {

    private Context context;

    private int count;

    public SamplePagerAdapter(Context context) {
        this.context = context;
    }

    public void setCount(int count) {
        this.count = count;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_main_view_pager, container, false);
        TextView tv = view.findViewById(R.id.item_text);
        tv.setText(position + "");
        Random random = new Random();
        int ranColor = 0xff000000 | random.nextInt(0x00ffffff);
        view.setBackgroundColor(ranColor);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
