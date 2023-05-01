//Rony Ahmmed BDU-ICTE
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String>name = new <String>ArrayList();
        for(int i=0; i<5; i++){
            System.out.println("Enter your Friend name "+(i+1));
            name.add(sc.nextLine());
        }
         
        
        for(String i: name){
            System.out.println(i);
        }
        
    }
} 
