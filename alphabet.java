public class alphabet{

    public static void main(String[] args){

        char ch;
        ch ='@';
        if( (ch >= 'a' && ch <= 'z') || (ch>= 'A' && ch <= 'Z'))
        {
            System.out.println(ch+"it is a alphabet character");
        }
else{

    System.out.println("it is not a character");
}
    }
}


char ch = "@";
if(ch>="a" && ch<='a' && ch<='z' || ch>='A' && ch<='Z'){

    System.out.println("it is a alphabet number");
}