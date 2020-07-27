package main.java.pers.hq.javacookbook.string;

public class StringToCharDemo {
    public static void main(String[] args) {
        // 使用for循环和String的charAt()方法
        String str = "a-b c";
        System.out.println("for循环");
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Char " + i + " is " + str.charAt(i));
        }

        // 使用"for each"循环和String的toCharArray()方法
        System.out.println("for each循环");
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
    }
}
