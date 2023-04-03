/* 
Task_3.
Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
*/

 
import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {

        // declaration variable
        double num1;
        double num2;
        double res;
        char op;
        Scanner reader = new Scanner (System.in);
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.println("\nEnter operation (+, -, /, *): ");
        op = reader.next().charAt(0);
        
        // switch with operations
        switch (op) {
            case '+': res = num1 + num2;
                break;
            case '-': res = num1 - num2;
                break;
            case '*': res = num1 * num2;
                break;
            case '/': res = num1 / num2;
                break;   
            default: System.out.println("Wrong operation");
                return;
        }

        // output result
        System.out.println("\nResult");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + res);
    }
}