package main.java.pers.hq.javacookbook.thread;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.LinkedList;

public class ProducerConsumerDemo1 {
    protected LinkedList<Object> list = new LinkedList<>();

    protected void produce() {
        int lenth = 0;
        synchronized (list) {
            Object prducer = new Object();
            list.addFirst(prducer);
            lenth = list.size();
            list.notifyAll();
        }
        System.out.println("List size is " + lenth);
    }

    protected void consume() {
        Object obj = null;
        int length = 0;
        synchronized (list) {
            while (list.size() == 0) {
                try {
                    list.wait();
                } catch (InterruptedException ex) {
                    return;
                }
            }
            obj = list.removeLast();
            length = list.size();
        }
        System.out.println("Consume is " + obj);
        System.out.println("List Size is " + length);
    }


    public static void main(String[] args) throws IOException {
        ProducerConsumerDemo1 pc = new ProducerConsumerDemo1();
        System.out.println("Ready, please input:");
        int i;
        while ((i = System.in.read()) != -1) {
            char c = (char) i;
            switch (c) {
                case 'p':
                    pc.produce();
                    break;
                case 'c':
                    pc.consume();
                    break;
            }
        }
    }
}
