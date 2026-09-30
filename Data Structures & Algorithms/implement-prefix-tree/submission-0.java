class PrefixTree {

    class TrieNode{
        boolean isComplete;
        TrieNode[] children;
        public TrieNode(){
            isComplete = false;
            children = new TrieNode[26];
        }
    }

    TrieNode root;
    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currNode = root;
        for(char c : word.toCharArray()){
            if(currNode.children[c-'a'] == null){
                currNode.children[c-'a'] = new TrieNode();
            }
            currNode = currNode.children[c-'a'];
        }
        currNode.isComplete = true;
    }

    public boolean search(String word) {
        TrieNode currNode = root;
        for(char c : word.toCharArray()){
            if(currNode.children[c-'a'] == null){
                return false;
            }
            currNode = currNode.children[c-'a'];
        }
        return currNode.isComplete;
    }

    public boolean startsWith(String prefix) {
        TrieNode currNode = root;
        for(char c : prefix.toCharArray()){
            if(currNode.children[c-'a'] == null){
                return false;
            }
            currNode = currNode.children[c-'a'];
        }
        return true;
    }
}
