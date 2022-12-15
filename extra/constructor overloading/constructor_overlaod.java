class student {
    String name;
    int age;

    student() {

        System.out.println("BIM third sem");

    }

    student(String n, int a) {
        name = n;
        age = a;
        System.out.println("name and age is " + name + " " + age);

    }
}

class constructor_overlaod {

    public static void main(String[] args) {

        student ob = new student();
        student obj = new student("Ram", 24);
    }
}

