// class TSumClosest1 {
//     void Process() {
//         int arr[] = {-1,2,1,-4};
//         // int arr[] = {0,0,0};
//         int target = 1;
//         int sum = 0;
//         for (int i=0; i<arr.length; i++) {
//             sum = sum + arr[i];
//             if (arr[i] == target)
//             break;
//         }
//         System.out.println("The sum that is closest to the target is: "+sum);
//     }
// }
// class TSumClosest {
//     public static void main(String[] args) {
//         TSumClosest1 obj = new TSumClosest1();
//         obj.Process();
//     }
// }

import java.util.Arrays;
class TSumClosest1 {
    void Process() {
        int arr[] = {-1,2,1,-4};
        int target = 1;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            if (target == arr[i]) {
                System.out.println(i);
            }
        }
    }
}
class TSumClosest {
    public static void main(String[] args) {
        TSumClosest1 obj = new TSumClosest1();
        obj.Process();
    }
}