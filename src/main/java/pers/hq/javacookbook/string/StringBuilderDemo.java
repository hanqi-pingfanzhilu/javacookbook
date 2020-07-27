package main.java.pers.hq.javacookbook.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // 由于String对象是不可变，因此使用StringBuilder对象，最后调用toString()方法将字符序列转换为String
        // StringBuffer是线程同步的；StringBuilder是线程不同步的
        StringBuilder sb = new StringBuilder();
        // append()方法返回一个指向StringBuilder对象本身的引用，因此可以使用 .append(…).append(…)这样的写法
        sb.append("Java").append(" ").append("Cookbook");
        System.out.println(sb.toString());
    }
}
