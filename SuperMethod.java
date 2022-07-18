// class A {
//     A() {
//         System.out.println("I am inside A");
//     }
// }

// class B extends A {
//     B() {
//         super();  
//         System.out.println("I am inside B");
//     }
// }

// class SuperMethod {
//     public static void main(String[] args) {
//         B obj = new B();
//     }
// }

// --------------------------------------------------------

class A {
    A() {
        System.out.println("I am inside A");
    }
}

class B extends A {
    B() {
        System.out.println("I am inside B");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("I am inside C");
    }
}

class SuperMethod {
    public static void main(String[] args) {
        C obj = new C();
    }
}

