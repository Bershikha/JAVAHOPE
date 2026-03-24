class Solution {
    public int arraySign(int[] nums) {
        int np=0;
        int nn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0) nn++;
           
        }
        if(nn%2==1) return -1;
        else return 1;
    }
        
   
}
