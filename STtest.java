class Student2 {
    int x;
    public void getData(int a) {
        x = a;
    }

    public void printData () {
        System.out.println(x);
    }
}

class STtest {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.getData(10);
        s1.printData();

        s2.getData(20);
        s2.printData();
    }
}
