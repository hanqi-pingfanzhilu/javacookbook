package main.java.pers.hq.javacookbook.number;

public class NumberDemo {
    public static void main(String[] args) {
        // 检查字符串是否是有效数字
        String numStr = "12.3";
        double num;
        try {
            num = Double.parseDouble(numStr);
            System.out.println(num);
            System.out.println(numStr + "是数字");
        } catch (NumberFormatException ex) {
            System.out.println(numStr + "不是数字");
        }

        // 用小数据类型存储大数据类型的数字时，由于会丢失精度，必须进行强制转换
        double num1 = 12.3;
        int num2 = (int) num1;
        System.out.println("num1: " + num1 + ", " + "num2: " + num2);

        // 装箱：将值类型转换成引用类型
        // 拆箱：将引用类型转换成值类型
        int num3 = 12;
        Object obj = num3;
        int num4 = Integer.valueOf(num3);
        System.out.println("num3: " + num3 + ", " + "num4: " + num4);
    }
}
