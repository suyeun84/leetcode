class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        
        int[][] total = new int[scores.length][2];
        int[] dp = new int[scores.length];
        int max = 0;
        
        for(int i = 0; i < scores.length; i++){
            total[i][0] = ages[i];
            total[i][1] = scores[i];
        }
        
        Arrays.sort(total, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        for(int i = 0; i < scores.length; i++){
            dp[i] = total[i][1];
            for(int j = 0; j < i; j++){
                if(total[i][1] >= total[j][1]){
                    dp[i] = Math.max(dp[i], dp[j] + total[i][1]);
                }
            }
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}