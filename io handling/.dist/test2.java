/*java program to create a file.*/

import java.io.*;
import java.util.Scanner;

public class createfile{

    public static void main(String[] args){

try{
File obj = new File("test.txt");
if(obj.createNewFile()){

    System.out.println("File created"+obj.getName());
}
else{
    System.out.println("File not created")
}

}
catch(IOException e){
System.out.println("an error is occured");
e.printStackTrace();
}
    }
}