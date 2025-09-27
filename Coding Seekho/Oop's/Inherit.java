class Nokia1{
    private int x, y;

    Nokia1(int p, int q){
       this.x = p;
       this.y = q;

        System.out.println(x);
        System.out.println(y);
        System.out.println("Parent's constructor executed.");
    }

    void f1(){
        System.out.println("Parent function 1 is executed.");
    }
    
    void f2(){
        System.out.println("Parent function 2 is executed.");
    }
}

class Nokia2 extends Nokia1{
    int z;
    
    void f3(){
        System.out.println("Child function 3 is executed.");
    }
    
    Nokia2(){
        super(5,6);
        System.out.println("Child constructor executed.");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Nokia2 n1 = new Nokia2();
        n1.f1();
        n1.f2();
        n1.f3();
    }
}