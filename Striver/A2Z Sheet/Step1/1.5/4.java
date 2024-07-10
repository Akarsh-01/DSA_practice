public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        int i=0;
        return print(i,x,arr);
        
    }
    public static int[] print(int i, int x, int arr[])
    {
        if(x>0)
        {
            arr[i]=x;
            print(i+1, x-1, arr);
        }
        return arr;
    }
}