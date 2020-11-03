package com.hk.ximalaya.utils;

import com.hk.ximalaya.base.BaseFragment;
import com.hk.ximalaya.fragments.MainFragment;
import com.hk.ximalaya.fragments.MyFragment;
import com.hk.ximalaya.fragments.RecommendFragment;

import java.util.HashMap;
import java.util.Map;

public class MainControlFagmentUtils {
    private final static int FRAGMENT_0 = 0;
    private final static int FRAGMENT_1 = 1;
    private final static int FRAGMENT_2 = 2;

    public final static int FRAGMENT_COUNT = 3;


    private static Map<Integer, BaseFragment> mCache = new HashMap<>();

    public static BaseFragment getInstance(int index) {
        BaseFragment baseFragment = mCache.get(index);
        if (baseFragment != null) {
            return baseFragment;
        }
        switch (index) {
            case FRAGMENT_0:
                baseFragment = new RecommendFragment();
                break;
            case FRAGMENT_1:
                baseFragment = new MainFragment();

                break;
            case FRAGMENT_2:
                baseFragment = new MyFragment();
                break;

        }
        mCache.put(index, baseFragment);
        return baseFragment;
    }

}
