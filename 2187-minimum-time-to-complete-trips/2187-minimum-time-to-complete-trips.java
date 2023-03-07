class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        
        int max = 0;
        for(int t : time){
            if(t > max)
                max = t;
        }
        long start = 0;
        long end = (long)max * (long)totalTrips;
            
        while(start < end){
            long trip = 0;
            long mid = start + (end - start) / 2;
            
            for(int t : time){
                trip += mid / t;
            }
            if(trip < totalTrips)
                start = mid + 1;
            else
                end = mid;
        }
        
        return start;
    }
}