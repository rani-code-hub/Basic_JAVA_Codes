import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromicPartition {
    public static void main(String[] args)
    {
        String input = "nitin";
        System.out.println("All possible palindrome partitions for " + input+ " are :");
        allPalPArtition(input);

    }
    private static void allPalPArtition(String input)
    {
        int n = input.length();

        ArrayList<ArrayList> allPart = new ArrayList<>();

        Deque currpart = new LinkedList();

        allPalPArtitionsUtil(allPart, currpart, 0,n,input);
        for (int i=0; i < allPart.size();i++)
        {
            for (int j=0 ; j<allPart.get(i).size(); j++)
            {
                System.out.print(allPart.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    private static void allPalPArtitionsUtil(ArrayList<ArrayList> allPart, Deque currPArt,int start , int n,String input)
    {
        if (start >= n)
        {
            allPart.add(new ArrayList<>(currPArt));;
            return;
        }

        for (int i=start ;i<n;i++)
        {
            if(isPalindrome(input,start,i))
            {
                currPArt.addLast(input.substring(start,i+1));
                allPalPArtitionsUtil(allPart,currPArt,i+1,n,input);
                currPArt.removeLast();
            }
        }
    }
    private static boolean isPalindrome(String input,int start, int i)
    {
        while (start<i)
        {
            if(input.charAt(start++) != input.charAt(i--))
                return false;
        }
        return  true;
    }
}
