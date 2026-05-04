class Solution {
    public int maxSubArray(int[] nums) {

        int cursum = 0 ;
        int maxsum = nums[0];

        for(int n : nums){
            cursum = Math.max(cursum, 0);
            cursum += n;
            maxsum  = Math.max(maxsum,cursum);

        }

        return maxsum;
        
        
    }
}
