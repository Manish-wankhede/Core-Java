abstract class Animal{
    String color;
    
    Animal(){
        System.out.println("Animal Construction");
    }

    void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    
    Horse(){
        System.out.println("House constructor");
    }

    void ChangeColor(){
        System.out.println("Black Brown");
    }

    void walk(){
        System.out.println("Walking in 4 leg");
    }
}

class Mustang extends Horse{

    Mustang(){
        System.out.println("Mustang Contructed");
    }
}

class Chicken extends Mustang{
    void ChangeColor(){
        color = "yello";
    }

    void walk(){
        System.out.println("Walking in 2 leg");
    }
}

class Test2{
    public static void main(String[] args){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Mustang m = new Mustang();
        m.ChangeColor();
    }
}