class Solution {
    public int[] sortArray(int[] nums) {
        
        var pq = new PriorityQueue<Integer>();
        
        for(int num : nums){
            pq.add(num);
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = pq.poll();
        }
        
        return nums;
    }
}