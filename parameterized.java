class para {
    para(int a, String b) {
        System.out.println("Id is: "+a);
        System.out.println("Name is: "+b);
    }
}

class parameterized {
    public static void main(String[] args) {
        para obj1 = new para(1, "Avik");
        para obj2 = new para(2, "Gopal");
    }
}
