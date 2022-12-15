import java.util.Scanner;

import java.io.*;

class filehandling {

    public static void main(String[] args) {
        File f = new File("test.txt");
        if (f.createNewFile()) {
            System.out.println("the file name created successfully");
        } else {
            System.out.println("faile to create file");
        }
        Scanner files = new Scanner(System.in);
        System.out.println("enter the name class and roll of the student");
        String name = files.nextLine();
        int clas = files.nextInt();

        // output input by the User
        FileWriter fe = new FileWriter("test.txt");

        fe.write("hello");

    }
}