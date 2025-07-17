public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();     // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.tip(5);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");
        p1.color = "yellow";
        System.out.println(p1.color);
    }    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void tip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phys, int chem, int math){
        percentage = (phys + chem + math) / 3;
    }
}
