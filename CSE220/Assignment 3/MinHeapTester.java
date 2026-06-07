import java.util.Arrays; // for Arrays.toString()

public class MinHeapTester {
    public static void main(String[] args) {
        // Create a minHeap with capacity 10
        minHeap heap = new minHeap(10);  // match your class name exactly

        // Insert elements
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(6);

        System.out.println("Original Heap:");
        printHeap(heap);

        // Extract the minimum element
        int min = heap.extractMin();
        System.out.println("Extracted Min: " + min);

        System.out.println("Heap after extracting min:");
        printHeap(heap);

        // Perform heapsort
        int[] sorted = heap.heapSort();  // match your method name exactly
        System.out.println("Heapsorted array (descending): " + Arrays.toString(sorted));

        System.out.println("Heap after heapsort (should be unchanged):");
        printHeap(heap);

        // Insert more elements after heapsort
        heap.insert(2);
        heap.insert(4);
        System.out.println("Heap after inserting 2 and 4:");
        printHeap(heap);
    }

    // Print the heap array directly from tester
    public static void printHeap(minHeap heap) {
        // Use reflection to access private 'ar' and 'size'
        try {
            java.lang.reflect.Field arrField = minHeap.class.getDeclaredField("ar");
            java.lang.reflect.Field sizeField = minHeap.class.getDeclaredField("size");
            arrField.setAccessible(true);
            sizeField.setAccessible(true);
            int[] arr = (int[]) arrField.get(heap);
            int size = (int) sizeField.get(heap);

            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
