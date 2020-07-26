package main.java.pers.hq.javacookbook.environment;

import java.util.Map;

public class EnvironmentVariable {
    public static void main(String[] args) {
        // 使用 System.getenv() 获取所有环境变量
        Map<String, String> map = System.getenv();
        System.out.println(map);
        // 使用 System.getenv("xxx") 获取指定的环境变量
        System.out.println(System.getenv("JAVA_HOME"));
    }
}
