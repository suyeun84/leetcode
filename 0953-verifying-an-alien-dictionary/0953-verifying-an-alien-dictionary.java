class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < order.length() ; i++){
            hashmap.put(order.charAt(i), i);
        }
        
        for(int i = 0; i < words.length - 1; i++){
            
            int min = Math.min(words[i].length(), words[i+1].length());
            for(int j = 0; j < min + 1; j++){
                if(j == min){
                    if(words[i].length() > words[i+1].length()){
                        return false;
                    }else{
                        break;
                    }
                }
                
                if(hashmap.get(words[i].charAt(j)) == hashmap.get(words[i+1].charAt(j))){
                    continue;
                }else if(hashmap.get(words[i].charAt(j)) > hashmap.get(words[i+1].charAt(j))){
                    return false;
                }else if(hashmap.get(words[i].charAt(j)) < hashmap.get(words[i+1].charAt(j))){
                    break;
                }
            }
        }
        return true;
    }
}