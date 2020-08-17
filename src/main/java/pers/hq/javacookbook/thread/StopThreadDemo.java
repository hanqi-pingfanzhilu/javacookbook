package main.java.pers.hq.javacookbook.thread;

public class StopThreadDemo extends Thread {
    /**
     * 必须是volatile，以确保变化对其他线程可见
     */
    protected volatile boolean done = false;

    @Override
    public void run() {
        while (!done) {
            System.out.println("Running...");
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                // nothing
            }
        }
        System.out.println("Finish.");
    }

    /**
     * 不建议使用Thread.stop()方法来停止线程
     */
    public void shutDown() {
        done = true;
    }

    public static void main(String[] args) throws InterruptedException {
        StopThreadDemo demo1 = new StopThreadDemo();
        demo1.start();
        Thread.sleep(5 * 1000);
        demo1.shutDown();
    }
}
