abstract class Vehicle
{
    abstract void engine();
}
class car extends Vehicle
{
    void engine()
    {
        System.out.println("Car Has Good Engine");
    }
}
class truck extends Vehicle
{
    void engine()
    {
        System.out.println("Truck Has Bad Engine");
    }
}
class Base
{
    public static void main(String[] args) {
        car obj1= new car();
        truck obj2 = new truck();

        obj1.engine();
        obj2.engine();
    }
}