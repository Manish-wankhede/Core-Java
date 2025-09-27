abstract class Shape {

    void display() {
        System.out.println("This is shape");
    }

    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle s = new Circle();
        s.display();
        s.draw();
    }
}