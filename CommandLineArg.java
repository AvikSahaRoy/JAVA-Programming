// class CommandLineArg1 {
//     void Process(int a, int b) {
//         System.out.println("Sum is: "+a+b);
//     }
// }
// class CommandLineArg {
//     public static void main(String[] args) {
//         CommandLineArg1 obj = new CommandLineArg1();
//         int a = 0, b = 0;
//         if (args.length <= 2) {
//             try {
//                 a = Integer.parseInt(args[0]);
//                 b = Integer.parseInt(args[1]);
//                 obj.Process(a, b);
//             }
//             catch(Exception e) {
//                 System.out.println(e);
//             }
//         }
//         else {
//             System.out.println("Please provide 2 value");
//         }
//     }
// }




class CommandLineArg1 {
    void Process(int arr[]) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
class CommandLineArg {
    public static void main(String[] args) {
        CommandLineArg1 obj = new CommandLineArg1();
        int len, arr[];
        len = args.length;
        arr = new int [len];
        for (int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        obj.Process(arr);
    }
}
