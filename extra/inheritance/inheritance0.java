class person{
    String name;
    int id;
    void setName(String n, int i){
        name = n;
        id = i;
    }
    void show(){
        System.out.println("name + " " +id);
    }
}

class student extends person{
    int age;
    public void setx(String n, int i, int a){
        age = a;
        set(n,i);
    }
    void showxx(){
        show();{
            System.out.println(" " + age);
        }
    }
    class inheritance{
        public static void main(String[] args){
            student ob = new student();
            ob.setx("Nimesh", 101,24);
            ob.showx();
        }
    }
}

