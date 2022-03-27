package com.sahan.csd68appone;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.sahan.csd68appone.view.GamesFragment;
import com.sahan.csd68appone.view.NewsFragment;
import com.sahan.csd68appone.view.NotificationFragment;

public class PagerAdapter2 extends FragmentStateAdapter {

    public PagerAdapter2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new GamesFragment();
                break;
            case 1:
                fragment = new NewsFragment();
                break;
            case 2:
                fragment = new NotificationFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
