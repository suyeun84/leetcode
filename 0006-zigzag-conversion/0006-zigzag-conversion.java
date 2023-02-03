class Solution {
    public String convert(String s, int numRows) {
        
        int num[] = new int[]{numRows * 2 - 2, 0};
        String result = "";
        
        if(s.length() == 1 || numRows == 1 || s.length() <= numRows)
            return s;
        
        for(int i = 0; i < numRows; i++){
            String now = "";
            int index = i;
            now += s.charAt(index);
            Loop:
            while(index < s.length()){

                for(int j = 0; j < 2; j++){
                    if(index + num[j] < s.length()){
                        if(num[j] != 0){
                            now += s.charAt(index + num[j]);
                            index += num[j];
                        }
                    }else{
                        result += now;
                        break Loop;
                    }
                }
            }
            num[0] -= 2;
            num[1] += 2;
        }
        return result;
    }
}