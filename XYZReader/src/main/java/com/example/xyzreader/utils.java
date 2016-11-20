package com.example.xyzreader;

import android.content.Context;

/**
 * Created by peter on 11/20/16.
 */

public class utils {

    // A method to find height of the status bar, help from
    // http://blog.raffaeu.com/archive/2015/04/11/android-and-the-transparent-status-bar.aspx
    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
