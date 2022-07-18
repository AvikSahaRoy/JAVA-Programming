import java.util.Scanner;

class Graph1 {
    void Process(int n1, int n2) {
        int count = 0;
        int a[][] = {{0, 1, 0, 0, 1}, {1, 0, 0, 1, 1}, {0, 0, 0, 1, 1}, {0, 1, 1, 0, 1}, {1, 1, 1, 1, 0}};

        if (a[n1][n2] == 1) {
            System.out.println(n1+ " Connected with "+n2);
        } else {
            System.out.println(n1+ " Not Connected with "+n2);
        }

        for (int i=0; i<a.length; i++) {
            if (a[n1][i] == 1) {
                count += 1;
            }
        }
        System.out.println(n1+ "th row total vertex is: "+count);

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length; j++) {
                if (a[i][j] == 1) {
                    System.out.println(i+" ---> "+j);
                    break;
                }
            }
        }
    }
}
class Graph {
    public static void main(String[] args) {
        Graph1 obj = new Graph1();
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter the row position: ");
        n1 = sc.nextInt();
        System.out.print("Enter the col position: ");
        n2 = sc.nextInt();
        obj.Process(n1, n2);
        sc.close();
    }
}
