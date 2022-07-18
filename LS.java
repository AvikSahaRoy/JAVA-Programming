class LS1 {
    void Process() {
        int arr[] = {5, 9, 200, 12, 17, 28, 100, 1};
        int temp = arr[0], temp1 = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
            if (arr[i] > temp1) {
                temp1 = arr[i];
            }
        }
        System.out.println("Smallest element is: "+temp);
        System.out.println("Largest element is: "+temp1);
    }
}
class LS {
    public static void main(String[] args) {
        LS1 obj = new LS1();
        obj.Process();
    }
}
