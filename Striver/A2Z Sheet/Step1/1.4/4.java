public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int x=1;
       int min = (n < m) ? n : m;
        {
            for(int i=1;i<=min;i++)
            if (n%i==0 && m%i==0 )
            x=i;
        }       
        return x;
        
    }
}