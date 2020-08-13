package main.java.pers.hq.javacookbook.thread;

/**
 * 实现线程方式1：继承Runnable接口
 */
public class ThreadDemo2 implements Runnable {
    private String msg;
    private Thread t;
    private int count;

    public static void main(String[] args) {
        new ThreadDemo2("Thread1", 10);
        new ThreadDemo2("Thread2", 10);
    }

    public ThreadDemo2(String msg, int count) {
        this.msg = msg;
        this.count = count;
        t = new Thread(this);
        t.setName(msg + " runner Thread");
        t.start();
    }

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
}
