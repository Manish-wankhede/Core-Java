public class getterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }    
}
class Pen{
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}
