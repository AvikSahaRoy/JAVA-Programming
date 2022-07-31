import java.util.ArrayList;
import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("JAVA");
        languages.add("Python");
        languages.add("C");
        System.out.println(languages); // [JAVA, Python, C]
        // Create a new array String Type -------------
        String arr[] = new String[languages.size()];
        // Convert Arraylist to Array -----------------
        languages.toArray(arr);
        for(String item:arr){
            System.out.println(item);
        }
      
        // -----------------------------------------
        
        String arr[] = {"Java", "Python", "C"};
        for(String item:arr){
            System.out.println(item);
        }
        // Convert Array to Arraylist
        ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr));
        System.out.println(languages); // [Java, Python, C]
        
    }
}
