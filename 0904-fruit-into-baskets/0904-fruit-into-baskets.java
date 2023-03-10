class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int startIndex = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int endIndex = 0; endIndex < fruits.length; endIndex++){
            hashmap.put(fruits[endIndex], hashmap.getOrDefault(fruits[endIndex], 0) + 1);
            while(hashmap.size() > 2){
                if(hashmap.get(fruits[startIndex]) == 1)
                    hashmap.remove(fruits[startIndex]);
                else
                    hashmap.put(fruits[startIndex], hashmap.get(fruits[startIndex]) - 1);
                startIndex++;
            }
            
            int pick = 0;
            for(int k : hashmap.keySet()){
                pick += hashmap.get(k);
            }
            if(max < pick)
                max = pick;
        }
        return max;
    }
}