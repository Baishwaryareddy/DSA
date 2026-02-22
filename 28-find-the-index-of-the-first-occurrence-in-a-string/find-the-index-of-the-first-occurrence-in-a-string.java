class Solution {
    public int strStr(String haystack, String needle) {
        int arr=-1;
        if(checks(haystack,needle)){
            arr=haystack.indexOf(needle);
        }
        return arr;
        }
    
    boolean checks(String haystack,String needle){
        if(haystack.contains(needle)){
            return true;
        }
        return false;
    }
}