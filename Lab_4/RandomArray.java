//Rony Ahmmed 2002035
package Lab_4;

public class RandomArray {

    public static void main(String[] args) {
        final int N = 10; // number of random elements
        // Create an array
        int[] random_numbers;
        // call create_random method that returns an array of random numbers
        random_numbers = create_random(N);
        System.out.println("The array of random numbers:");
        // display array of random numbers
        for (int i = 0; i < random_numbers.length; i++) {
            System.out.print(random_numbers[i] + " ");
        }
    }

    public static int[] create_random(int N) {
    //Create an array of size N => number of random numbers to be generated
        int[] random_array = new int[N];
        //generate random numbers and assign to array
        for (int i = 0; i < random_array.length; i++) {
            random_array[i] = (int) (Math.random() * 10);
        }
        //return array of random numbers
        return random_array;
    }
}
