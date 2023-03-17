class Trie {

    HashMap<String, Boolean> hashmap;
    public Trie() {
        hashmap = new HashMap<>();   
    }
    
    public void insert(String word) {
        hashmap.put(word, true);
    }
    
    public boolean search(String word) {
        if(hashmap.containsKey(word))
            return true;
        else
            return false;
    }
    
    public boolean startsWith(String prefix) {
        int size = prefix.length();
        for(String key : hashmap.keySet()){
            if(key.length() < size)
                continue;
            if(key.substring(0, size).equals(prefix))
                return true;
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */