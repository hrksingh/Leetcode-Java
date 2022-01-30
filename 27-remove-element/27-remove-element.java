class Solution {
    public int removeElement(int[] nums, int val) {
        int gMax = 1000;
        int count = 0 ;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] == val){
                nums[i] = gMax;
                count++;
            }
        }
        Arrays.sort(nums);
        return nums.length - count;
    }
}