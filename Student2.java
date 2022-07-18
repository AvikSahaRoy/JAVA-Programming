class STtest {
    void getData(int a) {
        int x = a;
    }
    void printData() {
        System.out.println(x);
    }
}
class Student2 {
    public static void main(String[] args) {
        STtest s1 = new STtest();
        STtest s2 = new STtest();

        s1.getData(1);
        s1.printData();

        s2.getData(2);
        s2.printData();

    }
}
