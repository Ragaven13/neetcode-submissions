class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int L = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;

        for(int R = 0 ; R < nums.length ; R++){

            sum +=nums[R];
             
            while(sum >= target){
                minlen = Math.min(minlen, R - L +1);
                sum -= nums[L];
                L++;

            }
        }

        return minlen  == Integer.MAX_VALUE ? 0 : minlen;
    }
}