public class prime_not{

public static void main(String[] args){
int num =29, flag =0;

for(int i=2; i<=num/2; i++){
    if(num % i ==0){

        // reminder 0 aaudeina
        flag =1;
        break;
    }
}
   if(flag ==1){
       System.out.println(num + "it is not a prime number");
   }
   else{
       System.out.println(nim + "it is a prime number");
   }
}

//check prime or not
int num = 29; flag =0;
for(int i=2; i<=num/2; i++){

    if(num%i==0){
        flag = 1;
    }
    if(flag = 1){
        System.out.println(num+"is not a prime number");
    }
}
