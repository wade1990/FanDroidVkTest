package com.polurival.fandroidvktest.model.view;

import android.view.View;

import com.polurival.fandroidvktest.model.WallItem;
import com.polurival.fandroidvktest.ui.holder.BaseViewHolder;
import com.polurival.fandroidvktest.ui.holder.NewsItemBodyHolder;

/**
 * Created by Polurival
 * on 26.08.2017.
 */

public class NewsFeedItemBodyViewModel extends BaseViewModel {

    private int mId;
    private String mText;

    public NewsFeedItemBodyViewModel(WallItem wallItem) {
        mId = wallItem.getId();
        mText = wallItem.getText();
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.NewsFeedItemBody;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new NewsItemBodyHolder(view);
    }

    public int getId() {
        return mId;
    }

    public String getText() {
        return mText;
    }
}