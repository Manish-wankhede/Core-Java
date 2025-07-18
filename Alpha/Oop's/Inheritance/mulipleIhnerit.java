class A{
    void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    void display1(){
        System.out.println("class B");
    }
}

class C extends B{
    void display2(){
        System.out.println("Class C");
    }
}

public class mulipleIhnerit {

    public static void main(String[] args) {
        C obj = new C();
        
        obj.display();
        obj.display1();
        obj.display2();
    }
}
