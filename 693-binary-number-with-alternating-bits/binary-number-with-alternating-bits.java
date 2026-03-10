class Solution {
    public boolean hasAlternatingBits(int n) {
      while(n!=0){
        int i=n&1;
        n=n>>1;
        int j=n&1;
        if(i==j){
            return false;
        }
      }
      return true;
    }
}