//Rony Ahmmed BDU-ICTE

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int n = 1;
		for(int i=1; i<=x; i++){
			n*=i;
			if(n>9999){
				n = n%10000;
			}
		}
		System.out.println(n);
	}
}
