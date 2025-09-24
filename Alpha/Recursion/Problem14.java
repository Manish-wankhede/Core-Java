public class Problem14 {
    public static void binString(int n, int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kaam
        // if(lastPlace == 0){
        //     //sit 0 on chair n
        //     binString(n-1, 0, str+"0");
        //     binString(n-1, 1, str+"1"); 
        // } else {
        //     binString(n-1, 0, str+"0");
        // }
        
        binString(n-1, 0, str+"0");
        if(lastPlace == 0){
            binString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        binString(3, 0, "");
    }
}
