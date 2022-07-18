import java.util.Scanner;

class Student1 {
    private static int Object_Counter = 0;
    Student1() {
        Object_Counter += 1;
        int Enrollment_No = Object_Counter;
        System.out.println("Object "+Enrollment_No);
    }

    protected int age;
    void validate(int a) {
        if (a>=4 && a<=40) {
            System.out.println("Age is: "+a);
            age = a;
        }
        else {
            System.out.println("Not valid please enter age between 4 to 40");
        }
    }
    
    protected void finalize() {
        Object_Counter -= 1;
        System.out.println("finalize() method called");
    }
    public static void Display() {
        System.out.println("Total objects are: "+Object_Counter);
    }
}

public class Student extends Student1 {
    public static void main(String[] args) {
        Student1 obj1 = new Student1();
        Student1 obj2 = new Student1();
        Student1 obj3 = new Student1();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Age: ");
        n = sc.nextInt();
        obj1.validate(n);
        obj3.finalize();
        Display();
        sc.close();
    }
}
