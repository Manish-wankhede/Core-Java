class Fun{
   static void fun(){
        System.out.println("Abc");
    }

    static void fun1(){
        System.out.println("Xyz");
    } 
}

public class Abc {

    static void fun(){
        System.out.println("A");
    }

    static void fun1(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("C");
        fun();
        fun1();
        Fun.fun();
        Fun.fun1();

    }
}