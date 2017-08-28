package com.jimmy.www.headfirst.observermode;

/**
 * <pre>
 *     author : Jimmy.tsang
 *     e-mail : jimmytsangfly@gmail.com
 *     time   : 2017/08/28
 *     desc   : 被观察者  (类似于报社，只要订阅这家报社的报纸，那么当有新的新闻时就会通知所有订阅该报社的用户)
 *     version: 1.0
 * </pre>
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObServer();


}
