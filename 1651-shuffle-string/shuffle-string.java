class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder correct=new StringBuilder();
        int index=-1;
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices.length;j++){
        if(i==indices[j]){
            index=j;
            break;
        }
            }
            correct.append(s.charAt(index));
        }
        
           return correct.toString();
    }
}