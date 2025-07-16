class StringDemonstrate
{
    String s1 = "      first String         ";

    String s2 = "Second String";

    void display()
    {
        System.out.print("\n String s1 = "+s1);
        System.out.print("\n String s2 = "+s2);
    }
    public static void main(String agrs[]) throws Exception
    {
        StringDemonstrate s = new StringDemonstrate();
        
        s.display();
    }
}