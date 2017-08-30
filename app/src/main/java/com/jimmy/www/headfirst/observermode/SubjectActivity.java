package com.jimmy.www.headfirst.observermode;

import java.util.ArrayList;

/**
 * <pre>
 *     author : Jimmy.tsang
 *     e-mail : jimmytsangfly@gmail.com
 *     time   : 2017/08/29
 *     desc   :  被观察者
 *     version: 1.0
 * </pre>
 */
public class SubjectActivity implements Subject {

    private ArrayList<Observer> mObserverList;

    private String mContent;

    public static final SubjectActivity sInstance = new SubjectActivity();

    private SubjectActivity() {
        mObserverList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        mObserverList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = mObserverList.indexOf(o);
        if (index >= 0) {
            mObserverList.remove(index);
        }
    }

    @Override
    public void notifyObServer() {
        //通知所有的观察者
        for (Observer o : mObserverList) {
            o.login(mContent);
        }
    }

    /**
     * 设置登录内容，用来打印
     */
    public void setLoginContent(String context) {
        this.mContent = context;
        notifyObServer();
    }
}
