public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int i=0;
        int[] rev=new int[n];
        while(i<n)
        {
            rev[n-i-1]=nums[i];
            i++;
        }
        return rev;
    }
}