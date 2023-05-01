//Rony Ahmmed BDU-ICTE
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String>name = new <String>ArrayList();
        for(int i=0; i<5; i++){
            System.out.println("Enter your Friend Name");
            name.add(sc.nextLine());
        }
        Collections.sort(name);
        System.out.println("Sort Friend Name");
        
        for(String i: name){
            System.out.println(i);
        }
        
    }
} 
