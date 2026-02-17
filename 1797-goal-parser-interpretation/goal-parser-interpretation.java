class Solution {
    public String interpret(String command) {
        String str="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                str=str.concat("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                str=str.concat("o");
                i++;
                }
            
            else{
                str=str.concat("al");
                i=i+3;
            }
            }
        }
        return str;
    }
}