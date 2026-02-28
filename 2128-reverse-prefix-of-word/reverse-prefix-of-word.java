class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int n=word.indexOf(ch);
        for(int i=n;i>=0;i--){
            sb.append(word.charAt(i));
        }
        for(int i=n+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}