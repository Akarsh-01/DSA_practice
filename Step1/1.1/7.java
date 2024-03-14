import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
		// Write your code here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());

			int sumeven=0;
			int sumodd=0;
		while (n!=0)
		{
			int digit=n%10;
			n=n/10;
			

			if(digit%2==0)
			{
				sumeven=sumeven+digit;
			}
			else
			{
				sumodd=sumodd+digit;;
			}
		}

			System.out.println(sumeven+" "+sumodd);

	}
}
