import java.util.Scanner;

public class max_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n] ;
        System.out.println("enter the elements in the array");
        for (int i= 0;i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("the array");
        for (int i= 0;i<n; i++) System.out.print(arr[i] + "\t");
        System.out.println("");
        int max=arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        System.out.println("Largest in given array is " + max);
    }
}
