abstract class figure{
    double length;
    double breadth;
    figure(double i, double b){

        length = i;
        breadth = b;
    }

    abstract void area();
}

class rectangle extends figure{
    rectangle(double l, double b){
        super(l,b);
    }


    void area(){

        System.out.println("area of rectangle:"+length*breadth);
    }
  
}

class applyingmethodoverridingabstract{
    public static void main(String[] args){
        rectangle r = new rectangle(5,3);

        figure ref;

        ref = r;
        ref.area();
    }
}