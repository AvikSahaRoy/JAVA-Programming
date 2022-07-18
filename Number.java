// import java.util.Scanner;

// class Number {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String n;
//         System.out.print("Enter a number: ");
//         n = sc.nextLine();
//         for (int i=0; i<n.length()-1; i++) {
//             System.out.println(n.charAt(i)+" "+n.charAt(i+1));
//         }
//     }
// }

import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n, n1;
        int c = 0;
        System.out.print("Enter a number: ");
        n = sc.nextLine();
        for (int i=0; i<n.length()-1; i++) {
            n1 = n.charAt(i)+""+n.charAt(i+1);
            c = c + Integer.parseInt(n1);
        }
        System.out.println(c);
    }
}