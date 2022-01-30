class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length ;i++){
            nums[i] *= nums[i];
        }
        
        int i = 0 , j =  nums.length -1;
        int[] res = new int[nums.length];
        
        for(int l = nums.length -1 ; l >=0 ; l--){
            
            if(nums[i] > nums[j]){
                res[l] = nums[i++];
            }
            else{
                res[l] = nums[j--];
            }
        }
        System.gc();
        return res;
    }
}