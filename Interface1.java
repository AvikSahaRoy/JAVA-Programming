interface Sum
{
    int a=5;
}
interface Add
{
    int b=5;
}
class A1 implements Sum, Add{
    public static void main(String[] args) 
    {
        System.out.println(a+b);
    }    
}
