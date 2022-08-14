// Write a Java program to find whether an array is sorted or not -->>

int arr[] = {1, 20, 3, 100, 4, 5};
// int arr[] = {1, 2, 3, 4, 5, 6};
int flag = 0;
for (int i=1; i<arr.length-1; i++) {
    if (arr[i] > arr[i+1]) {
        flag = 1;
        break;
    }
}
if (flag == 1) {
    System.out.println("Not sorted");
} else {
    System.out.println("Sorted");
}
