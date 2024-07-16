class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            ans.add(li(i));
        }
        return ans;
        
    }
    public List<Integer>li (int row){
        long ans=1;
        List<Integer> ansRow= new ArrayList<>();
        ansRow.add(1);
        for(int icol=1;icol<row;icol++)
        {
            ans=ans*(row-icol);
            ans=ans/icol;
            ansRow.add((int)ans);
        } 
        return ansRow;
    }
}