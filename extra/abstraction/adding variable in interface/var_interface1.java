interface var{

    int age = 12;
    String name = "Ram";
}

class x implements var{
    void show(){
        System.out.println("age:"+age+"name"+name);
    }
}

class var_interface1{
    public static void main(String[] args){

        var obj = new x();
        obj.show();
    }
}

