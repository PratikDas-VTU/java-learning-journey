
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        // Keys are unique, but Values can be duplicated
        // Does not maintain any order, but is memory efficient
        // HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Bottle", 15.45);
        map.put("Scale", 10.5);
        map.put("Pencil", 5.4);

        // map.put("Pencil",55.2); // Overwrites the key pencil

        // map.remove("Scale");

        System.out.println(map);
        System.out.println(map.get("Pencil"));
        System.out.println(map.containsKey("Bottle"));
        System.out.println(map.containsValue(5.4));
        System.out.println(map.size());

        if (map.containsKey("pineapple")) {
            System.out.println(map.get("apple"));
        } else {
            System.out.println("Key not found!");
        }

        for(String  key : map.keySet()){
            System.out.println(key + " :"+ map.get(key));
        }
    }
}
