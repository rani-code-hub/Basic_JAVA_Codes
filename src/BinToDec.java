import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary number");
        int binary= sc.nextInt();
        int decimal=0;//to store decimal number
        int n=0;//to use in power
        while(binary>0){
            int temp=binary%10;
            decimal += temp * Math.pow(2,n);//8,n for octal to decimal
            binary = binary/10;
            n++;
        }
        System.out.println("Decimal number : "+decimal);
    }
}
