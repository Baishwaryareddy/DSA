class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int start=0;
        int index=0;
        for(int i=0;i<arr2.length;i++){
        int end=arr1.length-1;
        while(start<end){
            if(arr2[i]==arr1[start]){
                start++;
            }
            else if(arr2[i]!=arr1[end]){
                end--;
            }
            else{
                swap(arr1,start,end);
            } 
        }
    }
    for(int i=0;i<arr1.length;i++){
        for(int j=start+1;j<arr1.length-i;j++){
            if(arr1[j]<arr1[j-1]){
              swap(arr1,j-1,j);
            }
        }
    }
    return arr1;
}
void swap(int[] arr,int start,int end){
    int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
}
}