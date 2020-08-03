package main.java.pers.hq.javacookbook.datastructure;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // 链表：详细介绍请看“数据结构”
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        ListIterator li = list.listIterator(0);
        while (li.hasNext()) {
            System.out.println("Next: " + li.next());
        }

        while (li.hasPrevious()) {
            System.out.println("Previous: " + li.previous());
        }
    }
}
