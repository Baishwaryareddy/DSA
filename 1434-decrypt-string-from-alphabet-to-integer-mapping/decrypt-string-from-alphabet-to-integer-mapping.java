class Solution {
    public String freqAlphabets(String s) {
        char[] al=new char[26];
        String[] num=new String[26];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            al[i]=(char)('a'+i);
            if(i<9){
               num[i]=String.valueOf(i+1);
            }else{
                num[i]=(i+1)+"#";
            }
        }
        for(int i=0;i<s.length();i++){
            if(i+2 < s.length() && s.charAt(i+2)=='#'){
             String temp=s.substring(i,i+3);
             for(int j=0;j<26;j++){
                if(temp.equals(num[j])){
                    sb.append(al[j]);
                    break;
                }
             }
             i=i+2;
        }
             else{
                String temp=s.substring(i,i+1);
                for(int j=0;j<26;j++){
                if(temp.equals(num[j])){
                    sb.append(al[j]);
                    break;
                }

             }

        }
    }
     return sb.toString();
}
}