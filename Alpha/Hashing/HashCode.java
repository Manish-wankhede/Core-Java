import java.util.*;

public class HashCode {
    static class HashMap<K, V> {
        private class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFun(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }
        private int searchLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0; i < ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void reHash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = N*2;
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in new buckets
            for(int i = 0; i < oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFun(key);
            int di = searchLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n/N;
            if(lambda > 2.0){
                reHash();
            }
        }
        public boolean containsKey(K key){
            int bi = hashFun(key);
            int di = searchLL(key, bi);

            if(di != -1){
                return true;
            } else {
                return false;
            }
        }
        public V get(K key){
            int bi = hashFun(key);
            int di = searchLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
               return node.value;
            } else {
                return null;
            }
        }
        public V remove(K key){
            int bi = hashFun(key);
            int di = searchLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }
        public ArrayList<K> ketSet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpy(){
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("Chaina", 150);
        map.put("US", 50);
        map.put("Nepal", 5);

        ArrayList<String> keys = map.ketSet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(map.get("India"));
        System.out.println(map.remove("India"));
        System.out.println(map.get("India"));
    }
}
