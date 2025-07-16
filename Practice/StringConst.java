class StringConst
{
    static char ch[] = {'A','B','C','D','\0'};
    static byte bt[] = {65,66,67,68};
    
    public static void main(String args[]) throws Exception
    {
        String str = "Java Programming";

        String s1 = new String();
        System.out.print("\n S1 = "+s1);

        String s2 = new String(ch);
        System.out.print("\n S2 = "+s2);

        String s3 = new String(ch,1,3);
        System.out.print("\n S3 = "+s3);

        String s4 = new String(str);
        System.out.print("\n S4 = "+s4.trim());

        String s5 = new String(bt);
        System.out.print("\n S5 = "+s5);

        String s6 = new String(bt,1,3);
        System.out.print("\n S6 = "+s6);

        String x = str.trim();
        System.out.println("\n"+x);
    }
}