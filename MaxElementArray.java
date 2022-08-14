// Write a Java program to find the maximum element in an array -->>

int arr[] = {1, 20, 3, 100, 4, 5};
int max = arr[0];
for (int i=1; i<arr.length; i++) {
    if (arr[i] > max ) {
        max = arr[i];
    } 
}
System.out.println("Maximum element in an array is: "+max);
