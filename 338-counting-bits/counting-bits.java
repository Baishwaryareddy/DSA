class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        int i=0;
        while(i<=n){
          ans[i]=count(i);
          i++;
        }
        return ans;
    }
    int count(int i){
        int count=0;
        while(i!=0){
            count+=i&1;
            i=i>>1;
        }
        return count;
    }
}