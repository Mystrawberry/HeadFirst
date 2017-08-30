package com.jimmy.www.headfirst;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jimmy.www.headfirst.observermode.SubjectActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    Button observerMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        observerMode = (Button) findViewById(R.id.observer_mode);
        observerMode.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.observer_mode:
                SubjectActivity.sInstance.setLoginContent("MainActivity");
                break;
            default:
                break;
        }
    }
}
