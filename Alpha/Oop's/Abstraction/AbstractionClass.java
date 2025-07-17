public class AbstractionClass {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        Mustang m = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal{
    String color;

    Animal(){
       System.out.println("Animal construction called...");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse construction called...");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walked in 4 leg");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang construction called...");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("Walked in 2 leg");
    }
} 