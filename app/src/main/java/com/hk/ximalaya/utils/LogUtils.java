package com.hk.ximalaya.utils;

import android.util.Log;

public class LogUtils {
    public static String mTag = "LogUtils";
    //控制是否输出
    public static boolean mIsRelease = false;

    public static void init(String baseTag, boolean isRelease) {
        mTag = baseTag;
        mIsRelease = isRelease;
    }

    public static void e(String subTag, String content) {
        if (mIsRelease) {
            Log.e("[ " + mTag + " ] ---- > " + subTag, content);
        }
    }

    public static void i(String subTag, String content) {
        if (mIsRelease) {
            Log.i("[ " + mTag + " ] ---- > " + subTag, content);
        }
    }

    public static void v(String subTag, String content) {
        if (mIsRelease) {
            Log.v("[ " + mTag + " ] ---- > " + subTag, content);
        }
    }

    public static void d(String subTag, String content) {
        if (mIsRelease) {
            Log.d("[ " + mTag + " ] ---- > " + subTag, content);
        }
    }

}
