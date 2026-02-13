class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int n=nums.length;
       int start=0;
       int end=n-1;
       while(start<end){
        if(nums[start]%2==0){
            start++;
        }
        else if(nums[end]%2==1){
            end--;
        }
        else{
            swap(nums,start,end);
        }
       }
       return nums; 
    }
    void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}