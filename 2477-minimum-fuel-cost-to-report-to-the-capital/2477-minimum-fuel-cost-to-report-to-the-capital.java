class Solution {
    
    List<List<Integer>> graph = new ArrayList();
    long result = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
    
        for (int i = 0; i < roads.length + 1; i++)
            graph.add(new ArrayList());
        
        for (int[] r: roads) {
            graph.get(r[0]).add(r[1]);
            graph.get(r[1]).add(r[0]);
        }
        
        dfs(0, -1, seats);
        
        return result;
    }
    
    public int dfs(int curr, int prev, int seats){
        int people = 1;
        
        for(int node : graph.get(curr)){
            if(node == prev) continue;
            people += dfs(node, curr, seats);
        }
        if (curr != 0) result += (people + seats - 1) / seats;
        return people;
    }
}