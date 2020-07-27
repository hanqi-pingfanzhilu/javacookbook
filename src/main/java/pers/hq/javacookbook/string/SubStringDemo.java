package main.java.pers.hq.javacookbook.string;

public class SubStringDemo {
    public static void main(String[] args) {
        // 截取字符串：substring(beginIndex, [endIndex]) --- 如果有endIndex，结束索引位置不包括endIndex
        String str1 = "Java Cookbook";
        String str2 = str1.substring(1);
        String str3 = str1.substring(0, 2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
