package Hw6;

import java.util.*;

public class main {
    public static void main(String[] args) {
        // Создаем набор ноутбуков
        Set<laptop> notebooks = new HashSet<>();
        notebooks.add(new laptop("Lenovo", 8, 512, "Windows 10", "Black"));
        notebooks.add(new laptop("HP", 16, 1000, "Windows 10", "Silver"));
        notebooks.add(new laptop("Dell", 8, 256, "Ubuntu 20.04", "Black"));
        notebooks.add(new laptop("Asus zenbook", 32, 6144, "Windows 11", "Black"));
        notebooks.add(new laptop("Apple MacBook Air", 16, 1024, "macOS", "Silver"));
        notebooks.add(new laptop("Huawei", 16, 3072, "Windows 11", "Silver"));
        notebooks.add(new laptop("Asus", 16, 512, "Windows 11", "Blue"));
        notebooks.add(new laptop("HP", 16, 512, "Windows 10", "White"));
        notebooks.add(new laptop("Dell XPS 13", 16, 512, "Windows 10", "Black"));

        try (// Запрашиваем у пользователя критерии фильтрации
    Scanner Scanner = new Scanner(System.in)) {
        Map<String, Object> filters = new HashMap<>();
        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - ОЗУ (минимальное значение)");
        System.out.println("2 - Объем жесткого диска (минимальное значение)");
        System.out.println("3 - Операционная система (название)");
        System.out.println("4 - Цвет");
        System.out.println("Введите номер критерия (или 0 для завершения ввода):");
        int criteria = Scanner.nextInt();
        while (criteria != 0) {
            switch (criteria) {
                case 1:
                    System.out.println("Введите минимальное значение ОЗУ:");
                    int ram = Scanner.nextInt();
                    filters.put("ram", ram);
                    break;
                case 2:
                    System.out.println("Введите минимальное значение объема жесткого диска:");
                    int storage = Scanner.nextInt();
                    filters.put("storage", storage);
                    break;
                case 3:
                    System.out.println("Введите название операционной системы:");
                    String os = Scanner.next();
                    filters.put("os", os);
                    break;
                case 4:
                    System.out.println("Введите цвет:");
                    String color = Scanner.next();
                    filters.put("color", color);
                    break;
                default:
                    System.out.println("Неверный номер критерия. Попробуйте еще раз.");
                    break;
            }
            System.out.println("Введите номер критерия (или 0 для завершения ввода):");
            criteria = Scanner.nextInt();
        }

        // Фильтруем ноутбуки и выводим результаты
        Set<laptop> filteredNotebooks = laptopFilter.filterNotebooks(notebooks, filters);
        if (filteredNotebooks.isEmpty()) {
            System.out.println("Ноутбуки, удовлетворяющие критериям фильтрации, не найдены.");
        } else {
            System.out.println("Найдены следующие ноутбуки, удовлетворяющие критериям фильтрации:");
            for (laptop notebook : filteredNotebooks) {
                System.out.println(notebook);
            }
        }
    }
}
}