
public class hierarchial {
    public static void main(String[] args) {
        Fish f = new Fish();
        System.out.println("\n Fish - ");
        f.breathe();
        f.eat();
        f.swim();

        Birds b = new Birds();
        System.out.println("\n Bird - ");
        b.breathe();
        b.eat();
        b.fly(); 

        Mammal m = new Mammal();
        System.out.println("\n Mammal - ");
        m.breathe();
        m.eat();
        m.walk();
    }
}

class Animal{
    String color;   

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}

class Birds extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}