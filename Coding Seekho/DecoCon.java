class Demo{

    int x, y;

    Demo(){
        System.out.println("Contructor are execute");
    }

    Demo(int p, int q){
        x = p;
        y = q;

    }
}

class DecoCon {
    public static void main(String[] args) {
        // Demo d1 = new Demo();
        // Demo d2 = new Demo();
        // Demo d3 = new Demo();

        Demo d = new Demo(5,6);
    }
}
