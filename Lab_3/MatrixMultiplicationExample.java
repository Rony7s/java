//Rony Ahmmed [2002035]
package Lab_3;

public class MatrixMultiplicationExample {
    public static void main(String[] args) {
        
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}; //creating two matrices
        int b[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}; 
        int c[][] = new int[3][3]; //3 rows and 3 columns
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }//end of k loop
                System.out.print(c[i][j] + " "); //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }
    }
}
