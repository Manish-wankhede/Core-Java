public class Q1 {   
    public static String[] mergeSort(String[] arr, int low, int hi){
        if(low == hi){  // Base case
            String[] A = {arr[low]};
            return A;
        }

        // mergeSort formula
        int mid = low + (hi - low) / 2;
        String[] arr1 = mergeSort(arr, low, mid);
        String[] arr2 = mergeSort(arr, mid+1, hi);
        String[] arr3 = merge(arr1, arr2);
        
        return arr3;
    }
    
    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        
        String[] arr3 = new String[m + n];

        int ind = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if(isSmaller(arr1[i], arr2[j])){
                arr3[ind] = arr1[i];
                i++;
                ind++;
            } else {
                arr3[ind] = arr2[j];
                j++;
                ind++;
            }
        }

        while (i < m) {
            arr3[ind] = arr1[i];
            i++;
            ind++;   
        }

        while (j < n) {
            arr3[ind] = arr2[j];
            j++;
            ind++;
        }

        return arr3;
    }

    //return true if str1 appears before str2 in alphabetically order
    public static boolean isSmaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        String[] a = mergeSort(arr, 0, arr.length - 1);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");  
        }
    }
}
