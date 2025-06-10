import java.util.HashMap;
import java.util.Set;
public class mapbasics {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        System.out.println(hashMap.get("Bob")); // Output: 30
        System.out.println(hashMap.get("David")); // Output: null
        System.out.println(hashMap.containsKey("Alice")); // Output: true
        System.out.println(hashMap.containsKey("Eve")); // Output: false
        System.out.println(hashMap.containsValue(25)); // Output: true

        hashMap.put("Alice", 26); // Update the value for the key "Alice"
        System.out.println(hashMap.get("Alice")); // Output: 26

        hashMap.remove("Bob"); // Remove the key-value pair with key "Bob"
        System.out.println(hashMap.containsKey("Bob")); // Output: false

        hashMap.clear(); // Remove all key-value pairs

        System.out.println(hashMap.isEmpty()); // Output: true

        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        System.out.println(hashMap.size()); // Output: 3

        //for iterating over the keys and values of a HashMap
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        // Output:
        // Alice: 25
        // Bob: 30
        // Charlie: 35


        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }

        // Output:
        // Alice: 25
        // Bob: 30
        // Charlie: 35

        for (int value : hashMap.values()) {
            System.out.println(value);
        }

        // Output:
        // 25
        // 30
        // 35



    }
}
