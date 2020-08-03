package main.java.pers.hq.javacookbook.datastructure;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // Set接口和List接口类似，不同的是：Set不保留添加顺序，且相同项只会添加一次，即Set中无重复项
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1); // 重复添加
        set.add(2);
        set.add(3);
        System.out.println("the size of set is " + set.size());
        set.forEach(item -> System.out.println(item));
    }
}
