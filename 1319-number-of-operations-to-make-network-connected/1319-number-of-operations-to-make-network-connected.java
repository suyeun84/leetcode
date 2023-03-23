class Solution {
    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length < n - 1) return -1;

        int[] arr = new int[n];
        boolean[] root = new boolean[n];
        int result = 0;

        for(int i = 0; i < n; i++) arr[i] = i;
        
        for(int[] connection : connections) {
            int a = findUnion(arr, connection[0]);
            int b = findUnion(arr, connection[1]);

            if(a < b) arr[b] = a;
            else arr[a] = b;
        }
        
        for(int i = 0; i < n; i++){
            int semi = findUnion(arr, i);
            if(root[semi]) continue;
            result++;
            root[semi] = true;
        }

        return result - 1;
//         HashSet<Integer> hashset = new HashSet<>();
//         for(int i=0; i<arr.length; ++i) hashset.add(findUnion(arr, i));
        
//         return hashset.size() - 1;
    }
    
    public int findUnion(int[] arr, int n) {
        if(arr[n] == n) return n;
        
        return findUnion(arr, arr[n]);
    }
}