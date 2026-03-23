import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt(), b= sc.nextInt();
        int min =Math.min(a,b);
        int i;
        for(i=min ; i>=1; i--)
        {
            if(a % i == 0 && b % i == 0)
                break;
        }
        System.out.println("Gcd of "+a+" and "+b+" is "+i);
    }
}
