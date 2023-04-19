//Rony Ahmmed BDU-ICTE
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int x = 0;
        while(a!=0 && b!=0){
            if(((a%10)+(b%10))>9){
                x=1;
                break;
            } 
            a = a/10;
            b = b/10;
        }
        if(x==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}
}
