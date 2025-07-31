import java.util.Scanner;

public class Z3_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведи първо число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Въведи второ число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Въведи операция (+, -, *, /): ");
        String op = scanner.next();

        double result;
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.println("Резултат: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Резултат: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Резултат: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Резултат: " + result);
                } else {
                    System.out.println("Грешка: Деление на 0.");
                }
                break;
            default:
                System.out.println("Невалидна операция.");
        }
    }
}
