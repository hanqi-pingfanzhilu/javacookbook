package main.java.pers.hq.javacookbook.thread;

import java.io.IOException;
import java.util.LinkedList;

public class ProducerConsumerDemo2 {
    /**
     * list是进行同步的对象（wait()和notifyAll()的对象）
     */
    protected LinkedList<Object> list = new LinkedList<>();
    protected int MAX = 10;
    protected boolean done = false;

    class Producer extends Thread {
        @Override
        public void run() {
            while (true) {
                Object producer = getRequest();
                synchronized (list) {
                    while (list.size() == MAX) {
                        try {
                            System.out.println("Producer Waiting...");
                            // 限制大小
                            list.wait();
                        } catch (InterruptedException ex) {
                            System.out.println("Producer Interrupted");
                        }
                    }
                    list.addFirst(producer);
                    // 必须要有锁
                    list.notifyAll();
                    System.out.println("List size is " + list.size());
                    if (done) {
                        break;
                    }
                }
            }
        }

        Object getRequest() {
            return (new Object());
        }
    }

    class Consumer extends Thread {
        @Override
        public void run() {
            while (true) {
                Object obj = null;
                synchronized (list) {
                    while (list.size() == 0) {
                        try {
                            System.out.println("Consumer Waiting...");
                            list.wait();
                        } catch (InterruptedException ex) {
                            System.out.println("Consumer Interrupted");
                        }
                    }
                    obj = list.removeLast();
                    list.notifyAll();
                    int length = list.size();
                    System.out.println("List size is " + length);
                    if (done) {
                        break;
                    }
                }
                process(obj);
            }
        }

        void process(Object obj) {
            System.out.println("Consuming object " + obj);
        }
    }

    ProducerConsumerDemo2(int p, int c) {
        for (int i = 0; i < p; i++) {
            new Producer().start();
        }
        for (int i = 0; i < c; i++) {
            new Consumer().start();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        // 启动生产者和消费者
        int pNum = 4;
        int cNum = 3;
        ProducerConsumerDemo2 pc = new ProducerConsumerDemo2(pNum, cNum);

        // 运行
        Thread.sleep(2 * 1000);

        // 结束
        synchronized (pc.list) {
            pc.done = true;
            pc.list.notifyAll();
        }
    }
}
