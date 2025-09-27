abstract class Shape {
    abstract void draw();

    void display(){
        System.out.println("This is shape");
    }
}

class Circle extends Shape{
    void draw(){    // child class 
        System.out.println("Drawing a circle");
    }
}

class Ab{
    public static void main(String[] args) {
        Shape s = new Circle(); // Polymorphism
        s.display();
        s.draw();
    }
}
