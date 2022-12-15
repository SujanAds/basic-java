class ThreadA implements Runnable {
    int i;
    for(i=50; i<100; i++){
        if(i%2==0){
            System.out.println(" "+i);
        }
    }
}

class ThreadB implements Runnable {
    //sa as A but
    if(i%2==1){
        System.out.println(" "+i);
    }
}


class thread {
    public static void main(String[] args){
        ThreadA objA = new ThreadA();
        objA.start();
    }
}