import java.util.*;
class Biggestnumber1 {
    public void Process(int a, int b, int c)
    {
        if (a > b && a > c) {
            System.out.println("Biggest Number is: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Biggest Number is: " + b);
        } 
        else {
            System.out.println("Biggest Number is: " + c);
        }
    }
}
class Biggestnumber {
    public static void main(String args[])
    {
        Biggestnumber1 obj = new Biggestnumber1();
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        obj.Process(a, b, c);
        sc.close();
    }
}