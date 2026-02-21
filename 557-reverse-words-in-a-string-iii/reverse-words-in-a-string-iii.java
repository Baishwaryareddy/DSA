class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String r="";
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
              r=r+str[i].charAt(j);
            }
            if(i<str.length-1){
                r=r+" ";
            }
        }
        return r;
     }
         
    }
