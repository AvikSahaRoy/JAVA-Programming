import java.util.*;
public class Swapobj {
    int a, b;
    void swap(Swapobj ob) {
        int tmp = ob.a;
        ob.a = ob.b;
        ob.b = tmp;
    }
    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
    }
    public static void main(String[] args) {
        Swapobj ob = new Swapobj();
        ob.get();
        ob.swap(ob);
        System.out.println(ob.a + " " + ob.b);
    }
}