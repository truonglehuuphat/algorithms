class LRUCache {
    private int size = 0;
    
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        size = capacity;
        head.next = tail;
        tail.prev = head;
    }
    private void addNode(Node newNode){
        Node temp = head.next;
        newNode.next = temp;
        newNode.prev = head;
        head.next = newNode;
        temp.prev = newNode;
    }

    private void deleteNode(Node delNode){
        Node prevv = delNode.prev;
        Node nextt = delNode.next;
        prevv.next = nextt;
        nextt.prev = prevv;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node resNode = map.get(key);
            int ans = resNode.val;
            map.remove(key);
            deleteNode(resNode);
            addNode(resNode);
            map.put(key, head.next);
            return  ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
       if(map.containsKey(key)){
        Node curr= map.get(key);
        map.remove(key);
        deleteNode(curr);
       }
       if(map.size()== size){
        map.remove(tail.prev.key);
        deleteNode(tail.prev);
       }
       addNode(new Node(key, value));
       map.put(key, head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */