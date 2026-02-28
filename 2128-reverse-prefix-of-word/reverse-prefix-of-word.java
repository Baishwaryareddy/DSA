class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int n=word.indexOf(ch);
        int i=0;
        while(i<word.length()){
            if(i<=n){
                sb.append(word.charAt(n-i));
            }
            else{
                sb.append(word.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}