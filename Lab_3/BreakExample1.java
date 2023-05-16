//Rony Ahmmed [2002035]
package Lab_3;

public class BreakExample1 {

    public static void main(String[] args) {
        a:
        for (int i = 0; i <= 10; i++) {
            b:
            for (int j = 0; j <= 15; j++) {
                c:
                for (int k = 0; k <= 20; k++) {
                    System.out.println(k);
                    if (k == 5) {
                        break a;
                    }
                }
            }
        }
    }
}
