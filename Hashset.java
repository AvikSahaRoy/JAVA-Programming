import java.util.HashSet; 

class Hashset {
    public static void main(String[] args) {
        // Java HashSet :-->
        // A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

        // Define Hashset -->>
        HashSet<String> cars = new HashSet<String>();
      
        // Add value into Hashset -->>
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        
        // Check If an Item Exists -->>
        System.out.println(cars.contains("Mazda"));
        
        // Remove an Item -->>
        System.out.println(cars.remove("Volvo"));
        System.out.println(cars);
        
        // To remove all items, use the clear() method -->>
        cars.clear();
        System.out.println(cars);
        
        // Hashset size -->>
        System.out.println(cars.size());
    
    }
}
