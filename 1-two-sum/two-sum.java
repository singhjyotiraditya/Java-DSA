class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> seen  = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(seen.containsKey(nums[i])){
               return new int[]{seen.get(nums[i]), i};
            };

            seen.put(target - nums[i], i);
        }
        return ans;
    }
}