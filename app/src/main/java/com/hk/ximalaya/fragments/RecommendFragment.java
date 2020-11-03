package com.hk.ximalaya.fragments;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.hk.ximalaya.R;
import com.hk.ximalaya.adapters.RecommendAdapter;
import com.hk.ximalaya.base.BaseFragment;
import com.hk.ximalaya.utils.Constants;
import com.hk.ximalaya.utils.LogUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.album.GussLikeAlbumList;

import java.util.HashMap;
import java.util.Map;

public class RecommendFragment extends BaseFragment {

    private final String TAG = this.getClass().getSimpleName();
    private RecyclerView recyclerView;
    private RecommendAdapter mRecommendAdapter;

    @Override
    public View onSubCreateView() {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_recommend_activity, null);
        return inflate;
    }

    @Override
    public void onFindById(View view) {
        recyclerView = view.findViewById(R.id.recycleVIew);
    }

    @Override
    public void initView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        mRecommendAdapter = new RecommendAdapter();
        recyclerView.setAdapter(mRecommendAdapter);
    }

    @Override
    public void initData() {

        Map<String, String> map = new HashMap<String, String>();
        map.put(DTransferConstants.LIKE_COUNT, Constants.REFRISH_SIZE);
        CommonRequest.getGuessLikeAlbum(map, new IDataCallBack<GussLikeAlbumList>() {
            @Override
            public void onSuccess(GussLikeAlbumList gussLikeAlbumList) {
                if (gussLikeAlbumList != null) {
                    if (gussLikeAlbumList.getAlbumList().size() > 0)

                        mRecommendAdapter.setData(gussLikeAlbumList.getAlbumList());
                }
                LogUtils.e(TAG, gussLikeAlbumList.getAlbumList().size() + "-----");
            }


            @Override
            public void onError(int i, String s) {
                LogUtils.e(TAG, "---onerror--");

            }
        });
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int sum = arr[j + 1];
                    arr[j + 1] = arr[i];
                    arr[j + 1] = sum;
                }
            }
            Log.e("", "");
        }
    }

    public void sort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int sum = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[sum] > arr[j]) {
                    sum = j;
                }
            }
            if (i != sum) {
                int num = arr[sum];
                arr[sum] = arr[i];
                arr[i] = num;
            }
        }
    }

    public int sort3(int[] arr, int key) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int modle = (start + end) / 2;
            if (arr[modle] == key) {
                return modle;
            } else if (arr[modle] > key) {
                end = modle + 1;
            } else if (arr[modle] < key) {
                start = modle - 1;
            }
        }
        return 0;
    }

}
