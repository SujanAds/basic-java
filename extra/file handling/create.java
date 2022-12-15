import java.io.*

class create {
    public static void main(String[] args){
        File f = new File("C:\\users\\lenovo\\desktop\test.txt");

      try{
        if(f.createNewFile()){
            System.out.println("file successfully created");
            }
            else{
                System.out.println("file already exists");
            }
      }
      catch(IOException i){
System.out.println("exception is handled successfully");
      }
    }
}
