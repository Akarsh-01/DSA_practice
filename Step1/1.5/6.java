import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> factorials=new ArrayList<>();
        long factorial =1;
        long i=1;
        while(factorial<=n)
        {
            factorials.add(factorial);
            i++;
            factorial*=i;
        }
        return factorials;
    }
}