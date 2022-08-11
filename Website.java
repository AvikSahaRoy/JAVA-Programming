import java.util.Scanner;

class Website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter website URL: ");
        a = sc.nextLine();

        if(a.contains(".in") == true) {
            System.out.println("Indian website");
        }
        else if(a.contains(".com") == true) {
            System.out.println("Commercial website ");
        }
        else if(a.contains(".org") == true) {
            System.out.println("Organization website ");
        }
        else {
            System.out.println("Others");
        }

        sc.close();
    }
}
