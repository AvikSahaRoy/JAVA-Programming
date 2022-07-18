import java.util.Scanner;

// Loops - 1) For loop 2) While Loop 3) Do while loop

// ------------------------------------------------------
// 1) For loop ------

// public class Loops {
//     public static void main(String[] args) {
//         for (int i=0; i<5; i++)
//         {
//             System.out.println(i);
//         }
//     }
// }

// ----------------------------------------------------
// 2) While Loop ----------

// public class Loops {
//     public static void main(String[] args) {
//         int i = 0;
//         while (i<5)
//         {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// ----------------------------------------------------------
// 3) Do while loop -------

// public class Loops {
//     public static void main(String[] args) {
//         int i = 0;
//         do
//         {
//             System.out.println(i);
//             i++;
//         }
//         while (i<5);
//     }
// }

// ----------------------------------------------------------
// 4) For each loop -------
class Loops1 {
    public void Process(String s) {
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        char[] ch = s.toCharArray();
        for (char c : ch) {
            for (char i : vowels) {
                if (c == i) {
                    System.out.print(i);
                }
            }
        }
    }
}

class Loops {
    public static void main(String[] args) {
        String s;
        Loops1 obj = new Loops1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        s = sc.next();
        obj.Process(s);
        sc.close();
    }
}