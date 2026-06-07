public class MaxHeapTester {
   
    public static void main(String[] args) {
        // Create a maxheap with capacity 10
        maxheap heap = new maxheap(10);

        // Insert elements into the heap
        heap.insert(15);
        heap.insert(10);
        heap.insert(20);
        heap.insert(17);
        heap.insert(8);

        // Perform heapsort to see the sorted array
        int[] sorted = heap.heapsort();
        System.out.println("Heapsorted array (ascending order):");
        for (int val : sorted) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Extract max element to test extractmax()
        int max = heap.extractmax();
        System.out.println("Extracted max: " + max);

        // Insert more elements
        heap.insert(25);
        heap.insert(5);

        // Heapsort again to check updated heap
        int[] sorted2 = heap.heapsort();
        System.out.println("Heapsorted array after more insertions:");
        for (int val : sorted2) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
