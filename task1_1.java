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

import java.util.Scanner;
public class task1_1 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];              // intialization massiv
               for (int i = 1; i < 1000; i++) {
                numbers[i - 1] = (int)Math.pow(i,3);

            }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first umber: ");
        int a = scanner.nextInt();
        System.out.println("Input second number: ");
        int b = scanner.nextInt();
           
        int cube1 = numbers[a - 1];
        int cube2 = numbers[b - 1];

        System.out.println("\n"+cube1+"");
        System.out.println(cube2);
        }
    
}
