class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] result=new String[str.length];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            int n=str[i].length();
            int p=str[i].charAt(n-1)-'0';
            result[p-1]=str[i].substring(0,n-1);
        }
     for(int i = 0; i < result.length; i++){
      sb.append(result[i]);
           if(i != result.length - 1)
               sb.append(" ");
                 }
           return sb.toString();
    }
}