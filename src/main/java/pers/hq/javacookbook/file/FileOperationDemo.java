package main.java.pers.hq.javacookbook.file;

import java.io.File;
import java.util.Arrays;

public class FileOperationDemo {
    public static void main(String[] args) {
        File file = new File("C:\\FileTest.txt");

        // 1.改变文件属性
//        long time = file.lastModified();
//        System.out.println("文件修改时间：" + time);
//        boolean isSuccess = file.setLastModified(time - 2 * 1000);
//        System.out.println("设置文件修改时间：" + isSuccess);

        // 2.列出目录内容
        String[] dirs = new File(".").list();
        for (String dir : dirs) {
            System.out.println(dir);
        }
        System.out.println();

        // 3.获取根目录：使用静态方法File.listRoots()
        File[] drives = File.listRoots();
        for (File dr : drives) {
            System.out.println(dr);
        }

        // 4.创建新目录
        // mkdir()仅能创建一级目录（前一个目录要存在）
        boolean newDir = new File("C:\\NewDirectory").mkdir();
        System.out.println("单个新目录创建：" + newDir);
        // mkdirs()能多级目录（前一个目录可以不存在）
        boolean newDirs = new File("C:\\NewDirectories\\1\\2").mkdirs();
        System.out.println("多个新目录创建：" + newDirs);
    }
}
