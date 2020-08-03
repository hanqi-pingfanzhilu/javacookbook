package main.java.pers.hq.javacookbook.datastructure;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
            ArrayList封装了数组的功能，但可以进行扩容
            ArrayList类返回的是Object对象，因此可以存储任何类型的对象，但是在取出时仍是Object，所以需要类型转换
            ArrayList如果要存储基本类型，需要使用基本类型对应的包装器类才行（Integer、Boolean等）

            ArrayList常用方法（详细用法请自行参考Java API文档）：
            ◆ add(Object obj)           在末尾添加对象
            ◆ add(int i, Object obj)    在索引i处插入对象
            ◆ clear()                   清空集合中所有对象的引用
            ◆ contains(Object obj)      如果集合包含给定的对象，则返回true
            ◆ get(int i)                返回指定索引的对象引用
            ◆ indexOf(Object obj)       如果包含给定的对象，则返回其索引，否则返回-1
            ◆ remove(Object obj)        移除指定的对象
            ◆ remove(int i)             通过索引移除一个对象
            ◆ toArray()                 将集合转换成数组
         */

        // ArrayList基本用法
        ArrayList al1 = new ArrayList();
        al1.add(1);
        al1.add("2");
        al1.add(3);
        for (int i = 0; i < al1.size(); i++) {
            // println这里会自动隐式转换为String类型，所以不用显示转换成String类型
            System.out.println(al1.get(i));
        }

        // 泛型集合：泛型，通过类型安全的方式将数据存储在集合中，获取数据时就不需要再进行强制类型转换了
        // 通过泛型，使得在编译时不需要进行类型转换，但运行时仍然需要，不过这部分工作不由人来做了
        // jdk1.8中，new后面的类型参数可以省略掉，只用<>即可。1.8之前不能省略，必须这样声明：ArrayList<Integer> intData = new ArrayList<>(Integer);
        ArrayList<Integer> intData = new ArrayList<>();
        // 如果这里用非Integer类型，就会报错，自行测试
        intData.add(11);
        intData.add(22);
        intData.add(33);

        for (Integer item: intData) {
            System.out.println(item);
        }
        intData.forEach(item -> System.out.println(item));
    }
}
