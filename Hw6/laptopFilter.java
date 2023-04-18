package Hw6;

import java.util.*;

public class laptopFilter {
    public static Set<laptop> filterNotebooks(Set<laptop> notebooks, Map<String, Object> filters) {
        Set<laptop> filteredNotebooks = new HashSet<>();

        for (laptop notebook : notebooks) {
            if (matchesFilters(notebook, filters)) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    private static boolean matchesFilters(laptop notebook, Map<String, Object> filters) {
        for (String key : filters.keySet()) {
            Object value = filters.get(key);
            switch (key) {
                case "ram":
                    if (notebook.getRam() < (int) value) {
                        return false;
                    }
                    break;
                case "storage":
                    if (notebook.getStorage() < (int) value) {
                        return false;
                    }
                    break;
                case "os":
                    if (!notebook.getOs().equals(value)) {
                        return false;
                    }
                    break;
                case "color":
                    if (!notebook.getColor().equals(value)) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        return true;
    }
}