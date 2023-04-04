/*
Task2_0

Посчитайте сколько драгоценных камней в куче обычных камней Пример:

jewels = “aB”, stones = “aaaAbbbB”

Результат в консоль ”a3B1”
*/

/**
 * task2_0
 */
import java.util.Scanner;

public class task2_0 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String jewels = "aBf";
        String stones = "aafffaAabbabB";
        System.out.println(findJewelsInStones(jewels, stones));
    }

public static String findJewelsInStones(String jewels, String stones) {
    String result = "";
    for (int i = 0; i < jewels.length(); i++) {
        int entries = 0;
        for (int j =0; j < stones.length(); j++) {
            if (jewels.charAt(i) == stones.charAt(j)) entries++; 
        }
        result += jewels.charAt(i) + Integer.toString(entries);
    }
   

    return result;
}
}