class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int n = nums.length;

        int pos = n - 1;

        int result[] = new int[n];


        while(left <= right){

            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[pos] = nums[left] * nums[left];
                left++;
            }else{
                result[pos] = nums[right] * nums[right];
                right--;
            }

            pos--;
        }

        return result;
    }
}