import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str = "earth";
        String str1 = "heart";

        // Convert String to lowercase. why? so that we don't have to check seperately for lower  uppercase
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        // First check if the length are the same
        if(str.length() == str1.length()){
            // Convert String into char array
            char[] strcharArray = str.toCharArray();
            char[] str1charArray = str1.toCharArray();

            //sort the char array
            Arrays.sort(strcharArray);
            Arrays.sort(str1charArray);

            // if the sorted char arrays are or identical then the strings are anagram
            boolean result = Arrays.equals(strcharArray, str1charArray);
            if(result){
                System.out.println(str + " and " + str1 + " are anagrams of each other.");
            } else {
                System.out.println(str + " and " + str1 + " are not anagrams of each other.");
            }
        } else {
            //case when length are not equals
            System.out.println(str + " and " + str1 + " are not anagrams of each other.");
        }
    }
}
