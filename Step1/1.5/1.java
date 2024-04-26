public class Solution {
    public static int[]addElement(int x, int arr[])
    {
        if(x>=1)
        {
            arr[x-1]=x;
            addElement(x-1, arr);
        }
        return arr;
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        return addElement(x, arr);
    }
}