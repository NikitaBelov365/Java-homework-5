import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Second {
    public static void main(String[] args) {
        String str = "Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина,Анна Крутова,Иван Юрин,Пётр Лыков,Павел Чернов,Пётр Чернышов,Мария Фёдорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова,Анна Владимирова,Иван Мечников,Пётр Петин,Иван Ежов";
        String[] arr = str.split(",");
        LinkedList<String> my_list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            String[] new_arr = arr[i].split(" ");
            my_list.add(new_arr[0]);
        }
        System.out.println(my_list.toString());
        Map<String, Integer> my_map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (my_map.containsKey(my_list.get(i))) {
                my_map.put(my_list.get(i), my_map.get(my_list.get(i)) + 1);
            } else {
                my_map.put(my_list.get(i), 1);
            }

        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(my_map.entrySet());
        Comparator<Map.Entry<String, Integer>> valueComparator = (e1, e2) -> e2.getValue().compareTo(e1.getValue());
        Collections.sort(entryList, valueComparator);
        LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : entryList) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : sortedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
