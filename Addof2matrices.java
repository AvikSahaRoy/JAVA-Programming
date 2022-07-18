class Addof2matrices1 {
    void Process() {
        int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
        int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
        int temp;

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                temp = a[i][j] + b[i][j];
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}
class Addof2matrices {
    public static void main(String[] args) {
        Addof2matrices1 obj = new Addof2matrices1();
        obj.Process();
    }
}
