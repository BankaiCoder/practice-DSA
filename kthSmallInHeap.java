
import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallInHeap {
    public static void smallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            maxHeap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();  // Remove the maximum element
                maxHeap.add(arr[i]);
            }
        }

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {8, 6, 5, 4, 2, 1, 3};
        int k = 3;
        // Output: 3 2 1
        smallest(arr, k);
    }
}
