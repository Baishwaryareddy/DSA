class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;int count=0;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else {
                return Ispalindrome(s,start+1,end) || Ispalindrome(s,start,end-1) ;
            }
        }
        return true;
    }
    boolean Ispalindrome(String s,int start,int end){
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}