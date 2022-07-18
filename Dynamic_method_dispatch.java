class A {
    void show() {
        System.out.println("Inside A");
    }
}
class B extends A {
    void show() {
        System.out.println("Inside B");
    }
}
class C extends B {
    void show() {
        System.out.println("Inside C");
    }
}
class Dynamic_method_dispatch {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();

        A r;
        r = ob1;
        r.show();
        r = ob2;
        r.show();
        r = ob3;
        r.show();

        // Without reference --->>
        // ob1.show();
        // ob2.show();
        // ob3.show();
    }
}
