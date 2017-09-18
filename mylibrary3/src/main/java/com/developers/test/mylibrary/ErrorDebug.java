package com.developers.test.mylibrary;

import android.util.Log;

/**
 * Created by arjun on 9/18/2017.
 */

public class ErrorDebug {
    private static final String TAG="SUPER+AWESOME";
    public static void d(String mes){
        Log.e(TAG, mes);
    }
}
