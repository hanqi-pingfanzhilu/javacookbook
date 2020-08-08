package main.java.pers.hq.javacookbook.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String  inputLine = br.readLine();
            while (!"stop".equals(inputLine)) {
                System.out.println("Read data: " + inputLine);
                inputLine = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
