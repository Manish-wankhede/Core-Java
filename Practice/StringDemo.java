/**
 * StringDemo
 */
public class StringDemo {

    public static void main(String[] args) {
            
        String x = "";
        String answer = "Addresses";

        int i;

        for (i=0; i<x.length(); i++) {

            int count = 0;
            for (int j=i; j<x.length(); j++) { 

                if (x.charAt(i) == x.charAt(j)) {
                    count++;
            
                    break;
            
                }
                answer += x.charAt(i) + Integer.toString(count);
            }
            
        }
        System.out.println(answer);
    }
}