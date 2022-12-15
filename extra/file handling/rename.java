
import java.io.*;

public class rename {
    public static void main(String[] args) {
        File f = new File("C:\\users:\\desktop\\lenovo\sujan.txt");
        File r = new File("C:\\users:\\desktop\\lenovo\rename.txt");
        if (f.exists()) {
System.out.println(f.renameTo(r))
        }
        else{
            System.out.println("file doesnot exist");
        }
    }
}