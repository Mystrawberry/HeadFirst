package com.jimmy.www.headfirst.observermode;

/**
 * <pre>
 *     author : Jimmy.tsang
 *     e-mail : jimmytsangfly@gmail.com
 *     time   : 2017/08/28
 *     desc   : 观察者 (当观察者发生改变时，观察者就能够及时知道发生了改变)
 *     version: 1.0
 * </pre>
 */
public interface Observer {
    /***
     * 更新内容
     */
    void login(String content);

    // 当然了可以在这里实现多个方法
}
