// parametarized method


class university {
String uname, uaddress;
int urank;
void set(String name, String address, int rank){
uname = name;
uaddress = address;
urank = rank;


}
void show(){

    System.out.println(uname+" "+uaddress+" "+urank);
}
}
public class university_demo{
public static void main(String[] args){

university ob = new university();
university obj = new university();
university objt = new university();
ob.set("TU", "kritipur",1);
obj.set("PU", "Pokhara",1);
objt.set("KU","Kavre", 1);

ob.show();
obj.show();
objt.show();

    
}

}


