import java.util.HashMap;

class Hashmap {
    public static void main(String args[]) {
        HashMap <Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "C++");
        System.out.println("HashMap: "+languages); // {1=Java, 2=Python, 3=C++}

        System.out.println("Keys: "+languages.keySet()); // [1, 2, 3]
        System.out.println("Values: "+languages.values()); // [Java, Python, C++]
        System.out.println("Key/Value Mapping: "+languages.entrySet()); // [1=Java, 2=Python, 3=C++]
        
    }
}
