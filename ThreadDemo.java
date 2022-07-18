// Sub class Thread --------------------
// class A extends Thread {
//     public void run() {
//         for (int i=1; i<=5; i++) {
//             System.out.println("Inside A thread "+i);
//         }
//         System.out.println("Exiting from thread A");
//     }
// }
// class B extends Thread {
//     public void run() {
//         for (int j=1; j<=5; j++) {
//             System.out.println("Inside B thread "+j);
//         }
//         System.out.println("Exiting from thread B");
//     }
// }
// class ThreadDemo {
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = new B();

//         obj1.start();
//         obj2.start();
//     }
// }

// ---------------------------------------------------


// Ruanable Interface -----------
class ThreadX implements Runnable {
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println("Inside A thread "+i);
        }
        System.out.println("Exiting from thread A");
    }
}
class ThreadY implements Runnable {
    public void run() {
        for (int j=1; j<=5; j++) {
            System.out.println("Inside B thread "+j);
        }
        System.out.println("Exiting from thread B");
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        ThreadX obj1 = new ThreadX();
        ThreadY obj2 = new ThreadY();

        Thread x = new Thread(obj1);
        Thread y = new Thread(obj2);

        x.start();
        y.start();
    }
}