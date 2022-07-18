abstract class Vahicle {
    abstract void engine();
}
class car extends Vahicle {
    void engine() {
        System.out.println("car has good engine");
    }
}
class truck extends Vahicle{
    void Process() {
        System.out.println("truck has bad engine");
    }
}
class Interface {
    public static void main(String[] args) {
        car obj1 = new car();
        truck obj2 = new truck();

        obj1.engine();
        obj2.engine();
    }
}

