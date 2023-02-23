class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        PriorityQueue <Integer> maxProfit = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < profits.length; i++){
            pq.add(new int[]{capital[i], profits[i]});
        }

        for(int i = 0; i < k; i++){
            while(!pq.isEmpty() && pq.peek()[0] <= w){
                maxProfit.add(pq.poll()[1]);
            }
            if(maxProfit.isEmpty())
                break;
            w += maxProfit.poll();
        }
        return w;
    }
}