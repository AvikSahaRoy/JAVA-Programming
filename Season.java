// Using If else condition -------------------

import java.util.*;
class Season1 {
    public void Process(int m)
    {
        if (m == 12 || m == 1 || m == 2)
        {
            System.out.print("Winter");
        }
        if (m == 3 || m == 4 || m == 5)
        {
            System.out.print("Spring");
        }
        if (m == 6 || m == 7 || m == 8)
        {
            System.out.print("Summer");
        }
        if (m == 9 || m == 10 || m == 11)
        {
            System.out.print("Autumn");
        }
        else
        {
            System.out.print("Invalid input");
        }
    }
}
class Season {
    public static void main(String args[])
    {
        Season1 obj = new Season1();
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("Enter month number: ");
        m = sc.nextInt();
        obj.Process(m);
        sc.close();
    }
}


// Using Switch case -------------------

// import java.util.*;
// class Season1 {
//     public void Process(int m)
//     {
//         switch(m){
//             case 12:
//             case 1:
//             case 2:
//             System.out.print("Winter");
//             break;

//             case 3:
//             case 4:
//             case 5:
//             System.out.print("Spring");
//             break;

//             case 6:
//             case 7:
//             case 8:
//             System.out.print("Summer");
//             break;
            
//             case 9:
//             case 10:
//             case 11:
//             System.out.print("Autumn");
//             break;
//         }
//     }
// }
// class Season {
//     public static void main(String args[])
//     {
//         Season1 obj = new Season1();
//         Scanner sc = new Scanner(System.in);
//         int m;
//         System.out.print("Enter month number: ");
//         m = sc.nextInt();
//         obj.Process(m);
//         sc.close();
//     }
// }