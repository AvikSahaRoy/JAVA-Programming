class A extends Thread {
    public void run() {
        System.out.println("Start thread A .....");
        for (int i=1; i<=5; i++) {
            if (i == 1) yield();
            System.out.println("From thread A: i = "+i);
        }
        System.out.println("...... Exit thread A");
    }
}
class B extends Thread {
    public void run() {
        System.out.println("Start thread B .....");
        for (int j=1; j<=5; j++) {
            System.out.println("From thread B: j = "+j);
            if (j == 2) stop();
        }
        System.out.println("...... Exit thread B");
    }
}
class C extends Thread {
    public void run() {
        System.out.println("Start thread C .....");
        for (int k=1; k<=5; k++) {
            System.out.println("From thread C: k = "+k);
            if (k == 3) {
                try {
                    sleep(1000);
                }
                catch(Exception e){

                }
            }
        }
        System.out.println("...... Exit thread C");
    }
}
class ThreadsMethods {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.start();
        obj2.start();
        obj3.start();
    }   
}
