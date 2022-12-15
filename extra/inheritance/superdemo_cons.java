class A {
    A() {
        int a = 10;
        System.out.println("A :" + a);
    }
}

class B extends A {
    B() {
        super();
        int c = 10;
        System.out.println("c: " + c);
    }
}

class superdemo_cons {
    public static void main(String[] args) {
        B ob = new B();
    }
}


