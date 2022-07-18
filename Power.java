import java.util.Scanner;

class Power1 {
    int Process(int a, int b) {
        if (b == 0) {
            return 1;
        }
        else {
            b -= 1;
            return (a * Process(a, b));
        }
    }
}
class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter number: ");
        a = sc.nextInt();
        System.out.print("Enter power: ");
        b = sc.nextInt();
        Power1 obj = new Power1();
        int x = obj.Process(a, b);
        System.out.println("Power is: "+x);
        sc.close();
    }
}
