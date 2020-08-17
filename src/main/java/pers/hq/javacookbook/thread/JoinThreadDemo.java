package main.java.pers.hq.javacookbook.thread;

import java.io.IOException;

public class JoinThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Reading");
            try {
                System.in.read();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        });
        System.out.println("Starting...");
        thread.start();
        System.out.println("Joining");
        try {
            thread.join();
        } catch (InterruptedException ex) {
            // 不应该发生
            System.out.println("Interrupt");
        }
        System.out.println("Finish");
    }
}
