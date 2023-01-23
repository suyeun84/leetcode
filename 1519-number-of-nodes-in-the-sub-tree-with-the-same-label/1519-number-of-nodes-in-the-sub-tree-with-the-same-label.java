class Solution {
    int[] result;
    public int[] countSubTrees(int n, int[][] edges, String labels) {

        result = new int[n]; 
    
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        dfs(-1, 0, graph, labels);
        return result;
    }

    public int[] dfs(int prev, int curr, List<List<Integer>> graph, String labels)
    {
        int[] ans = new int[26];
        for(int node : graph.get(curr))
        {
            if(prev != node) {
                int[] res = dfs(curr, node, graph, labels);  
                
                for(int i=0; i<res.length; i++)  
                    ans[i] += res[i];
            }
        }
        
        result[curr] = ++ans[labels.charAt(curr)-'a']; 
        return ans;
    }
}