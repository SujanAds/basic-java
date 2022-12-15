/*wap to display all the read only files of the given folder*/

import java.io.*;
public class filereadfromfolder{
public static void main(String[] args){


    File file = new File("D:/myfolder");
file.setReadOnly();
for(File f:files){

    System.out.println(f.getName());
}

}


}
