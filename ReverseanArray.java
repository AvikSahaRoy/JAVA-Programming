// Write a Java program to reverse an array -->>

int arr[] = {1, 2, 3, 4, 5};
int temp;
int l = arr.length;
for (int i=0; i<arr.length/2; i++) {
    temp = arr[i];
    arr[i] = arr[l-i-1];
    arr[l-i-1] = temp;
}
for(int element: arr) {
    System.out.print(element + " ");
}
