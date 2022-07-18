import java.util.*;
class Primenumber1 {
    public void Process(int p)
    {
        int flag = 0;
        for (int i=2; i<=p; i++)
        {
            for (int j=2; j<i; j++)
            {
                if (i%j == 0)
                {
                    flag = flag + 1;
                }
            }
            if (flag == 0)
            {
                System.out.print(i+ " ");
            }
            flag = 0;
        }
    }
}
class Primenumber {
    public static void main(String args[])
    {
        Primenumber1 obj = new Primenumber1();
        Scanner sc = new Scanner(System.in);
        int p;
        System.out.print("Enter your number: ");
        p = sc.nextInt();
        obj.Process(p);
        sc.close();
    }
}
