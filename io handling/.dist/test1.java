/*wap a programt that takes employee id,name and dob from the user and store it in "Emp.txt" and display its content*/

import java.io.*;
import java.util.Scanner;

class fil{
public static void main(String[] args){
try{

FileWriter fw = new FileWriter("Emp.txt");
BufferedWriter bw = new BufferedWriter(fw);

String name,id,DOB;
Scanner scan = new Scanner(System.in);
System.out.println("enter your name,id,dob");

bw.write(id);
bw.write(name);
bw.write(DOB);
bw.close();

}catch(Exception e){
System.out.println(e);

}
try{

FileReader fr = new FileReader("Emp.txt");
BufferedReader br = new BufferedReader(fr);

String msg = null;
while(msg=br.readLine()!=null){
    System.out.println(e);
}

}

}


}