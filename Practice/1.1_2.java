import java.io.*;
public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
       switch(type){
           case "Integer":
           return 4;
           case "Long":
           return 8;
           case "Float":
           return 4;
           case "Double":
           return 8;
           case "Character":
           return 1;
           default:
           return -1;
       }
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String str=br.readLine();
        System.out.println(dataTypes(str));
    }
}
