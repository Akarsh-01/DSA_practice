import java.io.*;
public class Solution {


	public static void main(String[] args)throws IOException {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine());
		int n1=0, n2=1;
		int n3=0;
		if(i==1)
		{
			System.out.println("1");
		}
		for (int n=1; n<i; n++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if((n==i-1))
			{
				System.out.println(n2);
			}
			
		}
		
	}

}
