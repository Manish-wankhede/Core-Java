// Keypad Combinations
// Given a string containing digits from 2-9 inclusive, print all possible letter combinations that
// the number could represent. You can print the answer in any order.
// A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1
// does not map to any letters.
// Sample

public class Q2 {
    final static char[][] key = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
                                {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
                            
    public static void letterCombi(String S){
        int len = S.length();

        if(len == 0){
            System.out.println("");
            return;
        }
        bsf(0, len, new StringBuilder(), S);

    }

    public static void bsf(int pos, int len, StringBuilder sb, String S){
        if(pos == len){
            System.out.print(sb.toString()+" ");
        } else {
            char [] letter = key[Character.getNumericValue(S.charAt(pos))];
            for(int i = 0; i < letter.length; i++){
                bsf(pos+1, len, new StringBuilder(sb).append(letter[i]), S);
            }
        }
    }

    public static void main(String[] args){
        letterCombi("48");
    }
}
