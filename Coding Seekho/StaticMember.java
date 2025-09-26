class A{
    private int x;
    private static int y;

    void f1(){
        y = 22;
        x = 5;
    }

    void f2(){
        System.out.println(x);
        System.out.println(y);
    }

    void f3(){
        y = 45;
    }
}

public class StaticMember {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        a1.f1();
        a2.f2();
    }
}
