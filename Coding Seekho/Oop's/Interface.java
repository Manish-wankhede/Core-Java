interface i1 {
    int x = 6;

    void f1();

    static void f2() {
        System.out.println(x);
    }
}

interface i2 extends i1 {
    int x = 5;
    int y = 2;

    static void f2() {
        System.out.println(x);
    }

    void f3();
}

class C1 implements i2 {

    void f2() {
        System.out.println(x);
    }

    public void f1() {

    }

    public void f3() {

    }
}

class Interface {
    public static void main(String[] args) {
        // C1 c1 = new C1();
        // c1.f2();
        // i1.f2();
        // System.out.println(c1.y);
        // i2.f2();

        i2.f2();
    }
}