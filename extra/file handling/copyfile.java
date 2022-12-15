import java.io.FileReader;

class copyfile {
    import java.IOException;
    import java.io.*;
    public static void main(String[] args) throws I OException{
        FileReader r = new fileReader("C:\\sujan\\test.txt");
        FileWwriter w = new FileWwriter("C:\\desktop\\text.txt");

        int i;
        while ((r.read()) != -1) {

            w.write((char) i);
        }
        System.out.println("data copied successfully");
    }

}