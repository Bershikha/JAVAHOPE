class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int leftsum=0;
        int rightsum=0;
        for(int i:nums) sum=sum+i;
        for(int i=0;i<nums.length;i++){
            
            rightsum=sum-nums[i]-leftsum;
            if(leftsum==rightsum)   return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}
