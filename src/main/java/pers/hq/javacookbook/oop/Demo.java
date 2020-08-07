package main.java.pers.hq.javacookbook.oop;

public class Demo {
    private String str1;
    private String str2;

    public Demo(String s1, String s2) {
        str1 = s1;
        str2 = s2;
    }

    /** 格式化输出：重写toString() */
    @Override
    public String toString() {
        return str1 + " " + str2;
    }

    public static void main(String[] args) {
        System.out.println(new Demo("a", "b"));
    }
}
