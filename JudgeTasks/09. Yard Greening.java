import java.util.Scanner;
 
public class YardGreening {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        double allSqM = Double.parseDouble(scanner.nextLine());
 
        double amount = allSqM * 7.61;
        double discount = amount * 0.18;
        double finalPrice = amount - discount;
 
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.printf("The discount is: %f lv.%n", discount);
    }
 
}
