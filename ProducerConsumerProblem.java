import java.util.Scanner;

class ProducerConsumerProblem1 {
    int full = 0, empty = 5, x = 0, mutex = 1;
    void Producer() {
        if (mutex == 1 && empty != 0) {
            full += 1;
            empty -= 1;
            mutex -= 1;
            x += 1;
            System.out.println("Producer produce "+x);
            mutex += 1;
        }
        else {
            System.out.println("Buffer is full");
        }
    }
    void Consumer() {
        if (mutex == 1 && full != 0) {
            full -= 1;
            empty += 1;
            mutex -= 1;
            System.out.println("Producer consume "+x);
            mutex += 1;
            x -= 1;
        }
        else {
            System.out.println("Buffer is empty");
        }
    }
}
class ProducerConsumerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProducerConsumerProblem1 obj = new ProducerConsumerProblem1();

        while(true) {
            System.out.println("\n<<--- Producer Consumer Problem --->>");
            System.out.println("1. for Produce");
            System.out.println("2. for Consume");
            System.out.println("3. for Exit");

            int n;
            System.out.print("Enter your choice: ");
            n = sc.nextInt();
            
            if (n == 1) {
                obj.Producer();
            }
            else if (n == 2) {
                obj.Consumer();
            }
            else if (n == 3) {
                System.out.println("You are exit this process");
                break;
            }
        }
    }
}
