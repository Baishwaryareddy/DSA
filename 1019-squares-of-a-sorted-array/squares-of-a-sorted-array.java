class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
          res[i]=nums[i]*nums[i];

        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length-i-1;j++){
                if(res[j]>res[j+1]){
                    swap(res,j,j+1);
                }
            }
        }
        return res;
    }
    void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}