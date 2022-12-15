interface num {
int add(int x, int y);
diff(int x, int y);
    
}

class calc implements num{
    int sum;
    int sub;
    int add(int x,int y){
        sum = x + y;
        System.out.println("the sum is"+sum);
        return sum;
    }
}
//same for difference too

