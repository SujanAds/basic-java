class access {

    int a;
    public int b;
    private int c;

    void setc(int i) {

        c = i;

    }

    int getc() {

        return c;
    }
}

class access_control {
    public static void main(String[] args) {
        access ob = new access();
        ob.a = 50;
        ob.b = 100;
        // ob.setc = 150;
        ob.setc(150);

        System.out.println("a:" + ob.a);
        System.out.println("b:" + ob.b);
        System.out.println("c:" + ob.getc());
    }

}