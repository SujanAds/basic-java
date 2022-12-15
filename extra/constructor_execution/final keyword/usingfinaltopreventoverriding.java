
//using final to prevent method overriding

class abc {

    final void display() {
        System.out.println("using final to prevent overriding");
    }
}

class pqr extends abs {
    void display() {
        // compile time error
    }}
    
    ii)using final

    final to prevent inheritance

    final class abc {

        voi display() {
            System.out.println("using final to prevent inheritance");
        }
    }

class pqr extends abc{

    // comilr time error: since class abs is decleared final
}
