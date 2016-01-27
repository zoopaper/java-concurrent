package com.concurrent.lock;

/**
 * <p>
 * 在有些情况下死锁是可以避免的,介绍三种用于避免死锁的技术：
 * 1.加锁顺序
 * 2.加锁时限
 * 3.死锁检测
 * <br><br>
 * 加锁顺序：
 * 当多个线程需要相同的一些锁，但是按照不同的顺序加锁，死锁就很容易发生。
 * 如果能确保所有的线程都是按照相同的顺序获得锁，那么死锁就不会发生。看下面这个例子：
 * <pre>
 *
 * </code>
 * </p>
 * <p/>
 * <p/>
 * User: shijingui
 * Date: 2016/1/26
 */
public class DeadLockAvoid {


}
