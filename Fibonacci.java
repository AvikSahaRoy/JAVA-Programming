import java.util.*;
class Fibonacci1 {
    // public void Process(int n)
    // {
    //     int sum = 0, a = 0, b = 1;
    //     for (int i=0; i<n; i++)
    //     {
    //         System.out.print(sum+" ");
    //         a = b;
    //         b = sum;
    //         sum = a + b;
    //     }
    // }

    int sum = 0, a = 0, b = 1;
    void Process(int n)
    {
        if (sum <= n) {
            System.out.println(sum+" ");
            a = b;
            b = sum;
            sum = a + b;
            Process(n);
        }
    }
}
class Fibonacci {
    public static void main(String args[])
    {
        Fibonacci1 obj = new Fibonacci1();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter your number: ");
        n = sc.nextInt();
        obj.Process(n);
        sc.close();
    }
}