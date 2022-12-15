package exmpl;

class base {
    void show() {
        System.out.println("this is a base class");
    }

}

class derived extends base {

    void show() {
        super.show();
        System.out.println("this is derived cass");
    }
}

class package1 {
    public static void main(String[] args) {

        derived ob = new derived();
        ob.show();
    }
}


//directory:desktop
//for compile: javac ./exmpl/package1.java
//java exmpl.package1