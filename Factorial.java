import java.util.*;
class Factorial1 {
    public int fact(int f)
    {
        int fact = 1;
        for (int i=1; i<=f; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public void sum(int f)
    {
        double sum = 0;
        for (int i = 1; i <= f; i++)
            sum += 1.0 / fact(i);
        System.out.print("Factorial is: "+sum);
    }
}
class Factorial {
    public static void main(String args[])
    {
        Factorial1 obj = new Factorial1();
        Scanner sc = new Scanner(System.in);
        int f;
        System.out.print("Enter your number: ");
        f = sc.nextInt();
        obj.sum(f);
        sc.close();
    }
}