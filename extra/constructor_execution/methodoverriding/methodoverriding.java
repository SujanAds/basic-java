class NCC{

    String address;
    long contact;
    kcmit(String add, long con){
        address = add;
        contact = con;
    }
    void show(){
        System.out.println(address+" "+ contact);
    }
class bim extends ncc{
    String Semester;

    bim(String add, long con, String name){

        super(add,con)
        semester=son;
    }

    void show(){
        System.out.println(semester)
    }
}
}

class methodoverriding {

    public static void main(String[] args){
    bim ob = new bim("ktm", 123456, "third");
}

}

super.show();// calls show method