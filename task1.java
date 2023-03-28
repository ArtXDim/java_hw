import java.util.Scanner;

/* 
Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем 
вводятся 2 числа из этого диапазона. Используя данные из массива найдите их 
кубы.

Sample Input:

8
11
Sample Output:

512
1331
*/

public class task1 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];              // intialization massiv
               for (int i = 1; i < 1000; i++) {
                numbers[i - 1] = i^3;    
            }

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first umber: ");
        int a = scan.nextInt();
        System.out.println("Input second number: ");
        int b = scan.nextInt();
        int[] result = getCubes(numbers, a, b);
    }
    
}


