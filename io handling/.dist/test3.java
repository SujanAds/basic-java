/*wap to write to a file*/);

import java.io.*;

public class writetofile{
public static void main(String[] args){
try{

FileWriter writer = new FileWriter("test.txt");
writer.write("hello world");
writer.close();
System.out.println("successfully write to file");
}

}

}