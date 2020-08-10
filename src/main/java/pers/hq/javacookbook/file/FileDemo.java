package main.java.pers.hq.javacookbook.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * java.io.file类包含了一系列与文件操作相关的方法
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\FileTest.txt");

        // 1.检查文件是否存在
        System.out.println("文件存在：" + file.exists());

        // 2.检查是否是文件
        System.out.println("是文件：" + file.isFile());

        // 3.获取文件全名
        System.out.println("文件全名：" + file.getCanonicalPath());

        // 4.检查文件是否可读
        System.out.println("文件可读：" + file.canRead());

        // 5.检查文件是否可写
        System.out.println("文件可写：" + file.canWrite());

        // 6.文件最后修改的时间
        System.out.println("文件最后修改的时间：" + new Date(file.lastModified()));

        // 7.文件大小
        System.out.println("文件大小：" + file.length());

        // 8.创建文件
        File newFile = new File("C:\\FileTestNew.txt");
        if (!newFile.exists()) {
            boolean success = newFile.createNewFile();
            System.out.println("创建新的文件：" + success);
        } else {
            System.out.println("文件已存在，无需创建");
        }

        // 9.重命名文件
        System.out.println("文件重命名成功：" + newFile.renameTo(new File("C:\\FileTestNew1.txt")));

        // 10.删除文件
        System.out.println("删除文件成功：" + newFile.delete());

        // 11.创建临时文件
        File temp = File.createTempFile("TempTest", "tmp");
        System.out.println("临时文件：" + temp.getCanonicalPath());

        // 12.程序退出时删除文件
        temp.deleteOnExit();
    }
}
