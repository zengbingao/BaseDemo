package com.robin.basedemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * BaseFragment
 * Created by robin on 2017/1/12.
 */

public abstract class BaseFragment extends Fragment {

    private static final String TAG = "BaseFragment";
    private BaseActivity mActivity;

    /**
     * 获取布局ID
     *
     * @return
     */
    abstract int getLayoutId();

    /**
     * 加载view
     *
     * @param view
     * @param savedInstanceState
     */
    abstract void initView(View view, Bundle savedInstanceState);

    /**
     * 获取当前fragment绑定的activity（用这个来替代getActivity）
     * @return
     */
    public BaseActivity getCurActivity() {
        return mActivity;
    }

    //添加fragment
    protected void addFragment(BaseFragment fragment) {
        if (null != fragment) {
            getCurActivity().addFragment(fragment);
        }
    }

    //移除fragment
    protected void removeFragment() {
        getCurActivity().removeFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (BaseActivity) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        initView(view, savedInstanceState);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
