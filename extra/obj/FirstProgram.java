class employee {
    String name;
    int age, salary;
    void set_values(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void show_values() {
        //if(salary>25000)
        System.out.println(name + " " + age + " " + salary);
    }
}

class FirstProgram {
    public static void main(String[] args) {
        employee obj[] = new employee[5];
        for (int i = 0; i < 5; i++) {
            obj[i] = new employee();
        }

        obj[0].set_values("Pratik", 23, 20000);
        obj[1].set_values("Sunil", 21, 25000);
        obj[2].set_values("Umesh", 20, 15000);
        obj[3].set_values("Sandeep", 21, 26000);
        obj[4].set_values("Shramik", 21, 28000);
        for (int i = 0; i < 5; i++) {
            if (obj[i].salary > 25000) {
                obj[i].show_values();
            }
        }
    }
}