public class Solution {
    public static long sum=0;
    public static long sumFirstN(long n) {
        // Write your code here.
        if(n>0)
        {
            sum=sum+n;
            sumFirstN(n-1);
        }        
        return sum;
    }
}