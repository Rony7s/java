//Rony Ahmmed BDU-ICTE (Bubble sort program in Java)
public class Main{
    public static void main(String[] args){
        //given array
        int[] a = {5, 2, 8, 7, 1};
        
        //Sort the array in ascending order
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if(a[i] > a[j]) {
                int x = a[i];
                a[i] = a[j];
                a[j] = x;
                }
            }
        }
        //Array after sorting
        System.out.printf("Array sorted in ascending order: %n");
        for (int i = 0; i < 5; i++) {
        System.out.printf("%d ", a[i]);
        }
    }
}
