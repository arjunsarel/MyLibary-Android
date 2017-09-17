package com.developers.test.mylibrary;

import android.util.Log;

/**
 * Created by arjun on 9/17/2017.
 */

public class LogDebug {
    private static final String TAG="SUPER+AWESOME";
    public static void d(String mes){
        Log.d(TAG, mes);
    }
}
