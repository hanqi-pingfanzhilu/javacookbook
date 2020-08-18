package main.java.pers.hq.javacookbook.reflect;

import java.util.ArrayList;
import java.util.Calendar;

public class ReflectClassDemo {
    public static void main(String[] args) {
        System.out.println("Use ClassName.class :");
        System.out.println("Object: " + Object.class);
        System.out.println("String: " + String.class);
        System.out.println("String[]: " + String[].class);
        System.out.println("ArrayList: " + ArrayList.class);
        System.out.println("Integer: " + Integer.class);
        System.out.println("int: " + int.class);

        System.out.println();

        System.out.println("Use Class instance.getClass() :");
        System.out.println("Calendar: " + Calendar.getInstance().getClass());

    }
}
