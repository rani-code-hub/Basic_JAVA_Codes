import java.util.Scanner;

public class sum_of_all_subsets_array {
    static void SubsetSum(int[] arr,int curr,int last,int sum)
    {
        if(curr>last)
        {
            System.out.print(sum+" ");
            return;
        }
        SubsetSum(arr,curr+1 , last , sum+arr[curr]);

        SubsetSum(arr, curr+1 , last , sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("enter the elements");
        for (int i=0; i<n ; i++) arr[i]= sc.nextInt();

        SubsetSum(arr, 0, n-1,0);
    }
}
