package main.java.pers.hq.javacookbook.thread;

/**
 * 实现线程方式1：继承Thread类
 */
public class ThreadDemo1 extends Thread {
    private String msg;
    private int count;

    public static void main(String[] args) {
        new ThreadDemo1("Thread1", 10).start();
        new ThreadDemo1("Thread2", 10).start();
    }

    public ThreadDemo1(final String msg, int count) {
        this.msg = msg;
        this.count = count;
        // setName(xxx)设置线程名称
        setName(msg + " runner Thread");
    }

    @Override
    public void run() {
        while (count-- > 0) {
            // getName()获取线程名称
            System.out.println(getName() + " --- " + msg);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println(msg + " all done.");
    }
}
