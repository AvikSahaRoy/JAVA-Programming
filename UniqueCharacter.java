import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        
        HashSet<Character> s = new HashSet<Character>();
        
        for(int i = 0; i < str.length(); i++)
        {
            s.add(str.charAt(i));
        }
        System.out.println(s);
        System.out.println(s.size());
    }
}
