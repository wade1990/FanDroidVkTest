package com.polurival.fandroidvktest.ui.holder;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

import com.polurival.fandroidvktest.MyApplication;
import com.polurival.fandroidvktest.R;
import com.polurival.fandroidvktest.model.view.NewsItemBodyViewModel;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Polurival
 * on 26.08.2017.
 */

public class NewsItemBodyHolder extends BaseViewHolder<NewsItemBodyViewModel> {

    @BindView(R.id.tv_text)
    TextView tvText;

    @BindView(R.id.tv_attachments)
    TextView tvAttachments;

    @Inject
    protected Typeface mFontGoogle;

    public NewsItemBodyHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);

        MyApplication.getApplicationComponent().inject(this);

        if (tvAttachments != null) {
            tvAttachments.setTypeface(mFontGoogle);
        }
    }

    @Override
    public void bindViewHolder(NewsItemBodyViewModel item) {
        tvText.setText(item.getText());
        tvAttachments.setText(item.getAttachmentString());
    }

    @Override
    public void unbindViewHolder() {
        tvText.setText(null);
        tvAttachments.setText(null);
    }
}
