package client.com.seaweed.ui.home;

import android.os.Bundle;
import android.view.View;

import client.com.seaweed.R;
import client.com.seaweed.base.BaseFragment;

/**
 * 首页
 * @author zxh17
 * @version 1.0
 *
 */
public class HomeFragment extends BaseFragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }



    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initViews(View view) {

    }

    @Override
    protected void onFragmentFirstVisible() {

    }


}
