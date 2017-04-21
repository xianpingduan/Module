package com.ivvi.thirdparty.glide;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * Created by duanxianping on 2016/12/15.
 */

public class GlideImageView extends AppCompatImageView {
    public GlideImageView(Context context) {
        this(context, null);
    }

    public GlideImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GlideImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void load(@NonNull Uri uri) {
        Glide.with(getContext())
                .load(uri)
                .centerCrop()
                .crossFade()
                .into(this);
    }

    public void load(@NonNull String url) {
        Glide.with(getContext())
                .load(url)
                .centerCrop()
                .crossFade()
                .into(this);
    }

    public void load(@NonNull File file) {
        Glide.with(getContext())
                .load(file)
                .centerCrop()
                .crossFade()
                .into(this);
    }

    public void load(@DrawableRes int resourceId) {
        Glide.with(getContext())
                .load(resourceId)
                .centerCrop()
                .crossFade()
                .into(this);
    }

}
