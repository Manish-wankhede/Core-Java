class Mohan{
    int x;
    int y;  // instance(object) member variable 

    void fun1(){ // instance(object) member function
        System.out.println("fun 1");
    } 

    void fun2(){    
        System.out.println("fun 2");
    }
}

public class Object {
    public static void main(String[] args) {
        Mohan m = new Mohan();  // reference variable
        Mohan m2 = new Mohan();
        m.x = 5;
        m.y = 10;
        System.out.println(m.x);
        System.out.println(m2.y);
        m.fun1();
        m.fun2();
    }
}
