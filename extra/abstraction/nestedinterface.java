interface abc{

    void show();
    interface pqr{
        void display();
    }
}


class nestedinterface implements abc.pqr{

public void show(){
    System.out.println("this is in outer interface");
}

public void display(){
    System.out.println("this is a nested interface");
}

}


public static void main(String[] args){

    abc obj1 = new NestedInterface();

    abc.pqr ob = nestedinterface();

    display();
}