package com.jimmy.www.headfirst;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jimmy.www.headfirst.observermode.Observer;
import com.jimmy.www.headfirst.observermode.Subject;

import java.util.ArrayList;

/**
 * <pre>
 *     author : Jimmy.tsang
 *     e-mail : jimmytsangfly@gmail.com
 *     time   : 2017/08/28
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class BaseActivity extends AppCompatActivity implements Subject {  // 这里我想试试 以activity 作为被观察者  //如果这样写的话，那么每一个activity都是
    //观察者

    private ArrayList<Observer> observers;
    private String content = "content"; //TODO 这个值需要被赋值

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        observers = new ArrayList<>();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObServer() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(content);
        }
    }

    public void setNewData(String s) {
        this.content = s;
        notifyObServer();
    }
}
