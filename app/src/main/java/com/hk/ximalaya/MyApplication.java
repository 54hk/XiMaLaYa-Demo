package com.hk.ximalaya;

import android.app.Application;

import com.hk.ximalaya.utils.LogUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化喜马拉雅SDK
        CommonRequest mXimalaya = CommonRequest.getInstanse();


        String mAppSecret = "a3a07b70561d29d49a2026bbac231198";
        mXimalaya.setAppkey("4c817a44a88d5adf59e4662e4c68fea6");
        mXimalaya.setPackid("com.hk.ximalaya");
        mXimalaya.init(this, mAppSecret);
        //初始化logUtils
        LogUtils.init(this.getPackageName(), true);

//        AccessTokenManager.getInstanse().init(this);
    }
}
