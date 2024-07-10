import java.io.*;

public class Main {
	
	public static void main(String[] args)throws IOException {
		// Write your code here
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int originaln=n;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=originaln;
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum+=Math.pow(digit, count);
			n=n/10;
		}
		boolean result=(sum==originaln);
		System.out.println(result);
	}
}
