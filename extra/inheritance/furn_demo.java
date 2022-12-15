class furninture{

    int weight;
    int price;

    void set(int w, int p){
        weight = w;
        price = p;
    }


class chair extends furninture{
   
void setx(int w, int p){
    set(w,p);
    System.out.println(weight);
}

}


class inheritance{
    public static void main(String[] args){
        chair ob = new chair();
        ob.setx(5,10);

        chair obj = new chair();
        obj.setx(15, 100);
    }
}
