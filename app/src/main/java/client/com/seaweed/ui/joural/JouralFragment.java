package client.com.seaweed.ui.joural;

import android.os.Bundle;
import android.view.View;

import client.com.seaweed.R;
import client.com.seaweed.base.BaseFragment;

/**
 * 日志
 * @author zxh17
 * @version 1.0
 */
public class JouralFragment extends BaseFragment {





    public JouralFragment() {
        // Required empty public constructor
    }

    public static JouralFragment newInstance() {
        JouralFragment fragment = new JouralFragment();
        return fragment;
    }



    @Override
    public int getLayoutId() {
        return R.layout.fragment_joural;
    }

    @Override
    public void initViews(View view) {

    }

    @Override
    protected void onFragmentFirstVisible() {

    }
}
