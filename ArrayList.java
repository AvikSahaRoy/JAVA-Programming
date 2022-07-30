import java.util.ArrayList;

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();

        // Add Elements into ArrayList ----
        obj.add("Java");
        obj.add("Python");
        obj.add("C++");
        System.out.println(obj); // [Java, Python, C++]
        
        // --------------------------------------------------------
        
        // Get the element ----
        System.out.println(obj.get(1)); // Python
        
        // --------------------------------------------------------
        
        // Change element into ArrayList ----
        obj.set(1, "JavaScript");
        System.out.println(obj); // [Java, JavaScript, C++]
        
        // --------------------------------------------------------
        
        System.out.println("Remove element: "+obj.remove(2)); // Remove C++
        System.out.println("Updated ArrayList: "+obj); // [Java, JavaScript]
        
        // --------------------------------------------------------
        
        // Remove All elements ----
        obj.removeAll(obj); // []
        
        // --------------------------------------------------------
        
        // Remove All elements ----
        obj.clear(); // Faster and efficient than removeAll
        System.out.println(obj); // []
        
        // --------------------------------------------------------
        
        // Create another array list ----
        ArrayList<String> obj1 = new ArrayList<>();
        // Add all the elements into obj1 --
        obj1.addAll(obj);
        System.out.println(obj); // [Java, JavaScript]
        System.out.println(obj1); // [Java, JavaScript]
        
        // --------------------------------------------------------
        
        // Clone() ------
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(5);
        number.add(3);
        System.out.println("Array list: "+number); // [1, 5, 3]
        
        ArrayList<Integer> clonenumber = (ArrayList<Integer>)number.clone();
        System.out.println("Clone Array List: "+clonenumber); // [1, 5, 3]
        
        // --------------------------------------------------------
        
        // Print the return value of clone() -------
        System.out.println(number.clone()); // [1, 5, 3]
        
    }
}
