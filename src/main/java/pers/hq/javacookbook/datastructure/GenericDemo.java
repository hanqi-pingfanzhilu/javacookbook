package main.java.pers.hq.javacookbook.datastructure;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo<T> {
    private List<T> list;

    public GenericDemo() {
        list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }

    public T get(int index) {
        return list.get(index);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void clear() {
        list.clear();
    }

    public void forEach() {
        list.forEach(item -> System.out.println(item));
    }

    public static void main(String[] args) {
        GenericDemo<String> genericDemo = new GenericDemo<>();
        genericDemo.add("a");
        genericDemo.add("b");
        genericDemo.add("c");
        genericDemo.forEach();
        System.out.println();

        System.out.println(genericDemo.get(2));
        System.out.println();

        genericDemo.remove(0);
        genericDemo.remove("c");
        genericDemo.forEach();

        genericDemo.clear();
    }
}
