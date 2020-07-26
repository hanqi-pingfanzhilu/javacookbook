package main.java.pers.hq.javacookbook.environment;

import java.util.Properties;

public class PropertiesInfo {
    public static void main(String[] args) {
        // 使用 System.getenv() 获取所有属性
        Properties props = System.getProperties();
        System.out.println(props);
        // 使用 System.getProperty("xxx") 获取指定的属性
        System.out.println(System.getProperty("java.version"));
    }
}
