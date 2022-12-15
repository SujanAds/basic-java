class main {
    public static void main(String[] args) {
        int i;
        int s = 0;
        for (i = -300; i < -1; i++) {
            if (i % 17 == 7) {
                System.out.println(i + " ");
                s = s + i;
            }

            System.out.println("the sum is" + s);
        }

    }

}