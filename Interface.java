interface Car {
    String x = "car has good engine";
}
interface Truck {
    String y = "truck has bad engine";
}

class Vahicle implements Car, Truck{
    public void Engine() {
        System.out.println(x);
        System.out.println(y);
    }
}
class Interface {
    public static void main(String[] args) {
        Vahicle obj = new Vahicle();
        obj.Engine();
    }
}
