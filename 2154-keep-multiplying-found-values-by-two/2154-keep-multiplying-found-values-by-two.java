class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
    
        for(int n : nums){
            if(n == original){

                original = (original * 2);
            }
        }
        return original;
    }
}