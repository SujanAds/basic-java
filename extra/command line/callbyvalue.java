//argument passing
//callbyvalue

class argument_pass {
    void set(int i, int j) {
        i *= 5;
        j *= 5;
    }

    class callbyvalue {
        public static void main(String[] args) {
            argument_pass ob = new argument_pass();
            int p = 10;
            int q = 20;
            System.out.println("p: " + p + "" + "q:" + q);
            ob.set(p, q);
            System.out.println("new: p:" + p + "" + "new: q" + q);
        }
    }
}