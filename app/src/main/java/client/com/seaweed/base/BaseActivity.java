package client.com.seaweed.base;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;



import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

import butterknife.ButterKnife;
import client.com.http.utils.RxHttpUtils;
import client.com.seaweed.R;
import client.com.seaweed.util.ActivityManage;
import client.com.seaweed.util.OsUtil;
import client.com.seaweed.util.StatusBarUtil;

/**
 * baseActivity
 * @author zxh
 * @version 1.0
 * **/
public abstract class BaseActivity extends AppCompatActivity {

    public static String LANGUAGE = "zh";
    public static final String TAG = "BaseActivity";
    private boolean statusbarTinted = true;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        ActivityManage.addActivity(this);
        initViews();
        if (statusbarTinted){
            setupStatusBar();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {

        super.onPause();

    }

    @Override
    protected void onStop() {

        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RxHttpUtils.clearAllCompositeDisposable();
        ActivityManage.removeActivity(this);

    }

    /**
     * 初始化 view
     */
    public abstract void initViews();

    /**
     * 获取布局id给setContentView()
     *
     * @return 布局id
     */
    public abstract int getLayoutId();

    public BaseActivity getActivity() {
        return this;
    }

    /**
     * 隐藏密码
     *
     * @param eye
     * @param editView
     */
    protected void hidePassword(View eye, EditText editView) {
        if (eye.isSelected()) {
            editView.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            editView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        eye.setSelected(!eye.isSelected());
        editView.setSelection(editView.getText().length());
    }

    protected void setupStatusBar() {
        if (OsUtil.isFlyme() || OsUtil.isMIUI()) {
            StatusBarUtil.setStatusBarColor(this, R.color.home_orange);
            StatusBarUtil.StatusBarLightMode(this);
        } else {
            StatusBarUtil.setStatusBarColor(this, R.color.home_orange);
        }
    }
    /**
     * 封装findViewById
     *
     * @param id          控件的id
     * @param contentView 布局view
     * @return T 返回相应的控件类型
     */
    protected static <T extends View> T getViewById(int id, View contentView) {
        return (T) contentView.findViewById(id);
    }

    public void setStatusbarTinted(boolean tinted){
        statusbarTinted = tinted;
    }


    /**
     * 打开activity * @param ActivityClass
     */
    public void openActivity(Class<? extends Activity> ActivityClass) {
        Intent intent = new Intent(this, ActivityClass);
        startActivity(intent);
    }

    /**
     * 打开activity * @param ActivityClass
     */

    public void openActivity(Class<? extends Activity> ActivityClass, Bundle b) {
        Intent intent = new Intent(this, ActivityClass);
        intent.putExtras(b);
        startActivity(intent);
    }


}
