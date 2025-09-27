public class ExceptionH3 {
    public static void main(String[] args) {
        int cb = 10000;
        int wb = 14000;

        try {
            if (cb < wb) {
                throw new ArithmeticException("Insufficient Balance.");
            }
            cb -= wb;
            System.out.println("Transactin Successful");
            System.out.println("Current Balance: " + cb);
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
            System.out.println("Current Balance: " + cb);
        }
    }
}
