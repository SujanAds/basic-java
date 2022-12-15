//parameter method

class rectangle {
    double length,breadth;
    void set(double l, double b)
    {
length = l;
breadth = b;
    }
    void show()
{

    System.out.println("area is:"+length*breadth);
}

}   

class rectangle_demo_return {
    public static void main(String[] args){
        rectangle r = new rectangle();
        rectangle rr = new rectangle();

        r.set(5,3);
        rr.set(10,4);
        r.show();
        rr.show();
    }
}
