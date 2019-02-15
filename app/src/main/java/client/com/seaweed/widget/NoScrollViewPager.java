package client.com.seaweed.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created on 2017/10/20 15:02.
 *
 * @author pan
 * @version 1.0
 */

public class NoScrollViewPager extends ViewPager {
    private boolean canScroll = false;

    public NoScrollViewPager(Context context) {
        this(context, null);

    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (canScroll) {
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (canScroll) {
            super.onTouchEvent(ev);
        }
        return false;
    }

    public void setCanScroll(boolean canScroll) {
        this.canScroll = canScroll;
    }


}

