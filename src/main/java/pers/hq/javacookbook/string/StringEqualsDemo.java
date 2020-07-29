package main.java.pers.hq.javacookbook.string;

public class StringEqualsDemo {
    public static void main(String[] args) {
        // 字符串相等比较
        System.out.println("Abc".equals("Abc"));
        System.out.println("Abc".equals("abc"));
        // 字符串相等比较，忽略大小写
        System.out.println("Abc".equalsIgnoreCase("abc"));
    }
}
