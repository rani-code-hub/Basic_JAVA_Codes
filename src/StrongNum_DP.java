public class StrongNum_DP {
    static int f[]=new int[10];

    static void preComputer(){
        f[0]=f[1]=1;
        for(int i=2;i<10 ;i++)
            f[i]=f[i-1] * i;
    }
    static boolean chackStrong(int num)
    {
        int sum=0;
        int temp=num;
        while(temp>0)
        {
            sum += f[temp%10];
            temp /= 10;
        }
        return (sum==num);
    }
    public static void main(String[] args)
    {
        preComputer();
        int val=145;
        if(chackStrong(val))
            System.out.println("Its a strong number");
        else
            System.out.println("Its not a strong number");
    }
}
