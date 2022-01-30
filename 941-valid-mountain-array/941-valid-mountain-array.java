class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int s = arr.length;
        while(i < s && i+1<s && arr[i] < arr[i+1]){
            i++;
        }
        
        if(i == 0 || i+1 >= s){
            return false;
        }
        
        while(i < s && i+1<s){
           if(arr[i] <= arr[i++ +1]){
               return false;
           } 
        }
      
       return true; 
    }
}