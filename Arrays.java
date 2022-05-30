import java.util.*;
class Arrays1 {
    public void Check(int[] arr1, int[] arr2)
    {
        int count = 0; 
        for (int i=0; i<arr1.length; i++)
        {
            if (arr1[i] != arr2[i])
            {
                count = count + 1;
            }
        }
        if (count == 1)
        {
            System.out.print("Not Same");
        }
        else
        {
            System.out.print("Same");
        }
    }
}

class Arrays {
    public static void main(String args[])
    {
        Arrays1 obj = new Arrays1();
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 6};
        obj.Check(arr1, arr2);
        sc.close();
    }
}