public class BasicQ1 {
    public static int allOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return 0;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
        }

        return allOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        allOccurance(arr, 2, 0);
    }
}
