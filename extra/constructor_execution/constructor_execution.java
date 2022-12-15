//when super is not used the default constructor of each superclass will be executed


class faculty{
faculty(){

System.out.println("all the faculties");//default constructor
}
}

class it extends faculty{

    it(){

        System.out.println("all the it members");
    }
}

class java extends it{

java(){

    System.out.println("all the java classes");
}
}
class constructor_execution{

    public static void main(){

        java ob = new java();
    }
}

1. single inheritance: derive a new class from a super class


class faculty{

    faculty(){

        System.out.println("all the faculties");
    }
}

class it extends faculty{

    it(){

        System.out.println("all the it students")
    }
}
// multiple class== derive a new class from more than one super class

class faculty{

    faculty(){

        System.out.println("all the faculties");
    }
}
class program{

    program(){

        System.out.println("all the programs")
    }
}
class it extends faculty,program{

    it(){

        System.out.println("all the it students")
    }
}

// multilevel inheritance

class faculty{

    faculty(){
        System.out.println("")
    }
}

class program extends faculty{

    program(){

        System.out.println("")
    }
}

class it extends program{

    it(){
        System.out.println("");
    }
}


hierarchical inheritance : process of deriving multiple class from a single super class

class faculty{

    faculty(){
        System.out.println("all the faculties");
    }
}

class program extends faculty{

    program(){
        System.out.println("all the program will be executed");
    }
}

class it extends faculty{
    it(){
        System.out.println("all the it members");
    }
}

