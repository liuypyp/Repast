package test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Liuyp on 2017/11/28.
 */
public class ThreadTest {
    static Integer a = 0;
    public static void main(String[] args){
        final  Lock lock = new ReentrantLock();
        new Thread(new Runnable() {
            public void run() {

                for(int i = 0; i < 50; i ++){
                    lock.lock();
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("aa->" + a++);
                    lock.unlock();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 50; i ++){
                    lock.lock();
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                    }
                    System.out.println("bb->" + a++);
                    lock.unlock();
                }
            }
        }).start();
    }

}


