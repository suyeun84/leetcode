class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long result = 0;
        int length = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                length++;
                result += length;
            }else
                length = 0;
        }
        
        return result;
    }
}