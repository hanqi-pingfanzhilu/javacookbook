package main.java.pers.hq.javacookbook.io;

import java.io.Console;
import java.util.Scanner;

public class ScannerAndConsole {
    public static void main(String[] args) {
        System.out.print("Please input your password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("Your password is: " + password);

        // Console是控制台类，IDEA是作为后台进程运行的，不是控制台，因此下面的代码会报错进入else，特此说明
        /*
        Console con;
        if ((con = System.console()) != null) {
            char[] pwd = null;
            try {
                pwd = con.readPassword("Password: ");
                System.out.println("The password is: " + new String(pwd));
            } finally {
                if (pwd != null) {
                    java.util.Arrays.fill(pwd, ' ');
                }
            }
        } else {
            throw new RuntimeException("No console, can't get password.");
        }*/
    }
}
