import java.io.FileWriter;

/*write to file*/
import java.io.*;

public class write {
    public static void main(String[] args) {

        try {
            FileWriter f = new filewriter("C:\\users\\lenovo\\desktop\\test.txt");
            try {
                f.write("i love java programming");
            } finally {
                f.close();
            }
            System.out.println("file written successfully");
        } catch (IOException e) {
            System.out.println(i);
        }
    }

}


