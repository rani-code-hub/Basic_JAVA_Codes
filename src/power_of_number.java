import java.util.Scanner;

public class power_of_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base and the power");
        int b = sc.nextInt(), p = sc.nextInt();
        System.out.println ("Required Power is " + power(b,p));
    }
    static int power(int b,int p){
        if(p==0)
            return 1;
        return b * power(b,p-1);
    }
}
