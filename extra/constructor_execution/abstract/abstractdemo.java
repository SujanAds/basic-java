
// aways make abstract class with derived

abstract class base {

    abstract void show();// we terminate abstract class by hiding

}

    void display() {

        System.out.println("abstract class demo");// concrete method
    }

    class derived extends base {

        void show() {

            super.display();
            System.out.println("implementation of method now");
        }
    }

public class abstractdemo {
    
public static void main(String[] args)
{
    derived ob = new derived();// always create object for derived class
    ob.show();
}
}
