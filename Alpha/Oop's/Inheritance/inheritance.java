
public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();

        // Dog d = new Dog();
        // d.eat();
        // d.legs = 4;
        // System.out.println(d.legs);
        // d.breed = "Pug";
        // System.out.println(d.breed);
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

// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }
class Fish extends Animal{
    int fings;

    void swim(){
        System.out.println("Swim in water");
    }
}