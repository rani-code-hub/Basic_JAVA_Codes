import java.util.Scanner;

public class F_Nth_term {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println(term(1,1,n));
    }
    static int term(int calculated , int current, int n){
        int i,cur=1;
        if(current == n+1) {
            return 0;
        }
        for (i=calculated;i<calculated+current ; i++)
            cur *= i;
        return cur + term(i,current+1,n);

    }
}
