//MD. RONY AHMMED SHAH [2002035]
package Lab_1_2;

public class ShiftOperator3 {

    public static void main(String args[]) {
        //For positive number, >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);

    }
}
