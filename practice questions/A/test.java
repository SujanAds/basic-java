interface num{
    int add(int x, int y);
    int diff(int x, int y);

    class calc implements num{
        int sum;
        int diff;

        public int add(intx,inty){
            sum = x + y;
            System.out.println(sum);
            return sum;
        }
    }
}