package com.ivvi.sdk.util;

import android.content.Context;
import android.content.Intent;

/**
 * Created by duanxianping on 2017/4/24.
 */

public class IntentUtils {

    public static Intent generateIntent(Context context, Class aclass) {
        Intent intent = new Intent();
        intent.setClass(context, aclass);
        return intent;
    }

    public static Intent generateIntent(String action) {
        Intent intent = new Intent();
        intent.setAction(action);
        return intent;
    }

}
