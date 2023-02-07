class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        while(secondIndex < fruits.length){
            hashmap.put(fruits[secondIndex], hashmap.getOrDefault(fruits[secondIndex], 0) + 1);
            secondIndex++;
            while(hashmap.size() > 2 && firstIndex < secondIndex){
                if(hashmap.get(fruits[firstIndex]) == 1)
                    hashmap.remove(fruits[firstIndex]);
                else
                    hashmap.put(fruits[firstIndex], hashmap.get(fruits[firstIndex]) - 1);
                firstIndex++;
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