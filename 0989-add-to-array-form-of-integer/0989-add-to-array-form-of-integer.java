class Solution {
    public List<Integer> addToArrayForm(int[] num, int K) {
        List<Integer> res = new LinkedList<>();

        int[] knum = new int[(int)(Math.log10(K)+1)];
        for(int i = knum.length - 1; i >= 0; i--){
            knum[i] = K % 10;
            K = K / 10;
        }
        int a = num.length - 1;
        int b = knum.length - 1;
        int carry = 0;
        while(a >= 0 || b >= 0 || carry == 1){
            int sum = carry;
            if(a >= 0){
                sum += num[a--];
            }
            if(b >= 0){
                sum += knum[b--];
            }

            res.add(0, sum % 10);
            carry = sum / 10;
        }
        return res;
    }
}