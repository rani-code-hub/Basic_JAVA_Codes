import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int hcf=0;
        for(int i=1;i<=a || i<= b ;i++){
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        //2nd method using substraction
        /*
        while(a!=b){
            if(a>b)
                a -= b;
            else
                b -= a;
         }*/
        System.out.println("hcf of "+a +" "+ b +" is "+hcf);
    }
}
