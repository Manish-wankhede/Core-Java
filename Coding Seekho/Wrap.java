public class Wrap {
    public static void main(String[] args) {
        // int x = Integer.parseInt("123"); 
        // Integer x1 = Integer.valueOf("10110",2);
        // System.out.println(x);       
        // int y = x1.intValue();
        // System.out.println(y);

        // int x2 = Integer.parseInt("123");
        // Double x3 = Double.valueOf("56");
        // double y2 = x3.doubleValue();
        // System.out.println(x2);
        // System.out.println(y2);

        int x = Integer.parseInt("123");
        System.out.println(x);

        Integer i1 = Integer.valueOf("11000111",2);
        int z = i1.intValue();
        System.out.println(z);

        Double x1 = Double.valueOf("56");
        double y = x1.doubleValue();
        System.out.println(y);
    }
}
