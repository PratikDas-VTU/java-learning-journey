import java.util.ArrayList;

import java.util.Collections;

public class arrayLists {
    public static void main(String[] args) {
        
//         ArrayList = A resizeable array that stores objects (autoboxing).
// Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>(); // <> -> Diamond operator
        ArrayList<String> fruits = new ArrayList<>();

        list.add(1); // appending 
        list.add(2);
        list.add(3);

        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        fruits.remove(0); // removing at an index

        fruits.set(1,"Coconut"); // replacing at an index

        System.out.println(list);
        System.out.println(fruits);
        System.out.println(fruits.get(2)); // read value at an index
        System.out.println(fruits.size()); // number of elements
        
        Collections.sort(fruits);
        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);

        }
    }
}
