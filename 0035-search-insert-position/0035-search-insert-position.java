class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int index = 0;
        for(int num : nums){
            if(num == target || num > target)
                return index;
            else if(num < target)
                index++;
        }
        return index;
    }
}