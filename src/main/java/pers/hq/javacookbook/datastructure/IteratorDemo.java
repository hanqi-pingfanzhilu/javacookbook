package main.java.pers.hq.javacookbook.datastructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        /*
            Java中提供了很多方法来遍历集合中的元素，按照最新优先的顺序为：
            ◆ Iterable.forEach()  -- Java 8
            ◆ Java的foreach循环    -- Java 5
            ◆ java.util.Iterator  -- Java 2
            ◆ for、while、枚举
         */

        // Iterable.forEach()
        System.out.println("--- Iterable.forEach() ---");
        List<String> list = Arrays.asList("Hello", "World");
        list.forEach(item -> System.out.println(item));

        // foreach
        System.out.println("--- foreach ---");
        for (String item : list) {
            System.out.println(item);
        }

        // Iterator
        System.out.println("--- Iterator ---");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        // for
        System.out.println("--- for ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
