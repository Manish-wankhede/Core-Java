class DefaultDemo
{
    int a,b,c;

    DefaultDemo()
    {
        a = 10;
        b = 20;
    }
    void display()
    {
        System.out.print("\n A = "+a); 
        System.out.print("\n B = "+b);
    }
    void calculate()
    {
        c = a + b;
        System.out.print("\n C = "+c);
    }
    public static void main(String args[]) throws Exception
    {
        DefaultDemo d = new DefaultDemo();

        d.display();
        d.calculate();
    }
}