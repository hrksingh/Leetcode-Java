class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
       for(int n : nums){
           int i = Math.abs(n) - 1;
           if (nums[i] > 0) {
                nums[i] *= -1;
            }
       }
        
        List<Integer> res = new ArrayList();
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}