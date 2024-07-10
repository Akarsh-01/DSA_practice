public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s+=sumOfADivisor(i);
        }
        return s;
    }
    public static int sumOfADivisor(int i) {
    int sum = 0; 
    int sqrt = (int) Math.sqrt(i);
    for (int j = 1; j <= sqrt; j++) {
        if (i % j == 0) {
            sum += j; 
            if (j != i / j) { 
                sum += i / j;
            }
        }
    }
    return sum;
}
}