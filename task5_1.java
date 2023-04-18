/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
что 1 человек может иметь несколько телефонов.*/


import java.util.HashMap;
import java.util.Scanner;


public class task5_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> phoneBook = new HashMap<String, String>();
    
    System.out.println("введите Имя и номер телефона через ПРОБЕЛ, и \"стоп\" для выхода: ");

    while (true) {
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("стоп")) {
            break;            
        }

        String[] tempbook = input.split(" ");
        if (tempbook.length < 2) {
            System.out.println("неверный формат Имя/Номер. Повторите ввод");
            continue;
        }
        String name = tempbook[0];
        String numbers = "";

        for (int i = 1; i < tempbook.length; i++) {
            numbers += tempbook[i] + ",";    
        }
        numbers = numbers.substring(0, numbers.length() -1);

        if (phoneBook.containsKey(name)){
            String phoneExists = phoneBook.get(name);
            phoneBook.put(name, phoneExists + ", " + numbers);            
        }
        else{
            phoneBook.put(name, numbers);
        }

        System.out.println("данные записаны. Продолжите ввод или введите: \"стоп\" для выхода: ");        
    }

    System.out.println("Телефонная книга:");
        for (String name : phoneBook.keySet()) {
            String phones = phoneBook.get(name);
            System.out.println(name + ": " + phones);
        }
        sc.close();
    }
}