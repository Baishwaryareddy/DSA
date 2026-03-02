class Solution {
    public int addDigits(int num) {
        int len=String.valueOf(num).length();
        int ans=sumDigits(num);
        if(len==1){
            return ans;
        }
        while(len>1){
            ans=sumDigits(ans);
            len=String.valueOf(ans).length();
        }
        return ans;
    }
    int sumDigits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}