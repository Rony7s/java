//Rony Ahmmed 2002035
package Lab_4;

public class Aarray2D {

    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 4}, {0, 7}, {9, 29}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
