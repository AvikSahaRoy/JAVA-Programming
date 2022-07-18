class StaticMethod1 {
    static int x, y;
    static void show(int z, int a)
    {
        System.out.println("Z is: "+z);
        System.out.println("A is: "+a);
        System.out.println("X is: "+x);
        System.out.println("Y is: "+y);
    }
    static
    {
        y = 100;
        x = y + 20;
    }
}

class StaticMethod {
    public static void main(String[] args) {
        StaticMethod1 obj = new StaticMethod1();
        obj.show(10, 20);
    }
}

// Multiple Static Block -------------------
// Advantages of static variable --
// It makes your program memory efficient (i.e., it saves memory).

// class StaticMethod {
//     static char ch;
    
//     static 
//     {
//         System.out.println("1st Static Block");
//         ch = '*';
//     }
//     static 
//     {
//         System.out.println("2nd Static Block");
//         ch = '@';
//     }
//     static void Display()
//     {
//         System.out.println("Ch = "+ch);
//     }
//     public static void main(String[] args) {
//         Display();
//     }
// }