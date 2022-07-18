import java.util.Scanner;

class Repeating1 {
    void Process(String s) {
        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                break;
            }
            else {
                System.out.println(s.charAt(i));
            }
        }
    }
}
class Repeating {
    public static void main(String[] args) {
        Repeating1 obj = new Repeating1();
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter a String: ");
        s = sc.nextLine();
        obj.Process(s);
        sc.close();
    }
}
