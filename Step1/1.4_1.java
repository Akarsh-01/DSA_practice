import java.io.*;
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int m=n;
        int i=0;
        while (n!=0)
        {
            double digit=n%10;
            n=n/10;
            if(m%digit==0)
            i=i+1;
        }
        return i;
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
    }
}
