class furninture{
    int weight;
    float price;

    public void setdata(int w, float p){
        weight=w;
        price = p;
    }

public void display(){
    System.out.println("weight"+weight);
    System.out.println("price"+price);
}

}
class chair extends furninture{
    String color;
    void setdata(int w, float p, String c){
        super.setdata(w,p);
        color = c;
    }
    public void display(){
        super.display();
        System.out.println("color"+color);
    }
}

class furn_demo{
    public static void main(String[] args){
        chair obj = new chair();
        obj.setdata(21,1.21. "red");
        obj.display();
    }
}