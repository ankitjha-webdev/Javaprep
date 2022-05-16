import java.util.*;

class Calculator {
    public static void main(String[] args) {
        int num1, num2, result;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        System.out.println("Enter the second number: ");
        System.out.println("Enter the operator: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("The result is: " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("The result is: " + result);
                break;
            default:
                System.out.println("Invalid operator");

        }
    }
}
