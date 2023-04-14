/*Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
*/

import java.util.*;
import java.util.stream.Collectors;

public class task5_2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов");
        List<String> names = new ArrayList<>();
        for (String employee : employees) {
          String name = employee.substring(0, employee.indexOf(' '));
          names.add(name);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : names) {
          if (map.containsKey(name)) {
            map.put(name, map.get(name) + 1);
          } else {
            map.put(name, 1);
          }
        }
    
        Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(Collectors.toMap(Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1, e2) -> e1,
                    LinkedHashMap::new));
    
        for (var item : sortedMap.entrySet()) {
          System.out.printf("%s - %d\n", item.getKey(), item.getValue());
        }
      }
}