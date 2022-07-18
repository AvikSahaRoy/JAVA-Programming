class Prefix1 {
    void Process() {
        String a[] = {"flower","flow","flight"};
        int i = 0;
        // String a[] = {"dog","racecar","car"};
       
        while(a[0].charAt(i) == a[1].charAt(i) && a[0].charAt(i) == a[2].charAt(i)) 
        {
                System.out.print(a[0].charAt(i));
                i++;
        }
    }
}
class Prefix {
    public static void main(String[] args) {
        Prefix1 obj = new Prefix1();
        obj.Process();
    }
}
 