public class Root {
    static class Node{
        Node[] child = new Node[26];
        boolean eow;

        Node(){
            for(int i = 0; i < 26; i++){
                child[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){ //0(L)
        Node curr = root;
        for(int ch = 0; ch < word.length(); ch++){
            int idx = word.charAt(ch) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx]; // ch - 'a'
        }
        curr.eow = true; // marking the end of word
    }
    public static boolean search(String key){
        Node curr = root;
        for(int ch = 0; ch < key.length(); ch++){
            int idx = key.charAt(ch) - 'a';
            if(curr.child[idx] == null){
                // curr.child[idx] = new Node();
                return false; // key does not exist
            }
            curr = curr.child[idx]; // ch - 'a'
        }
        return curr.eow == true;
    } 
    public static boolean wordBreak(String key){
        if(key.length() == 0) return true;
        for(int i = 1; i <= key.length(); i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true; // found a valid word break
            }
        }
        return false; // no valid word break found for the key
    }
    public static void main(String[] args) {
        // String words[] = {"the", "a", "there","thier","any","thee"};
        // for(int i = 0; i < words.length; i++){
        //     insert(words[i]);
        // }
        // System.out.println(search("a"));
        // System.out.println(search("thor"));

        String arr[] = {"i", "like","sam","samsung","mobile","ice"};

        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}