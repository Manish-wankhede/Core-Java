class Animal{
    void eat(){
        System.out.println("Eat");
    }

    void breath(){
        System.out.println("Breath");
    }

    String color;
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swimming");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}

class Mammel extends Animal{
    void walk(){
        System.out.println("Walking");
    }
}

class Hierarchical{
    public static void main(String[] args){
        Fish f = new Fish();
        System.out.println("Fish");
        f.swim();
        f.eat();
        f.breath();

        Bird b = new Bird();
        System.out.println("Bird");
        b.breath();
        b.eat();
        b.fly();

        Mammel m = new Mammel();
        m.walk();
        m.eat();
        m.breath();
    }
}  