import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        float weight, height, bmi;
        
        System.out.println("Enter your name:");
        name = sc.nextLine();
        
        System.out.println("Enter your height (in meters):");
        height = sc.nextFloat();
        
        System.out.println("Enter your weight (in kilograms):");
        weight = sc.nextFloat();
        
        bmi = weight / (height * height);
        
        System.out.println(name + ", your BMI is " + bmi);
        
        sc.close();
    }
}