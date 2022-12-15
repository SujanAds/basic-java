public class pattern1{

    public static void main(String[] args) {
        int arr[][] = new int[3][4];

        int i, j, k = 1;
        for(i = 0; i <3; i++){

            for (j = 0; j <=i; j++) {
                arr[i][j] = k;
                k = k + 1;
            }
        }
        for (i = 0; i<3; i++) {
            for (j =0; j <=i; j++) {
                System.out.print(arr[i][j]+ "" );
            }
            System.out.println();
        }
    }
}