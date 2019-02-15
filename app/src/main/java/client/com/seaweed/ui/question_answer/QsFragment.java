package client.com.seaweed.ui.question_answer;

import android.os.Bundle;
import android.view.View;

import client.com.seaweed.R;
import client.com.seaweed.base.BaseFragment;

/**
 * 问答页面
 * @author zxh17
 * @version
 */
public class QsFragment extends BaseFragment {




    public QsFragment() {
        // Required empty public constructor
    }


    public static QsFragment newInstance() {
        QsFragment fragment = new QsFragment();
        return fragment;
    }




    @Override
    public int getLayoutId() {
        return R.layout.fragment_qs;
    }

    @Override
    public void initViews(View view) {

    }

    @Override
    protected void onFragmentFirstVisible() {

    }


}
