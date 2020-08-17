package main.java.pers.hq.javacookbook.thread;

import java.io.IOException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerDemo3 {
    protected volatile boolean done = false;

    class Producer implements Runnable {
        protected BlockingDeque<Object> queue;

        Producer(BlockingDeque<Object> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Object producer = getRequest();
                    queue.put(producer);
                    System.out.println("List size is" + queue.size());
                    if (done) {
                        return;
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println("Producer Interrupted");
            }
        }

        Object getRequest() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Producer Read Interrupted");
            }
            return new Object();
        }
    }

    class Consumer implements Runnable {
        protected BlockingDeque<Object> queue;

        Consumer(BlockingDeque<Object> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Object obj = queue.take();
                    int length = queue.size();
                    System.out.println("List size is " + length);
                    process(obj);
                    if (done) {
                        return;
                    }
                }
            } catch (InterruptedException ex) {
                System.out.println("Consumer Interrupted");
            }
        }

        void process(Object obj) {
            System.out.println("Consuming object " + obj);
        }
    }

    ProducerConsumerDemo3(int p, int c) {
        BlockingDeque<Object> queue = new LinkedBlockingDeque<>();
        for (int i = 0; i < p; i++) {
            new Thread(new Producer(queue)).start();
        }
        for (int i = 0; i < c; i++) {
            new Thread(new Consumer(queue)).start();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        int pNum = 4;
        int cNum = 3;
        ProducerConsumerDemo3 pc = new ProducerConsumerDemo3(pNum, cNum);

        Thread.sleep(1000);

        pc.done = true;
    }
}
