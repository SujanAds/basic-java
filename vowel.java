public class vowel{

    public static void main(String[] args){
 char ch;
 ch = 'z';
 switch(ch){

    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    System.out.println(ch+ " is a vowel");
    break;
    default:
    System.out.println(ch+ " is not a vowel");
   
 }

    }
}
// another method using if else condition
public class vowel{
public static void main(String[] args){
char ch = 'a';
if(ch=='a'|| cha=='e'|| ch =='i' || ch=='o' || ch=='u'){
    System.out.println(ch+ " is a vowel");
}
else{
    System.out.println(ch+ " is not a vowel")
}
}

}

public class Main{
    public static void main(String[] args){

        char ch = 'a';
        if(ch='a' || ch="e" || ch="i" || ch="o" || ch="u"){
            System.out.println("it is a vowel number"+ch);
        }
        else{
            System.out.println(ch+"is not a vowel");
        }
    }
}

