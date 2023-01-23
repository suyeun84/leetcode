class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] person = new int[n + 1];
        boolean[] doTrust = new boolean[n + 1];
        
        for(int[] t : trust){
            int p = t[1];
            int d = t[0];
            person[p]++;
            doTrust[d] = true;
        }
        
        int a = 0;
        int judge = 0;
        for(int i = 1; i <= n; i++){
            if(person[i] == n-1 && doTrust[i] == false){
                a++;
                judge = i;
            }
            if(a > 1) return -1; //judge 한명이어야 함
        }
        if(a == 0) return -1;
        
        // for(int[] t : trust){
        //     if(t[0] == judge) // judge는 아무도 안믿음
        //         return -1;
        // }
        
        return judge;
    }
}