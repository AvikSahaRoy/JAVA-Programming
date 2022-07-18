class Rect {
    double l, b;
    Rect() {
        l = b = 0;
        System.out.println("Non parameter constructor");
    }
    Rect(double l1) {
        l = b = l1;
        System.out.println("Only one parameter");
    }
    Rect(double l1, double b1) {
        l = l1;
        b = b1;
        System.out.println("Two parameter");
    }

    void add () {
        System.out.println("Non parameter constructor");
    }
    void add (int a) {
        System.out.println("Squre of A is: "+(a*a));
    }
    void add (int a, int b) {
        System.out.println("Sum is: "+(a+b));
    }
}
class ConstructorOverloading {
    public static void main(String[] args) {
        Rect ob1 = new Rect();
        Rect ob2 = new Rect(5.1);
        Rect ob3 = new Rect(5, 2);

        // Rect ob4 = new Rect();
        ob1.add();
        ob1.add(5);
        ob1.add(2,3);
    }
}
