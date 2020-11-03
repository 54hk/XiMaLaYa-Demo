package com.hk.ximalaya.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hk.ximalaya.R;
import com.hk.ximalaya.base.BaseFragment;

public class MyFragment extends BaseFragment {



    @Override
    public View onSubCreateView() {

        return LayoutInflater.from(getActivity()).inflate(R.layout.fragment_my , null);
    }

    @Override
    public void onFindById(View view) {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }
}
