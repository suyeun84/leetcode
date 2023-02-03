class Solution {
    public String convert(String s, int numRows) {
        
        int first = numRows * 2 - 2;
        int second = 0;
        if(s.length() == 1)
            return s;
        if(numRows == 1)
            return s;
        if(s.length() <= numRows)
            return s;
        String result = "";
        for(int i = 0; i < numRows; i++){
            String now = "";
            int index = i;
            now += s.charAt(index);
            while(index < s.length()){
                boolean flag1 = true;
                boolean flag2 = true;
                if(first != 0 && index + first < s.length()){
                    now += s.charAt(index + first);
                    index += first;
                    flag1 = false;
                }
                if(first == 0 && index + first < s.length())
                    flag1 = false;
                if(flag1){
                    result += now;
                    break;
                }
                    
                if(second != 0 && index + second < s.length()){
                    now += s.charAt(index + second);
                    index += second;
                    flag2 = false;
                }
                if(second == 0 && index + second < s.length())
                    flag2 = false;
                if(flag2){
                    result += now;
                    break;
                }
            }
            first -= 2;
            second += 2;
            if(first < 0)
                break;
        }
        return result;
    }
}