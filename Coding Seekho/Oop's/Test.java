public class Test{
    public static void main(String[] args) {
        System.out.println("Main with Stringp[] args");
        main("Manish");
        main(5);
    }

    public static void main(String args) {
        System.out.println("Main with String args: "+args);
    }

    public static void main(int num) {
        System.out.println("Main with int args: "+num);
    }
}