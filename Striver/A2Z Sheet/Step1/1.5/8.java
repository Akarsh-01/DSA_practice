class Solution {
    public boolean isPalindrome(String s) {
        String nospace=s.replaceAll("[^a-zA-Z0-9]","");
        String lowercase=nospace.toLowerCase();
        int n=lowercase.length();
        int i=0;
        while(i<(n/2))
        {
            if(lowercase.charAt(i)!=lowercase.charAt(n-i-1))
            return false;
            i++;
        }
        return true;
    }
}