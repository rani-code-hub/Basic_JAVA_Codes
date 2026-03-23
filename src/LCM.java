import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=sc.nextInt(), b= sc.nextInt();
        int max=(a>b) ? a:b;
        int lcm=0;
        for(int i=max ; i<= a*b; i++)
        {
            if(i % a == 0 && i % b == 0)
            {
                lcm=i;
                break;
            }
        }
        /*
        using hcf
        for(int i=i ; i<= a || i<=b; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                hcf=i;
            }
        }
        lcm= (a*b)/hcf; */
        System.out.println("Lcm of "+a+" and "+b+" is "+lcm);
    }
}
