interface A {
    int x = 10;
}
interface B{
    int y = 20;
}
class A1 implements A, B{
    public void Display() {
        int sum = x + y;
        System.out.println("Sum is: "+sum);
    }
}
class InterfaceSum {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.Display();
    }
}
