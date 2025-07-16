// import java.util.*;

// import java.util.Scanner;

class ArrayDemo{
    // public static void main(String[] args) {
    //     int num;
    //     int a[] = new int[5];

    //     Scanner s = new Scanner(System.in);

    //     for(int i = 0; i < 5; i++){
    //         num = s.nextInt();
    //         a[i] = num;
    //     }
    //     for(int i = 0; i < 5; i++){
    //         System.out.print(a[i]+" ");
    //     }
    //     s.close();
    // }
    // public static void main(String[] args) {
    //     int a[] = {10,20,30,40,50};

    //     for(int i = 0; i < a.length; i++){
    //         System.out.print(a[i]+" ");
    //     }
    // }
    // public static void main(String[] args) {
    //     int a[] = new int[5];

    //     Scanner sc = new Scanner(System.in);

    //     for(int i = 0; i < 5; i++){
    //         a[i] = sc.nextInt();
    //     }
    //     for(int i = 0; i < 5; i++){
    //         if(a[i] % 2 == 0)
    //             System.out.println("Even no :"+a[i]);
    //     }
    //     sc.close();
    // }
    // public static void main(String[] args) {
    //     int a[] = new int[5];
    //     int sum = 0;

    //     Scanner s = new Scanner(System.in);

    //     for(int i = 0; i < 5; i++){
    //         a[i] = s.nextInt();
    //     }

    //     for(int i = 0; i < 5; i++){
    //         sum = sum + a[i];
    //     }
    //     System.out.println("sum :"+sum);
    //     s.close();
    // }

    void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        ArrayDemo A = new ArrayDemo();
        int arr[] = {10,20,30,40,50};
        A.display(arr);
    }
}