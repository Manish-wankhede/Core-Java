class Demo
{
    int a,b,c;

    void accept( int x , int y )
    {
        a = x;
        b = y;
    }
    void display()
    {
        System.out.print("\n A = "+a);
        System.out.print("\n B = "+b);
    }
    void calculate()
    {
        c = a + b;
        System.out.print("\n Sum = "+c);
    }
    public static void main(String args[]) throws Exception
    {
        Demo d = new Demo();

        d.accept(10,20);
        d.display();
        d.calculate();
    }
}