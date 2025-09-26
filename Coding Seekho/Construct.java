class Demo{
    int x,y;

    Demo(int p, int q){
        x = p;
        y = q;
    }

    Demo(int f){
        System.out.println("Contructed is excuted");
    }

    Demo(){
        System.out.println(x);
        System.out.println(y);
    }
}

class Construct{
    public static void main(String[] args){
        // Demo d1 = new Demo(5,6);
        // Demo d2 = new Demo();
        // Demo d3 = new Demo(5);

        Demo d1 = new Demo();
        d1.x = 5; 
        d1.y = 9;
    }
}