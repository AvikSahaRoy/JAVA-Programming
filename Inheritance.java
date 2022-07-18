// 1) Single Inheritance -------
// class Process {
//     int a = 10;
// }

// class Inheritance extends Process {
//     public static void main(String args[]) {
//         Inheritance obj = new Inheritance();
//         System.out.println(obj.a);
//     }
// }

// ----------------------------------------------------
// 2) Multilevel Inheritance ----------

// class x {
//     int a = 10;
// }

// class y extends x{
//     int b = 20;
// }

// class Inheritance extends y {
//     public static void main(String args[]) {
//         Inheritance obj = new Inheritance();
//         System.out.println("X is: "+obj.a);
//         System.out.println("Y is: "+obj.b);
//     }
// }

// ----------------------------------------------------
// 3) Multilevel Inheritance ----------

class x {
    int a = 10;
}

class y {
    int b = 20;
}

class Inheritance extends x,y {
    public static void main(String args[]) {
        Inheritance obj = new Inheritance();
        System.out.println("X is: "+obj.a);
        System.out.println("Y is: "+obj.b);
    }
}

// ----------------------------------------------------
// 4) Hierarchical Inheritance ----------

// class x {
//     int a = 10;
// }

// class y extends x{
//     int b = 20;
// }

// class z extends y{
//     int c = 30;
// }

// class Inheritance extends z {
//     public static void main(String args[]) {
//         Inheritance obj = new Inheritance();
//         System.out.println("X is: "+obj.a);
//         System.out.println("Y is: "+obj.b);
//         System.out.println("Z is: "+obj.c);
//     }
// }

// ----------------------------------------------------
// 4) Hybrid Inheritance ----------

