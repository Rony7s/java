//Rony Ahmmed 2002035
package Lab_4;

public class CopyArray {
    public static void main(String[] args) {
        //declaring a source array
        char[] copyFrom = {'H', 'e', 'l', 'l', 'o', ' ', 'B','D', 'U'};
        //declaring a destination array
        char[] copyTo = new char[5];
        //copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 0, copyTo, 0, 5);
        //printing the destination array
        System.out.println(String.valueOf(copyTo));
    }
}
