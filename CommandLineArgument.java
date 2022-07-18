class CommandLineArgument1 {
    void Process(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }
}
class CommandLineArgument {
    public static void main(String args[]) {
        CommandLineArgument1 obj = new CommandLineArgument1();
        int a, b, c;
        if (args.length <= 3) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                c = Integer.parseInt(args[2]);
                obj.Process(a,b,c);
            }
            catch (Exception e) {
                System.out.println("Please provide 3 value");
                // System.out.println(e); // Print System error 
            }
        }
        else {
            System.out.print("Please provide 3 numbers");
        }
    }
}

