package main.java.pers.hq.javacookbook.string;

import java.util.StringTokenizer;

public class SplitStringDemo {
    public static void main(String[] args) {
        // 分解字符串方式1：split(String regex, [int limit])
        String str1 = "Java1 Cookbook1";
        String[] strArray = str1.split(" ");
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);

        // 分解字符串方式2：StringTokenizer(String str, [String delim], [boolean returnDelims])。主要是其hasMoreTokens()和nextToken()方法
        StringTokenizer st1 = new StringTokenizer("Java2,Cookbook2");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken(","));
        }
        // StringTokenizer还有个hasMoreElements()方法，但从源码看，该方法其实就是返回hasMoreTokens()
        StringTokenizer st2 = new StringTokenizer("Java3,Cook--book 3", ", -");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}
