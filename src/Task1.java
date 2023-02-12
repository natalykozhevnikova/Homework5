import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1{

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Petr Ivanov", 858599503, bookPhone);
        addNumber("Petr Ivanov", 859686948, bookPhone);
        addNumber("Ivan Petrov", 859488595, bookPhone);
        addNumber("Ivan Petrov", 895850494, bookPhone);
        addNumber("Ivan Petrov", 893939494, bookPhone);
        printBook(bookPhone);
    }
}