class Largest
{
    int a,b;

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
    void findLargest()
    {
        if( a > b )
        {
            System.out.print("\n A is Largest");
        }
        else if( a < b )
        {
            System.out.print("\n B is Largest");
        }
        else
        {
            System.out.print("\n\n Both are same");
        }
    }
    public static void main(String args[]) throws Exception
    {
        Largest l = new Largest();

        l.accept(10,20);
        l.display();
        l.findLargest();
    }
}