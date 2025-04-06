import java.util.PriorityQueue;

public class Q11 {
    public static void main(String[] args) {
        int arr[] = {1,5,8,6,8,2,1,4,9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int ele: arr)
            minHeap.add(ele);
        System.out.println("Elements in the MinHeap in sorted order is:");
        while(!minHeap.isEmpty())
            System.out.print(minHeap.poll()+" ");
    }
}
