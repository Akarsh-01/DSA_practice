import java.io.*;

public class Solution {
    
    public static void main(String[] args)throws IOException {
        // Write your code here
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        {
            String str= br.readLine();
            char ch=str.charAt(0);
            if(ch >= 65 && ch <= 90)
            {
                System.out.println("1");
            }
		    else if(ch >= 97 && ch <= 122)
            {
                System.out.print("0");
            }
            else{
                System.out.println("-1");
            }
        }

    }
}
