package main.java.pers.hq.javacookbook.file;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\");
        FileSystem fs = path.getFileSystem();
        System.out.println(fs.getRootDirectories());
    }
}
