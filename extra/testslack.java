class Stack {
    int stck[] = new int[5];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 4)
            System.out.println("Stack full");

        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack empty");
            return 0;
        } else
            return stck[tos--];
    }
}

class teststack {
    public static void main(String[] args) {
        Stack ob = new Stack();
        int i;

        for (i = 0; i < 5; i++)
            ob.push(i);

        System.out.println("Stack elements: ");
        for (i = 0; i < 5; i++)
            System.out.println(ob.pop());
    }
}