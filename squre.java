// import java.util.*;
// class squre
// {
//     public void Input()
//     {
//         int x,sum;
//         System.out.print("Enter a no: ");
//         Scanner in = new Scanner(System.in);
//         x = in.nextInt();
//         sum = x * x;
//         System.out.print(sum);
//     }

//     public static void main(String args[])
//     {
//         squre obj = new squre();
//         obj.Input();
//     }
// }

import java.util.*;
class squre
{
    public void Input()
    {
        // int a,b,c;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter 1st number: ");
        // a = sc.nextInt();
        // System.out.print("Enter 2nd number: ");
        // b = sc.nextInt();
        // c = a + b;
        // System.out.print("sum " + a + "+" + b + " is: " + c);

        String n = "Avik";
        // System.out.print(n.charAt(1));
        for(int i=3;i>=0;i--){
            // System.out.print(n.charAt(i));
            char v = n.charAt(i);
        }
        System.out.print(v);
    }
    public static void main(String args[])
    {
        squre obj = new squre();
        obj.Input();
    }
}