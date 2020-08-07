package main.java.pers.hq.javacookbook.oop;

/**
 * 最简单的实现方式：
 * 一个私有的构造函数、保存结果的域和一个静态公共的访问方法
 */
public class SingletonDemo {
    private static SingletonDemo instance;

    /** 私有的构造函数可以防止其他任何类对它实例化 */
    private SingletonDemo() {}

    /** 静态的初始化器在装载类的时候构造了实例 */
    static {
        instance = new SingletonDemo();
    }

    public static SingletonDemo getInstance() {
        return instance;
    }

    public String getResult(String str) {
        return str + " Singleton";
    }

    public static void main(String[] args) {
        SingletonDemo sd = SingletonDemo.getInstance();
        System.out.println(sd.getResult("abc"));
    }
}
