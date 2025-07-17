public class string {

    public static void printLetter(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = "xyz";

        // // String are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        //Concatination
        String fName = "Manish";
        String lName = "Wankhede";

        String fullName = fName + " " + lName;

        printLetter(fullName);
    }

}