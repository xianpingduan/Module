package com.ivvi.video;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ivvi.sdk.activity.BaseActivity;

import butterknife.BindView;

/**
 * Created by duanxianping on 2016/12/16.
 */

public abstract class CommonActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.floatingActionButton)
    FloatingActionButton floatingActionButton;
    @BindView(R.id.coordinatorLayout)
    CoordinatorLayout coordinatorLayout;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO to receive intent data  flashBuket data
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_common;
    }

    public void hideFab() {
        floatingActionButton.setVisibility(View.GONE);
    }

    public void showFab() {
        floatingActionButton.setVisibility(View.VISIBLE);
    }

    public void setFabClickListener(View.OnClickListener listener) {
        if (floatingActionButton == null) {
            return;
        }
        floatingActionButton.setOnClickListener(listener);
    }
}
