import java.util.Scanner;

class Telephone1 {
    void Process(String f1) {
        String a[] = { "a", "b", "c" };
        String b[] = { "d", "e", "f" };
        String c[] = { "g", "h", "i" };
        String d[] = { "j", "k", "l" };
        String e[] = { "m", "n", "o" };
        String f[] = { "p", "q", "r", "s" };
        String g[] = { "t", "u", "v" };
        String h[] = { "w", "x", "y", "z" };

        String newarray[][] = new String[2][2];

        for (int i = 0; i < f1.length(); i++) {
            if (f1.charAt(i) == '2') {
                newarray[i] = a;
            }
            if (f1.charAt(i) == '3') {
                newarray[i] = b;
            }
            if (f1.charAt(i) == '4') {
                newarray[i] = c;
            }
            if (f1.charAt(i) == '5') {
                newarray[i] = d;
            }
            if (f1.charAt(i) == '6') {
                newarray[i] = e;
            }
            if (f1.charAt(i) == '7') {
                newarray[i] = f;
            }
            if (f1.charAt(i) == '8') {
                newarray[i] = g;
            }
            if (f1.charAt(i) == '9') {
                newarray[i] = h;
            }
        }

        if (f1.length() == 0) {
            System.out.println("[]");
        } 
        else if (f1.length() == 1) {
            for (int i = 0; i < newarray[0].length; i++) {
                System.out.print(newarray[0][i] + " ");
            }
        } 
        else {
            for (int i = 0; i < newarray[0].length; i++) {
                for (int j = 0; j < newarray[1].length; j++) {
                    System.out.print(newarray[0][i] + newarray[1][j] + " ");
                }
            }
        }
    }
}

class Telephone {
    public static void main(String[] args) {
        Telephone1 obj = new Telephone1();
        Scanner sc = new Scanner(System.in);
        String f1;
        System.out.print("Enter number: ");
        f1 = sc.nextLine();
        obj.Process(f1);
        sc.close();
    }
}
