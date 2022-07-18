class BubbleSort1 {
    void Process() {
        int arr[] = {36, 16, 10, 15, 20, 48, 45, 30};
        int temp;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
class BubbleSort {
    public static void main(String[] args) {
        BubbleSort1 obj = new BubbleSort1();
        obj.Process();
    }
}
