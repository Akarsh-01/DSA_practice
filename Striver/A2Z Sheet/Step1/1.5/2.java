import java.util.*;
public class Solution {
    public static List<String> printNtimes(int n){
        // Write your code here.
        ArrayList<String> print=new ArrayList<>();
        return printout(n, print);
    }
    public static List<String> printout(int n, List<String> print)
    {
        if(n>0)
        {
            print.add("Coding Ninjas");
            printout(n-1, print);
        }
        return print;
    }
}