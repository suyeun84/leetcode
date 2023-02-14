class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder sb = new StringBuilder("");
        int carry = 0;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        
        while(aIndex >= 0 || bIndex >= 0 || carry == 1){
            int sum = carry;
            if(aIndex >= 0)
                sum += a.charAt(aIndex--) - '0';
            if(bIndex >= 0)
                sum += b.charAt(bIndex--) - '0';
            
            if(sum > 1)
                carry = 1;   
            else
                carry = 0;
            sb.insert(0, sum % 2);
        }
        return sb.toString();
    }
}