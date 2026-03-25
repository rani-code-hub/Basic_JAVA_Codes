import java.util.Scanner;

public class Nth_row_PascalTriangle {
    static void generateNthRow(int n)
    {
        int prev= 1;
        System.out.print(prev);
        for (int i=1 ; i<=n ; i++)
        {
            int curr=(prev * (n - i + 1))/i; // nCr = nC(r-1) * (n-r+1)/r
            System.out.print(", " + curr);
            prev=curr;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n");
        int n = sc.nextInt();
        System.out.println("the "+ n +"th row of pascal triangle is");
        generateNthRow(n);
    }
}
