package main.java.pers.hq.javacookbook.thread;

import java.util.ArrayList;

/**
 * 实现线程方式1：使用一个内部类提供Runnable的实现
 */
public class ThreadDemo3 {
    private Thread t;
    private int count;

    public static void main(String[] args) {
        new ThreadDemo3("Thread1", 10);
        new ThreadDemo3("Thread2", 10);
    }

    public ThreadDemo3(final String msg, int c) {
        count = c;

        // 匿名内部类
        /* t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count-- > 0) {
                    System.out.println(msg);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
                System.out.println(msg + " thread all done.");
            }
        });*/

        // lambda表达式
        t = new Thread(() -> {
            while (count-- > 0) {
                System.out.println(msg);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
            System.out.println(msg + " thread all done.");
        });
        t.setName(msg + " runner Thread");
        t.start();
    }
}
