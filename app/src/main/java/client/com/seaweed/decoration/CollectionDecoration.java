package client.com.seaweed.decoration;

import android.graphics.Rect;
import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * recyclerview分割线
 * @author zxh17
 * @version 1.0
 * */
public class CollectionDecoration extends RecyclerView.ItemDecoration{
    //dp转px
    private int bottomOffset; //底部分割线
    private int topOffset;// 第一条顶部分割线

    public CollectionDecoration(int bottomOffset, int topOffset) {
        this.bottomOffset = bottomOffset;
        this.topOffset = topOffset;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        int childCount = parent.getChildCount();
        if(childLayoutPosition==0){
            outRect.top=topOffset;
          }
        outRect.bottom=bottomOffset;
    }


}
