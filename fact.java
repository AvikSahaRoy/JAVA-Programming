import java.util.*;
class fact2
{
    public int Process(int f)
    {
        int sum = 1;
        for (int i=1; i<=f; i++)
        {
            sum = sum * i;
        }
        return sum;
        // if (f>=1)
        // {
        //     return f*Process(f-1);
        // }
        // else
        // {
        //     return 1;
        // }
    }
}
class fact
{
    public static void main(String args[])
    {
        fact2 obj = new fact2();
        Scanner s = new Scanner(System.in);
        int f = 0;
        System.out.print("Enter the number: ");
        f = s.nextInt();
        int ff = obj.Process(f);
        System.out.print("Fact is: "+ff); 
        s.close();
    }
}
