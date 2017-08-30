package com.jimmy.www.headfirst;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jimmy.www.headfirst.observermode.Observer;
import com.jimmy.www.headfirst.observermode.SubjectActivity;

/**
 * <pre>
 *     author : Jimmy.tsang
 *     e-mail : jimmytsangfly@gmail.com
 *     time   : 2017/08/28
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class BaseActivity extends AppCompatActivity implements Observer {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SubjectActivity.sInstance.registerObserver(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SubjectActivity.sInstance.removeObserver(this);
    }


    @Override
    public void login(String content) {
        Log.e("content",content);
    }
}
