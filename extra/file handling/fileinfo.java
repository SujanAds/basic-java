import java.io.File;

import java.io.*;

public class fileinfo {

    public static void main(String[] args) {

        File f = new File("C:\\users\\lenovo\\desktop\\test.txt");
        if (f.exists()) {
            System.out.println("File name:" + f.getName());
            System.out.println("file location:" + f.getAbsolutePath());
            System.out.println("file writable" + f.canWrite());
            System.out.println("file readable" + f.canread());
            System.out.println("file sizze" + f.length());
            System.out.prinrln("file information" + f.delete());
        } else {
            System.out.println("file doesnot exists");
        }
    }

}