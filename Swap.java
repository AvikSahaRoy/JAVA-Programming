import java.util.*;
class Swap1 {
    public void Process(int sw1, int sw2)
    {
        int temp;
        temp = sw1;
        sw1 = sw2;
        sw2 = temp;
        System.out.println("Swap no is: "+sw1 +" "+sw2); 
    }
}
class Swap {
    public static void main (String args[])
    {
        Swap1 obj = new Swap1();
        Scanner s = new Scanner(System.in);
        int sw1, sw2;
        System.out.print("Enter the two number: ");
        sw1 = s.nextInt();
        sw2 = s.nextInt();
        obj.Process(sw1, sw2);
        s.close();
    }
}
