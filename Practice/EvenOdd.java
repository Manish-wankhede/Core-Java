class EvenOdd
{
    int num;

    void accept( int x )
    {
        num = x;
    }
    void display()
    {
        System.out.print("\n Number = "+num);
    }
    void calculate()
    {
        if( num%2 == 0 )
        {
            System.out.print("\n Even = "+num);
        }
        else
        {
            System.out.print("\n Odd = "+num);
        }
    }
    public static void main(String args[]) throws Exception
    {
        EvenOdd e = new EvenOdd();

        e.accept(5);
        e.display();
        e.calculate();
    }
}