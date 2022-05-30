class ArrayofObjects1 {
    public String name1;
    public int roll1;
  
    // Student class constructor
    ArrayofObjects1(String name, int roll)
    {
        name1 = name;
        roll1 = roll;
    }

    public void Display() {
        System.out.println("Name is "+name1 +" "+"and Roll number is " +roll1);
    }    
}
class ArrayofObjects {
    public static void main(String[] args) {
        // Declaring an array of student
        ArrayofObjects1 arr[] = new ArrayofObjects1[2];

        arr[0] = new ArrayofObjects1("Avik", 1);
        arr[1] = new ArrayofObjects1("Gopal", 2);

        arr[0].Display();
        arr[1].Display();
    }
}