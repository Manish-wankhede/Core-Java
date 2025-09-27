abstract class Animal{
    String color;
    
    Animal(){
        System.out.println("Animal contructor called");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse Contruction called");
    }

    void walk(){
        System.out.println("Walking in 4 leg");
    }

    void ChangeColor(){
        System.out.println("Brown");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Contruction called");
    }
}

class Chicken extends Animal{
    
    void walk(){
        System.out.println("Walking int 2 leg");
    }

    void ChangeColor(){
        color = "Yellow";
    }
}

class Abs {
    public static void main(String[] args) {
        // Horse s = new Horse();
        // s.ChangeColor();
        // s.eat();
        // s.walk();

        // System.out.println("-------------------------------------");

        // Mustang m = new Mustang();
        // m.ChangeColor();
        // m.walk();

        System.out.println("--------------------------------------");

        Chicken c = new Chicken();
        c.ChangeColor();
        c.eat();
        c.walk();
    }
}