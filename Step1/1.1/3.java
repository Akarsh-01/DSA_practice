import java.io.*;

public class Solution {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if (a<b)
        return"smaller";
        else if (a>b)
        return"greater";
        else
        return "equal";
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println(compareIfElse(a, b));
    }
}
