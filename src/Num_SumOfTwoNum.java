import java.util.Scanner;

public class Num_SumOfTwoNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int x=0;
        for (int i=2 ; i<=num/2 ; i++)
        {
            if(prime(i)==1)
            {
                if(prime(num-i)==1)
                {
                    System.out.println(num+" = "+i+" + "+(num-i));
                    x=1;
                }
            }
        }
        if(x == 0)
            System.out.println(num+" cannot be expressed as a sum of two prime numbers");
    }
    public static int prime(int n)
    {
        int c=1;
        for (int i=2 ;i<n; i++)
        {
            if(n%i==0)
            {
                c=0;
                break;
            }
        }
        return c;
    }
}
