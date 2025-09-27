class Example1 {
    int x,y;

    void f1(int x, int y){
        this.x = x;
        this.y = y;
    }   

    void display(){
        System.out.println("Example1: "+x); 
        System.out.println("Example1: "+y);
    }
}

class Example2 extends Example1{
    int x,y;

    void f3(int x, int y){
        super.x = x;
        super.y = y;
    } 

    void f4(){
        System.out.println("Example2: "+super.x);
        System.out.println("Example2: "+super.y);
    }
}

class ThisKey { 
    public static void main(String[] args) {
        // Example1 e1 = new Example1();
        // e1.f1(5, 4);
        // e1.display();

        Example2 e2 = new Example2();
        e2.f1(5, 4);
        e2.display();
        e2.f3(7, 9);
        e2.f4();
    }
}
