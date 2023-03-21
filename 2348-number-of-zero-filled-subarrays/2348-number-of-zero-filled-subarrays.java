class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long result = 0;
        int length = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                length++;
            }else{
                for(int j = 1; j < length + 1; j++){
                    result += j;
                }
                length = 0;
            }
        }
        for(int j = 1; j < length + 1; j++){
            result += j;
        }
        
        return result;
    }
}