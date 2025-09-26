class ScopeDemo {
    int a = 10;
    static int b = 20;
    
    void display(int x){
        int c = 30;
        System.out.println("C: "+c);
        System.out.println("X: "+x);
    }

    void show(){
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        display(50);
    }

    public static void main(String[] args) {
        ScopeDemo sd = new ScopeDemo();
        sd.show();
    }
}