class student {
    String name, address;
    int age;
    void show(String name) {
        this.name = name;
        System.out.println("Name: " + this.name);
    }

    void show(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Name: " + this.name + " Address: " + this.address);
    }

    void show(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        System.out.println("Name: " + this.age);
    }
}

