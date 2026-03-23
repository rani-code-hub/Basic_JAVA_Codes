import java.util.Scanner;

public class Permutations_of_string {
    static void Permutation(String str , String ans)
    {
        if(str.isEmpty())
        {
            System.out.print(ans + " ");
            return;
        }
        for (int i=0 ; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            String r = str.substring(0,i) + str.substring(i+1);
            Permutation(r , ans+ch);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        Permutation(str, "");
    }
}
