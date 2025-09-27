public class ExceptionH1 {
    public static void main(String[] args) {

        String s1 = null;
        try{
            System.out.println(s1.length());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("A");

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println("B");
    }
}
