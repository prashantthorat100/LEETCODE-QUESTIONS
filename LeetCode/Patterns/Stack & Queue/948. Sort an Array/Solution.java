class Solution {
     public void merge(int nums[],int mid , int si, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;//left iterator
        int j = mid+1;//right iterator
        int k = 0;

        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k] = nums[i];
                k++;
                i++;
            }else{
                temp[k] = nums[j];
                k++;
                j++;
            }
        }

        // left part 
        while(i<=mid){
            temp[k++]= nums[i++];
        }
        // right part
        while(j<=ei){
            temp[k++]= nums[j++];
        }

        //copy in main array
        for(k=0, i=si;k<temp.length;k++, i++){
            nums[i] = temp[k];
        }

    }

    public void MergeSort(int nums[],int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        MergeSort(nums,si,mid);
        MergeSort(nums,mid+1,ei);
        merge(nums, mid, si,ei);

    }
    public int[] sortArray(int[] nums) {
        MergeSort(nums,0,nums.length-1);
        return nums;
    }
}