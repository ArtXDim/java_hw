/*
Task2_1
Вам дается строка S и целочисленный массив индексов int index[s.length]. 
Напишите программу, которая перетасует символы в S таким образом, что символ 
c i-й позиции переместится на индекс index[i] в результирующей строке.

Пример: s = “cba”, index = [3,2,1] result “abc” 
*/

public class task2_1 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {3, 2, 1};
        StringBuilder z = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            z.setCharAt(i, s.charAt(index[i]-1));
        }

        System.out.println(z);
    }
}

