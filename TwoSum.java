class TwoSum1 {
    void Process() {
        int arr[] = {2,7,11,15};
        int target = 9;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target ) {
                    System.out.println("Index is: "+i+" " +j);
                }
            }
        }
    }
}
class TwoSum {
    public static void main(String[] args) {
        TwoSum1 obj = new TwoSum1();
        obj.Process();
    }
}
