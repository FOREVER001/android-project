package client.com.seaweed;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;
import client.com.seaweed.adapter.MainVpAdapter;
import client.com.seaweed.base.BaseActivity;
import client.com.seaweed.ui.home.HomeFragment;
import client.com.seaweed.ui.joural.JouralFragment;
import client.com.seaweed.ui.mine.MineFragment;
import client.com.seaweed.ui.privilege.PrivilegeFragment;
import client.com.seaweed.ui.question_answer.QsFragment;
import client.com.seaweed.widget.NoScrollViewPager;

/**
 * mainActivity
 * @author zxh17
 * @version 1.0
 */
public class MainActivity extends BaseActivity {


    @BindView(R.id.im_menu1)
    ImageView imMenu1;
    @BindView(R.id.tv_menu1)
    TextView tvMenu1;
    @BindView(R.id.ll_menu1)
    LinearLayout llMenu1;
    @BindView(R.id.im_menu2)
    ImageView imMenu2;
    @BindView(R.id.tv_menu2)
    TextView tvMenu2;
    @BindView(R.id.ll_menu2)
    LinearLayout llMenu2;
    @BindView(R.id.im_menu3)
    ImageView imMenu3;
    @BindView(R.id.tv_menu3)
    TextView tvMenu3;
    @BindView(R.id.ll_menu3)
    LinearLayout llMenu3;
    @BindView(R.id.im_menu4)
    ImageView imMenu4;
    @BindView(R.id.tv_menu4)
    TextView tvMenu4;
    @BindView(R.id.ll_menu4)
    LinearLayout llMenu4;
    @BindView(R.id.im_menu5)
    ImageView imMenu5;
    @BindView(R.id.tv_menu5)
    TextView tvMenu5;
    @BindView(R.id.ll_menu5)
    LinearLayout llMenu5;
    @BindView(R.id.main_vp)
    NoScrollViewPager mViewPager;
    @BindView(R.id.container)
    RelativeLayout container;
    private int mCurrentPage = 0;

    private HomeFragment fragment1;
    private JouralFragment fragment2;
    private PrivilegeFragment fragment3;
    private QsFragment fragment4;
    private MineFragment fragment5;

    @Override
    public void initViews() {
        fragment1 = HomeFragment.newInstance();
        fragment2 = JouralFragment.newInstance();
        fragment3 = PrivilegeFragment.newInstance();
        fragment4 = QsFragment.newInstance();
        fragment5 = MineFragment.newInstance();

        mViewPager.setCanScroll(false);
        mViewPager.setOffscreenPageLimit(5);
        SparseArray list = new SparseArray(5);
        list.put(0, fragment1);
        list.put(1, fragment2);
        list.put(2, fragment3);
        list.put(3, fragment4);
        list.put(4, fragment5);
        MainVpAdapter adapter = new MainVpAdapter(getSupportFragmentManager(), list);
        mViewPager.setAdapter(adapter);
        llMenu1.setSelected(true);
        smoothChangePage(0);
    }
    private void smoothChangePage(int page) {
        mViewPager.setCurrentItem(page, false);
    }
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @OnClick({R.id.ll_menu1, R.id.ll_menu2, R.id.ll_menu3, R.id.ll_menu4, R.id.ll_menu5})
    public void onViewClicked(View view) {
        llMenu1.setSelected(false);
        llMenu2.setSelected(false);
        llMenu3.setSelected(false);
        llMenu4.setSelected(false);
        llMenu5.setSelected(false);
        switch (view.getId()) {
            case R.id.ll_menu1:
                llMenu1.setSelected(true);
                mCurrentPage = 0;
                break;
            case R.id.ll_menu2:
                llMenu2.setSelected(true);
                mCurrentPage = 1;
                break;
            case R.id.ll_menu3:
                llMenu3.setSelected(true);
                mCurrentPage = 2;
                break;
            case R.id.ll_menu4:
                llMenu4.setSelected(true);
                mCurrentPage = 3;
                break;
            case R.id.ll_menu5:
                llMenu5.setSelected(true);
                mCurrentPage = 4;
                break;
        }
        smoothChangePage(mCurrentPage);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("page", mCurrentPage);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mCurrentPage = savedInstanceState.getInt("page");
        smoothChangePage(mCurrentPage);
    }
}
