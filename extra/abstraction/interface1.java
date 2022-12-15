//create an interface college with method signatures void set(String name, int rank) and void display(); also create a class to implement that college interface and display the record of college




interface college {
    void set(String name, int rank);
    void display();
}
class University implements college {
    String name;
    int rank;
    public void set(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    public void display() {
        System.out.println("Name: " + name + " Rank: " + rank);
    }
}
class FirstProgram {
    public static void main(String[] args) {
        college obj = new University();
        obj.set("NCC", 1);
        obj.display();
        obj.set("NCIT", 2);
        obj.display();
    }
}