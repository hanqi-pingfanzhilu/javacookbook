package main.java.pers.hq.javacookbook.number;

import java.util.Random;

public class NumberDemo {
    public static void main(String[] args) {
        // 1.检查字符串是否是有效数字
        String numStr = "12.3";
        double num;
        System.out.println("检查字符串是否是有效数字");
        try {
            num = Double.parseDouble(numStr);
            System.out.println(num);
            System.out.println(numStr + "是数字");
        } catch (NumberFormatException ex) {
            System.out.println(numStr + "不是数字");
        }

        // 2.用小数据类型存储大数据类型的数字时，由于会丢失精度，必须进行强制转换
        double num1 = 12.3;
        int num2 = (int) num1;
        System.out.println("丢失精度必须强制转换");
        System.out.println("num1: " + num1 + ", " + "num2: " + num2);

        // 3.装箱：将值类型转换成引用类型; 拆箱：将引用类型转换成值类型
        // 基本类型对应的包装类，其作用之一就是对基本类型进行装箱
        int num3 = 12;
        Object obj = num3;
        int num4 = Integer.valueOf(num3);
        System.out.println("装箱和拆箱");
        System.out.println("num3: " + num3 + ", " + "num4: " + num4);

        // 4.整数类型除以0会抛出异常，但浮点型不会
        // 正浮点数除以0得到POSITIVE_INFINITY常量，负浮点数除以0得到NEGATIVE_INFINITY常量，无效结果得到NaN（非数字），这三个常量都被定义在float和double的包装类中
        // NaN不能用==来判断，必须用isNan()方法来判断
        System.out.println("浮点数除以0以及NaN");
        System.out.println(Double.isNaN(0.0d / 0.0));
        System.out.println(Double.isInfinite(12.3 / 0));
        System.out.println(Double.isInfinite(-12.3 / 0));

        // 5.比较浮点数
        double num5 = 3 * 0.3333333333;
        double num6 = 0.99999992857;
        System.out.println("比较浮点数");
        System.out.println(num5 == num6);
        System.out.println(equals(num5, num6, 0.0000001));

        // 6.浮点数的四舍五入，使用Math.round()方法（直接将浮点数转换为整数，只会保留整数部分，而不会进行四舍五入）
        System.out.println("浮点数的四舍五入");
        System.out.println((int) 56.7);
        System.out.println(Math.round(56.7));

        // 7.进制数之间的转换，使用Integer.parseInt(String s, int radix)方法。 s:字符串  radix:进制（2,8,10,16）
        System.out.println("进制数之间的转换");
        System.out.println(Integer.parseInt("1001", 2));
        System.out.println(Integer.parseInt("1001", 8));

        // 8.字符串和数字之间的转换，使用整型或浮点型包装类中的parseXXX()方法
        System.out.println("字符串和数字之间的转换");
        System.out.println(Integer.parseInt("2"));
        System.out.println(Double.parseDouble("1.23"));

        // 9.生成随机数，使用Math.random()方法生成双精度随机数；使用Random类的nextXXX()方法生成指定类型的随机数
        System.out.println("生成随机数");
        System.out.println(Math.random());
        System.out.println(new Random().nextInt());

        // 10.取对数
    }

    /** 在给定误差的范围内比较两个双精度浮点数 */
    public static boolean equals (double a, double b, double eps) {
        return a == b ? true : Math.abs(a - b) < eps;
    }
}
