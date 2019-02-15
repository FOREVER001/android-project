package client.com.seaweed.ui.mine;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import client.com.seaweed.R;
import client.com.seaweed.base.BaseFragment;

/**
 * 我的页面
 * @author zxh17
 * @version 1.0
 */
public class MineFragment extends BaseFragment {


    public MineFragment() {
        // Required empty public constructor
    }

    public static MineFragment newInstance() {
        MineFragment fragment = new MineFragment();
        return fragment;
    }




    @Override
    public int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initViews(View view) {

    }

    @Override
    protected void onFragmentFirstVisible() {

    }


}
