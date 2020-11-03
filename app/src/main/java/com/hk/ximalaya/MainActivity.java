package com.hk.ximalaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.androidkun.xtablayout.XTabLayout;
import com.hk.ximalaya.adapters.FragmentAdapter;
import com.hk.ximalaya.utils.AppUtil;
import com.hk.ximalaya.utils.Constants;
import com.hk.ximalaya.utils.LogUtils;
import com.hk.ximalaya.utils.statusbar.StatusBarUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.album.GussLikeAlbumList;
import com.ximalaya.ting.android.opensdk.model.category.Category;
import com.ximalaya.ting.android.opensdk.model.category.CategoryList;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private String TAG = this.getClass().getSimpleName();
    private XTabLayout mXtabLayout;
    private ViewPager mViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StatusBarUtils.setStatusBarColor(this,R.color.color_eec04c);
        mXtabLayout = findViewById(R.id.xtab_layout);
        mViewpager = findViewById(R.id.viewpager);

        FragmentAdapter mViewPagerAdapter = new FragmentAdapter(this, getSupportFragmentManager());
        mViewpager.setAdapter(mViewPagerAdapter);
        //给TabLayout设置适配器
        mXtabLayout.setupWithViewPager(mViewpager);

    }

}
