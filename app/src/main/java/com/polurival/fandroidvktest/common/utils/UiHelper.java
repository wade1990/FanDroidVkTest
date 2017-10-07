package com.polurival.fandroidvktest.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

import com.polurival.fandroidvktest.R;

/**
 * Created by Polurival
 * on 05.10.2017.
 */

public class UiHelper {

    private static UiHelper ourInstance = new UiHelper();

    private Resources mResources;
    private Context mContext;

    public static UiHelper getInstance() {
        return ourInstance;
    }

    public void setUpTextViewWithVisibility(TextView textView, String s) {
        textView.setText(s);

        if (s.length() != 0) {
            textView.setVisibility(View.VISIBLE);
        } else {
            textView.setVisibility(View.GONE);
        }
    }

    public void setUpTextViewWithMessage(TextView textView, String s, String messageIfEmpty) {
        String s1;
        int color;
        Resources res = textView.getResources();

        if (s.length() != 0) {
            textView.setVisibility(View.VISIBLE);
            color = android.R.color.primary_text_light;

            s1 = s;

        } else {
            s1 = "Поделился";
            color = R.color.colorIcon;
        }

        textView.setText(s1);
        textView.setTextColor(res.getColor(color));
    }
}