package com.sahan.csd68appone.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.sahan.csd68appone.adapter.PagerAdapter2;
import com.sahan.csd68appone.R;

public class Home2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        TabLayout tabLayout2 = (TabLayout) findViewById(R.id.tabLayout2);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.viewPager2);

        PagerAdapter2 adapter2 = new PagerAdapter2(this);
        viewPager2.setAdapter(adapter2);

        String[] titles = {"Games","Updates","Notifications"};
        TabLayoutMediator.TabConfigurationStrategy configurationStrategy = new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(titles[position]);
            }
        };

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout2, viewPager2, configurationStrategy);
        tabLayoutMediator.attach();

    }
}