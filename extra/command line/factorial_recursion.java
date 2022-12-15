public class factorial {
    int fact(int n){
int result;
if(n ==1)
return 1;
else{

    result = fact(n-1)*n;
    return result;
}


    }
}
class factorial_recursion{
    public static void main(String[] args){
        factorial f = new factorial();
        System.out.println("factorial of 1 is " + f.fact(1));
System.out.println("factorial of 3 is"+f.fact(3));
    }
}