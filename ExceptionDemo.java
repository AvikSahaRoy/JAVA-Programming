class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, div;
            div = a/b;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Can't devided by Zero "+e);
        } catch (Exception e) {
            System.out.println("Can't divide "+e);
        }
        System.out.println("..... Exit try catch block");
    }
}