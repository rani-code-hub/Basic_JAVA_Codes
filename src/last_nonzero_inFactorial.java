import java.util.Scanner;

public class last_nonzero_inFactorial {
    static int factorial(int n){
        if(n==1 || n==0)
            return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n =sc.nextInt();
        int fact = factorial(n);
        System.out.println("factorial of "+ n + " is "+ fact);
        while(fact%10==0)
        {
            fact /= 10;
        }
        System.out.println("last non zero digit in factorial of "+ n +" is "+ fact%10);
    }
}
