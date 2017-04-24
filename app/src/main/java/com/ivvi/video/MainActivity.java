package com.ivvi.video;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ivvi.sdk.util.IntentUtils;

import butterknife.BindView;

public class MainActivity extends CommonActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO  receive data
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Intent getStartIntent() {
        return IntentUtils.generateIntent(this, MainActivity.class);
    }
}
