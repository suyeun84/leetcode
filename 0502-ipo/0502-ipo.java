class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        
        int result = 0;
        int[][] total = new int[profits.length][2];
        int currK = 0;

        //capital 순
        PriorityQueue <int []> pq = new PriorityQueue<>(new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o2[1] - o1[1];
				else return o1[0]-o2[0];
			}
		});
        //profit 순
        PriorityQueue <Integer> maxProfit = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < profits.length; i++){
            total[i][0] = capital[i];
            total[i][1] = profits[i];
            
            pq.add(total[i]);
        }

       while(true){
           while(!pq.isEmpty() && pq.peek()[0] <= w){
               maxProfit.add(pq.poll()[1]);
           }
           if(maxProfit.isEmpty())
               return w;
           
           if(currK < k){
               w += maxProfit.poll();
               currK++;
           }else{
               return w;
           }
       }

    }
}