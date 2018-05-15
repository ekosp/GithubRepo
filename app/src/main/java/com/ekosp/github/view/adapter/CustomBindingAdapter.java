package com.ekosp.github.view.adapter;

import android.view.View;
import android.databinding.BindingAdapter;

/**
 * Created by eko on 15/05/ 18.
 * Email : eko.purnomo@salt.co.id
 */

public class CustomBindingAdapter {
    @BindingAdapter("visibleGone")
    public static void showHide(View view, boolean show) {
        view.setVisibility(show ? View.VISIBLE : View.GONE);
    }
}