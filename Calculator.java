import java.util.Scanner;

public class Myclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter your second number: ");
        int number2 = sc.nextInt();

        System.out.println("Enter your operation (+, -, *, /): ");
        char ch = sc.next().charAt(0);  

        int result = 0;

        if (ch == '+') {
            result = number1 + number2;
            System.out.println("Result: " + result);
        } 
        else if (ch == '-') {
            result = number1 - number2;
            System.out.println("Result: " + result);
        } 
        else if (ch == '*') {
            result = number1 * number2;
            System.out.println("Result: " + result);
        } 
        else if (ch == '/') {
            if (number2 != 0) {
                result = number1 / number2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero!");
            }
        } 
        else {
            System.out.println("Invalid operation!");
        }

        sc.close();
    }
}
