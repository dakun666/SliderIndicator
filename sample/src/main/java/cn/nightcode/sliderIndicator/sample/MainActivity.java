package cn.nightcode.sliderIndicator.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import cn.nightcode.sliderIndicator.SliderIndicator;

public class MainActivity extends AppCompatActivity {

    private ViewPager mainViewPager;

    private SliderIndicator indicator;

    private SamplePagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewPager = findViewById(R.id.main_view_pager);

        pagerAdapter = new SamplePagerAdapter(this);
        mainViewPager.setAdapter(pagerAdapter);

        indicator = findViewById(R.id.main_slide_indicator);

        pagerAdapter.setCount(10);
        indicator.setupWithViewPager(mainViewPager);
    }
}
