class Solution {
    public int findComplement(int num) {
        int base=1;
        int sum=0;
        while(num!=0){
        if((num & 1)==0){
            sum=sum+base;
        }
        num=num>>1;
        base=base*2;
        }
        return sum;
    }
}