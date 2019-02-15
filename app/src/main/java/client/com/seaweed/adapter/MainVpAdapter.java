package client.com.seaweed.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;

import client.com.seaweed.base.BaseFragment;


/**
 * Created on 2017/10/20 14:39.
 *
 * @author pan
 * @version 1.0
 */

public class MainVpAdapter extends FragmentPagerAdapter {
    private SparseArray<BaseFragment> mFragmentList;
    public MainVpAdapter(FragmentManager fm, SparseArray list) {
        super(fm);
        mFragmentList = list;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
