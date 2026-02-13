class Solution {
    public int thirdMax(int[] nums) {
      for(int i=0;i<nums.length;i++)
      { 
        int last=nums.length-i-1; 
        int maxIndex=getMaxIndex(nums,last);
         swap(nums,maxIndex,last); 
         } 
         int count=0; 
         for(int j=nums.length-1;j>0;j--){ 
            if(nums[j]!=nums[j-1]){ 
                count++;
             } 
             if(count==2){ 
                return nums[j-1];
              } 
              } 
              return nums[nums.length-1];
               } 
               void swap(int[] arr,int first,int second){ 
                int temp=arr[first]; 
                arr[first]=arr[second];
                 arr[second]=temp; 
                 }
                  int getMaxIndex(int[] arr,int end){ 
                    int max=0;
                     for(int i=0;i<=end;i++){
                         if(arr[max]<arr[i]){ max=i; }
                          } 
                          return max;  
    }
}