import java.util.Scanner;

class VowelDemo1 {
    void P(String v) {
        // Using For loop ---------------------->>>
        // for (int i=0; i<v.length(); i++) {
        //     if (v.charAt(i) == 'a' || v.charAt(i) == 'e' || v.charAt(i) == 'i' || v.charAt(i) == 'o' || v.charAt(i) == 'u')   {
        //         System.out.println(v.charAt(i));
        //     }
        // }

        // Using For each loop ---------------------->>>
        char ch[] = v.toCharArray();
        for(char i:  ch)
        {
            if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u')
            {
                System.out.print(i+" ");
            }
        }
    }
}
class VowelDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v;
        System.out.print("Enter a String: ");
        v = sc.nextLine();
        VowelDemo1 obj = new VowelDemo1();
        obj.P(v);
    }
}
