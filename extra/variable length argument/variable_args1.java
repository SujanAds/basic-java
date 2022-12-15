public class variable_args1 {
    static void display(int ....v,String msg)
    {
        System.out.print(msg + v.length + "Contents: ");
        for(int i: v){
            System.out.print(i + "");
        }
        System.out.println();
    }
}

public static void main{
    
}

