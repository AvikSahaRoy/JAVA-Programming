class A {
    public void P() {
        System.out.println("Hello World");
    }
}

class GarbageCollector {
    public static void main(String[] args) {
        A obj = new A();
        {
            A obj2 = new A();
            System.out.println("ob1 valid here");
            obj2.P();
        }
        System.out.println("ob2 valid here");
        obj.P();
        // obj2.P(); // Not Alow

    }
}