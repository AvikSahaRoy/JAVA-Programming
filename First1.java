import java.util.*;
class First1
{
    public void Input()
    {
        int x,y,sum;
        System.out.print("Enter two no: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        sum = x + y;
        System.out.print(sum);
    }

    public static void main(String args[])
    {
        First obj = new First1();
        obj.Input();
    }
}