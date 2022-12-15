class calculate_area{


    void area(){

int r = 7;
System.out.println("Area of circle"+(3.14*r*r));

    }
    void area(int l, int b){

System.out.println("Area of rectangle is"+(l*b));

    }

    void area(int l){

System.out.println("area of square is"+l*l);

    }

    void area(int l, double b){
System.out.println("area of trangle is"+(0.5*l*b));

    }

}

class method{

public static void main(String[] args){
calculate_area ob = new calculate_area();
ob.area();
ob.area(2);
ob.area(2,6);
ob.area(5,3.50);


}

}