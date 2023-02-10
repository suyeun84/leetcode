class Solution {
    //bfs
    public int maxDistance(int[][] grid) {
        
        int max = Integer.MIN_VALUE;
        int a = grid.length;
        int b = grid[0].length;
        Queue<int[]> queue = new LinkedList<>(); //현재 위치 표시
        int[][] direction = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 0; //거리로 초기화
                    queue.add(new int[]{i,j}); //다넣어
                }else
                    grid[i][j] = Integer.MIN_VALUE;
            }
        }
        
        while(!queue.isEmpty()){
            int[] pos = queue.poll();
            for(int[] dir : direction){
                int x = dir[0] + pos[0];
                int y = dir[1] + pos[1];
            
                if(0 <= x && x < a && 0 <= y && y < b && grid[x][y] < 0){
                    queue.add(new int[]{x,y});
                    grid[x][y] = grid[pos[0]][pos[1]] + 1;
                    max = Math.max(max , grid[x][y]);
                }
            }
        }
        
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}












