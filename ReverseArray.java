class ReverseArray {
    public static void main(String[] args) {
        int arr[]={50, 40, 10, 30, 100}, temp, i, j, k;
        for (i=0,j=4;i<5/2;i++,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (k=0; k<5; k++) {
            System.out.println(arr[k]);
        }
    }
}
