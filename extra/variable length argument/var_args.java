class variable_args {
    void display(int ...v)
    {
        System.out.println("Contents");
        for(int i: v){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}

class var_args{
    public static void main(String args[]){
        variable_args ob = new variable_args();
        ob.display(7);
        ob.display(1,2,3,4,5);
        ob.display();
    }
}

//demostrate of variable length argument

class variable_args{

    void display(int ....v)
    {
        System.out.print("contents: ");
        for(int i:v){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class var_args{
    public static void main(String[] args){
        variable_args ob = new variable_args();
        ob.display(7);
        ob
    }
}