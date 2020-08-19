package main.java.pers.hq.javacookbook.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectMethodDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "java.lang.String";
        Class<?> c = Class.forName(className);

        Constructor<?>[] cons = c.getConstructors();
        System.out.println("The length of cons is " + cons.length);
        for (int i = 0; i < cons.length; i++) {
            System.out.println(cons[i].toString());
        }
        System.out.println();

        Method[] methods = c.getMethods();
        System.out.println("The length of methods is " + methods.length);
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].toString());
        }
        System.out.println();

        Field[] fields = c.getFields();
        System.out.println("The length of fields is " + fields.length);
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            System.out.println(fields[i].toString());
        }
    }
}
