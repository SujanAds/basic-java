
import java.util.Scanner;
public class readfromconsole {
    public static void main(String[] args) {
      Scanner myobj = new Scanner(System.in);
      String username;
      // enter your username
      System.out.println("enter your username");

      username = myobj.nextLine();
      System.out.println("username is" + username);
    }
}


import java.util.Scanner;
public class readfromconsole{

  public static void main(String[] args){

Scanner obj = new Scanner(System.in);
String username;
System.out.println("please enter your username: ");
username = obj.nextLine();
System.out.println("username is"+username);

  }
}