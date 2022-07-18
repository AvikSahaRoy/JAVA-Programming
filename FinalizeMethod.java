public class FinalizeMethod 
{
    public static void main(String[] args) 
    {
        FinalizeMethod obj = new FinalizeMethod();
        FinalizeMethod obj1 = new FinalizeMethod();
        obj1 = null;
        // Explicit call
        obj.finalize();
        System.out.println("Garbage collector");
        System.gc(); //Implicit call to finilize() method        
    }
    
    protected void finalize()
    {
        System.out.println("finilize() method called");
    }
}