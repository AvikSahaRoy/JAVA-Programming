import java.util.Scanner;

class ReplaceSpace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Replace Space with UnderScores -->>
        String a = "Be a Programmer";
        System.out.println(a.replace(" ", "_"));

        // Replace Name -->>
        String x;
        String b = "Dear name, Thanks a lot";
        System.out.print("Enter Your name: ");
        x = sc.nextLine();
        System.out.println(b.replace("name", x));
        
        sc.close();
    }
}
