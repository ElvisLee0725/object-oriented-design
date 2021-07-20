public class Solution {
    public static void main(String[] args) {
        Heap minHeap = new Heap("min");
        minHeap.insert(4);
        minHeap.insert(8);
        minHeap.insert(2);
        minHeap.insert(3);
        System.out.println(minHeap.pop());
        System.out.println(minHeap.peek());
        System.out.println(minHeap.remove(3));
        System.out.println(minHeap.remove(4));
        System.out.println(minHeap.remove(10));

        System.out.println(minHeap.size());
    }
}
