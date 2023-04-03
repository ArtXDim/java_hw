/*
Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. Затем 
вводится число, на которое нужно умножить все введённые выше числа. 
Выведите на экран результат умножения построчно.

Sample Input:
4
1
2
3
5
2


Sample Output:
2
4
6
10
*/
import java.util.Scanner;

 public class task1_2 {
 
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int[] numbers = new int[n];
      
      for (int i = 0; i < n; i++) {
         numbers[i] = scanner.nextInt();
      }


      int multiplier = scanner.nextInt();
      for (int i = 0; i < n; i++) {
         System.out.println(numbers[i] * multiplier);
      }
      
    }

 }