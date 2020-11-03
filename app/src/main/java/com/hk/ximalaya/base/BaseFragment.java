package com.hk.ximalaya.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = onSubCreateView();
        onFindById(view);
        initView();
        initData();
        return view;
    }


    public abstract View onSubCreateView();
    public abstract void onFindById(View view);
    public abstract void initView();
    public abstract void initData();
}
