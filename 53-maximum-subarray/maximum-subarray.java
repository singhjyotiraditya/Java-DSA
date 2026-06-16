class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int ele: nums){
            if (sum<0) sum=0;
            sum = sum + ele;
            if (maxSum < sum) maxSum = sum;
        }

        return maxSum;
    }
}