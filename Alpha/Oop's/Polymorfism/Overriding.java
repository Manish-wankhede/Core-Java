public class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        // Animal a = new Animal();
        // a.eat();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anythings");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}
