class college {
    String cname;
    String caddress;

    void set(String cn, String ca) {
        cname = cn;
        caddress = ca;
    }

    void display() {
        System.out.print(cname + " " + caddress);
    }
}

class teacher extends college {
    String tname;
    int id;

    void put(String cn, String ca, String tn, int i) {
        tname = tn;
        id = i;
        set(cn, ca);
    }

    void show() {
        display();
        System.out.println(" " + tname + " " + id);
    }
}

class inheritance2 {
    public static void main(String[] args) {
        teacher[] ob = new teacher[3];
        for (int i = 0; i < 3; i++)
            ob[i] = new teacher();
        ob[0].put("KCMIT", "KTM", "Nimesh", 101);
        ob[1].put("NCC", "KTM", "Sampad", 102);
        ob[2].put("KEC", "BKT", "Gokul", 103);
        for (int i = 0; i < 3; i++)
            ob[i].display();
    }
}

