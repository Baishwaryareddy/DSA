class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
    
    for (String s : strs) {
        if (s == null || s.length() == 0) {
            return "";
        }
    }
        String str="";
        int start=0;
        while(start < strs[0].length()){
            if(!IsFound(strs,start)){
                break;
            }
            else{
                str+=strs[0].charAt(start);
                start++;
            }
        }
        return str;
    }
    boolean IsFound(String[] strs, int i){
        char ch=strs[0].charAt(i);
        for(int j=1;j<strs.length;j++){
            
                if(i >= strs[j].length()||strs[j].charAt(i) != ch){
                return false;
            }
            
        }
        return true;
    }
}