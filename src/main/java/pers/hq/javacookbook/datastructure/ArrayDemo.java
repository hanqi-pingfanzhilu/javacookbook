package main.java.pers.hq.javacookbook.datastructure;

public class ArrayDemo {
    public static void main(String[] args) {
        // 数组可以用来存放一个线性数据集合，它里面的元素必须是相同的类型（可以是基本类型，也可以是对象类型）

        // 数组的声明方式1
        int[] arr1; // 声明一个整型数组
        arr1 = new int[10]; // 构造并分配内存

        // 数组的声明方式2
        int[] arr2 = new int[10];

        // 数组的声明方式3
        int[] arr3 = {1, 2, 3, 4, 5};

        // 二维数组
        int[][] arr4 = new int[2][];
        int[][] arr5 = new int[2][10];

        // 数组的大小是固定的，一旦初始化之后，就不能进行扩容；
        // 如果要进行扩容，两种方式：(1)是将原数组复制到一个新的更大的数组中；(2)可以使用ArrayList

    }
}
