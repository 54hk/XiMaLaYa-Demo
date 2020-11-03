package com.hk.ximalaya.adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.hk.ximalaya.R;
import com.hk.ximalaya.utils.MainControlFagmentUtils;

public class FragmentAdapter extends FragmentPagerAdapter {

    private final String[] title;

    public FragmentAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        title = context.getApplicationContext().getResources().getStringArray(R.array.main_control_fragment);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return MainControlFagmentUtils.getInstance(position);
    }

    @Override
    public int getCount() {
        return MainControlFagmentUtils.FRAGMENT_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];

    }
}
