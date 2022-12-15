/*WAP to read a file*/


import java.io.*;

public class readfile{

    public static void main(String[] args){
        try{


            File obj = new File("filename.txt");

            Scanner myReader = new Scanner(obj);
            while(myreader.hasNextLine()){
                String data = myReader.nextLine();
            }
        }
    }
}