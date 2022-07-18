// import java.util.*;
// class First
// {
//     int a,b,c;
//     public void Input()
//     {
//         System.out.print("Enter 1st Number: ");
//         Scanner s = new Scanner(System.in);
//         a=s.nextInt();

//         System.out.print("Enter 2nd Number: ");
//         b=s.nextInt();
//     }
//     public void Process()
//     {
//         c=a+b;
//         System.out.print("Result is: "+c);
//     }
//     public static void main(String args[])
//     {
//         First obj = new First();
//         obj.Input();
//         obj.Process();
//     }
// }

import java.util.*;
class First
{
    int a, i=0;
    public void Input()
    {
        System.out.print("Enter the Number: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
    }
    public void Process()
    {
        for(i=0; i<a; i++)
        {
            i = i * i;
        }
        System.out.print("Result is: "+i);
        
    }
    public static void main(String args[])
    {
        First obj = new First();
        obj.Input();
        obj.Process();
    }
}