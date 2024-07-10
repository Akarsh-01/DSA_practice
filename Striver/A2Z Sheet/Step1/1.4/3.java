import java.io.*;

public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
         int x=n;
        int y=0;
        while(n!=0)
        {
            int digit=n%10;
            y=y*10+digit;
            n=n/10;
        }
       return (x==y);
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
    }
}