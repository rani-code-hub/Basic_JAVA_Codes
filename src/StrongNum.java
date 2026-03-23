import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i,r,j,s=0;
        for(i=n;i>0;i=i/10)
        {
            r=i%10;
            int f=1;
            for(j=1;j<=r;j++){
                f=f*j;
            }
            s=s+f;
        }
        if(s==n)
            System.out.println("yes its armstrong");
        else
            System.out.println(("no!! not armstong"));
    }
}
