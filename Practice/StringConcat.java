class StringConcat
{
    public static void main(String args[]) throws Exception
    {
        String s1 = "Java";
        String s2 = " Programming";
        String s3 = " it's Oop";

        System.out.print("\n S1 = "+s1);
        System.out.print("\n S2 = "+s2);
        System.out.print("\n S3 = "+s3);

        String s4 = s1 + s2;
        System.out.print("\n String S4 = "+s4);

        String s5 = s1 + s2 + s3;
        System.out.print("\n String s5 = "+s5);
    }
}