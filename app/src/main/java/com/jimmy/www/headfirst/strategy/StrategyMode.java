package com.jimmy.www.headfirst.strategy;

import android.util.Log;

/**
 * <pre>
 *     author : Jimmy.tsang
 *     e-mail : jimmytsangfly@gmail.com
 *     time   : 2017/08/30
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class StrategyMode {

    private int i;

    public StrategyMode() {

    }

    public void print() {
        //假设这个值有很多东西
        if (i == 1) {
            Log.e("tag", "1");
        } else if (i == 2) {
            Log.e("tag", "2");
        } else if (i == 3) {
            Log.e("tag", "3");
        }
    }
}
