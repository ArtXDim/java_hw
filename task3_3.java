/*
Task3_3
Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
среднее из этого списка.
*/
 

//Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это тзучить эти сортировки на Питоне , 
//и постораться написать их на java)
/*
import java.util.ArrayList;
import java.util.Scanner;


public class task3_3 {
    public static void main(String[] args) {
         // запрашиваем размер списка у пользователя
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введите размер списка: ");
         int size = scanner.nextInt();
 
         // создаем список и заполняем его случайными целыми числами от 0 до 99
         ArrayList<Integer> list = new ArrayList<Integer>();
         for (int i = 0; i < size; i++) {
             int number = (int) (Math.random() * 100);
             list.add(number);
         }
 
         // выводим элементы списка
         System.out.println("Список: " + list);
 
         // находим минимальное значение в списке
         int min = list.get(0);
         for (int i = 1; i < list.size(); i++) {
             if (list.get(i) < min) {
                 min = list.get(i);
             }
         }
         System.out.println("Минимальное значение: " + min);
 
         // находим максимальное значение в списке
         int max = list.get(0);
         for (int i = 1; i < list.size(); i++) {
             if (list.get(i) > max) {
                 max = list.get(i);
             }
         }
         System.out.println("Максимальное значение: " + max);
 
         // находим среднее значение в списке
         int sum = 0;
         for (int i = 0; i < list.size(); i++) {
             sum += list.get(i);
         }
         double avg = (double) sum / list.size();
         System.out.println("Среднее значение: " + avg);
    }
}
*/

import java.util.*;
public class task3_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(list.stream().mapToInt(Integer::intValue).average());
    }
}