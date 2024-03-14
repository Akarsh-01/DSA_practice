import java.io.*;

public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        switch (ch)
        {
            case 1:
            double ar1=a[0]*a[0]*Math.PI;
            return ar1;
            case 2:
            double ar2=a[0]*a[1];
            return ar2;
            default:
            return -1;
        }
    }
    public static void main(String[]args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int ch=Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        double[] a = new double[input.length];
        for (int i = 0; i < input.length; i++) 
        {
            a[i] = Double.parseDouble(input[i]);
        }
        System.out.println(areaSwitchCase(ch, a));
    }
}
