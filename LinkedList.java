import java.util.LinkedList;

class HelloWorld {
    public static void main(String[] args) {
        // JAVA LinkedList --------------------->>
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        System.out.println(animals); // [Cat, Dog, Cow]
        
        // Add element into LinkedList ----------->>
        animals.add(1, "Hourse");
        System.out.println(animals); // [Cat, Hourse, Dog, Cow]
        
        // Get the element into LinkedList ---------->>
        String str = animals.get(1);
        System.out.println(str); // Hourse
        
        // Set element into LinkedList ----------->>
        animals.add(3, "Tiger");
        System.out.println(animals); // [Cat, Hourse, Dog, Tiger, Cow]
    }
}
