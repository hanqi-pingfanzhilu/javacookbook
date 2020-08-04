package main.java.pers.hq.javacookbook.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        // 获取键值对的方式1：通过key找到对应的value
        System.out.println("通过key找到对应的value");
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
        System.out.println(map.get("3"));

        // 获取键值对的方式2：使用keySet()获取键的集合
        System.out.println("使用keySet()");
        for (String key : map.keySet()) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }

        // 获取键值对的方式3：使用entrySet()获取键值对的集合
        System.out.println("使用entrySet()");
        for (Entry<String, String> pair: map.entrySet()) {
            System.out.println("key: " + pair.getKey() + ", value: " + pair.getValue());
        }
        // 等价于
        map.entrySet().forEach(pair -> System.out.println("key: " + pair.getKey() + ", value: " + pair.getValue()));
    }
}
